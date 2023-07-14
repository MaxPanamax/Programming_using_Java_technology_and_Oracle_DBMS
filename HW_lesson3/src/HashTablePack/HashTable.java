package HashTablePack;
import java.util.Dictionary; 
import java.util.Hashtable; 


public class HashTable {
	public static void main(String args[]) { 
		 Hashtable ht = new Hashtable(); 
		 ht.put("brand", "Opel"); 
		 ht.put("mark", "Corsa"); 
		 ht.put("engine", "1.2 ecotec"); 
		 ht.put("price", (95000)); 
		 show(ht); 
		 } 
		 static void show(Dictionary d) { 
		 System.out.println("Brand: " + d.get("brand")); 
		 System.out.println("Mark: " + d.get("mark")); 
		 System.out.println("Engine: " + d.get("engine")); 
		 System.out.println("Price: " + d.get("price")); 
		 } 
}
