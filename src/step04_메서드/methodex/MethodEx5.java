package step04_메서드.methodex;
/*
    문제
    학점 : switch()를 이용하여 결과 구하기
    -- 90이상 'A', 80이상 'B', 70이상 'C', 60이상은 'D', 나머지는 'F'
    결과 : if~else 를 이용하여 'F'인 경우 "불합격", 아니면 "합격"

    --결과
    총점 : 253점
    평균 : 84.33
    학점 : B
    결과 : 합격
*/
public class MethodEx5 {
//    public static int total(int k, int e, int m){ return k+e+m;}
//    public static Double avg(int total){ return (double)total/3;}
//    public static char grade(double avg){
//        return switch ((int)(avg*0.1)){
//            case 9 -> 'A';
//            case 8 -> 'B';
//            case 7 -> 'C';
//            case 6 -> 'D';
//            default ->'F';
//        };
//    }
//    public static String result(char grade){
//        return (grade=='F')? "불합격" : "합격";
//    }

    public static int total(int k, int e, int m){
        return k+e+m;
    }

    public static double avg(int total){
        return total/3.0;
    }

    public static char grade(double avg){
        switch ((int)avg/10){   // avg=84.33->84->8
            case 10:
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            default: return 'F';
        }
    }

    public static String result(char grade){
        if(grade=='F'){
            return "불합격";
        }else {
            return "합격";
        }
    }

    public static void main(String[] args) {
        int k=95, e=85, m=73;
        System.out.println("총점 : "+total(k, e, m)+"점");
        System.out.printf("평균 : %.2f\n",avg(total(k, e, m)));
        System.out.println("학점 : "+grade(avg(total(k, e, m))));
        System.out.println("결과 : "+result(grade(avg(total(k, e, m)))));
    }

}
