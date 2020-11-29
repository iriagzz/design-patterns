import Cars.Car;
import Cars.Manual;
import builders.CarBuilder;
import builders.CarManualBuilder;
import director.Director;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

	}
}