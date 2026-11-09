package step09_바인딩.override;
class Test1{
    public void view1() { System.out.println("view1 method"); }
    public void view3() { System.out.println("view3 method"); }

}
class Test2 extends Test1{
    @Override
    public void view1() { System.out.println("view11 method"); }
    public void view2() { System.out.println("view22 method"); }
}
public class OverrideEx {
    public static void main(String[] args) {
        Test1 ob = new Test2();   // 부모 클래스의 참조변수로 자식 객체 생성

//        Test2 ob = new Test2();  // 자식 클래스의 참조변수로 자식 객체 생성
//        ob.view1(); //view11
//        ob.view2(); //view22
//        ob.view3(); //view3
    }
}
