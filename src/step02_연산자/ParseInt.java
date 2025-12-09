package step02_연산자;
// 파스 파싱 => 구문분석
public class ParseInt {
    public static void main(String[] args) {
        String a="100";  // 문자열 "100"
        String b="200";  // 문자열 "200"

        int a1=Integer.parseInt(a); // "100" --> 100으로 변환(문자열을 숫자로)
        int b1=Integer.parseInt(b); // "200" --> 200으로 변환(문자열을 숫자로)

        System.out.println(a+b);   // 100200 연결의 의미
        System.out.println(a1+b1); // 300 더하기의 의미

//        Float.parseFloat(b);
//        Double.parseDouble(b);
    }
}

/*
    컴퓨터의 입력으로는 키보드, 마우스, 인터넷, 파일등이 있다
    비트 -> 문자열 -> 변환할 때 파싱이용
*/
