package step05_배열.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    BufferedReader를 이용하여
    크기가 5인 정수형 배열을 선언하고 배열에 데이터를 입력을 받아서 출력하고 최대, 최솟 값을 출력

    -- 결과
    arr[0]의 값을 입력 : 25
    arr[1]의 값을 입력 : -31
    arr[2]의 값을 입력 : 13
    arr[3]의 값을 입력 : 5
    arr[4]의 값을 입력 : 8

    25 -31 13 5 8

    최댓값 : 25
    최솟값 : -31
*/
public class ArrayEx7 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[5];
        for(int i=0; i<arr.length; i++) {
            System.out.print("arr["+i+"]의 값을 입력 : "); arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        System.out.println();
        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);

    }
}
