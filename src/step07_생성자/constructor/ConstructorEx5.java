package step07_생성자.constructor;
/*
    문제, 생성자에서 두 수를 입력받아 큰수와 작은 수를 출력하세요
    show() 에서 maxValue(), minValue()를 호출해서 결과를 출력하세요

    클래스명 : Max
    -a : int
    -b : int
    +Max()
    +maxValue() : int
    +minValue() : int
    +show() : void

    ---------------------
    Input a : 5
    Input b : 3

    큰수 : 5
    작은수 : 3


 */

import java.util.Scanner;

class Max{
    private int a;
    private int b;
    public Max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a : ");   a=sc.nextInt();
        System.out.println("Input b : ");   b=sc.nextInt();
        sc.close();
    }
    public int maxValue(){
        return (a>b)?a:b;
    }
    public int minValue(){
        return (a<b)?a:b;
    }
    public void show() {
        System.out.println("큰수 : "+maxValue());
        System.out.println("작은수 : "+minValue());
    }
}
public class ConstructorEx5 {

    public static void main(String[] args) {
        Max m = new Max();
        m.show();
    }
}
