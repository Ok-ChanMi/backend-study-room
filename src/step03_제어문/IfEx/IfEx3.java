package step03_제어문.IfEx;
// 중첩 if문 : if문 내부에 또 다른 if문 사용
public class IfEx3 {
    public static void main(String[] args) {
        int score=85;

        if(score>=60){
            if(score < 80){
                System.out.println("합격 : 보통");
            }else {
                System.out.println("합격 : 우수");
            }
        }else {
            System.out.println("불합격");
        }
    }
}
