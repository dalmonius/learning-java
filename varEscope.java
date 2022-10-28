public class varEscope {
    public static void main(String[] args){
        int x = 10; // this variable is known inside all of the main() class

        if(x == 10) {
            int y = 20; // this variable is known only inside this block "{}"
            System.out.println("x + y = " + (x + y)); // both variables can be read here
        }

        /*
         * y = 100;
         * 
         * if you try to compile the above line of code the program won't run because
         * the variable y was declared inside the if statement code block
         * hence, it cannot be read outside of it rendering an error
         * 
         * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
         * y cannot be resolved to a variable
         * at varEscope.main(varEscope.java:10)
         *  
         */
    }
}
