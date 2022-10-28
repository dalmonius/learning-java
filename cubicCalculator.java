/*
    The program suggests to compute the number of cubic inches in a cubic mile.

    Since I'm used to the imperial system, I'll compute the number of cubic centimeters in a cubic kilometer.
*/

class cubicCalculator{
    public static void main(String[] args){
        long centimeters, kilometers;
        kilometers = 256;
        centimeters = kilometers * 1000000;

        System.out.println("There are " + centimeters);
        System.out.println("There are " + kilometers);
        System.out.println();
        System.out.println("1 km³ is " + centimeters + " cm³");
    }
}