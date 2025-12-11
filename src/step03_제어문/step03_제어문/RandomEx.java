package step03_제어문.step03_제어문;

import java.util.Random;

// 난수 : 컴퓨터가 임의의 숫자를 만들어 내는 것
// 의사 난수 (pseudo random): 동일한 조건이 갖추어 진다면 동일한 값을 재생할 수 있는 난수
public class RandomEx {
    public static void main(String[] args) {
        // Math 클래스를 이용------------
        System.out.println(Math.random());  // 0이상 1미만의 실수 난수 생성
        System.out.println((int)(Math.random()*10+1));  // 1이상 11미만의 정수 난수 생성
        System.out.println((int)(Math.random()*31+50));  // 50이상 81미만의 정수 난수 생성

        System.out.println((int)(Math.random()*30+51));  // 50이상 81미만의 정수 난수 생성

        // Random클래스 이용---------------------
        Random rd=new Random();
        int n1=rd.nextInt(101)+0; // 0이상 101미만의 정수 난수
        int n2=rd.nextInt(31)+50; // 50이상 81미만의 정수 난수
        int n3=rd.nextInt(41)+30; // 30이상 71미만의 정수 난수

        System.out.println(n1+"  "+n2+"   "+n3);
    }
}
