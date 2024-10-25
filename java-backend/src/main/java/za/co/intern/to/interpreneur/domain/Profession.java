package za.co.intern.to.interpreneur.domain;

import java.util.List;
import java.util.UUID;

public class Profession {

	private String uuid = UUID.randomUUID().toString();
	private String name;
	private List<Reference> references;

}
