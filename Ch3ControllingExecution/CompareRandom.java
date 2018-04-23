// Exercise 2: Write a program that generates 25 random
//int values. For each value,use an if-else statement to classify
// it as greater than, less than or equal to a second randomly generated value.
public class CompareRandom{

	public static void main(String[] args){
		for(int i = 1; i <= 25; i++){ //Note a semicolon at the end will throw a compile error.
			int i1 = (int)(Math.random() * 10);
			int i2 = (int)(Math.random() * 10);
			String s;
			if(i1 < i2){
				s = "	is less than		";
			}
			else if(i1 > i2){
				s = "	is greater than		";
			}
			else {
				s = "	is equal to		";
			}
			
			System.out.println(i1 + " " + s + " " + i2);
		}//End of For
	}//End of main
}//End of class