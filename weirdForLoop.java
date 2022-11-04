/*
    This is a weird loop because the initialization and the iteration
    both contains two variables, two values.
    It is especially weird in the iteration part where you increment
    one variable and at the same decrement another.
    wtf!!
*/
public class weirdForLoop {
    public static void main(String[] args){
        int i, j;

        for(i=0, j=10; i < j; i++, j--){
            System.out.println("i and j: " + i + " " + j); // so weird!!
        }
    }
}
