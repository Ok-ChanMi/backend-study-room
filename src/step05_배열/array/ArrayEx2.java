package step05_배열.array;

public class ArrayEx2 {
    public static void main(String[] args) {
        String[] car={"소나타", "스파크", "아반떼", "모닝", "코란도"};
        car[3]="포터";

        // 향상된 for 문으로 출력하세요
        for(String n : car){
            System.out.print(n+"  ");
        }
    }
}
