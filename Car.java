public class Car extends Vehicle {
    /**
     This is the Car class which is the child class of Vehicle class.
     This class creates the car object which can be used to store all
     information of a car. This class has the setters - setNumSeats
     and setIsSUV with getters for each as well.
     The class also holds the constructor.
     */

    //Instance Variables - Private
    private int numSeats;
    private boolean isSUV;

    //Constructor
    public Car(int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber, int numSeats, boolean isSUV) throws IllegalVehicleException {
        /**
         This is the Car constructor.
         para:int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber, int numSeats, boolean isSUV
         return: none
         */
        super(registrationNumber, owner, odometerReading, make, model, year, numWheels, plateNumber);
        setNumSeats(numSeats);
        setIsSUV(isSUV);
    }

    //Setters
    /**
     This is the setter for NumSeats
     para: int numSeats
     return: none
     */
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    /**
     This is the setter for IsSUV
     para: boolean isSUV
     return: none
     */
    public void setIsSUV(boolean isSUV) {
        this.isSUV = isSUV;
    }

    //Getters
    /**
     This is the getter for NumSeats
     para: none
     return: this.numSeats
     */
    public int getNumSeats() {
        return this.numSeats;
    }

    /**
     This is the getter for IsSUV
     para: none
     return: this.isSUV
     */
    public boolean getIsSUV() {
        return this.isSUV;
    }

    @Override
    public String toString (){
        /**
         This is the toString function.The toString method is used
         to return a string representation of an object chosen, in
         this case - Car Object
         para: none
         return: output_Car
         */
        // Creating an output by calling a range of getters specific to vehicle car.
        String output_Car = "Car Type: " + getYear() + " " + getMake()+ " "+ getModel() + ". Number Of wheels: " + getNumWheels() + ". Odometer reads: " + getOdometerReading() + ". Registration Number: " + getRegistrationNumber() + ". Plate Number: " + getPlateNumber() + ". More Information Of The Car - Number Of Seats: " + getNumSeats() + ". Is It An SUV: " + getIsSUV() + ". Owner Info: " + getOwner();
        return output_Car;
    }

}
