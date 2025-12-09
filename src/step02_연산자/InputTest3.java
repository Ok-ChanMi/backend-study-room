package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제 다음과 같이 입력받고 출력하세요

    이름 : 진달래
    성별 : 여
    나이 : 23

    --출력
    이름은 진달래입니다
    성별은 여성입니다
    나이는 23세 입니다

    --이전 코드를 기억으로만 작성해 볼것
*/
public class InputTest3 {
    public static void main(String[] args) throws IOException {

//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        char gender;
        int age;

        System.out.print("이름 : ");  name=br.readLine();
        System.out.print("성별 : ");  gender=br.readLine().charAt(0);
        System.out.print("나이 : ");  age=Integer.parseInt(br.readLine());

        System.out.println("이름은 "+name+"입니다\n성별은 "+gender+"성입니다\n나이는 "
                            +age+"세 입니다");
    }
}
