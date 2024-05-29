package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; //int / int
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; //int /int
        System.out.println("div2 = " + div2); //1.0

        double div3 = 3.0 / 2; //double / int
        System.out.println("div3 = " + div3); //1.5

        double div4 = (double) 3 / 2; //명시적 형변환을 사용했다. (double) int / int
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; //1.5
        System.out.println("result = " + result);
        /*
        int + int = int (같은 타입 계산은 같은 타입이 나옴)
        int + double = double (서로 다른 타입 계산은 큰 범위로 자동 형변환)
         */
    }
}
