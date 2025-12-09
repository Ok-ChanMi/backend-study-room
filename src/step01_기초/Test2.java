package step01_기초;

/*
    문제 4개의 변수를 만들어서 다음의 결과를 나오도록 출력하세요
            (이름, 국어, 영어 , 수학 변수)
    이름 : 뽀로로
    국어 : 95
    영어 : 85
    수학 : 73
    총점 : 253점
*/
public class Test2 {
    public static void main(String[] args) {

        String name="뽀로로";
        int kor = 95;
        int eng = 85;
        int mat = 73;

        System.out.println("이름 : "+ name);
        System.out.println("국어 : "+ kor);
        System.out.println("영어 : "+ eng);
        System.out.println("수학 : "+ mat);
        System.out.println("총점 : "+(kor+eng+mat)+"점");

        System.out.println();
        System.out.println("이름 : "+name+"\n국어 : "
                            +kor+"\n영어 : "+eng+"\n수학 : "
                            +mat+"\n총점 : "+(kor+eng+mat)+"점");

        System.out.println();
        System.out.printf("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d점", name, kor, eng, mat, kor+eng+mat);
    }
}
