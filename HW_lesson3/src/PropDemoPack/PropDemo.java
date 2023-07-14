package PropDemoPack;
import java.util.Properties;

public class PropDemo {
	static Properties prop = new Properties(); 
	 public static void main(String args[]) { 
	 prop.put("Brand", "put brand here"); 
	 prop.put("Mark", "put mark here"); 
	 prop.put("Engine", "engine not set"); 
	 Properties book = new Properties(prop); 
	 book.put("Brand", "Opel"); 
	 book.put("Mark", "Corsa"); 
	 System.out.println("Brand: " +book.getProperty("Brand")); 
	 System.out.println("Mark: " +book.getProperty("Mark")); 
	 System.out.println("Engine: " +book.getProperty("Engine")); 
	 System.out.println("other: " +book.getProperty("other", "???")); 
	 } 
}
