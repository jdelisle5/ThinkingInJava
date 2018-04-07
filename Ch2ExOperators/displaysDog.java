//Exercises 5: Create a class called Dog
// containing two String s: name and says. In 
// main(), create two dog objects with names "spot" who
// says, "Ruff!" and "Scruffy" who says (who says, "Wurf.")
//	then displays their names and what they say.
class Dog{
	String name;
	String says;
}

public class displaysDog{
	public static void main(String[] args){
		
		//Ex 5
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "Spot";
		d1.says = "Ruff!";
		d2.name = "Scruffy";
		d2.says = "Wurf";
		
		System.out.println(d1.name + " says, " + d1.says );
		System.out.println(d2.name + " says, " + d2.says );
		
		//Ex 6 Folloing exercise 5, create a new Dog reference and assign it to spots's object.
		//Test for comparisons using == and equals() for all references.
		
		Dog d3;
		d3 = d1; //We passed the object reference to d3.
				//Both d3 and d1 have have the same object reference.
		
		System.out.println("d1 == d2: " + (d1 == d2));
		System.out.println("d2 == d3: " + (d2 == d3));
		System.out.println("d1 == d3: " + (d1 == d3));
		
		System.out.println("d1.equals(d2): " + d1.equals(d2));
		System.out.println("d2.equals(d3): " + d2.equals(d3));
		System.out.println("d1.equals(d3): " + d1.equals(d3));
	}
}