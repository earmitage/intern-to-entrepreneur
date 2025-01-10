package za.co.intern.to.interpreneur.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.intern.to.interpreneur.domain.Profession;
import za.co.intern.to.interpreneur.entities.ProfessionEntity;
import za.co.intern.to.interpreneur.entities.ProfessionRepository;

@RestController
public class ProfessionApi {

    
    @Autowired
    private ProfessionRepository professionRepository;
    
    //Adding new resource to the server
    @PostMapping("/professions")
    public Profession createProfession(Profession profession) {

	
	ProfessionEntity entity = new ProfessionEntity();
	entity.setName(profession.getName());
	
	ProfessionEntity saved = professionRepository.save(entity);
	
	profession.setUuid(saved.getUuid());
	return profession;
        
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
        Profession profession1 = new Profession();
        profession1.setName("Frontend developer");
        professions.add(profession1);
        //TODO fetch from database
        return professions;

    }


}
