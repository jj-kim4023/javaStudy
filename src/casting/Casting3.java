package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting= " + intValue);
        //오버플로우 int 최고값을 넘어서 int 처음으로 돌아감
        //시계로 예를 들면 60에서 1로 변함 (2를 초과하면 2로 변환)
        //오버플로우 발생시 타입을 변경해야함 int -> long
    }
}
