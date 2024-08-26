public class Race {

    public static String race(Car[] carArray) {

        int[] distance = new int[3];
        String leader = "";

        for(int i = 0 ; i < 3; i++) {
            distance[i] = 24 * carArray[i].speedCar;
        }

        int max = -1;
        int count = 0;

        for (int i=0; i < carArray.length; i++) {
            if (carArray[i].speedCar > max) {
                max = carArray[i].speedCar;
                leader = carArray[i].nameCar;
                count = count + 1;
            }



           //else if (carArray[i].speedCar == max){
           //  System.out.println("В этой гонке победителя нет, попробуйте запустить программу снова!");
           //}
        }
        return leader;
    }
}
