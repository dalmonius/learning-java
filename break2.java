public class break2 {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        for ( ; ; ){
            System.out.println("...");
            ch = (char) System.in.read();
            if(ch == 'q') break;
        }
    }
}
