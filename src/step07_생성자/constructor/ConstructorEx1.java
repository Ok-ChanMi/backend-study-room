package step07_생성자.constructor;
// 생성자 : 객체 초기화를 담당하는 서브루틴
//         맴버 변수, 맴버 함수의 초기화 담당
// 문법 : 접근지정자 클래스이름(매개변수, ...){}
public class ConstructorEx1 {
    public ConstructorEx1() { // 생략 가능, 생략될 경우 자동 생성
        System.out.println("default constructor");
    }
    public ConstructorEx1(String str) {
        System.out.println(str + " constructor");
    }
    public ConstructorEx1(String str, int n) {
        System.out.println(str +" "+ n +" constructor");
    }
    public static void main(String[] args) {
        new ConstructorEx1();  // 디폴트 생성자 호출
        new ConstructorEx1("abc");
        new ConstructorEx1("abc", 20);
    }
}
