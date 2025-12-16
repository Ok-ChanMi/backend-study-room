package step05_배열.array;
/* args를 이용하여 세 수를 입력받고 최대값, 최소값을 출력

    $ java ArrayEx4 10 15 23
    최대값 : 23
    최소값 : 10
*/
public class ArrayEx4 {
    public static void main(String[] args) {
        int[] num=new int[3];

        // 입력
        num[0]=Integer.parseInt(args[0]);
        num[1]=Integer.parseInt(args[1]);
        num[2]=Integer.parseInt(args[2]);

        // 계산--최대, 최소
        int max=num[0];
        int min=num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]>max) max=num[i];
            if(num[i]<min) min=num[i];
        }
        // 출력
        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);
    }
}
