/*
*Exercise 11: Turn the AllTheColorsOfTheRainbow example into a program
*that compiles and runs.
*
*/

class AllTheColorsOfTheRainbow{
	int anIntegerRepresintingColors;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresintingColors = newHue;
	}
		public static void main(String[] args){
			AllTheColorsOfTheRainbow setColor = new AllTheColorsOfTheRainbow();
			
			setColor.changeTheHueOfTheColor(50);
			
			System.out.println(setColor.anIntegerRepresintingColors);
		}
}//End of AllTheColorsOfTheRainbow class