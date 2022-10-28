// this program demonstrates casting. I have no idea how this can be useful but I'm interested.

public class casting {
    public static void main(String[] args){
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        System.out.println("\n" + "original datatype 'double' x and y value before casting:\nx = " + x + " and y = " + y);

        i = (int) (x / y); // this will "cast" the datatype of x / y (which were double to begin with)to int and write it to i, is that right?
        System.out.println("\n" + "x / y = " + i + " as an integer.");

        i = 100;
        b = (byte) i; // here there is no data loss
        System.out.println("\n" + "dataype byte and the value of b is: " + b);

        i = 257;
        b = (byte) i; // here there will be data loss
        System.out.println("\n" + "dataype byte and the value of b is: " + b);

        b = 88; // ASCII code for X
        ch = (char) b; // cast between incompatible types. You cannot cast a char (ch) variable to a byte (b) variable.
        System.out.println("\n" + "ch: " + ch);
    }
}
