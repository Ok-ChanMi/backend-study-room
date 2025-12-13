package step03_제어문.forex;

public class ForEx1 {
    public static void main(String[] args) {
//         int sum=0, even=0, odd=0;
//
//         for(int i=1; i<=100; i++){
//             sum+=i; //sum=sum+i;
//             switch (i%2){
//                 case 0 :
//                     even+=i;
//                     break;
//                 case 1 :
//                     odd+=i;
//                     break;
//             }
//         }
//        System.out.println("1-100까지의 전체합  : "+sum);
//         // 짝수합 홀수합 결과 출력
//        System.out.println("1-100까지의 짝수합  : "+even);
//        System.out.println("1-100까지의 홀수합  : "+odd);

//        ------------------------------------------------
//        for(char c='A'; c<='Z'; c++){
//            System.out.print(c+"  ");
//        }

//        --------------------------------------------------

        // 100 97 94 ... 82
        for(int i = 100; i>=82; i-=3){
            System.out.print(i+"  ");
        }
    }
}
