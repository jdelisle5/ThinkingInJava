/*
Write a program that finds and calls the storage(method)
defined in this chapter
*/
public class Storage{
	int storage(String s){
		return s.length() * 2;
	}//End of Storage
	
	public static void main(String[] args){
		Storage s1 = new Storage();
		System.out.println(s1.storage("Joseph"));
	}//End of storage
}//End of Class