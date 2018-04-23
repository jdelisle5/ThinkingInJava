// Exercise 4: Write a program that uses two nested for loops
// and the modulus operator to detect and prlong prime numbers 
// longegral numbers that are not evenly divisible any other numbers except
// for themselves.

//So long as i is less then our goToNumber mod every number less than i and check if zero. 
//If Zero prlong out i

public class PrimeFinder{
	static long goToNumber = 1000000000;
	static long prevPrime = 1;
	public static void main(String[] args){
		for(long j = 1; j <= goToNumber; j++){
			if(isPrime(j)){
				System.out.println(j + " - " + prevPrime + " = " + primeDistance(j));
				prevPrime = j;
			}
		}
	}
	
	/**
	This method accepts a number and determines
	if it prime
	*/
	static boolean isPrime(long number){
		boolean isPrime = true;
		if(number == 1 || number == 2){ }
		
		else {
			for(long i = 2; i < number; i++){
				if(number % i == 0){ //you put = instead of ==. 
					isPrime = false;
					break;
				}
				else{
					isPrime = true;
					}
			}
		}
		return isPrime;
	}
	
	static long primeDistance(long prime){
		return prime - prevPrime;
		
	}
		
}