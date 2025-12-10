package step02_연산자;

public class CastingEx {
    public static void main(String[] args) {
/*
    문제 실 수령액을 계산하세요 : 급여 - (급여*세금)
    실 수령액 : 829348원
    int pay=857650;
    double tax=0.033;
*/
        int pay=857650;
        double tax=0.033;

        int Income = pay - (int)(pay*tax);

        System.out.println("실 수령액 : "+Income);
// -------------------------------------------------------
        int k=87, e=88, m=75;

        int tot=k+e+m;
//        double avg=tot/3;   //83.0  => tot/3 정수 avg=로 대입연산자 실행되어 실수로 자동형변환
//        double avg=tot/3.0;   // tot/3.0 실수로 자동형변환 -> 대입
        double avg=(double) tot/3;   // 강제형변환
        System.out.println("총점 : "+tot);
        System.out.printf("평균 : %.2f",avg);

// -------------------------------------------------------
//        byte a=100; // byte자료형 : -128 ~ +127까지 표현
//        int b=a;    // int자료형 : -2147483648 ~ +2147483647, 자동형변환
//
//        double c=73.45;
//        int d=(int)c;   // 강제 형변환
//
//        System.out.println(a+"  "+b);
//        System.out.println(c+"  "+d);
    }
}
