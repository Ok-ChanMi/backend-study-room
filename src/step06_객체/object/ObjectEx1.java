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

    public setPerson(String name, int a, float s){      // 멤버함수, 메서드

    }
    public void viewPerson(){

    }
}


public class ObjectEx1 {

    public static void main(String[] args) {
        // 인스턴스 : 클래스의 오브젝트
        Person ps=new Person();     // new Person : heap 영역에 메모리를 할당해서 인스턴스 생성
    }
}
