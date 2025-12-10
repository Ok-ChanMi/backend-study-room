package step03_제어문.IfEx;

public class IfEx1 {
    public static void main(String[] args) {

//        // if~else if문
//        int score=75;
//        char grade;
//
//        if(score>=90){
//            grade='A';
//        }else if(score>=80){
//            grade='B';
//        }else if(score>=70){
//            grade='C';
//        }else if(score>=60){
//            grade='D';
//        }else{
//            grade='F';
//        }
//
//        System.out.println("점수는 "+score+"점이고 학점은 "+grade+"입니다");

//        ---------------------------------
        int score=75;
        char grade='\0';    // 초기화 생략불가

        if(score>=90 && score<=100){
            grade='A';
        }
        if(score>=80 && score<90){
            grade='B';
        }
        if(score>=70 && score<80){
            grade='C';
        }
        if(score>=60 && score<70){
            grade='D';
        }
        if(score>=0 && score<60){
            grade='F';
        }
        System.out.println("점수는 "+score+"점이고 학점은 "+grade+"입니다");

//        // if~else 문
//        int score=45;
//        if(score>=60){
//            System.out.println("합격");
//        }else {
//            System.out.println("불합격");
//        }
//        System.out.println("점수는 "+score+"점입니다");

        //        // 단순 if 문 ----------
//        String str="Potter";
//
//        if(str=="Harry"){
//            System.out.println("해리");
//            System.out.println("포터");
//        }
//        System.out.println("호그와트"); // if문의 범위가 아님
    }
}
