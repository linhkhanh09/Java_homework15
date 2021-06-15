package fs.apidef.identifyservice.java.homework15;

import java.util.Scanner;

public class VerifyCar {
    static void input() {
        Scanner sc = new Scanner(System.in);
        String car[] = new String[5];

        for (int i = 0; i < car.length; i++) {
            System.out.printf("Hãng xe thứ [%d] = ", i);
            car[i] = sc.nextLine();

        }
        String start = car[0];
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].compareTo(car[j]) > 0) {
                    start = car[j];
                    car[j] = car[i];
                    car[i] = start;

                }
            }
        }
        System.out.println("Sắp xếp theo thứ tự alphabet: " );
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }
}

