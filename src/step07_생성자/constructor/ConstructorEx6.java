package step07_생성자.constructor;

public class ConstructorEx6 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("홍길동");
        st.setKor(95);
        st.setEng(85);
        st.setMat(73);

        System.out.println(st.toString());
        // 출력 시 : 홍길동의 점수는 253점이며 평균은 84.33이고 학점은 B입니다.

        // 매개변수 4개 생성자를 이룡하여 민들래, 95 85 73을 대입하고 getter을 이요하여 출력
        // 이름 : 민들래
        // 국어 : 95
        // 영어 : 85
        // 수학 : 73
        // 총점 : 253
        // 평균 : 84.33
        // 학점 : B

    }
}
