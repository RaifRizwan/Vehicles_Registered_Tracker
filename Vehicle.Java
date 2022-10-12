public class Vehicle {
    /**
     This class will be used to represent all types of vehicles. The sub class of
     Vehicle class are Car, Truck, and Motorcycle.These sub-classes will contain the
     variables and methods that are specific to those particular types of vehicles.
     This class has the setters - setRegistration, setOwner, setOdometer,
     setMake, setModel, setYear, setNumWheels,setPlateNumber with getters
     for each as well. The class also holds the constructor.
     */

    // instance variables - Private
    private int registrationNumber;
    private CarOwner owner;
    private int odometerReading;
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private String plateNumber;

    //constructor
    public Vehicle (int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber) throws IllegalVehicleException {
        /**
         This is the vehicle constructor.
         para: int registrationNumber, CarOwner owner, int odometerReading, String make, String model, int year, int numWheels, String plateNumber
         return: none
         */
        setRegistrationNumber(registrationNumber);
        setOwner(owner);
        setOdometer(odometerReading);
        setMake(make);
        setModel(model);
        setYear(year);
        setNumWheels(numWheels);
        setPlateNumber(plateNumber);

    }

    //setters
    /**
     This is the setter for registration number
     para: int registrationNumber
     return: none
     */
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     This is the setter for Owner
     para: CarOwner owner
     return: none
     */
    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    /**
     This is the setter for Odometer reading
     para: int odometerReading
     return: none
     */
    public void setOdometer(int odometerReading) throws IllegalVehicleException {
        // if odometer reading given is less than the current odometer reading - IllegalVehicleException thrown.
        if (odometerReading < this.odometerReading){
            throw new IllegalVehicleException("Illegal mileage - nice try!");
        }
        // Current odometer reading is changed to the given odometer reading
        this.odometerReading = odometerReading;
    }

    /**
     This is the setter for make
     para: String make
     return: none
     */
    public void setMake(String make) {this.make = make;}

    /**
     This is the setter for model
     para: String model
     return: none
     */
    public void setModel(String model) {this.model = model;}

    /**
     This is the setter for year
     para: int year
     return: none
     */
    public void setYear(int year) throws IllegalVehicleException {
        // if year given is less than 1980 - IllegalVehicleException thrown.
        if (year < 1980){
            throw new IllegalVehicleException("Illegal year - you need to buy a newer vehicle!");
        }
        //Current year is changed to the given year
        this.year = year;
    }

    /**
     This is the setter for numWheels
     para: int numWheels
     return: none
     */
    public void setNumWheels(int numWheels) throws IllegalVehicleException {
        // if numWheels given is less than 2 - IllegalVehicleException thrown.
        if (numWheels< 2){
            throw new IllegalVehicleException("Illegal number of wheels - buy a unicycle!");
        }
        //Current numWheels is changed to the given numWheels
        this.numWheels = numWheels;
    }

    /**
     This is the plate number checker function
     for setter plate number. This determines
     if the plate number inputted is legal.
     para: String plateNumber
     return: true, false.
     */
    private boolean plate_number_checker (String plateNumber) {
        // Assigning variables for use in method.
        int Alphabet = 0;
        int number = 0;
        int total_length = 0;

        // for loop in which variable z assigned values from 0 to 4.
        for (int z = 0; z < 4; z++){
            // if the character of the given String plate number from 0 to 4 is an Alphabet - Alphabet and total length variable added 1
            if (Character.isAlphabetic(plateNumber.charAt(z))){
                Alphabet = Alphabet + 1;
                total_length = total_length + 1;

            }
        }

        // for loop in which variable y assigned values from 4 to length of string plate number.
        for (int y = 4; y < plateNumber.length(); y++){
            // if the character of the given String plate number from 4 to length of string plate number is a digit - number and total length variable added 1
            if (Character.isDigit(plateNumber.charAt(y))){
                number = number + 1;
                total_length = total_length + 1;
            }
        }

        // if Alphabet variable is equal to 4 and number variable is equal to 3 and total length is equal to 7 - boolean value true returned
        if ((Alphabet == 4) && (number == 3) && (total_length == 7)){
            return true;
        }

        // else statement - boolean value false returned.
        else {
            return false;
        }
    }

    /**
     This is the setter for plate number
     para: String plateNumber
     return: none
     */
    public void setPlateNumber(String plateNumber) throws IllegalVehicleException{
        // plate number checker method called with String plate number. If the return value is false - IllegalVehicleException thrown.
        if (!plate_number_checker(plateNumber)){
            throw new IllegalVehicleException("Illegal license plate!");
        }
        // Current plate number is changed to the given plate number
        this.plateNumber = plateNumber;

    }

    //getters
    /**
     This is the getter for registration number
     para: none
     return: this.registrationNumber
     */
    public int getRegistrationNumber() {return this.registrationNumber;}

    /**
     This is the getter for owner
     para: none
     return: this.owner
     */
    public CarOwner getOwner() {return this.owner;}

    /**
     This is the getter for odometer reading
     para: none
     return: this.odometerReading
     */
    public int getOdometerReading() {return this.odometerReading;}

    /**
     This is the getter for make
     para: none
     return: this.make
     */
    public String getMake() {return this.make;}

    /**
     This is the getter for model
     para: none
     return: this.model
     */
    public String getModel() {return this.model;}

    /**
     This is the getter for year
     para: none
     return: this.year
     */
    public int getYear() {return this.year;}

    /**
     This is the getter for NumWheels
     para: none
     return: this.numWheels
     */
    public int getNumWheels() {return this.numWheels;}

    /**
     This is the getter for plate number
     para: none
     return: this.plate number
     */
    public String getPlateNumber() {return this.plateNumber;}

    @Override
    public String toString (){
        /**
         This is the toString function.The toString method is used
         to return a string representation of an object chosen, in
         this case - Vehicle object.
         para: none
         return: output_Vehicle
         */
        // Creating an output by calling a range of getters specific to vehicle.
        String output_Vehicle = "Vehicle Type:" + getYear() + " " + getMake()+ " "+ getModel() + ". Number Of wheels: " + getNumWheels() + ". Odometer reads: " + getOdometerReading() + ". Registration Number: " + getRegistrationNumber() + ". Plate Number: " + getPlateNumber() + ". Owner: " + getOwner();
                return output_Vehicle;
    }
}
