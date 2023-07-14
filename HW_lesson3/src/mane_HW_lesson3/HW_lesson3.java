package mane_HW_lesson3;
//import StaticPack.*;
import  OuterPack.*;
import EnumerationPack.*;
import java.util.Enumeration;
import java.util.Vector;
import StackPack.*;
import java.util.Stack; 
import java.util.EmptyStackException; 

public class HW_lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ball ball=new Ball("green");
//		System.out.println(ball.toString());
//		System.out.println(ball);
		
		
		Outer out= new Outer();
		out.showField();
		
		Outer.Inner in=out.new Inner();
		in.setField(1); 
		out.showField();
		
		Outer.Inner in2= out.new Inner(); 
		 in2.setField(2); 
		 out.showField(); 
		 
		 Outer out2 = new Outer(); 
		 out2.showField(); 
		 
		 Outer.Inner in3 = out2.new Inner(); 
		 in3.setField(1); 
		 out2.showField(); 
		 
//		 Объекты in и in2 созданы через объект out, следовательно, они могут получать
//		 доступ к полям и методам класса out. Объект in3 создан через экземпляр класса
//		 out2, т.е. in3 может получить доступ к полям и методам объекта out2.
		 
		 //**************************************************
		 
//		 Double и Float
		 Double d1 = new Double(3.14159); 
		 Double d2 = new Double("314159E-5"); 
		 System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));
		 
		 //**********************************************************
		 //Бесконечность и NaN
		 
		 Double d11 = new Double(1/0.); 
		 Double d12 = new Double(0/0.); 
		 System.out.println(d11 + ": " + d11.isInfinite() + ", " + d11.isNaN()); 
		 System.out.println(d12 + ": " + d12.isInfinite() + ", " + d12.isNaN());
		 
//		 (статический)islnfinite(d) возвращает true, если абсолютное значение
//		 указанного числа типа double бесконечно велико
//		 ● islnfinite() возвращает true, если абсолютное значение числа, хранящегося в
//		 данном объекте Double, бесконечно велико
//		 ● (статический) isNaN(d) возвращает true, если значение указанного числа типа
//		 double неопределено
//		 ● isNaN() возвращает true, если значение числа, хранящегося в данном объекте
//		 Double, неопределено
		 //**********************************************************************
		 
		 //Integer и Long
		 Integer number=Integer.parseInt("1234556");
		 System.out.println(number);
		 
		 String str=Integer.toString(12344);
		 System.out.println(str);
		 boolean bool=Character.isUpperCase('\u042d');
		 System.out.println(bool);
		 //*********************************************************************8
		 //Интерфейс Enumeration
		 
		 
//		 Enumeration enum = new Enum(); 
//		 while (enum.hasMoreElements()) { 
//		 System.out.println(enum.nextElement());}
		 
		 
		 Enumeration days;
	      Vector dayNames = new Vector();
	      
	      dayNames.add("Воскресенье");
	      dayNames.add("Понедельник");
	      dayNames.add("Вторник");
	      dayNames.add("Среда");
	      dayNames.add("Четверг");
	      dayNames.add("Пятница");
	      dayNames.add("Суббота");
	      days = dayNames.elements();
	      
	      while (days.hasMoreElements()) {
	         System.out.println(days.nextElement()); 
	      }
		 
		 //*************************************************
		 //Stack
		 
//		 Stack st = new Stack(); 
//		 System.out.println("stack: " + st); 
//		 showpush(st, 42); 
//		 showpush(st, 66); 
//		 showpush(st, 99); 
//		 showpop(st); 
//		 showpop(st); 
//		 showpop(st); 
//		 try { 
//		 showpop(st); 
//		 } 
//		 catch (EmptyStackException e) { 
//		 System.out.println("empty stack"); 
//		 } 

		 
	}

}
