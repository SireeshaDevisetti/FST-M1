package Activitie;

public class Activity1 {


    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2016;
        toyota.color = "Grey";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}



