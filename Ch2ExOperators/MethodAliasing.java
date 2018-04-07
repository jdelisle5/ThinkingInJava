//Method Aliasing/Exercise3/Ch2
import static net.mindview.util.Print.*;
class Floater{
	float j = 5.01f;
}

public class MethodAliasing{
	static void changeFloat(Floater x){
		print(x.j + " 2");
		x.j = 10.1f;
		print(x.j + " 3 ");
	}
	
	public static void main(String[] args){
		Floater floaterY = new Floater();
		print(floaterY.j + " 1");
		
		changeFloat(floaterY);
		print(floaterY.j + " 4");
		
	}
	
}//The output shows that there isn't a copy of the objects. They are the same reference
//If they were a copy of the 3rd output would be different than the 4th.
//5.01 1
//5.01 2
//10.01 3
//10.01 4