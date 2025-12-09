package step01_기초;

/*
    문제 각각의 변수를 만들어서 결과를 완성하세요

    float 자료형의 변수 75.3
    double 자료형의 변수에 89.53을 대입하여
    System.out.print()를 1회 사용하여 결과를 출력하세요

    --결과
    국어 점수는 75.3점이고
    수학 점수는 89.53점입니다
*/
public class Test3 {
    public static void main(String[] args) {
        float kor=75.3f;
        double mat=89.53;

        System.out.print("국어 점수는 "+kor+"점이고\n수학 점수는 "+mat+"점입니다");
//        System.out.println();
//        System.out.printf("국어 점수는 %.1f점이고\n수학 점수는 %.2f점입니다", kor,mat);
    }
}
