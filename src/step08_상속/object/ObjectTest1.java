package step08_상속.object;
/*
    클래스명 : Emp1
    -name : String
    -dept : String
    -salary : int
    +setEmp(name, dept, salary):void
    +printEmp():void
 */
class Emp1{
    private String name;
    private String  dept;
    private int salary;
    public void setEmp(String name, String dept, int salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }
    public void printEmp(){
        System.out.println(name+" 사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다");
    }
}
public class ObjectTest1 {
    public static void main(String[] args) {
        Emp1 em = new Emp1();
        em.setEmp("홍길동", "개발부", 1500000);
        em.printEmp();
        // 홍길동 사원은 개발부에 근무하며 1500000원의 급여를 받습니다

    }
}
