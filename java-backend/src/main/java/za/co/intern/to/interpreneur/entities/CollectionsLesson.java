package za.co.intern.to.interpreneur.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsLesson {

    public static void main(String[] args) {


	Person evans = new Person("Evans", 40, "random address in KZN");
	Person tipe = new Person("Evans", 40, "random address in Limpopo");
	Person estelle = new Person("Evans", 15, "random address in JHB");
	Person estelle2 = new Person("Evans", 15, "random address in JHB");


	
	//  //    //     //  //

	Set<Person> unique = new HashSet<>();
	
	unique.add(estelle);
	unique.add(evans);
	unique.add(tipe);
	unique.add(estelle2);
	
	System.out.println("set has "+ unique);
	
	System.out.println(evans.equals(tipe));
	System.out.println(evans.equals(estelle));
	System.out.println(tipe.equals(estelle));
	System.out.println(estelle.equals(estelle2));
	
	
	// System.out.println(people.get(0) == people.get(1));
    }

}

class Account {

    String accNum;

    public Account(String accNum) {
	this.accNum = accNum;
    }

    @Override
    public String toString() {
	return accNum;
    }

}
