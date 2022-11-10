class guessTheLetterFour{
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'z';

        do{
            System.out.println("Guess the letter between A and Z" + "\n" + "Can you guess it? ... ");
            ch = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            if(ch == answer) System.out.println("You guessed right!");
            else{
                System.out.println("\nSorry...");
                if(ch < answer) System.out.println("you're too low." + "\n" + "try again.\n");
                else System.out.println("you're too high." + "\n" + "try again.\n");
            }
        } while(answer != ch);
    }
}