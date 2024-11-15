package za.co.intern.to.interpreneur.domain;

import java.util.List;
import java.util.UUID;

public class Profession {

	private String uuid = UUID.randomUUID().toString();
	private String name;
	private List<Reference> references;

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getUuid() {
		return uuid;
	}
}
