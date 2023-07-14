package STDemoPack;
import java.util.StringTokenizer;

public class STDemo {
	static String in = "Brand=Opel:" + "Mark=Corsa:" + "Engine=1.2 ecotec"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(in, "=:"); 
		 while (st.hasMoreTokens()) { 
		 String key = st.nextToken(); 
		 String val = st.nextToken(); 
		 System.out.println(key + "\t" + val); 
		 }
	}

}
