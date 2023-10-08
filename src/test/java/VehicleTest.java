import org.assertj.core.internal.bytebuddy.utility.dispatcher.JavaDispatcher;
import org.example.HW2.Car;
import org.example.HW2.Motorcycle;
import org.example.HW2.Vehicle;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @Test
    public  void testCar(){
        Car car1 = new Car("BMW", "X5", 2015);
        //проверка того, что экземпляр объекта Car также является экземпляром Vehicle;
        assertInstanceOf(Vehicle.class, car1);
    }

    @Test
    public void  testCarNumWheels(){
        Car car1 = new Car("BMW", "X5", 2015);
        //проверка того, объект Car создается с 4-мя колесами
        int numWheels = 4;
        int numWheels1 = car1.getNumWheels();

        assertEquals(numWheels, numWheels1);
    }

    @Test
    public void testMotorcycleNumWheels(){
        Motorcycle motorcycle1 = new Motorcycle("HONDA", "CRB650R", 2020);
        //проверка того, объект Motorcycle создается с 2-мя колесами
        int numWheels = 2;
        int numWheels1 = motorcycle1.getNumWheels();

        assertEquals(numWheels, numWheels1);
    }

    @Test
    public void testCarTestDrive(){
        Car car1 = new Car("BMW", "X5", 2015);
        //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
        int carSpeed = 60;
        car1.testDrive();
        int carSpeedTestDrive = car1.getSpeed();

        assertEquals(carSpeed, carSpeedTestDrive);
    }

    @Test
    public void testMotorcycleTestDrive(){
        Motorcycle motorcycle1 = new Motorcycle("HONDA", "CRB650R", 2020);
        //проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
        int motorcycleSpeed = 75;
        motorcycle1.testDrive();
        int motorcycleSpeedTestDrive = motorcycle1.getSpeed();

        assertEquals(motorcycleSpeed, motorcycleSpeedTestDrive);
    }
    @Test
    public void testCarParkSpeed(){
        Car car1 = new Car("BMW", "X5", 2015);
        //проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
        // машина останавливается (speed = 0)
        int carSpeed = 0;
        car1.testDrive();
        car1.park();
        int carSpeedTestDrive = car1.getSpeed();

        assertEquals(carSpeed,carSpeedTestDrive);
    }

    @Test
    public void testMotorcycleParkSpeed(){
        Motorcycle motorcycle1 = new Motorcycle("HONDA", "CRB650R", 2020);
        //проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
        // мотоцикл останавливается (speed = 0)
        int motorcycleSpeed = 0;
        motorcycle1.testDrive();
        motorcycle1.park();
        int motorcycleSpeedTestDrive = motorcycle1.getSpeed();

        assertEquals(motorcycleSpeed, motorcycleSpeedTestDrive);
    }
}
