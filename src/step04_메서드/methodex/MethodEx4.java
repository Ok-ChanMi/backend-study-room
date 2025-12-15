package step04_메서드.methodex;
// call by value : 값에 의한 전달
public class MethodEx4 {
    public static void show1(int a, char b, double c, float d){     // 받는 쪽의 값을 형식 매개변수라 함
        System.out.println(a+"  "+b+"  "+c+"  "+"  "+d);
    }

    public static int show2(int k, int e, int m){
        return k+e+m;
    }

    public static double show3(int k, int e, int m){
        return (double) (k+e+m)/3;

    }
    public static String show4(int k, int e, int m){
        double avg=(k+e+m)/3.0;
//        if(avg>=60){
//            return "합격";
//        }else {
//            return "불합격";
//        }
        // 삼항 연산자로 표현
        return (avg>=60)? "합격" : "불합격";
    }


    public static void main(String[] args) {
        show1(10, 'A', 10.5, 100.3f);    // 보내는 쪽의 값을 실매개변수
        int sum=show2(95,85,73);
        System.out.println("합계 : "+sum);
        System.out.println("합계 : "+show2(95, 85,73));


        double avg=show3(95,85,73);
        System.out.printf("평균 : %.2f\n",avg);

        String rs=show4(95,85,73);
        System.out.println(rs);
    }
}
