/*
   Student Name: Matthew St. Louis
   Student Number: 040799919
   Course & Section #: 23W_CST8288_011
   Declaration:
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * A class to test the implementation of the Strategy Design pattern on various 
 * measurement conversions. 
 * @author Matthew St. Louis
 * @since 19.0.1
 * @version 1.0
 */
public class UnitConverterTest {

    /**
     * Main entry point for the program. Creates a default Unit object and begins to 
     * convert manually inputted values. Starts with C to F, then F to C, then Deg to Rad,
     * and finally Rad to Deg. Printing a report each time a conversion happens, listing
     * the conversion type, the unit pre-conversion, and the unit post-conversion.
     * @param args command line arguments
     */
    public static void main(String[] args) {
                
                //initialize Unit object, is CFconverter by default
                Unit unit = new Unit();
                unit.convert(35);
                System.out.printf(unit.toString(35));
                
                //change conversion type to Farenheit -> Celsius
                unit.changeUnitConversion(new FCconverter());                
                unit.convert(85);
                System.out.printf(unit.toString(85));
                
                //change conversion type to Degrees -> Radians
                unit.changeUnitConversion(new DRconverter());
                unit.convert(180);
                //print string representation of object
                System.out.printf(unit.toString(180));
                
                //change conversion type to Radians -> Degrees
                unit.changeUnitConversion(new RDconverter());
                unit.convert(4);
                //print string representation of object
                System.out.printf(unit.toString(4));
	
	}

}
