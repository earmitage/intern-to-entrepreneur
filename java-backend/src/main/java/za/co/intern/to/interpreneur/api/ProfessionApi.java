package za.co.intern.to.interpreneur.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.intern.to.interpreneur.domain.Profession;

@RestController
public class ProfessionApi {
	
	
	@PostMapping("/professions")
	public Profession createProfession(Profession profession ) {
		
		//create in the database
		return new Profession();
		
	}

	@GetMapping("/professions")
	public List<Profession> fetchProfession( ) {
		List<Profession> professions = new ArrayList<Profession>() ;
		
		//fetch from database
		return professions ;
		
	}
	

}
