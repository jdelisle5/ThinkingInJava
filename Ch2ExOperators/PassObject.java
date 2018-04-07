class Letter{
	char c;
}

public class PassObject(
	static void f(Letter y){ //Other program y would be making a copy of whatever is passed in.
							//However, hear y simply points to whatever is pass in with an object reference
							//
	y.c = 'z';
	}

	public class void main(Strings[] args){
		Letter x = new Letter();
		x.c = 'a';
		print("1: x.c: " + x.c);
		f(x);
		print("2: x.c: " + x.c);
	}
)/* Output:
1: x.c: a
2: x.c: z
*/
