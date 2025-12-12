package step03_제어문.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// do~while 는 검사를 하고자 하는 값을 입력을 받아서 처리할 경우 사용
public class DoWhileEx1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        do {
            System.out.print("점수를 입력하세요 : ");
            num=Integer.parseInt(br.readLine());
        }while (num<0 || num>100);

        System.out.println("점수는 "+num+"점 입니다");
    }



}
