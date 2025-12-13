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
        System.out.println();
//        --------------------------------------
        String [] color={"red", "green", "blue"};
        for(int n=0; n<color.length; n++){
            System.out.print(color[n]+" ");
        }
        System.out.println();
        // 향상된 for문으로 표현해 주세요
        for(String str : color){
            System.out.print(str+" ");
        }
//        --------------------------------------
        System.out.println();
        // continue, break
        for(int a=1; a<=10; a++){
            if(a==5)
//                break;  // 현재 반복되고 있는 루프가 멈추게 됨
                continue;   // 현재 반복되고 있는 루프를 멈추고 루프의 처음에서 다음 반복을 수행
                            // 1 2 3 4 6 7 8 9 10
            System.out.print(a+" ");    // 1 2 3 4
        }

    }
}
