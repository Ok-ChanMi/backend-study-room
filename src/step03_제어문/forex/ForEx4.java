package step03_제어문.forex;
/*
    1~100 사이의 7의 배수만 출력 (continue 사용)

    7 14 21 ....98
*/
public class ForEx4 {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%7!=0){
                 continue;
            }
            System.out.print(i+" ");
        }
    }
}
