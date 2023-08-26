package Packed_HW_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W_2 {
	private static final List<Product> products = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        products.add(new Product("Нежинская", Products_Arry.milk, 48));
        products.add(new Product("Фермерское", Products_Arry.milk, 50));
        products.add(new Product("Простоквашино", Products_Arry.milk, 52));
        products.add(new Product("Фитнес", Products_Arry.bread, 48));
        products.add(new Product("Батон", Products_Arry.bread, 55));
        products.add(new Product("Галицкий", Products_Arry.bread, 50));
        products.add(new Product("Литовский", Products_Arry.bread, 52));
        products.add(new Product("Голанский", Products_Arry.cheese, 48));
        products.add(new Product("Шато", Products_Arry.wine, 50));
        products.add(new Product("Томаты", Products_Arry.vegetables, 52));
        System.out.println("Введите:\n" +
                "1). Показать все продукты;\n" +
                "2). Показать все продукты с названием меньше 5 символов;\n" +
                "3). Посчитать сколько раз встречается продукт, чье название ввёл пользователь;\n" +
                "4). Показать все продукты, которые начинаются на заданную букву;\n" +
                "5). Показать все продукты из категории \"Молоко\";\n" +
                "6). Для выхода\n");

        int inputUser = scanner.nextInt();
        while (inputUser != 6) {
            switch (inputUser) {
                case 1 -> products.forEach(System.out::println);
                case 2 -> products.stream()
                        .filter(product -> product.getName().length() < 5)
                        .forEach(System.out::println);
                case 3 -> System.out.println(countProduct());
                case 4 -> startLetterProduct();
                case 5 -> products.stream()
                        .filter(product -> product.getCategoryProduct() == Products_Arry.milk)
                        .forEach(System.out::println);
                default -> System.out.println("Не корректный ввод");
            }
            System.out.print("Введите следующий пункт меню или введите 6 для выхода: ");
            inputUser = scanner.nextInt();
        }
    }

    private static long countProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название продукта: ");
        String nameProduct = scanner.next();
        return products.stream()
                .filter(product -> product.getName().equals(nameProduct))
                .count();
    }

    private static void startLetterProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стартовую букву для поиска: ");
        String letter = scanner.next();
        products.stream()
                .filter(product -> product.getName().startsWith(letter))
                .forEach(System.out::println);
    
	}

}
