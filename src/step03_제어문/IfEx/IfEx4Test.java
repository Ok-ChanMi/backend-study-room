package step03_제어문.IfEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    문제 중첩 if문을 이용하여 프로그램 작성
    3개 과목의 점수를 입력받아서 합격인지 불합격인지 출력하시오
    평균이 60미만이면 "불합격"
    평균이 60이 넘는 경우
        -- 1개의 과목이라도 40미만이라면 "과락으로 불합격"
        -- 3개 과목이 모두 40이상인 경우는 "합격"

    -- 결과
    국어점수입력 : 75
    영어점수입력 : 80
    수학점수입력 : 100
    결과 : 합격

    국어점수입력 : 95
    영어점수입력 : 80
    수학점수입력 : 38
    결과 : 과락으로 불합격

    국어점수입력 : 32
    영어점수입력 : 40
    수학점수입력 : 22
    결과 : 불합격

*/
public class IfEx4Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int kor, eng, mat, sum;

        System.out.print("국어점수입력 : "); kor=Integer.parseInt(br.readLine());
        System.out.print("영어점수입력 : "); eng=Integer.parseInt(br.readLine());
        System.out.print("수학점수입력 : "); mat=Integer.parseInt(br.readLine());

        sum = (kor+eng+mat) / 3;
        if(sum < 60){
            System.out.println("불합격");
        }else {
            if(kor<40 || eng<40 || mat<40){
                System.out.println("과락으로 불합격");
            }else {
                System.out.println("합격");
            }
        }

        System.out.println();

        if(kor<40 || eng <40 || mat<40){
            if(sum < 60){
                System.out.println("불합격");
            }else {
                System.out.println("과락으로 불합격");
            }
        }else {
            System.out.println("합격");
        }
    }
}
