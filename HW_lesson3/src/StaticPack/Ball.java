package StaticPack;

public class Ball {
	
//	 Сатическое поле для хранения кол-ва
//	 существующих экземпляров класса 
	  
	private static int count=0;
	
//	Метод возвращает кол-ва
//	 существующих экземпляров класса
	
	static int getCountInctence() {
		return count;
	}
	
	public String color="none";
	
	public Ball(String color) {
		this.color=color;
		//Увеличиваем значение счетчика
		count++;
	}
	protected void finalizy() {
		System.out.println("ASD");
		//Уменьшаем значение счетчика
		count--;
	}
	
}
