package step03_제어문.IfEx;

/*
    문제 다음 프로그램을 작성하세요
    a 변수에 55또는 46을 대입한후
    1. 단순 if 이용
        "55는 50보다 크거나 같다" or "46은 50보다 작다"를 출력
    2. if~else를 이용(a%2==0)
        a변수의 값이 홀수인지 짝수인지를 출력
    3. if~else if를 이용
        a변수의 값이 " 양수", "음수", "zero"인지 출력

    -----결과
    55는 50보다 크거나 같다
    55는 홀수입니다
    55는 양수입니다
*/
public class IfEx2Test {
    public static void main(String[] args) {

        int a=0;
        // 1. 단순 if 이용
        if(a>=50){
            System.out.println(a+"는 50보다 크거나 같다");
        }
        if(a<50){
            System.out.println(a+"은 50보다 작다");
        }

        //2. if~else를 이용(a%2==0)
        if(a%2==0){
            System.out.println(a+"는 양수입니다");
        }else{
            System.out.println(a+"는 홀수입니다");
        }

        // 3. if~else if를 이용
        if(a>0){
            System.out.println(a+"는 양수입니다");
        }else if(a<0){
            System.out.println(a+"는 음수입니다");
        }else {
            System.out.println("Zero");
        }


    }
}
