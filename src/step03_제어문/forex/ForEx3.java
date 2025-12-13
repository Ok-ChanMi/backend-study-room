package step03_제어문.forex;

public class ForEx3 {
    public static void main(String[] args) {
//      중첩 for문 밖의 for문에 행에 대한 것 안쪽이 열에 대한것
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

//        -----------------------------
        for(int i=1; i<=5; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
//        -----------------------------
        /*  문제
            54321
            5432
            543
            54
            5
        */
        for(int i=1; i<=5; i++){
            for (int j=5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
