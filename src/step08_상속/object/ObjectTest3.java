package step08_상속.object;
/*
    클래스명 : Emp3
    -name : String
    -dept : String
    -salary : int
    +getter & setter
    +toString() : String
 */
class Emp3{
    private String name;
    private String  dept;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return String.format("%s 사원은 %s에 근무하며 %d원의 급여를 받습니다", getName(), getDept(), getSalary());
    }
}
public class ObjectTest3 {
    public static void main(String[] args) {
        Emp3 em = new Emp3();
        em.setName("홍길동");
        em.setDept("개발부");
        em.setSalary(1500000);

        System.out.println(em.toString());
        // 홍길동 사원은 개발부에 근무하며 1500000원의 급여를 받습니다

        System.out.println("이름 : "+em.getName());
        System.out.println("부서 : "+em.getDept());
        System.out.println("급여 : "+em.getSalary()+"원");
    }
}