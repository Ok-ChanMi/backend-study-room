package step09_바인딩.animal;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        while (true){
            System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5.Exit \n선택하세요 : ");
            n=sc.nextInt();
            Dog dog=null;
            Cat cat=null;
            Duck duck=null;
            Fish fish=null;
            switch (n){
                case 1: dog=new Dog(); dog.speak(); dog.walk(); break;
                case 2: cat=new Cat(); cat.speak(); cat.walk(); break;
                case 3: duck=new Duck(); duck.speak(); duck.walk(); break;
                case 4: fish=new Fish(); fish.speak(); fish.walk(); break;
                case 5:
                    System.out.println("------- 종료합니다 --------");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("입력이 잘못 되었습니다");
            }
        }
    }
}
