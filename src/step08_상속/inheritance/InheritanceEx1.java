package step08_상속.inheritance;
// -------------------------------------1. 상속을 사용하지 않을 때 메서드 처리
/*
class SuperEx {
    public void show1() {
        System.out.println("show1 method");
    }
}
class SubEx{
    public void show2(){
        System.out.println("show2 method");
    }
}
public class InheritanceEx1 {
    public static void main(String[] args) {
        SuperEx ob1 = new SuperEx();
        ob1.show1();
        SubEx ob2 = new SubEx();
        ob2.show2();
    }
}
*/
// -----------------------------2. 상속을 사용할 때 메서드 처리
/*
class SuperEx {  // 부모클래스
    public void show1() {
        System.out.println("show1 method");
    }
}
class SubEx extends SuperEx{   // 자식 클래스가 부모 클래스 SuperEx를 상속받음
    public void show2(){
        System.out.println("show2 method");
    }
}
public class InheritanceEx1 {
    public static void main(String[] args) {
        SubEx ob = new SubEx();
        ob.show1();
        ob.show2();
    }
}
 */
// -------------------------- 3. 상속을 받을 때 메서드 오버라이딩
// 오버라이딩 : 부모 클래스가 가진 메서드에 대하여 자식 클래스에서 그 메서드를 재정의
class SuperEx {
    public void show() {
        System.out.println("show1 method");
    }
}
class SubEx extends SuperEx{
    public void show(){
        super.show();
        System.out.println("show2 method");
    }
}
public class InheritanceEx1 {
    public static void main(String[] args) {
        SubEx ob = new SubEx();
        ob.show();
    }
}