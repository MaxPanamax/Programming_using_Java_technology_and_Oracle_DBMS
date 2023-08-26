package Packed_HW_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class W_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Device> devices = new ArrayList<>();
	        devices.add(new Device("Device 1", 2020, 1000.0, "Red", "Type 1"));
	        devices.add(new Device("Device 2", 2019, 1500.0, "Blue", "Type 2"));
	        devices.add(new Device("Device 3", 2021, 2000.0, "Green", "Type 1"));
	        devices.add(new Device("Device 4", 2020, 2500.0, "Red", "Type 2"));
	        devices.add(new Device("Device 5", 2018, 3000.0, "Blue", "Type 1"));

	        // Показать все устройства
	        List<Device> allDevices = devices.stream()
	                .collect(Collectors.toList());
	        System.out.println("Все устройства:");
	        allDevices.forEach(System.out::println);

	        // Показать все устройства заданного цвета
	        String colorToFilter = "Red";
	        List<Device> devicesByColor = devices.stream()
	                .filter(device -> device.getColor().equals(colorToFilter))
	                .collect(Collectors.toList());
	        System.out.println("Устройства цвета " + colorToFilter + ":");
	        devicesByColor.forEach(System.out::println);

	        // Показать все устройства заданного года выпуска
	        int yearToFilter = 2020;
	        List<Device> devicesByYear = devices.stream()
	                .filter(device -> device.getYear() == yearToFilter)
	                .collect(Collectors.toList());
	        System.out.println("Устройства выпущенные в " + yearToFilter + " году:");
	        devicesByYear.forEach(System.out::println);

	        // Показать все устройства дороже заданной цены
	        double priceToFilter = 2000.0;
	        List<Device> devicesByPrice = devices.stream()
	                .filter(device -> device.getPrice() > priceToFilter)
	                .collect(Collectors.toList());
	        System.out.println("Устройства дороже " + priceToFilter + " рублей:");
	        devicesByPrice.forEach(System.out::println);

	        // Показать все устройства заданного типа
	        String typeToFilter = "Type 1";
	        List<Device> devicesByType = devices.stream()
	                .filter(device -> device.getType().equals(typeToFilter))
	                .collect(Collectors.toList());
	        System.out.println("Устройства типа " + typeToFilter + ":");
	        devicesByType.forEach(System.out::println);

	        // Показать все устройства, чей год выпуска находится в указанном диапазоне
	        int startYear = 2019;
	        int endYear = 2021;
	        List<Device> devicesByYearRange = devices.stream()
	                .filter(device -> device.getYear() >= startYear && device.getYear() <= endYear)
	                .collect(Collectors.toList());
	        System.out.println("Устройства с годом выпуска от " + startYear + " до " + endYear + ":");
	        devicesByYearRange.forEach(System.out::println);
	    }
	}


