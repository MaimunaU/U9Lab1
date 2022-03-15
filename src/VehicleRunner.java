public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle bike = new Bicycle("Green Bike", 2, 16);
    System.out.println(bike.getName());
    System.out.println(bike.getWheels());
    System.out.println(bike.getGearCount());
    bike.ringBell();
    bike.move(70);
    bike.turn(90);
    bike.brake(0.5);

    Skateboard board = new Skateboard("Skatey", 4, "green");
    System.out.println(board.getName());
    System.out.println(board.getWheels());
    System.out.println(board.getColor());
    board.trick();
    board.move(7);
    board.turn(35);
    board.brake(1);






  }
}