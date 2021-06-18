package helloWorld;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import helloWorld.Playlist;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, Integer>{
	
	@Query(value = "Select * from playlists", nativeQuery = true)
	Iterable<Playlist> getAllArtists();
	
//	@Query(value = "select * from Artist where ArtistId = 1", nativeQuery = true)
	Playlist findById(int id);

	Iterable<Playlist> findByNameContains(String name);
}
