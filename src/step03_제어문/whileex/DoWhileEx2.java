package step03_제어문.whileex;
// 65~90사이의 난수 10개 생성
public class DoWhileEx2 {
    public static void main(String[] args) {
        int num;
        int count=0;

//        do{
//            ++count;
//            num=(int)(Math.random()*26+65);
//            System.out.print(num+" ");
//        }while (count<10);

//        -----------------
        while (count<10){
            ++count;
            num=(int)(Math.random()*26+65);
            System.out.print(num+" ");
//      값을 초기화해서 들어갔기 때문에 별차이 x 하지만 입력을 받아서 초기화할 땐 대부분 do~while 이 편리
        }
    }
}
