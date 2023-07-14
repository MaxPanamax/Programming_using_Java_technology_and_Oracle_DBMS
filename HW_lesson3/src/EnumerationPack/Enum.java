package EnumerationPack;
import java.util.Enumeration;

class Enum implements Enumeration{
	private int count = 0; 
	private boolean more = true; 
	 public boolean hasMoreElements() { 
	 return more; 
	 } 
	 public Object nextElement() { 
		 count++; 
		 if (count > 4) more = false; 
		 return (count); 
		 } 
	 
} 


