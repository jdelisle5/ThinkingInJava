//: operators/Casting.java
public class Casting {
	public static void main(String[] args){
		int i = 200;
		long lng = (long)i;
		lng = i; //"Widening, "  so cast not really required
		long lng2 = (long)200;
		lng2 = 200;
		//A "narrowing conversion";
		i = (int)lng2; //Cast required
	}
}
//You can cast in the same family of types: Oaks can cast to Trees, but not to a Rock