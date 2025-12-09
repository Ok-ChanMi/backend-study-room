package step01_기초;
// 제어문자
/*
    System.out.printf("메세지 or 제어문자:", 변수1, 변수2,..);

    %s : String 문자열
    %c : char 문자
    %d : int 정수
    %f : float, double 실수
*/
public class DataType2 {
    public static void main(String[] args) {
        String name="이순신";
        String dept="개발부";
        char gender='M';
        int age=23;
        float tall=183.4f;
        double score=85.3;

        System.out.printf("이름 : %s\n", name);
        System.out.printf("부서 : %s\n", dept);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d세\n", age);
        System.out.printf("신장 : %.1fcm\n", tall);
        System.out.printf("점수 : %.1f점\n", score);


        System.out.println();
        System.out.printf("점수 : %-10.1f점\n", score); // - 왼쪽정렬, 10 자리수 10개, .1 소수점아래 1자리

        /*
            문제 printf()를 한 번만 사용하여 결과를 출력하세요
                이름 : 뽀로로
                나이 : 23세
        */
        System.out.println();

        String name2="뽀로로";
        int age2=23;
        System.out.printf("이름 : %s\n나이 : %d세",name2, age2);

        System.out.println();
        // 변수 선언 없이 바로 대입
        System.out.printf("이름 : %s\n나이 : %d세","뽀로로", 23);
    }
}
