package step03_제어문.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/*
    do~while 을 이용하여 반복처리를 하세요

    다시 실행할까요?(Y/y):y
    다시 실행할까요?(Y/y):Y
    다시 실행할까요?(Y/y):n

    *** 수고하셨습니다 ***
*/
public class DoWhileEx3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char option;
        do{
            System.out.print("다시 실행할까요?(Y/y) : ");
            option=br.readLine().charAt(0);
        }while(option=='Y' || option=='y');
        System.out.println("*** 수고하셨습니다 ***");
    }
}
