package step03_제어문.forex;

public class ForEx2 {
    public static void main(String[] args) {
        int [] num= {101, 102, 103, 104, 105};

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        // 향상된 for문 : 배열 변수, 연동된 값을 가지는 시퀀스 변수
        for(int n : num){
            System.out.print(n+ " ");
        }
//        --------------------------------------
        String [] color={"red", "green", "blue"};
        for(int n=0; n<color.length; n++){
            System.out.println(color[n]+" ");
        }
        System.out.println();
        // 향상된 for문으로 표현해 주세요
        for(String str : color){
            System.out.println(str);
        }

    }
}
