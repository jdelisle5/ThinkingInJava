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
	public static void main(Strings[] args){
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "spot"
		d1.says = "Ruff!"
		d2.name = "Scruffy"
		d2.says = "Wurf"
		
		System.out.println(d1.name + "says, " + d1.says )
		System.out.println(d2.name + "says, " + d2.says )
	}
}