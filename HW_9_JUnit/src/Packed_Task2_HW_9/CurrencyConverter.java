package Packed_Task2_HW_9;

import java.util.Scanner;

public class CurrencyConverter {

    private double dollarRate;
    private double euroRate;
    private double poundRate;
    private double yenRate;

    public void setRates(double dollarRate, double euroRate, double poundRate, double yenRate) {
        this.dollarRate = dollarRate;
        this.euroRate = euroRate;
        this.poundRate = poundRate;
        this.yenRate = yenRate;
    }

  
	public static void main(String[] args) {
		CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        // Введите курсы валют
        System.out.print("Введите курс доллара: ");
        double dollarRate = scanner.nextDouble();
        System.out.print("Введите курс евро: ");
        double euroRate = scanner.nextDouble();
        System.out.print("Введите курс фунта стерлингов: ");
        double poundRate = scanner.nextDouble();
        System.out.print("Введите курс йены: ");
        double yenRate = scanner.nextDouble();

        converter.setRates(dollarRate, euroRate, poundRate, yenRate);

        // Введите сумму и валюту, которую нужно конвертировать
        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();
        System.out.print("Введите валюту, которую нужно конвертировать (USD, EUR, GBP, JPY): ");
        String fromCurrency = scanner.next();

        // Введите валюту, в которую нужно конвертировать
        System.out.print("Введите валюту, в которую нужно конвертировать (USD, EUR, GBP, JPY): ");
        String toCurrency = scanner.next();

        double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);

        System.out.println("Конвертированная сумма: " + convertedAmount + " " + toCurrency);
    }
	  public double convert(double amount, String fromCurrency, String toCurrency) {
	        double convertedAmount = 0.0;

	        switch (fromCurrency) {
	            case "USD":
	                convertedAmount = amount * dollarRate;
	                break;
	            case "EUR":
	                convertedAmount = amount * euroRate;
	                break;
	            case "GBP":
	                convertedAmount = amount * poundRate;
	                break;
	            case "JPY":
	                convertedAmount = amount * yenRate;
	                break;
	            default:
	                System.out.println("Недействительная валюта!");
	        }

	        return convertedAmount;
	    }
	}

