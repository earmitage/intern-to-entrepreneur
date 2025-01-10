package za.co.intern.to.interpreneur.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import za.co.intern.to.interpreneur.domain.Profession;

public class ProfessionApiTest {

    
    
	@Test
	public void fetchProfessions_test() {
		ProfessionApi myObject = new ProfessionApi();
		List<Profession> list = myObject.fetchProfessions();

		//assertEquals(2, list.size());

	//TDD Test driven development

	}
}
