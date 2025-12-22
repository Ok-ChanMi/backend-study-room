package step06_객체.object;
/*
    -name:String
    -dept:String
    -pay:int
    -score:double

    +getter & setter

    +setEmployee(name:String, dept:String, pay:int, score:double):void
    +toString():String
 */
public class Employee {
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

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private String name;
    private String dept;
    private int pay;
    private double score;

    public void setEmployee(String name, String dept, int pay, double score){
        this.name = name;
        this.dept = dept;
        this.pay = pay;
        this.score = score;
    }
    @Override
    public String toString(){
        return "사원이름 : "+name+"\n" +
                "근무부서 : "+dept+"\n" +
                "받는급여 : "+pay+"\n" +
                "입사점수 : "+score;
    }

}
