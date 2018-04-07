//:operators/Assignment.java
//Assignments with objects is a bit tricky
//Because you have assigned a reference change
import static net.mindview.util.Print.*;

class Tank{
	int level;
}

public class Assignment{
	public static void main(String[] args){
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		
		print("1: t1 level: " + t1.level +
			  ", t2.level: " + t2.level);
		t1 = t2; //!!!!!!!!Reference Change!!!!!!!!  Hey t1 reference the same object as t2.
		
		print("2: t1 level: " + t1.level +
			  ", t2.level: " + t2.level);
		t1.level = 27;	  
		print("3: t1 level: " + t1.level +
			  ", t2.level: " + t2.level);		
	}
}/* Output
1: t1.level: 9. t2.level: 47
2: t1.level: 47. t2.level: 27
//Skip the aliasing by saying t1.level = t2.level;
*///:~