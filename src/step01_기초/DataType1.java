package step01_기초;

public class DataType1 {
    public static void main(String[] args) {

        String name="홍길동"; // 문자열 자료형, 값을 "" 안에 입력
        int age=23;  // 4바이트 정수 자료형
        char gender='남'; // 1개의 문자는 ''안에 작성
        float weight=63.4f; // float 인 경우 f를 붙임
        double tall=175.5;


        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age+"세");
        System.out.println("성별 : "+gender);
        System.out.println("체중 : "+weight+"kg");
        System.out.println("신장 : "+tall+"cm");


//        System.out.println("이름 : 홍길동");
//        System.out.println("나이 : 23세");
//        System.out.println("성별 : 남");
//        System.out.println("체중 : 63.4kg");
//        System.out.println("신장 : 175.5cm");
        System.out.println();


        // 문제 println() 한 번만 사용하여 결과가 동일하게 나오도록 출력하세요
        System.out.println("이름 : "+name+"\n나이 : "+age+"세\n성별 : "
                            +gender+"\n체중 : "+weight+"kg\n신장 : "+tall+"cm");
    }
}
