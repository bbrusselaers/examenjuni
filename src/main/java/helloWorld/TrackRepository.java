package helloWorld;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import helloWorld.Track;

public interface TrackRepository extends CrudRepository<Track, Integer> {
	
	@Query(value = "Select * from Track", nativeQuery = true)
	Iterable<Track> getAllTracks();
	
	Track findById(int id);
	


}
