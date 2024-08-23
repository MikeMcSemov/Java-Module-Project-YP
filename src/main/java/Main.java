import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Car[] carArray = new Car[3];
        int speed = 0;
// создание участников гонки
            for (int i=0; i<3; i++) {
                System.out.println("Введите название машины №" + (i + 1));
                String name = scanner.next();

                System.out.println("Введите скорость машины №" + (i + 1));
                    speed = scanner.nextInt();
                    //test 0..250
                    while (speed < 0 || speed > 250) {
                    System.out.println("Неправильная скорость");
                    System.out.println("Введите скорость машины №" + (i + 1));
                    speed = scanner.nextInt();
                }
                    Car car = new Car(name, speed);
                    carArray[i] = car;
                }
            scanner.close();
    //экземпляре класса «Гонка». Определение победителя
    }
}