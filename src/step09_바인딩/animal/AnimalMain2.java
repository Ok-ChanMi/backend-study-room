package step09_바인딩.animal;

import java.util.Scanner;
// 동적바인딩 : 실행시점(runtime)에 호출함수가 결정이 되는 구조
public class AnimalMain2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        while (true){
            System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit \n선택하세요 : ");
            n=sc.nextInt();
            Animal ani=null;
//            Dog dog=null;
//            Cat cat=null;
//            Duck duck=null;
//            Fish fish=null;
            switch (n){
                case 1: ani=new Dog();  break;
                case 2: ani=new Cat();  break;
                case 3: ani=new Duck();  break;
                case 4: ani=new Fish();  break;
                case 5:
                    System.out.println("------- 종료합니다 --------");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("입력이 잘못 되었습니다");
            }
            ani.speak();
            ani.walk();
        }
    }
}
