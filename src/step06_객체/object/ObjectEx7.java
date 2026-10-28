package step06_객체.object;

import java.util.Scanner;

/*
    ***** 사다리꼴의 넚이 구하기 *****
    밑변을 입력하세요 : 3
    윗변을 입력하세요 : 4
    높이를 입력하세요 : 5
    넓이 : 17.5
    한번 더 실행할까요?(Y/y): y
    ***** 수고하셨습니다 *****
    ***** 사다리꼴의 넚이 구하기 *****
    밑변을 입력하세요 : 3
    윗변을 입력하세요 : 4
    높이를 입력하세요 : 5
    넓이 : 17.5
    한번 더 실행할까요?(Y/y): n
    ***** 수고하셨습니다 *****
 */
public class ObjectEx7 {
    public static void main(String[] args) {
        int base, top, height;
        char ck;
        Scanner sc=new Scanner(System.in);

        do{
            // 입력받기
            System.out.println("***** 사다리꼴의 넚이 구하기 *****");
            System.out.print("밑변을 입력하세요 : ");   base=sc.nextInt();
            System.out.print("윗변을 입력하세요 : ");   top=sc.nextInt();
            System.out.print("높이를 입력하세요 : ");   height=sc.nextInt();


            // Trapezoid 클래스로 객체를 만들어서 넓이를 구하세요
            Trapezoid tz=new Trapezoid();
            tz.setTrapezoid(base, top, height);

            System.out.println(tz.toString());
            System.out.print("한번 더 실행할까요?(Y/y): ");
            ck=sc.next().charAt(0);
        }while (ck=='Y' || ck=='y');
        System.out.println("***** 수고하셨습니다 *****");
        sc.close();
    }
}
