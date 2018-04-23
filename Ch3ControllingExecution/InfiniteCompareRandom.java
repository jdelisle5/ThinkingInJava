//Exercise 3: Modify Exercise 2 so that your code is surrounded by an
//"infinite" while loop. It will then run until you interrupt it from
// the keyboard (typically by pressing Control+C
public class InfiniteCompareRandom{

	public static void main(String[] args){
		while(true){ //Note a semicolon at the end will throw a compile error.
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