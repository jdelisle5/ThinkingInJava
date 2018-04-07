/*
* Exercise 9: Write a Program that demonstrates 
* autoboxing works for all the primitive types
* and their wrappers
*/

//"The wrapper classes for the primitive data types allow you to make
//a non primitive object on the heap to represent that primitive types.
//This is instead of on the stack

public class AutoBoxingWorks{

	
	public static void main(String[] args){
	//AutoBoxingWorks AB = new AutoBoxingWorks();
	Character 	ch 	= new Character('x');
	Boolean 	b 	= new Boolean(true); //Primintive
	Byte		by	= new Byte((byte)134);
	Short		sh	= new Short((short)0101);
	Integer		i	= new Integer(5);
	Long		l	= new Long(199999*19999);
	Float		f	= new Float(922337203685477.01);
	Double		d	= new Double(922337203684775.01);
	
	System.out.println(ch);
	System.out.println(b);
	System.out.println(by);
	System.out.println(sh);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);

	
	}
}//End Class