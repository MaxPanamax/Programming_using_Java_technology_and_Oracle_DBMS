package Packed_Task3_HW_9;

public class StringManipulationApp {
	 public boolean isPalindrome(String str) {
	        // Удаляем все пробелы и приводим строку к нижнему регистру
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	    
	    public int countVowels(String str) {
	        // Удаляем все пробелы и приводим строку к нижнему регистру
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        
	        int count = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++;
	            }
	        }
	        
	        return count;
	    }
	    
	    public int countConsonants(String str) {
	        // Удаляем все пробелы и приводим строку к нижнему регистру
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        
	        int count = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
	                count++;
	            }
	        }
	        
	        return count;
	    }
	    
	    public int countWordOccurrences(String str, String word) {
	        // Разбиваем строку на слова
	        String[] words = str.split("\\s+");
	        
	        int count = 0;
	        
	        for (String w : words) {
	            if (w.equalsIgnoreCase(word)) {
	                count++;
	            }
	        }
	        
	        return count;
	    }
}
