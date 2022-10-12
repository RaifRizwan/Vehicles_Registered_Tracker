public class IllegalVehicleException extends Exception {
    /**
     This exception class throws an "IllegalVehicle" exception object if an
     attempt is made to set or alter any of the chosen attributes to illegal values.
     The chosen attributes in which the exception is thrown are - vehicle's year,
     setMileage Method, number of wheels, vehicle's plate number, age, yearsDriving
     */

    /**
     This is the Illegal Vehicle Exception function.
     This function changes the exception message
     depending on which illegal value is inputted.
     para: String Message
     return: none
     */
    public IllegalVehicleException (String Message) {
        super (Message);
    }

}
