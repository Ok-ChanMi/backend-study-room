package step02_연산자;

public class OperatorEx1{
    public static void main(String[] args){
        int a=5;

        // 관계연산자
        System.out.println(a==5); // a는 5와 같은가?, true
        System.out.println(a>=5); // a는 5보다 크거나 같은가?, true
        System.out.println(a<=5); // a는 5보다 작거나 같은가?, true
        System.out.println(a>5); // a는 5보다 큰가?, false
        System.out.println(a!=5); // a는 5와 같이 않은가?, false


        // 논리 연산자 and, or
        String str="Korea";
        System.out.println(str=="Korea" || str=="KOREA");  // or, true

        int score=57;
        System.out.println(score>70 && score<90);  // and, false


    }
}
