package step06_객체.object;

import java.util.Scanner;

// 입력 : BufferedReader(내부에 리더 객체를 이용을 해서 inputStreamReader 를 사용), Scanner(간결하게 처리하나 메모리를 조금 더 차지)
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("문자열 : ");   String str=sc.nextLine();
        System.out.print("정수 : ");     int a= sc.nextInt();
        System.out.print("실수 : ");     double b=sc.nextDouble();
        System.out.print("문자 : ");     char c=sc.next().charAt(0);

        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}
