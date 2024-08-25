import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Car[] carArray = new Car[3];
        Race[] raceArray = new Race[3];
        int speed = 0;
        boolean isCorrect = false;

// создание участников гонки
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины №" + (i + 1));
            String name = scanner.next();
            while (!isCorrect) {
                System.out.println("Введите скорость машины №" + (i + 1));
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if ((speed < 0 || speed > 250) || (speed == 0 || speed == 250)) {
                        System.out.println("Неправильная скорость");
                    } else {
                        isCorrect = true;
                    }
                } else {
                    System.out.println("Неправильный тип данных, попробуйте снова!");
                    scanner.next();
                }
            }
            isCorrect = false;

            Car car = new Car(name, speed);
            carArray[i] = car;
        }
        scanner.close();

        //экземпляре класса «Гонка». Определение победителя
        //

        //System.out.println(carArray[0].nameCar);
        //Race.race(Car[0] Arraylist);
    }
}
