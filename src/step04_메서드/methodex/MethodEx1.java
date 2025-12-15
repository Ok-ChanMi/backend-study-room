package step04_메서드.methodex;
// 메서드 (method) : 클래스의 멤버함수
// call by name : 이름만 가지고 있는 함수
// 함수 정의 규칙 -- 함수는 클래스의 내부에 정의
//             -- 함수의 내부에 함수를 정의하지 않음
public class MethodEx1 {
    public static void view() { // 함수의 정의
        System.out.println("hello");

        return; // 생략가능 return 타입이 void 일때
    }

    public static void star(){
        System.out.println("*****");
    }
    public static void main(String[] args) {
        view(); // 함수의 호출
        star();
    }
}
