package step04_메서드.inputex;
/*
    Argument 를 이용하여 입력받고 출력하세요
    $ java InputTest& 103 뽀로로 C 75.3

    -- 결과
    사원번호 : 103
    사원이름 : 뽀로로
    부서코드 : C
    입사성적 : 75.3

    printf()를 1회만 사용하여 출력하세요
*/
public class InputTest7 {
    public static void main(String[] args) {
        int eno=Integer.parseInt(args[0]);
        String name=args[1];
        char dept=args[2].charAt(0);
        double score=Double.parseDouble(args[3]);

        System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.1f", eno, name, dept, score);

    }
}
