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
        st = new Student("민들래", 95, 85, 73);
        System.out.println("이름 : "+st.getName());
        System.out.println("국어 : "+st.getKor());
        System.out.println("영어 : "+st.getEng());
        System.out.println("수학 : "+st.getMat());
        System.out.println("총점 : "+st.getTotal());
        System.out.printf("평균 : %.2f\n",st.getAvg());
        // System.out.println(String.format("평균 : %.2f",st.getAvg()));
        System.out.println("학점 : "+st.getGrade());
    }
}
