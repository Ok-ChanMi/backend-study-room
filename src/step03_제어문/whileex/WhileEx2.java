package step03_제어문.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    문제 단을 입력받아서 구구단을 출력하세요

    단을 입력하세요 : 7

    7 * 1 = 7
    7 * 2 = 14
    7 * 3 = 21
        :
    7 * 9 = 63
*/
public class WhileEx2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, number=1;

        System.out.print("단을 입력하세요 : ");    num=Integer.parseInt(br.readLine());

        while (number<10){
            System.out.println(num + " * " +number + " = " + (num*number));
            number++;
        }
    }
}
