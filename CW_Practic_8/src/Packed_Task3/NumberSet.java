package Packed_Task3;

import java.util.ArrayList;
import java.util.List;

public class NumberSet {
	private List<Integer> numbers;

    public NumberSet() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double getAverage() {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = getSum();
        return (double) sum / numbers.size();
    }

    public int getMaximum() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Набор номеров пуст");
        }
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int getMinimum() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Набор номеров пуст");
        }
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
