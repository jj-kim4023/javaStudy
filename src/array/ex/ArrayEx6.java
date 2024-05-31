package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumer, maxNumer;

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumer = maxNumer = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minNumer) {
                minNumer = numbers[i];
            }
            if (numbers[i] > maxNumer) {
                maxNumer = numbers[i];
            }
        }

        System.out.println("가장 적은 정수: " + minNumer);
        System.out.println("가장 큰 정수: " + maxNumer);
    }
}
