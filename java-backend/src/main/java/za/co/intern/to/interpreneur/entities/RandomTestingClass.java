package za.co.intern.to.interpreneur.entities;

public class RandomTestingClass {
    
    
   private Fruit baseInterface;

    public void testMethod() {

	
	
	Mango mainInterface = new AMango();
	AMango codeToImplementation = new AMango();
	
	

	codeToImplementation.somethingElse();
	codeToImplementation.anotherAction("");
	
	
	AnOrange orange = new AnOrange();
	orange.anotherActionForAnOrange();
	
	Fruit orangeFruit = new AnOrange();
	
	orangeFruit.makeJuice();
	
	
	
	
	makeFruitSalad(codeToImplementation);
	
	makeFruitSalad(mainInterface);
	

    }
    
    public String makeFruitSalad(Fruit m) {
	
	
	///m.clean()
	
	return "";
    }

}
