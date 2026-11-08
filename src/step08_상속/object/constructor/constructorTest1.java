package step08_상속.object.constructor;
/*
    클래스명 : Member
    -name : String 초기값 : 이순신
    -age : int  초기값 : 25
    +Member()
    +Member(name, age)
    +view() : void
 */
class Member{
    private String name="이순신";
    private int age=25;
    public Member() {
//        name="이순신";     // 초기값을 지정하면 디폴트 생성자에서 초기화 되는 효과
//        age=25
    }
    public Member(String name, int age) {
        super();
        this.name=name;
        this.age=age;
    }
    public void view() {
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }

}
public class constructorTest1 {
    public static void main(String[] args) {
        Member ob1 = new Member();
        ob1.view();
        Member ob2 = new Member("홍길동", 23);
        ob2.view();

    }
}
