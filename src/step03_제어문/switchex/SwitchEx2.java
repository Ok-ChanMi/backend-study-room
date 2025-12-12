package step03_제어문.switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    문제 다음 프로그램을 작성하세요

    숫자를 입력하세요 : 5
    5는 홀수입니다
*/
public class SwitchEx2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;

        System.out.print("숫자를 입력하세요 : ");   number=Integer.parseInt(br.readLine());
        switch (number%2){
            case 0:
                System.out.println(number+"는 짝수입니다");
                break;
            default:
                System.out.println(number+"는 홀수입니다");
                break;
        }
    }
}
