class typePromotion{
    public static void main(String[] args){
        byte b = 100;
        int i = b * b;
        System.out.println(i); // datatype is converted to int

        b = (byte) (b * b); // the cast here is used in order to return the promotion back to byte. Is that right?
        System.out.println(b);
    }
}