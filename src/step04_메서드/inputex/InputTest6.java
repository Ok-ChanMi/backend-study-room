package step04_메서드.inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    BufferedReader 를 이용하여 입력을 받을 후 출력

    사원번호를 입력하세요 : 102
    사원이름을 입력하세요 : 이순신
    부서코드를 입력하세요 : B
    입사성적을 입력하세요 : 90.54

    -- 결과
    사원번호 : 102
    사원이름 : 이순신
    부서코드 : B
    입사성적 : 90.54

    println 으로 출력하세요
    입사성적은 printf 로 소수 둘째자리까지 출력하세요
*/
public class InputTest6 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("사원번호를 입력하세요 : ");
        int eno = Integer.parseInt(br.readLine());

        System.out.print("사원이름을 입력하세요 : ");
        String name = br.readLine();

        System.out.print("부서코드를 입력하세요 : ");
        char dept = br.readLine().charAt(0);

        System.out.print("입사성적을 입력하세요 : ");
        double score=Double.parseDouble(br.readLine());

        System.out.println("사원번호 : "+eno);
        System.out.println("사원이름 : "+name);
        System.out.println("부서코드 : "+dept);
        System.out.printf("입사성적 : %.2f",score);
    }
}
