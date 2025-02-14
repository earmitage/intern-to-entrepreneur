package za.co.intern.to.interpreneur.entities;

import java.util.Objects;

import lombok.Getter;

@Getter
public class Person {
    
    public Person(String name, int age, String address) {
	this.name = name;
	this.age = age;
	this.address = address;
    }


    private String name;
    private int age;
    private String address;
    

    @Override
    public String toString() {
	
	return name;
    }


    @Override
    public int hashCode() {
	return Objects.hash(name, age);
    }


    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Person other = (Person) obj;
	return  Objects.equals(name, other.name) && Objects.equals(age, other.age);
    }




    
    
    
    
}
