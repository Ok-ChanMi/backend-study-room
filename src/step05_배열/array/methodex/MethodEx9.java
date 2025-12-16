package step05_배열.array.methodex;

public class MethodEx9 {


    public static void view1(){
        System.out.println("static method");
    }
    public void view2(){
        System.out.println("non-static method");
    }
    public static void main(String[] args) {
        // 클래스 메서드(static method) : 객체없이 호출가능
        view1();    // 함수 호출
        MethodEx9.view1(); // 자기 자신의 메서드에 접근할때는 클래스이름 생략 가능

        // 인스턴스 메서드(instance method) : 반드시 객체를 생성한 후에 메서드를 호출 가능
        MethodEx9 ob=new MethodEx9();   // 객체 생성
        ob.view2();
    }
}
