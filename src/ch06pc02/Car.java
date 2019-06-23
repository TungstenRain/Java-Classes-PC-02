package ch06pc02;

/**
 *
 * @author Frank
 * date 11/8/2017
 * purpose: Car Class
 */
public class Car {
    //fields
    private int yearModel;  //Car's model year
    private String make;    //Car's make
    private int speed;      //Car's current speed
    
    //Constructors
    public Car(int year, String carMake)
    {
        yearModel = year;
        make = carMake;
        speed = 0;
    }
    public Car()
    {
        yearModel = 0;
        make = "";
        speed = 0;        
    }
    
    //Methods
    public int getYearModel()
    {
        return yearModel;
    }
    public void setYearModel(int year)
    {
        yearModel = year;
    }
    
    public String getMake()
    {
        return make;
    }
    public void setMake(String carMake)
    {
        make = carMake;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    public int accelerate()
    {
        return speed += 5;
    }
    
    public int decelerate()
    {
        return speed -= 5;
    }
}
