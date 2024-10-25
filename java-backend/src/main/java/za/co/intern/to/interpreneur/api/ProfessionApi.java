package za.co.intern.to.interpreneur.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.intern.to.interpreneur.domain.Profession;

@RestController
public class ProfessionApi {

	//Adding new resource to the server
	@PostMapping("/professions")
	public Profession createProfession(Profession profession) {

		// create in the database
		return new Profession();

	}
	
	//Fetch one record from the server	
	@GetMapping("/professions/{uuid}")
	public Profession fetchProfession(@PathVariable String uuid) {
		
		return new Profession();
		
	}
	
	
	//Fetch one record from the server
	@PutMapping("/professions/{uuid}")
	public Profession updateProfession(Profession profession) {
		
		//TODO  fetch from database
		return new Profession();
		
	}


	//fetch multiple records from the server
	@GetMapping("/professions")
	public List<Profession> fetchProfessions() {
		List<Profession> professions = new ArrayList<Profession>();
		

		//TODO fetch from database
		return professions;

	}

	
	//status code  
	//200 - 299,
	//300 - 399
	
	//400, 406, - 499  404 401 403
	
	//500 - 599
}
