//Exercise 7: Write a program that simulates coin flipping.
import java.util.*;

class Coin{
	long flip = Math.round(Math.random());
	
	public void flip(){
		String heads = "Heads";
		String tails =  "Tails";
		if(flip == 0){
			System.out.println(heads);
		}
		else {
			System.out.println(tails);
		}
	}
}
	
public class FlipCoin{
	public static void main(String[] args){
		Coin c1 = new Coin();
		c1.flip();
	}
}