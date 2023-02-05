public class SoutTest {
    public static void main(String[] args) {
        // 이스케이프 시퀀스
        System.out.println("Hello\\World");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\"World");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\\\\World");
        System.out.println(Math.random());
        System.out.println(Math.min(23, 45));
        System.out.println(Math.max(4, 45));

        System.out.printf("5 * 2 = %d", 5 * 2).println();   // 정수의 수식어는 %d 로 사용이 가능
        System.out.printf("%d * %d = %d", 5, 7, 5 * 7).println(); // 문자열 리터럴에 하드코딩된 값이 없음
        System.out.printf("%d + %d + %d = %d", 5, 6, 7 , (5+6+7)).println();
        System.out.printf("Print %s", "Testing").println();
        System.out.printf("%f + %f + %f", 5.5, 6.5, 7.5).println();

        // 부동소수점의 상수값이 double이기때문에 float으로 선언할때 f를 써주지않으면 double로 인식해 에러발생

        

    }
}
