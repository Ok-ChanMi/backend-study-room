package step05_배열.array.methodex;
// call vy reference : 참조에 의한 값의 전달
// 객체 자료형(class), 배역
public class MethodEx8 {

    public static void view1(String str){ // 문자열은 매개변수로 사용되면 call by value 로 처리
        System.out.println(str);
    }

    public static void view2(int[] num){
        for(int n : num){
            System.out.print(n+" ");
        num[0]=100;
        System.out.println();
        }
    }
    public static void main(String[] args) {
        String str=new String("happy");
        view1(str);

        int [] num={10, 20, 30, 40, 50};
        view2(num);
        for(int n : num) {
            System.out.print(n + " ");
        }
    }
}
