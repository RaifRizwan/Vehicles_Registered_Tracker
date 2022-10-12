public class CarOwner {
    /**
     This is the CarOwner class. This class is used to create the car owner object which
     represent the vehicle owner information. This class has the setters - setName, setAge,
     setLicenseNumber and setYearsDriving with getters for each as well.
     The class also holds the constructor.
     */

    //instance variables - Private
    private String name;
    private int age;
    private String licenseNumber;
    private int yearsDriving;

    //constructor
    public CarOwner (String name, int age, String licenseNumber, int yearsDriving) throws IllegalVehicleException {
        /**
         This is the CarOwner constructor.
         para: String name, int age, String licenseNumber, int yearsDriving
         return: none
         */
        setName(name);
        setAge(age);
        setLicenseNumber(licenseNumber);
        setYearsDriving(yearsDriving);
    }

    //setters
    /**
     This is the setter for Name
     para: String name
     return: none
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     This is the setter for age
     para: int age
     return: none
     */
    public void setAge(int age) throws IllegalVehicleException {
        // if age given is less than 0 - IllegalVehicleException thrown.
        if (age < 0 ){
            throw new IllegalVehicleException("Illegal value!");
        }
        // Current age is changed to the given age.
        this.age = age;
    }

    /**
     This is the setter for License Number
     para: String licenseNumber
     return: none
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     This is the setter for Years Driving
     para: int yearsDriving
     return: none
     */
    public void setYearsDriving(int yearsDriving) throws IllegalVehicleException{
        // if yearsDriving given is less than 0 - IllegalVehicleException thrown.
        if (yearsDriving < 0){
            throw new IllegalVehicleException("Illegal value!");
        }
        // Current yearsDriving is changed to the given yearsDriving.
        this.yearsDriving = yearsDriving;
    }

    //getters
    /**
     This is the getter for Name
     para: none
     return: this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     This is the getter for Age
     para: none
     return: this.age
     */
    public int getAge() {
        return this.age;
    }

    /**
     This is the getter for License Number
     para: none
     return: this.licenseNumber
     */
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    /**
     This is the getter for Years Driving
     para: none
     return: this.yearsDriving
     */
    public int getYearsDriving() {
        return this.yearsDriving;
    }

    @Override
    public String toString (){
        /**
         This is the toString function.The toString method is used
         to return a string representation of an object chosen, in
         this case - CarOwner Object
         para: none
         return: output_CarOwner
         */
        // Creating an output by calling a range of getters specific to Car Owner.
        String output_CarOwner = "Owner Name: " + getName() + ". Age: " + getAge() + ". License Number: " + getLicenseNumber() + ". Years Of Driving: " + getYearsDriving();
        return output_CarOwner;
    }

}
