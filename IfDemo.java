/*
	java if
*/

class IfDemo{
	public static void main(String[] args){
		int a, b, c;
		a = 2;
		b = 3;
		if(a < b) System.out.println("a < b");
		if(a == b) System.out.println("won't display");
		System.out.println(); // /n
		c = a-b; // 2 - 3 = -1
		System.out.println("variable c contrains: " + c);
		if(c >= 0) System.out.println("variable c is greater than zero"); // wont display
		if(c < 0) System.out.println("variable c is lesser than zero");
	}
}
