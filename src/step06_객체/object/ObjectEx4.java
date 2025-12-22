package step06_객체.object;
/*
    사원이름 : 진달래
    근무부서 : 총무부
    받는급여 : 2000000
    입사점수 : 85.85

 */
public class ObjectEx4 {
    public static void main(String[] args) {
        Employee em=new Employee();
        em.setName("진달래");
        em.setDept("총무부");
        em.setPay(20000000);
        em.setScore(85.85);
        System.out.println(em.toString());


        em.setEmployee("이순신","개발부",2200000, 85.85);
//        System.out.println(em.toString());
        System.out.println("사원이름 : "+em.getName());
        System.out.println("근무부서 : "+em.getDept());
        System.out.println("받는급여 : "+em.getPay());
        System.out.println("입사점수 : "+em.getScore());
    }
}
