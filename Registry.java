/*

This program is a software that will keep record of the vehicles registered
within the province. For simplicity, the software will only focus on the following
types of Vehicle: Car, Truck and Motorcycle.

Author: Raif Rizwan Karkal
Date: 22nd July 2022

 */

import java.util.ArrayList;

public class Registry {
    /**
     This class is a simple collection class that represents a collection of vehicle objects.
     This class holds the main which is where the data is added to the vehicle collection.
     It is also where print statements are held. Additionally, this class has multiple
     functions such as add vehicle, average mileage and print registry. Lastly,
     this class holds getters and setters which are - setVehicleCollection, setnumVehicles,
     getVehicleCollection, GetNumvehicles.

     */

    //Instance Variables - Private and Static
    // Vehicle Collection variable with data type - ArrayList.
    private static ArrayList vehicleCollection = new ArrayList();
    // num Vehicle variable with data type - int
    private static int numVehicles;

    //Setters
    /**
     This is the setter for VehicleCollection
     para: ArrayList vehicleCollection
     return: none
     */
    public void setVehicleCollection(ArrayList vehicleCollection) {
        this.vehicleCollection = vehicleCollection;
    }

    /**
     This is the setter for NumVehicles
     para: int numVehicles
     return: none
     */
    public void setNumVehicles(int numVehicles) {
        this.numVehicles = numVehicles;
    }

    //Getters
    /**
     This is the getter for Vehicle Collection
     para: none
     return: this.vehicleCollection
     */
    public ArrayList getVehicleCollection() {return this.vehicleCollection;}

    /**
     This is the getter for NumVehicle
     para: none
     return: this.numVehicle
     */
    public int getNumVehicles() {
        // Equating numVehicle to the size of arraylist Vehicle Collection
        numVehicles = vehicleCollection.size();
        return this.numVehicles;
    }


    // Add Vehicle
    private void addVehicle (Vehicle vehicle_add){
        /**
         *
         This is the add Vehicle function. This function is responsible for taking
         in the parameter vehicle_add, which is of data type - Vehicle, and adding it
         to the vehicle collection array.

         Para: Vehicle vehicle_add
         Return: none
         */

        vehicleCollection.add(vehicle_add);
    }


    private void printRegistry(){
        /**
         This is the print registry function. This function loops through
         the vehicle collection array and prints all the vehicles that are
         currently inventoried in the registry.

         Para: None
         Return: None
         */

        // For loop which assigns variable i from 0 to the size of the vehicle collection.
        for(int i=0; i<vehicleCollection.size(); i++) {
            // printing each vehicle in vehicle collection
            System.out.println(vehicleCollection.get(i));
        }
    }


    private void averageMileage (){
        /**
         This is the averageMileage function. This function loops through
         the vehicle collection array and gets the mileage for each vehicle.
         It totals all the mileage and divides it by the length of the array.

         Para: None
         Return: None
         */

        // Assigning variables for use in method.
        int total_OdometerReading = 0;
        float averageMileage = 0;
        int Vehicle_Array_size = vehicleCollection.size();

        // for loop in which variable i assigned to value's from 0 to size of vehicle collection.
        for(int i=0; i<vehicleCollection.size(); i++) {
            // assigning each vehicle in vehicle collection, to vehicle object.
            Vehicle vehicle_object = (Vehicle) vehicleCollection.get(i);
            // using the getter - getOdometerReading() to get each vehicle's odometer reading.
            int Odometer_reading = vehicle_object.getOdometerReading();
            // adding each vehicle's odometer reading.
            total_OdometerReading = total_OdometerReading + Odometer_reading;

        }
        // dividing the total odometer reading with the size of vehicle array to get the average
        averageMileage = total_OdometerReading / Vehicle_Array_size;
        System.out.println(averageMileage);
    }



    public static void main (String[] args) throws IllegalVehicleException {
        /**
         This is the main function. This function is used for creating
         the different car owner objects and different vehicle objects.
         This is also used for conducting different test such as testing the
         exceptions to make sure it appears when an illegal value is entered
         as well as making sure different functionalities of the program
         is working.

         */

        // Creating new registry object.
        Registry registry = new Registry();

        // Try and catch used for testing of program. Catch function used if an illegal value is inputed - IllegalVehicleException class called with exception printed depending on illegal value type.
        try{
            // Creating different vehicle objects and adding to vehicle collection registry
            CarOwner owner_1 = new CarOwner("Raif", 20, "L232131", 3);
            Car vehicle_1 = new Car(987662, owner_1, 33125, "Mercedes", "c200", 2016, 4, "ABCD123", 5,false);
            registry.addVehicle(vehicle_1);

            CarOwner owner_2 = new CarOwner("Lewis", 30, "M44444", 5);
            Truck vehicle_2 = new Truck(7455383, owner_2, 12123, "Volvo", "b20", 2016, 8, "CFAD213", true,2000);
            registry.addVehicle(vehicle_2);

            CarOwner owner_3 = new CarOwner("Max", 23, "N33987", 2);
            Motorcycle vehicle_3 = new Motorcycle(45323432, owner_3, 43231, "Ducati", "Sports", 2019, 2, "EKET323");
            registry.addVehicle(vehicle_3);

            System.out.println("Testing - Vehicle Registry printed by calling the print registry method: ");
            registry.printRegistry();
            System.out.println(" ");
            System.out.println("Testing - Average Mileage of all vehicles in the Registry printed by calling the average mileage method (Output must be 29493): ");
            registry.averageMileage();
            System.out.println(" ");
            System.out.println("Testing - Number of Vehicles in the Registry printed by calling the getNumVehicles method (Output must be 3): ");
            System.out.println(registry.getNumVehicles());
            System.out.println(" ");
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
        }

        // Testing Of Illegal Vehicle Exceptions
        System.out.println("Testing Illegal Vehicle Exception - Illegal Year (If vehicle's year is earlier than 1980, it throws an exception): ");
        try {
            CarOwner owner_4 = new CarOwner("Daniel", 21, "O33987", 2);
            Motorcycle vehicle_4 = new Motorcycle(45323432, owner_4, 43200, "BMW", "Sports", 1900, 2, "EKET323");
            registry.addVehicle(vehicle_4);

            registry.printRegistry();
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");
        }

        System.out.println("Testing Illegal Vehicle Exception - Illegal Mileage (If set mileage is less than old value, it throws an exception): ");
        try {
            CarOwner owner_5 = new CarOwner("Daniel", 25, "P33987", 2);
            Motorcycle vehicle_5 = new Motorcycle(45323432, owner_5, 43600, "Honda", "Sports", 2001, 2, "EKET323");
            registry.addVehicle(vehicle_5);

            vehicle_5.setOdometer(4300);
            registry.printRegistry();
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");
        }

        System.out.println("Testing Illegal Vehicle Exception - Illegal Number Of Wheels (If an attempt is made to set the number of wheels to less than two, throws an exception): ");
        try {
            CarOwner owner_6 = new CarOwner("Philips", 30, "Q33987", 2);
            Motorcycle vehicle_6 = new Motorcycle(45323432, owner_6, 41230, "Honda", "Sports", 2012, 1, "EKET323");
            registry.addVehicle(vehicle_6);

            registry.printRegistry();
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");
        }

        System.out.println("Testing Illegal Vehicle Exception - Illegal Plate Number (If there is an attempt to set the vehicle's plate number to an illegal value, throws an exception): ");
        try {
            CarOwner owner_7 = new CarOwner("louis", 35, "E33987", 2);
            Car vehicle_7 = new Car(45323432, owner_7, 41230, "Tesla", "EV", 2012, 4, "323WOW", 5, false);
            registry.addVehicle(vehicle_7);

            registry.printRegistry();
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");
        }

        System.out.println("Testing Illegal Vehicle Exception - Illegal Value - Age (If there is an attempt to set the age less than 0, throws an exception): ");
        try {
            CarOwner owner_8 = new CarOwner("William", -1, "L33987", 2);
            Car vehicle_8 = new Car(45323432, owner_8, 41230, "Ford", "EV", 2012, 4, "WOWQ321", 5, false);
            registry.addVehicle(vehicle_8);

            registry.printRegistry();
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");
        }

        System.out.println("Testing Illegal Vehicle Exception - Illegal Value - YearsDriving (If there is an attempt to set the YearsDriving less than 0, throws an exception): ");
        try {
            CarOwner owner_9 = new CarOwner("Max", 19, "T33987", -1);
            Car vehicle_9 = new Car(45323432, owner_9, 41230, "Ford", "EV", 2012, 4, "WOWQ321", 5, false);
            registry.addVehicle(vehicle_9);

            registry.printRegistry();
        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");
        }

        // Testing Of Getters And Setters
        System.out.println("Testing Of Some Getters And Setters: ");
        try {
            CarOwner owner_10 = new CarOwner("Max", 19, "T33987", 2);
            Car vehicle_10 = new Car(45323432, owner_10, 41230, "Ford", "EV", 2012, 4, "WOWQ321", 5, false);
            registry.addVehicle(vehicle_10);

            System.out.println("Getting the Name (Before Changing): ");
            System.out.println(owner_10.getName());
            owner_10.setName("Alex");
            System.out.println("Getting the Name (After Changing): ");
            System.out.println(owner_10.getName());
            System.out.println(" ");

            System.out.println("Getting the age (Before Changing): ");
            System.out.println(owner_10.getAge());
            owner_10.setAge(31);
            System.out.println("Getting the License Number (After Changing): ");
            System.out.println(owner_10.getAge());
            System.out.println(" ");

            System.out.println("Getting the Years Driving (Before Changing): ");
            System.out.println(owner_10.getYearsDriving());
            owner_10.setYearsDriving(5);
            System.out.println("Getting the Years Driving (After Changing): ");
            System.out.println(owner_10.getYearsDriving());
            System.out.println(" ");

            System.out.println("Getting the License Number (Before Changing): ");
            System.out.println(owner_10.getLicenseNumber());
            owner_10.setLicenseNumber("M947391");
            System.out.println("Getting the License Number (After Changing): ");
            System.out.println(owner_10.getLicenseNumber());
            System.out.println(" ");

            System.out.println("Getting the Years Driving (Before Changing): ");
            System.out.println(owner_10.getYearsDriving());
            owner_10.setYearsDriving(5);
            System.out.println("Getting the Years Driving (After Changing): ");
            System.out.println(owner_10.getYearsDriving());
            System.out.println(" ");

            System.out.println("Getting the registration number (Before Changing): ");
            System.out.println(vehicle_10.getRegistrationNumber());
            vehicle_10.setRegistrationNumber(12397641);
            System.out.println("Getting the registration number (After Changing): ");
            System.out.println(vehicle_10.getRegistrationNumber());
            System.out.println(" ");

            System.out.println("Getting the Odometer Reading (Before Changing): ");
            System.out.println(vehicle_10.getOdometerReading());
            vehicle_10.setOdometer(48000);
            System.out.println("Getting the Odometer Reading (After Changing): ");
            System.out.println(vehicle_10.getOdometerReading());
            System.out.println(" ");

            System.out.println("Getting the Make (Before Changing): ");
            System.out.println(vehicle_10.getMake());
            vehicle_10.setMake("BMW");
            System.out.println("Getting the Make (After Changing): ");
            System.out.println(vehicle_10.getMake());
            System.out.println(" ");

            System.out.println("Getting the Model (Before Changing): ");
            System.out.println(vehicle_10.getModel());
            vehicle_10.setModel("M5");
            System.out.println("Getting the Model (After Changing): ");
            System.out.println(vehicle_10.getModel());
            System.out.println(" ");

            System.out.println("Getting the Year (Before Changing): ");
            System.out.println(vehicle_10.getYear());
            vehicle_10.setYear(2022);
            System.out.println("Getting the Year (After Changing): ");
            System.out.println(vehicle_10.getYear());
            System.out.println(" ");

            System.out.println("Getting the Number Of Wheels (Before Changing): ");
            System.out.println(vehicle_10.getNumWheels());
            vehicle_10.setNumWheels(5);
            System.out.println("Getting the Number Of Wheels (After Changing): ");
            System.out.println(vehicle_10.getNumWheels());
            System.out.println(" ");

            System.out.println("Getting the Plate Number (Before Changing): ");
            System.out.println(vehicle_10.getPlateNumber());
            vehicle_10.setPlateNumber("FAMK123");
            System.out.println("Getting the Plate Number (After Changing): ");
            System.out.println(vehicle_10.getPlateNumber());
            System.out.println(" ");

            System.out.println("Getting the Number Of Seats (Before Changing): ");
            System.out.println(vehicle_10.getNumSeats());
            vehicle_10.setNumSeats(4);
            System.out.println("Getting the Number Of Seats (After Changing): ");
            System.out.println(vehicle_10.getNumSeats());
            System.out.println(" ");

            System.out.println("Getting the boolean value for IsSUV (Before Changing): ");
            System.out.println(vehicle_10.getIsSUV());
            vehicle_10.setIsSUV(true);
            System.out.println("Getting the boolean value for IsSUV (After Changing): ");
            System.out.println(vehicle_10.getIsSUV());
            System.out.println(" ");

        }

        catch (IllegalVehicleException i){
            System.out.println(i.getMessage());
            System.out.println(" ");

        }
    }
}
