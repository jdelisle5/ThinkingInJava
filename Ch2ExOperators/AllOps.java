//: operators/AllOps.java
//Test all the operators on all primitive data types
// to show which ones are accepted by the Java Compiler

public class AllOps{
	//To Accept the results of a boolean test:
	void f(boolean b){}
	void boolTest(boolean x, boolean y){
		//Arimetic operators:
		//! x = x * y;
		//! x = x/y;
		//! x = x % y;
		//! x = x + y;
		//! x = x - y;
		//! x++;
		//! x--;
		//! x = +y;
		//! x = -y;
		//Relational and Logical
		//! f(x > y);
		//! f(x < y);
		//! f(x <=y);
		//!	f(x >= y);
		f(x == y);
		f(x != y);
		f(!y);
		x = x && y;
		x = x || y;
		//Bitwise operators:
		//! x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>>1;
		//Compoung Assignment:
		//! x += y;
		//! x -= y;
		//! x *=y;
		//! x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>> 1;
		x &= y;
		x ^= y;
		x |= y;
		//Casting
		//! char c = (char)x;
		//! byte b = (byte)x;
		//! short s = (short)x;
		//! int i = (int)x;
		//! long l = (long)x;
		//! float f = (float)x;
		//! double d = (double)x;
	}
	void charTest(char x, char y){
		//Arimetic operators all work
		x = (char)(x * y); //Because it promotes it to int. Need to cast back down.
		x = (char) (x/y);
		x = (char) (x + y);
		x = (char) (x - y);
		x = (char) (x % y);
		x++;
		x--; 
		x = (char)+y;//Urnary plus
		x = (char)-y;
		//Relations and logical
		f(x > y);
		f(x >= y);

		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		//Bitwise operators
		x = (char)~y;
		x = (char)(x & y);
		x = (char)(x | y);
		x = (char)(x ^ y);
		x = (char)(x << 1);
		x = (char)(x >> 1);
		x = (char)(x >>> 1);
		//CompoundAssignment
		x += y;
		x -= y;
		x /= y;
		x %= y;
		x <<= y;
		x >>= y;
		x >>>=y;
		x &= y;
		x ^= y;
		x |= y;
		//Casting:
		//! boolean b1 = (boolean)x;
		byte b = (byte)x;
		short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}
	void byteTet(byte x, byte y){
		//Arimetic operators:
		x = (byte)(x*y);
		x = (byte)(x / y);
		x = (byte) (x % y);
		x = (byte)(x + y);
		x = (byte)(x-y);
		x++; 
		x--;
		x = (byte)+y;
		x = (byte)-y;
		//Relational and logical;
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//f(x && y);
		//f(x || y);
		//! (f(!x);
		//Bitwise operators;
		x = (byte)~y;
		x = (byte)(x & y);
		x = (byte)(x | y);
		x = (byte)(x ^ y);
		x = (byte)(x << y);
		x = (byte)(x >> y);
		x = (byte) (x >>> y);
		//Compound Assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x &= y;
		x |= y;
		x ^= y;
		x <<= y;
		x >>= y;
		x >>>= y;
		//Casting:
		//! boolean b1 = (boolean)x;
		char c = (char)x;
		short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}
	void shortTest(short x, short y){
	//This is the similar to byte, short and int
	//And long
	}
	void floatTest(float x, float y){
	//With Floats you cannnot do bitwise operators or logical operators.
	}
	void doubleTest(double x, double y){
	//Double is the same as float.
	//Cannot do bitwise operators or logical operators
	}
	
}