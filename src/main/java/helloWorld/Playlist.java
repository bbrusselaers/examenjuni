package helloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "playlists")
public class Playlist {
	
	@Id
	@Column(name = "playlistid")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(Integer Id) {
		this.id = Id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
