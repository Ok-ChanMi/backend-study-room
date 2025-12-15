package step04_메서드.methodex;
/*
    사원번호 : 101
    사원이름 : 홍길동
    부서코드 : A
    입사성적 : 85.9
*/
public class MethodEx3 {

    public static int view1(){ return 101; }
    public static String view2(){ return "홍길동"; }
    public static char view3() { return 'A'; }
    public static double view4() { return 85.9; }

    public static void main(String[] args) {
        System.out.println("사원번호 : "+ view1());
        System.out.println("사원이름 : "+ view2());
        System.out.println("부서코드 : "+ view3());
        System.out.printf("입사성적 : %.1f", view4());
    }
}
