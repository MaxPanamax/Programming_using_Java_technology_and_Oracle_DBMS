package GenericTypes;
import java.util.Vector;

//Настраиваемые типы(Generic types)

public class Pair <T,T2> {
	T v1; 
	 T2 v2; 
	 Pair(T v1,T2 v2) 
	 { 
	 this.v1 = v1; 
	 this.v2 = v2; 
	 } 
	 public T getV1() { 
	 return v1; 
	 } 
	 public void setV1(T v1) { 
	 this.v1 = v1; 
	 } 
	 public T2 getV2() { 
	 return v2; 
	 } 
	 public void setV2(T2 v2) { 
	 this.v2 = v2; 
	 }
}

//***************************************
//Ограничения в настраиваемых типах

//public class Pair < T extends Moveable,T2 > { 
//	 T v1; 
//	 T2 v2; 
//	 Pair(T v1,T2 v2) 
//	 { 
//	 this.v1 = v1; 
//	 this.v2 = v2; 
//	 } 
//	 public T getV1() { 
//	 return v1; 
//	 } 
//	 public void setV1(T v1) { 
//	 this.v1 = v1; 
//	 } 
//	 public T2 getV2() { 
//	 return v2; 
//	 } 
//	 public void setV2(T2 v2) { 
//	 this.v2 = v2; 
//	 } 
//	} 

//****************************************************
//Создание объектов настраиваемого типа

//Pair<Circle,Integer> pair = new Pair<Circle,Integer>(new Circle
//(10,100,100,"blue"),4); 


//*********************************************8
//Настраиваемые контейнеры

//Vector<Integer> v = new Vector<Integer>(); 
//v.add(10); 
///* Ошибка на этапе компиляции, т.к. контейнер 
//может хранить только целочисленные значения */
//v.add("Hello"); Integer a = (Integer)v.get(1); 



