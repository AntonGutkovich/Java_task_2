import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Car car_1 = new Car();
        car_1.To_String();
        car_1.Print_age();
        Car car_2 = new Car("Audi", "red", "123456", 2005);
        car_2.To_String();
        car_2.Print_age();
        Car car_3 = new Car("BMW", "model");
        car_3.To_String();
        Car car_4=new Car("super red", "color");
        car_4.To_String();
        Car car_5=new Car("Amogus", "license");
        car_5.To_String();
        Car car_6=new Car("2006", "year");
        car_6.To_String();
        car_6.Print_age();
    }
}