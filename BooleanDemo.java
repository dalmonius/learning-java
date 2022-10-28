public class BooleanDemo {
    public static void main(String[] args){
        boolean b;

        b = false;
        System.out.println("boolean variable b is: " + b);

        b = true;
        System.out.println("boolean variable b is: " + b);

        // a boolean variable can control an if statement by itself
        if(b) System.out.println("if true, it will be executed");

        b = false;

        if(b) System.out.println("if false, it won't be executed");
    }
}
