package step05_배열.array;
// 가변 배열 : 행 또는 열의 개수가 다른 배열
public class ArrayEx6 {
    public static void main(String[] args) {    // 3행 4열 3 x 4 배열
//        int[][] num=new int[3][]; // 행의 개수를 지정하면 열의 개수는 자동으로 완성 but, 반대는 불가능
//        num[0]=new int[]{10,20};
//        num[1]=new int[]{50, 60, 70, 80};
//        num[2]=new int[]{90, 100, 100};

        int[][] num={{10,20},
                    {50, 60, 70, 80},
                    {90, 100, 100}};


        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();   // 행이 끝날때 마다 줄바꿈 기능
        }
    }
}
