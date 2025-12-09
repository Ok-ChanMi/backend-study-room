package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  문제
    A의 값을 입력하세요 : 15
    B의 값을 입력하세요 : 9
    15+9=24
*/
public class InputTest2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int a;
        int b;

        System.out.print("A의 값을 입력하세요 : ");     a=Integer.parseInt(br.readLine());
        System.out.print("B의 값을 입력하세요 : ");     b=Integer.parseInt(br.readLine());

        System.out.println("\n"+a+"+"+b+"="+(a+b));
    }
}
