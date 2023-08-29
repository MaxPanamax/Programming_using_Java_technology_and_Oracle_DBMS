package Packed_Task5_HW_9;

public class WeightConvert {
	 public double ConvertGr(double mgr) {
  	   double gr = mgr / 1000;
  	    return gr;
   }
   public double ConvertKg(double mgr) {
	   double gr = mgr / 1000;
  	    double kg = gr / 1000;
  	    return kg;
   }
   public double ConvertHundredweight(double mgr) {
	   double gr = mgr / 1000;
 	    double kg = gr / 1000;
  	    double hundredweight = kg / 100;
  	    return hundredweight;
   } 
   
   public double ConvertTon(double mgr) {
	   double gr = mgr / 1000;
	    double kg = gr / 1000;
 	    double hundredweight = kg / 100;
	    double ton = hundredweight / 10; 
	    return  ton;
}
}
