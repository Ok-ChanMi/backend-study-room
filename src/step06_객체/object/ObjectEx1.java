package step06_객체.object;
/*  + public, - private, # protected
    클래스 명 : Person
    +name:String
    +age:int
    +score:float

    +setPerson(name:String, a:omt. s:float):void
    +viewPerson():void
*/
// ObjectEx1.java ==> Person.class, ObjectEx1.class
class Person{
    public String name;     // 멤버변수 field, 전역변수
    public int age;
    public float score;

    public void setPerson(String name, int a, float s){      // 멤버함수, 메서드
        this.name=name;
        this.age=a;
        this.score=s;
    }
    public void viewPerson(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("점수 : "+score);
    }
}


public class ObjectEx1 {

    public static void main(String[] args) {
        // 인스턴스 : 클래스의 오브젝트
        // 객체(오브젝트) : 클래스의 인스턴스, 필드와 메서드의 조합
        Person ps=new Person();     // new Person : heap 영역에 메모리를 할당해서 인스턴스 생성
//        int a=5; // 자료형 변수명=초기값;
        ps.setPerson("홍길동", 23, 75.3f);
        ps.viewPerson();
        // hashcode() : reference 주소를 리턴, 객체를 구별하기 위한 고유의 정수를 리턴하는 메서드
        System.out.println(ps.hashCode());
        System.out.println(ps);

        ps=new Person();    // 이름이 동일한 새로운 객체
        ps.setPerson("이순신",25,90.5f);
        ps.viewPerson();

        System.out.println(ps.hashCode());
        System.out.println(ps);

    }
}
