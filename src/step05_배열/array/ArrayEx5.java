package step05_배열.array;
// 2차원 배열
public class ArrayEx5 {
    public static void main(String[] args) {    // 3행 4열 3 x 4 배열
        //int[][] num={{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
        int[][] num=new int[][]{{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();   // 행이 끝날때 마다 줄바꿈 기능
        }
    }
}
