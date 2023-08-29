package Packed_Task3_HW_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStringManipulationApp {

	 @Test
	    public void testStringManipulationApp() {
	        StringManipulationApp app = new StringManipulationApp();
	        
	        // Проверка на палиндром
	        assertEquals(true, app.isPalindrome("level"));
	        assertEquals(true, app.isPalindrome("A man a plan a canal Panama"));
	        assertEquals(false, app.isPalindrome("hello"));
	        
	        // Подсчет гласных и согласных
	        assertEquals(3, app.countVowels("Hello World"));
	        assertEquals(7, app.countConsonants("Hello World"));
	        
	        // Подсчет количества вхождений слова
	        assertEquals(2, app.countWordOccurrences("Hello World Hello", "Hello"));
	        assertEquals(0, app.countWordOccurrences("Hello World", "Java"));
	    }

}
