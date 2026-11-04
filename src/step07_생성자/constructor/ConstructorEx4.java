package step07_생성자.constructor;

import java.util.Scanner;

/*
    클래스명 : ConstructorEx4
    x : int
    y : int
    +ConstructorEx4()   -- 입력받기
    +cal() : int     -- x*y를 리텀
    +display() : void   -- 결과 출력
 */
public class ConstructorEx4 {

    int x;
    int y;
    public ConstructorEx4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("가로를 입력 : ");    x=sc.nextInt();
        System.out.println("세로를 입력 : ");    y=sc.nextInt();

    }
    public int cal(){
        return x*y;
    }
    public void display(){
        System.out.println("사각형의 넓이 : "+cal());
    }
    public static void main(String[] args) {
        //new ConstructorEx4().display();

        ConstructorEx4 ob = new ConstructorEx4();
        ob.display();
    }
}
