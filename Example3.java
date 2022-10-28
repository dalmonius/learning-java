/*
	the differences between int and double
	plus, I'll make some float variables
*/

class Example3 {
	public static void main(String[] args){
		int vInt;
		double vDouble;

		vInt = 10;
		vDouble = 10.0;

		System.out.println(vInt);
		System.out.println(vDouble);

		vInt = vInt / 2;
		vDouble = vDouble / 2;

		System.out.println(vInt + " is the result of vInt / 2");
		System.out.println(vDouble + " is the result of vDouble / 2");

		// does the value of the variable is permanently updated?

		System.out.println("the updated value is: " + vInt);
		System.out.println("the updated value is: " + vDouble);
		
	}
}
