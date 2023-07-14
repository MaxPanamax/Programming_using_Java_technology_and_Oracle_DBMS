package OuterPack;

public class Outer {
private int field=0;
//Класс для управления полем внешнего класса

public class Inner{
//	Метод устанавливает значение внешнего класса
	
	public void setField(int f) {
		field=f;
	}	
}
public void showField() {
	System.out.println(field);
}
}
