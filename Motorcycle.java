public class Motorcycle extends Vehicle{
    /**
     This is the Motorcycle class which is the child class of Vehicle class.
     This class creates the motorcycle object which can be used to store
     all information of a motorcycle. This class has no setters or
     getters. The class also holds the constructor.
     */

    //Constructor
    public Motorcycle(int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber) throws IllegalVehicleException {
        /**
         This is the Motorcycle constructor.
         para:int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber
         return: none
         */
        super(registrationNumber, owner, odometerReading, make, model, year, numWheels, plateNumber);
    }

    @Override
    public String toString (){
        /**
         This is the toString function.The toString method is used
         to return a string representation of an object chosen, in
         this case - Motorcycle Object
         para: none
         return: output_Motorcycle
         */
        // Creating an output by calling a range of getters specific to vehicle motorcycle.
        String output_Motorcycle = "Motorcycle Type: " + getYear() + " " + getMake()+ " "+ getModel() + ". Number Of wheels: " + getNumWheels() + ". Odometer reads: " + getOdometerReading() + ". Registration Number: " + getRegistrationNumber() + ". Plate Number: " + getPlateNumber() + ". Owner Info: " + getOwner();
        return output_Motorcycle;
    }

}
