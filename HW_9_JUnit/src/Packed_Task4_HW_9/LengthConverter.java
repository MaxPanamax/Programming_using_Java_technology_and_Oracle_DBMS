package Packed_Task4_HW_9;


public class LengthConverter {
 
     public double ConvertCentim(double millimeters) {
    	   double centimeters = millimeters / 10;
    	    return centimeters;
     }
     public double ConvertDecim(double millimeters) {
    	   double centimeters = millimeters / 10;
    	    double decimeters = centimeters / 10;
    	    return decimeters;
     }
     public double ConvertMetr(double millimeters) {
    	   double centimeters = millimeters / 10;
    	    double decimeters = centimeters / 10;
    	    double meters = decimeters / 10;
    	    return  meters;
     } 
     
     public double ConvertKilometr(double millimeters) {
 	   double centimeters = millimeters / 10;
 	    double decimeters = centimeters / 10;
 	    double meters = decimeters / 10;
 	    double kilometers = meters / 1000; 
 	    return  kilometers;
  }
  
}
