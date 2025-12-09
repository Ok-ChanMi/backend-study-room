package step01_기초;

/*
    문제 각각의 변수를 만들어서 값을 대입한 후 결과를 출력하세요 (println() 사용)
            (이름, 성별, 입사점수)
    --결과
    이름은 홍길동이며 성별은 남자이고
    입사성적은 85.35점입니다

*/
public class Test1 {
    public static void main(String[] args) {

        String name="홍길동";
        String gender="남자";
        float score=85.35f;

        System.out.println("이름은 "+name+"이며 성별은 "+gender+"이고");
        System.out.println("입학성적은 "+score+"점입니다");
    }
}
