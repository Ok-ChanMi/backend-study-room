package step01_기초;

/*
    문제 각각 변수에 값을 대입하여 출력하세요

    이름 : 이순신  -> println()
    나이 : 25세   -> print()
    부서 : 개발부  -> printf()를 사용하여 부서와 성적을 한 번에 출력
    성적 : 87.5점
*/

public class Test4 {
    public static void main(String[] args) {
        String name="이순신";
        int age=25;
        String dept="개발부";
        double score=87.5;

        System.out.println("이름 : "+name);
        System.out.print("나이 : "+age+"세\n");
        System.out.printf("부서 : %s\n성적 : %.1f점", dept,score);  // printf()로 출력할 땐 소수점 아래 어디까지 출력할지 정해줘야함(println()이나 print()는 상관없음)
    }
}
