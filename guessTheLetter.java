public class guessTheLetter {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'k';
        System.out.println("I'm thinking of a letter from A to Z.\nCan you guess it?\nPress a letter followed by ENTER: ...");
        ch = (char) System.in.read(); // the character is returned as an int hence the need for the cast
        if(ch == answer)
        {
            System.out.println("You're right!");
        }
        else
        {
            System.out.println("Wrong!! :(");
        }
    }
}
