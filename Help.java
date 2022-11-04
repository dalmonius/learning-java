public class Help {
    public static void main(String[] args) throws java.io.IOException{
        char i;
        System.out.println("\n" + "Which control statement structure do you need?" + "\n" + "1. if" + "\n" + "2. if (complete) " + "\n" + "3. switch" + "\n" + "4. for" + "\n" + "Choose one: ");
        
        i = (char) System.in.read();
        
        if(i == '1') // maybe I should use a switch at this point
        {
            System.out.println("\n" + "The if: " + "\n" + "if(condition) statement" + "\n");
        }
        if(i == '2')
        {
            System.out.println("\n" + "The complete if: " + "\n" + "if(contition){" + "\n" + "\tstatement\n}" + "");
        }
        if(i == '3')
        {
            System.out.println("\n" + "The switch: " + "\n" + "switch(expression){" + "\n" + "\tcase constant1:" + "\n" + "\t\tstatement sequence" + "\n" + "\t\tbreak;" + "\n" + "\tcase constant2:" + "\n" + "\t\tstatement sequence" + "\n" + "\t\tbreak;" + "\n" + "}");
        }
        if(i == '4')
        {
            System.out.println("\n" + "The for:" + "\n" + "for(initialization; condition; interation){" + "\n" + "\tstatement" + "\n" + "\t}");
        }
    }
}