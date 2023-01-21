/*
   Student Name: Matthew St. Louis
   Student Number: 040799919
   Course & Section #: 23W_CST8288_011
   Declaration:
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;

/**
 * Class Unit is designed to represent an arbitrary unit that is to be converted using the 
 * UnitCoverter interface that is implemented by various other classes.
 * @author Matthew St. Louis, 040799919
 * @since 19.0.1
 * @version 1.0
 */
public class Unit {

    private double convertedUnit;//the unit post-conversion
    private UnitConverter unitConverter;//the type of conversion happening
    
    /**
     * no @param constructor sets unitConverter to Celsius -> Fahrenheit
     * by default
     */
    public Unit() {
        convertedUnit = 0;
        this.unitConverter = new CFconverter();
    }
    
    /**
     * getConvertedUnit() 
     * @return the converted unit stored in this instance 
     */
    public double getConvertedUnit(){
        return this.convertedUnit;
    }
    
    /**
     * convert() converts and stores the unit in this object
     * using interfaced methods
     * @param unit to be converted
     * @return convertedUnit containing the converted unit
     */
    public double convert(double unit){
        convertedUnit = this.unitConverter.convert(unit);
        return convertedUnit;
    }
    
     /**
     * changeUnitConversion() sets the type of conversion for this
     * object
     * @param unitConverter the type of conversion to be changed to
     */
    public void changeUnitConversion(UnitConverter unitConverter){
	
            this.unitConverter = unitConverter;
		
	}
    
     /**
     * toString(double originalUnit) creates a formatted string
     * representation of the object for use in print functions. This
     * is not an Override of the Class String method toString().
     * @param originalUnit that will be converted
     * @return the formatted string representation of the object
     */
    public String toString(double originalUnit) {
        //create builder object
	StringBuilder builder = new StringBuilder();
        //start the building
	builder.append("\nConversion happening: ")
		.append(String.format(unitConverter.unitConversionType()))
		.append("\nUnit before conversion: ")
		.append(originalUnit)
                .append("\nUnit after conversion: ")
                .append(String.format("%.2f",this.convertedUnit))
                .append("\n");
        //return the build
	return builder.toString();
        }   
}
