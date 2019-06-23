package ch06pc02;

/**
 *
 * @author Frank
 * date 11/8/2017
 * purpose: to play around with cars
 */
public class Ch06pc02 {

    public static void main(String[] args) {
        //variables
        int i;
        
        //instantiate car class
        Car redCar = new Car(1956, "Shelby Cobra");
        
        for (i = 0; i < 5; i++)
        {
            redCar.accelerate();
            System.out.println(redCar.getMake() + " has a current speed of " + redCar.getSpeed());
        }
        for (i = 0; i < 5; i++)
        {
            redCar.decelerate();
            System.out.println(redCar.getMake() + " has a current speed of " + redCar.getSpeed());
        }
    }
    
}
