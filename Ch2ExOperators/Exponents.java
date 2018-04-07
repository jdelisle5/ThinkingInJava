//: operators/Exponents.java
// "e" means "10" to the power
public class Exponents {
	public static void main(String[] args){
		//Uppercase and lowercase 'e' are the same:
		float expFloat = 1.39e-43f;;
		expFloat = 1.39E-43f;
		
		System.out.println(expFloat);
		
		double expDouble = 47e47d; //'d' is optional
		expDouble = 47e47; //Automatically or default is double
		System.out.println(expDouble);
	}
}