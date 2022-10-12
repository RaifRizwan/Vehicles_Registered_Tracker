public class Truck extends Vehicle{
    /**
     This is the Truck class which is the child class of Vehicle class.
     This class creates the truck object which can be used to store all
     information of a truck. This class has the setters - setIsSemi
     and setLoadCapacity with getters for each as well.
     The class also holds the constructor.
     */

    //Instance Variables - Private
    private boolean isSemi;
    private int loadCapacity;

    //Constructor
    public Truck(int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber, boolean isSemi, int loadCapacity) throws IllegalVehicleException {
        /**
         This is the Truck constructor.
         para: int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber, boolean isSemi, int loadCapacity
         return: none
         */
        super(registrationNumber, owner, odometerReading, make, model, year, numWheels, plateNumber);
        setIsSemi(isSemi);
        setLoadCapacity(loadCapacity);
    }

    //Setters
    /**
     This is the setter for IsSemi
     para: boolean isSemi
     return: none
     */
    public void setIsSemi(boolean isSemi) {
        this.isSemi = isSemi;
    }

    /**
     This is the setter for LoadCapacity
     para: int loadCapacity
     return: none
     */
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    //Getters
    /**
     This is the getter for IsSemi
     para: none
     return: this.isSemi
     */
    public boolean getisSemi() {
        return this.isSemi;
    }

    /**
     This is the getter for Load Capacity
     para: none
     return: this.loadCapacity
     */
    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    /**
     This is the getter for Number Axles
     para: none
     return: num_of_axles_calc
     */
    public int getNumberAxles(){
        // num_of_axles_calc is an int value which is calculated by called the getter - getNumWheels() and dividing by 2.
        int num_of_axles_calc = getNumWheels() / 2;
        return num_of_axles_calc;
    }

    @Override
    public String toString (){
        /**
         This is the toString function.The toString method is used
         to return a string representation of an object chosen, in
         this case - Truck Object
         para: none
         return: output_Truck
         */

        // Creating an output by calling a range of getters specific to vehicle truck.
        String output_Truck = "Truck Type: " + getYear() + " " + getMake()+ " "+ getModel() + ". Number Of wheels: " + getNumWheels() + ". Odometer reads: " + getOdometerReading() + ". Registration Number: " + getRegistrationNumber() + ". Plate Number: " + getPlateNumber() + ". More Information Of Truck - Is It A Semi: " + getisSemi() + ". Load Capacity(lbs): " + getLoadCapacity() + ". Number Of Axles: " + getNumberAxles() + ". Owner Info:" + getOwner();
        return output_Truck;
    }

}
