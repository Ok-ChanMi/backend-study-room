package step02_연산자;
/*
    ASCII코드 : 7비트 코드체계, 미국정보교환용표준코드 0~127까지
    A : 65 (100001)
    a : 97
*/
public class AsciiCode {
    public static void main(String[] args) {

        System.out.println('A' + " : " + (int) 'A');
        System.out.println('a' + " : " + (int) 'a');

        System.out.println(65 + " : " + (char) 65);
        System.out.println(97 + " : " + (char) 97);

        System.out.println("-------------------");

        System.out.println('A' + 1);          // char+int==> int
        System.out.println((char) ('A' + 1));

        // 이클립스에서 대소문자 변환 Ctrl + Shift + x, Ctrl + Shift + y
        // 인텔리제이 macOS : Command + Shift + U
        System.out.println('a' - 32);
        System.out.println((char) ('a' - 32));

        System.out.println('A' + 'B'); // char+char==> int
        System.out.println((char) ('A' + 'B')); // 출력 시 결과는 보이지는 않으나 출력이 되어있음 특수한 경우 말고는 사용x
    }
}

/*
    비트 : 하나의 자리값으로 0, 1을 표현
    바이트 : 영문자, 숫자, 특수문자 => 8개의 비트
*/
