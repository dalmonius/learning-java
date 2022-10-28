/*
	Example2 where how to declare a variable is shown
*/

class Example2 {
	public static void main(String[] args){
		int myVar1;
		int myVar2;

		/*
		variables of the same data type can be declared like this:
		int myVar1, myVar2;
		*/
		
		myVar1 = 1024;
		System.out.println("myVar1: " + myVar1);

		myVar2 = myVar1 / 2;
		
		System.out.println("myVar2 contains myVar1 / 2");
		System.out.println("myVar2: " + myVar2);
	}
}
