package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i <numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        /*
        // iter 줄임단축키
        // for-each문을 사용 할 수 없는 경우, 증가하는 index 값 필요
        for (int number : numbers) {
        }
        */
    }
}
