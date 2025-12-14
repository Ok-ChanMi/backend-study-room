package step04_메서드.inputex;
/*
    eno:101
    ename:홍길동
    dept:A
    score:85.9를 대입 후 출력하세요
    printf()를 사용하여 출력해주세요

    --결과
    사원번호 : 101
    사원이름 : 홍길동
    부서코드 : A
    입사성적 : 85.9
*/
public class InputTest5 {
    public static void main(String[] args) {

        int eno = 101;
        String name="홍길동";
        char dept='A';
        double score=85.9;

        System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.1f", eno, name, dept, score);

    }
}
