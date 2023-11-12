package HomeWork2;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void testCarInstanceIsAlsoVehicle() {
        Car car = new Car("Toyota", "LandCruiser", 2023);
        Assert.assertEquals(true, car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "LandCruiser", 2023);
        int expectedNumWheels = 4;
        Assert.assertEquals(expectedNumWheels, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Minsk", "SCR 250", 2022);
        int expectedNumWheels = 2;
        Assert.assertEquals(expectedNumWheels, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDriveMode() {
        Car car = new Car("Hyundai", " Santa Fe", 2023);
        int expectedSpeed = 60;
        car.testDrive();
        Assert.assertEquals(expectedSpeed, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedInTestDriveMode() {
        Motorcycle motorcycle = new Motorcycle("BMW", "K1600GTL ", 2015);
        int expectedSpeed = 75;
        motorcycle.testDrive();
        Assert.assertEquals(expectedSpeed, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsInParkMode() {
        Car car = new Car("Hyundai", " Santa Fe", 2023);
        car.testDrive();
        car.park();
        int expectedSpeed = 0;
        Assert.assertEquals(expectedSpeed, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsInParkMode() {
        Motorcycle motorcycle = new Motorcycle("BMW", "K1600GTL ", 2015);
        motorcycle.testDrive();
        motorcycle.park();
        int expectedSpeed = 0;
        Assert.assertEquals(expectedSpeed, motorcycle.getSpeed());
    }
}

