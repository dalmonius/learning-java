public class Help {
    public static void main(String[] args) throws java.io.IOException  {
        char i;
        System.out.println("\n" + "Which control statement structure do you need?" + "\n" + "1. if" + "\n" + "2. switch" + "\n" + "Choose one: ");
        
        i = (char) System.in.read();
        
        if(i == '1')
        {
            System.out.println("\n" + "The if: " + "\n" + "if(condition) statement");
        }
        if(i == '2')
        {
            System.out.println("\n" + "The switch: " + "\n" + "switch(expression){" + "\n" + "case constant1:" + "\n" + "statement sequence" + "\n" + "break;" + "\n" + "case constant2:" + "\n" + "statement sequence" + "\n" + "break;");
        }
    }
}
