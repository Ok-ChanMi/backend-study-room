package step05_배열.array;
// 배열 : 동일한 자료형의 연속된 기억공간
// 1차원 배열
// length : 배열의 길이를 구하는 객체
public class ArrayEx1 {
    public static void main(String[] args) {

//        int[] num={10, 20, 30, 40, 50};
        int[] num=new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;

        // length를 이용하여 출력
//        System.out.println(num.length);

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        for(int i=num.length-1; i>=0; i++){
            System.out.printf(num[i]+"  ");
        }
        System.out.println();
        // 향상된 for문으로 출력하세요
        for(int i : num){
            System.out.print(i+"  ");
        }
    }
}
