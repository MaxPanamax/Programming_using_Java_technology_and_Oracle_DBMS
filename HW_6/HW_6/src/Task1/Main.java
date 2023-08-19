package Task1;

import java.util.*;

public class Main {
    private static LinkedList<Passenger> passengers = new LinkedList<>(); //Массив для хранения информации о приходящих пассажиров на остановку
    private static List<Passenger> smelledPassengers = new ArrayList<>(); //Для хранения информации о убывших (севших в катер) пассажиров
    private static List<Statistic> statisticsCountPassenger = new ArrayList<>(); //Для хранения статистики количества пассажиров на остановке при пребывании катера на остановку.
    private static int countPassenger = 0; //Переменная для хранения информации об общем количестве пассажиров за день
    private static final int maxCountPassengerBoat = 20; //Максимальная вместимость пассажиров в катере.
    private static boolean endingStation = false; //Конечная остановка

    public static void main(String[] args) {
        /*Утреннее время с 8:00 до 12:00 (с 480 минуты по 720 минуты)*/
        /*Дневное время с 12:00 до 17:00 (c 720 минуты по 1020 минуты)*/
        /*Вечернее время с 17:00 до 21:00 (c 1020 минуты по 1260 минуты)*/

        int[] timeAppearancePassengersStop = new int[3]; //Массив, хранящий среднее время появления пассажиров на остановке в утреннее, дневное и вечернее время
        int[] timeAppearanceBoatStop =  new int[3]; //Массив, хранящий среднее время появления катера на остановке в утреннее, дневное и вечернее время

        Scanner scannerInputInfo = new Scanner(System.in);
        /*Ввод данных о пассажирах*/
        System.out.print("Введите среднее время (в минутах) между появлениями пассажиров на причале в утреннее (с 8:00 до 12:00) время суток: ");
        timeAppearancePassengersStop[0] = scannerInputInfo.nextInt();
        System.out.print("Введите среднее время (в минутах) между появлениями пассажиров на причале в дневное (с 12:00 до 17:00) время суток: ");
        timeAppearancePassengersStop[1] = scannerInputInfo.nextInt();
        System.out.print("Введите среднее время (в минутах) между появлениями пассажиров на причале в вечернее (с 17:00 до 21:00) время суток: ");
        timeAppearancePassengersStop[2] = scannerInputInfo.nextInt();
        /*Ввод данных о катерах*/
        System.out.print("Введите среднее время (в минутах) между появлениями катеров на причале в утреннее (с 8:00 до 12:00) время суток: ");
        timeAppearanceBoatStop[0] = scannerInputInfo.nextInt();
        System.out.print("Введите среднее время (в минутах) между появлениями катеров на причале в дневное (с 12:00 до 17:00) время суток: ");
        timeAppearanceBoatStop[1] = scannerInputInfo.nextInt();
        System.out.print("Введите среднее время (в минутах) между появлениями катеров на причале в вечернее (с 17:00 до 21:00) время суток: ");
        timeAppearanceBoatStop[2] = scannerInputInfo.nextInt();

        int currentTime = 480; //480 минут. Это 8 утра.
        int averageTimePassengerStop = timeAppearancePassengersStop[0]; //среднее время появления пассажира на остановке (в минутах)
        int averageTimeBoatStop = timeAppearanceBoatStop[0]; //среднее время появления катера на остановке (в минутах)
        System.out.println("Имитационная модель «причал морских катеров»");
        System.out.println("Стартовое время: " + currentTime / 60 + ":" + (((currentTime % 60) < 10) ? "0" + currentTime % 60 : currentTime % 60));

        while (currentTime < 1260) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentTime++;
            if (currentTime >= 720 && currentTime < 1020) {
                averageTimePassengerStop = timeAppearancePassengersStop[1];
                averageTimeBoatStop = timeAppearanceBoatStop[1];
            }

            if (currentTime >= 1020) {
                averageTimePassengerStop = timeAppearancePassengersStop[2];
                averageTimeBoatStop = timeAppearanceBoatStop[2];
            }

            if (currentTime % averageTimePassengerStop == 0) {
                Passenger passenger = new Passenger("Пассажир " + countPassenger, currentTime);
                passengers.add(passenger);
                System.out.println(passenger);
                countPassenger++;
            }
            if (currentTime % averageTimeBoatStop == 0) {
                int countFreePlace = (int) (Math.random() * maxCountPassengerBoat + 1);
                System.out.println("Внимание. Прибыл катер. Количество свободных мест: " + countFreePlace);
                System.out.print("Введите тип остановки катера (true - конечная, false - не конечная.).\n" +
                        "Не правильно введенное значение (отличное от true или false) будет считаться, что остатновка не конечная: ");
                try {
                    Scanner scanner = new Scanner(System.in);
                    endingStation = scanner.nextBoolean();
                } catch (Exception e) {
                    System.out.println("Не корректный ввод. Остановку будем считать не конечной");
                    endingStation = false;
                }
                if (!endingStation) { //Если остановка конечная, то считаю, что пассажиры не садятся в катер. В противном случае сажаем пассажиров
                    statisticsCountPassenger.add(new Statistic(currentTime, passengers.size())); //Добавляем информацию в статистику
                    while (countFreePlace > 0 && !passengers.isEmpty()) {
                        Passenger p = passengers.poll(); //Получаем и удаляем пассажира из остановки
                        p.setDepartureTimeStop(currentTime); //Присваиваем пассажиру время убытия из остановки
                        System.out.println(p.getName() + " сел в катер в " + currentTime / 60 + ":" + (((currentTime % 60) < 10) ? "0" + currentTime % 60 : currentTime % 60));
                        smelledPassengers.add(p); //Добавляем в массив убывших пассажиров
                        countFreePlace--;
                    }
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество людей, чтобы определить достаточный интервал времени между приходами катеров,\n" +
                "чтобы на остановке находилось не более введенного Вами количества людей одновременно: ");
        int chooseUserCountPassenger = scanner.nextInt();
        System.out.println("Вывод статистической информации");

        System.out.println("===========================================================================================================================");
        System.out.println("Определяем среднее время пребывания человека на остановке (в минутах) за целый день.");
        System.out.println();
        showStatistic1(480, 1260, smelledPassengers);
        System.out.println("***************************************************************************************************************************");
        System.out.println("Определяем среднее время пребывания человека на остановке (в минутах) в утреннее время суток (с 8:00 до 12:00)");
        System.out.println();
        showStatistic1(480, 720, smelledPassengers);
        System.out.println("***************************************************************************************************************************");
        System.out.println("Определяем среднее время пребывания человека на остановке (в минутах) в дневное время суток (с 12:00 до 17:00)");
        System.out.println();
        showStatistic1(720, 1020, smelledPassengers);
        System.out.println("***************************************************************************************************************************");
        System.out.println("Определяем среднее время пребывания человека на остановке (в минутах) в вечернее время суток (с 17:00 до 21:00):");
        System.out.println();
        showStatistic1(1020, 1260, smelledPassengers);
        System.out.println("===========================================================================================================================");

        System.out.println("Определяем достаточный интервал времени между приходами катеров в утреннее " +
                "время суток (с 8:00 до 12:00) для того, чтобы на остановке находилось не более " + chooseUserCountPassenger + " людей одновременно");
        System.out.println();
        showStatistic2(480, 720, chooseUserCountPassenger, statisticsCountPassenger, timeAppearanceBoatStop[0]);
        System.out.println("***************************************************************************************************************************");
        System.out.println("Определяем достаточный интервал времени между приходами катеров в дневное " +
                "время суток (с 12:00 до 17:00) для того, чтобы на остановке находилось не более " + chooseUserCountPassenger + " людей одновременно");
        System.out.println();
        showStatistic2(720, 1020, chooseUserCountPassenger, statisticsCountPassenger, timeAppearanceBoatStop[1]);
        System.out.println("***************************************************************************************************************************");
        System.out.println("Определяем достаточный интервал времени между приходами катеров в вечернее " +
                "время суток (с 17:00 до 21:00) для того, чтобы на остановке находилось не более " + chooseUserCountPassenger + " людей одновременно");
        System.out.println();
        showStatistic2(1020, 1260, chooseUserCountPassenger, statisticsCountPassenger, timeAppearanceBoatStop[2]);
        System.out.println("===========================================================================================================================");
    }

    //Для определения среднего времени пребывание человека на остановке
    private static void showStatistic1(int dateBeginMinute, int dateEndMinute, List<Passenger> smelledPassengers) {
        OptionalDouble averagePassengerTime = smelledPassengers.stream()
                .filter(item -> item.getArrivalTimeStop() >= dateBeginMinute && item.getArrivalTimeStop() <= dateEndMinute)
                .mapToInt(value -> value.getDepartureTimeStop() - value.getArrivalTimeStop())
                .average();
        if (averagePassengerTime.isPresent()) {
            System.out.println("Среднее время пребывания человека на остановке (в минутах) составляет: " + Math.round(averagePassengerTime.getAsDouble()));
        }
    }

    /*Для определения достаточного интервала времени между приходами катеров, чтобы на остановке находилось не более N людей одновременно*/
    private static void showStatistic2(int dateBeginMinute, int dateEndMinute, int chooseUserCountPassenger, List<Statistic> statisticsCountPassenger, int timeAppearanceBoatStop) {
        //Сначала определяем среднее количество пассажиров на остановке/причале при пребывании катера
        OptionalDouble averageCountPassenger = statisticsCountPassenger.stream()
                .filter(item -> item.getArrivalTime() >= dateBeginMinute && item.getArrivalTime() <= dateEndMinute)
                .mapToInt(value -> value.getCountPassenger())
                .average();

        if (averageCountPassenger.isPresent()) {
            System.out.println("Среднее количество людей на остановке составляет " + Math.round(averageCountPassenger.getAsDouble()) + " человек при интенсивности пребывания катеря каждые " + timeAppearanceBoatStop + " минут");

            if (Math.round(averageCountPassenger.getAsDouble()) < chooseUserCountPassenger) {
                System.out.println("Текущая интенсивность прихода катера в данное время является достаточной для того, чтобы на причале находилось менее " + chooseUserCountPassenger + " людей одновременно");
            } else {
                long newTimeAppearanceBoatStop = Math.round((timeAppearanceBoatStop * chooseUserCountPassenger) / averageCountPassenger.getAsDouble());
                System.out.println("Достаточный интервал времени между приходами катеров, " +
                        "чтобы на остановке находилось не более " + chooseUserCountPassenger + " людей одновременно составляет " + newTimeAppearanceBoatStop + " минут");
            }
        }
    }
}