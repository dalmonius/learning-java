public class fuelEfficiency {
    public static void main(String[] args){
        double fuel, km, price, autonomy, spent, efficiency;
        fuel = 45;
        km = 155;
        price = 4.5;
        autonomy = 15;

        spent = price * fuel; // how much you spent on fuel
        efficiency = km / autonomy; // how much fuel you use

        System.out.println("You will spend: " + spent + " on " + fuel + "liters of fuel");
        System.out.println("You vehicle will spend " + efficiency + " litters of fuel in a " + km + " kilometer trip");
    }
}
