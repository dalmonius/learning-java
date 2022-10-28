/*
	This program calculates the gravity of the moon.
*/

class MoonGravity{
	public static void main(String[] args){
		double earth, moon;
		earth = 9.8;
		moon = earth * 0.17;
		System.out.println("The gravity on the moon is: " + moon + "m/s²");
	}
}
