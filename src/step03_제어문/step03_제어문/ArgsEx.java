package step03_제어문.step03_제어문;
// 아규먼트 : 프로그램에서 함수를 호출할 때 전달되 입력되는 실제 값
/* 강의에서 java ArgsEx 10 20 30 -> 이렇게 나오면
   ArgsEx <- 클래스명 아규먼트에서 받아서 하는 것!
*/
public class ArgsEx {
    public static void main(String[] args) {
        /* 이클립스는 Variables 에서 ${string_prompt}
           인텔리제이는 Program arguments 에서 $Prompt$ 작성
        */
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int c= Integer.parseInt(args[2]);

        System.out.println("세 수의 합 : "+(a+b+c));
    }
}
