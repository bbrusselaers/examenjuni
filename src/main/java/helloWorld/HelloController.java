package helloWorld;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

	@Autowired
	private PlaylistRepository playlistRep;
	@Autowired
	private TrackRepository trackRep;
	
	@GetMapping("/")
    public Iterable<Track> index() {
        return trackRep.findAll();
    }
	
	@GetMapping("/albums")
	public Iterable<Track> index1() {
        return trackRep.findAll();
    }
	
	@GetMapping("/byid")
    public Playlist byId(@RequestParam int id) {
		return playlistRep.findById(id);
    }
	
	@GetMapping("/byalbumid")
    public Track byId1(@RequestParam int id) {
		return trackRep.findById(id);
    }
	
	@GetMapping("/byname")
    public Iterable<Playlist> byName(@RequestParam String name) {
		System.out.println("Name: " + name);
        return playlistRep.findByNameContains(name);
    }
	
	
	  
	  

}
