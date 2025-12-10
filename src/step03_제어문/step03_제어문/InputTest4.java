package step03_제어문.step03_제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
    문제 다음과 같이 출력하세요
    반지름을 입력하세요 : 5

    원의 넓이 : 78.5    -> r*r*3.14
    원의 둘레 : 31.4    -> r*2*3.14

*/
public class InputTest4 {
    public static void main(String[] args) throws NumberFormatException,IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        double r;
//
//        System.out.print("반지름을 입력하세요 : ");  r=Double.parseDouble(br.readLine());
//
//        System.out.printf("원의 넓이 : %.1f\n",r*r*3.14);
//        System.out.printf("원의 둘레 : %.1f",r*2*3.14);

//        ------------------------------------------------
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int radius;
//        double size, round;
//
//        // 입력
//        System.out.print("반지름을 입력하세요 : ");
//        radius=Integer.parseInt(br.readLine());
//
//        // 계산
//        size=radius*radius*3.14;
//        round=radius*2*3.14;
//
//        // 출력
//        System.out.printf("원의 넓이 : %.1f\n", size);
//        System.out.printf("원의 둘레 : %.1f", round);
//        ---------------------------------------------
        Scanner sc = new Scanner(System.in);

        int radius;
        double size, round;

        // 입력
        System.out.print("반지름을 입력하세요 : ");
        radius=sc.nextInt();

        // 계산
        size=radius*radius*3.14;
        round=radius*2*3.14;

        // 출력
        System.out.printf("원의 넓이 : %.1f\n", size);
        System.out.printf("원의 둘레 : %.1f", round);
    }
}
