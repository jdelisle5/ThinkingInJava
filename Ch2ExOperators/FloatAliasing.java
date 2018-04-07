//Exercise2: FloatAliasing
import static net.mindview.util.Print.*;
class Boat{
	float f;
	} //Ends Boat
	
public class FloatAliasing{
	

	public static void main(String[] args){
		Boat b1 = new Boat();
		Boat b2 = new Boat();
		b1.f = (float)123.01;
		b2.f = (float)123.02;

		
		print("1: bl.f = " + b1.f + " b2.f = " + b2.f);
		
		b1 = b2; //Move the object reference to both objects
		//bl.f = b1.f assign the value of f on b2 to b2.f
		print("1: bl.f = " + b1.f + " b2.f = " + b2.f);
		b1.f = 100;
		print("1: bl.f = " + b1.f + " b2.f = " + b2.f);
		
	}//Ends Main
}