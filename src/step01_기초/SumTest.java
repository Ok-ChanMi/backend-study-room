package step01_기초;
/*
    + 의 의미
    1. 더하기
    2. 연결하기
    3. 단항연산자
*/
public class SumTest {
    // 메인함수 엔트리포인트(진입점)
    public static void main(String[] args) {

        int a=5, b=7; // 정수 자료형의 변수 선언
        System.out.println(a+b); // + 가 더하기 의미로 사용
        System.out.println("a+b="+a+b);  // + 가 연결의 의미로 사용
        System.out.println("a+b="+(a+b));  // 앞의 + 는 연결, 뒤의 + 는 더하기(괄호가 우선순위가 더 높아서 더하기 의미로 사용됨)
        System.out.println(a+"+"+b+"="+(a+b));
        // 문제 a는 5, b는 7
        System.out.println("a는 "+a+", b는 "+b);
    }
}
