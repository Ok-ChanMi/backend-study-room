package step03_제어문.whileex;

// 조건을 만족하는 동안 반복
// while(조건식){문장..}

public class WhileEx1 {
    public static void main(String[] args) {
//        int n=0;
//
//        // 조건식의 결과가 true일 경우 반복
//        while(true){    // 무한루프, 이경우는 내부에 탈출 조건을 작성해야함
//            ++n;
//            if(n<=5){
//                System.out.println("hello java");
//            }else {
//                break;
//            }
//        }

//        ------------------------------------
//        int n=0;
//        while(n<=5){
//            ++n;
//            System.out.println("hello java");
//        }

//        -------------------------------------
        // 10 9 8 7 6 5 4 3 2 1
        int n=10;
        while (n>=1){
            System.out.print(n+" ");
            --n;
        }
    }
}
