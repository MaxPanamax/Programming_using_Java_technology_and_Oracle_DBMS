package Packed_HW_8;

import java.util.Arrays;
import java.util.Comparator;

public class W_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Projector[] projectors = {
	                new Projector("Проектор1", 2021, 1000,"Производитель1"),
	                new Projector("Проектор2", 2022, 1500,"Производитель2"),
	                new Projector("Проектор3", 2023, 2000, "Производитель3"),
	                new Projector("Проектор4", 2023, 2500, "Производитель4")
	        };

		// Показать все проекторы
	        System.out.println("Все проекторы:");
	        Arrays.stream(projectors)
	                .forEach(p -> System.out.println(p.getName() + ", " + p.getYear() + ", " + p.getPrice() + ", " + p.getManufacturer()));
	        System.out.println();

	     // Показывать проекторы определенного производителя, текущего года выпуска и цены, превышающей заданное значение
	        String manufacturer = "Производитель1";
	        int currentYear = 2023;
	        double minPrice = 2000;
	        System.out.println("Проекторы производителя " + manufacturer + ", текущий год " + currentYear + ", и цена выше, чем " + minPrice + ":");
	        Arrays.stream(projectors)
	                .filter(p -> p.getManufacturer().equals(manufacturer))
	                .filter(p -> p.getYear() == currentYear)
	                .filter(p -> p.getPrice() > minPrice)
	                .forEach(p -> System.out.println(p.getName() + ", " + p.getYear() + ", " + p.getPrice() + ", " + p.getManufacturer()));
	        System.out.println();

	     // Сортировка проекторов по цене в порядке возрастания
	        System.out.println("Проекторы, отсортированные по цене в порядке возрастания:");
	        Arrays.stream(projectors)
	                .sorted(Comparator.comparingDouble(Projector::getPrice))
	                .forEach(p -> System.out.println(p.getName() + ", " + p.getYear() + ", " + p.getPrice() + ", " + p.getManufacturer()));
	        System.out.println();

	     // Сортировка проекторов по цене в порядке убывания
	        System.out.println("Проекторы, отсортированные по цене в порядке убывания:");
	        Arrays.stream(projectors)
	                .sorted(Comparator.comparingDouble(Projector::getPrice).reversed())
	                .forEach(p -> System.out.println(p.getName() + ", " + p.getYear() + ", " + p.getPrice() + ", " + p.getManufacturer()));
	        System.out.println();

	     // Сортировка проекторов по годам в порядке возрастания
	        System.out.println("Проекторы отсортированы по годам в порядке возрастания:");
	        Arrays.stream(projectors)
	                .sorted(Comparator.comparingInt(Projector::getYear))
	                .forEach(p -> System.out.println(p.getName() + ", " + p.getYear() + ", " + p.getPrice() + ", " + p.getManufacturer()));
	        System.out.println();

	     // Сортировка проекторов по годам в порядке убывания
	        System.out.println("Проекторы отсортированы по годам в порядке убывания:");
	        Arrays.stream(projectors)
	                .sorted(Comparator.comparingInt(Projector::getYear).reversed())
	                .forEach(p -> System.out.println(p.getName() + ", " + p.getYear() + ", " + p.getPrice() + ", " + p.getManufacturer()));
	    }
	}


