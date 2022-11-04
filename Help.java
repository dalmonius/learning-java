public class Help {
    public static void main(String[] args) throws java.io.IOException  {
        char i;
        System.out.println("\n" + "Which control statement structure do you need?" + "\n" + "1. if" + "\n" + "2. switch" + "\n" + "Choose one: ");
        
        i = (char) System.in.read();
        
        if(i == '1')
        {
            System.out.println("\n" + "The if: " + "\n" + "if(condition) statement" + "\n");
        }
        if(i == '2')
        {
            System.out.println("\n" + "The switch: " + "\n" + "switch(expression){" + "\n" + "\tcase constant1:" + "\n" + "\t\tstatement sequence" + "\n" + "\t\tbreak;" + "\n" + "\tcase constant2:" + "\n" + "\t\tstatement sequence" + "\n" + "\t\tbreak;" + "\n");
        }
    }
}
