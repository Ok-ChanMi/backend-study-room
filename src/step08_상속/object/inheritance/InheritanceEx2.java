package step08_상속.object.inheritance;
// 생성자
class ParentEx{
    public ParentEx(){
        System.out.println("paret class");
    }
}
class ChildEx extends ParentEx{
    public ChildEx(){
        super();  // 기본값, 생략 가능, this() 함께 사용하지 않음
        System.out.println("child class");
    }
}
public class InheritanceEx2 {
    public static void main(String[] args) {
        new ChildEx();
    }
}
/*
    this.변수
    this.method()
    this()
    this(인자, 인자, ...) -- 자기 객체의 생성자

    super.변수
    super.method()
    super()
    super(인자, 인자, ...) -- 부모 객체의 생성자
 */