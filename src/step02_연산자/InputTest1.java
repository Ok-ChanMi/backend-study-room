package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    콘솔에서 데이터 입력받기
    이름을 입력하세요 : 뽀로로
    --출력
    이름은 뽀로로입니다
*/
// 키보드에서 값을 입력 받는 경우는 변수에 저장하여 사용
public class InputTest1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String name;
        char gender;
        int age;
        float tall;
        double weight;

        System.out.print("이름을 입력하세요 : ");   name=br.readLine();
        System.out.print("성별을 입력하세요 : ");   gender=br.readLine().charAt(0);
        /* charAt(index) 인덱스로 주어진 값에 해당하는 문자를 리턴
           인덱스는 0부터 시작, 가장 큰수는 (문자열.length-1)
           인덱스에 해당하는 값이 없는 경우는 공백을 리턴
           키보드로 남성을 입력했을 때 br.readLine()은 남성+엔터까지 받음(+\r\n)
           but '남'만 받으면 되니까 charAt()을 이용해 남(index 0번째에 해당하는 부분)만
           받아서 사용
        */
        System.out.print("나이를 입력하세요: ");    age=Integer.parseInt(br.readLine());
        System.out.print("키를 입력하세요: ");    tall=Float.parseFloat(br.readLine());
        System.out.print("체중를 입력하세요: ");    weight=Double.parseDouble(br.readLine());



        System.out.println("이름은 "+name+"입니다");
        System.out.println("성별은 "+gender+"성 입니다");
        System.out.println("나이는 "+age+"세입니다");
        System.out.println("키는 "+tall+"cm입니다");
        System.out.println("체중는 "+weight+"kg입니다");
    }
}
