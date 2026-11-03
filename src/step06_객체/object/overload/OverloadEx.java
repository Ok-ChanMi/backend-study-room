package step06_객체.object.overload;
/* method overload(중복 함수) : 같은 이름의 함수를 여러번 구현
*  1. 반드시 함수 이름 동일
*  2. 매개변수의 자료형이 다르거나 개수가 달라야 함
*
*  사용하는 이유 : 함수의 이름 절약, 동일한 역할 또는 비슷한 역할을 하는 함수에 대하여
* */
public class OverloadEx {
    int x=17;
    int y=15;
    public  int max(){
        return (x>y)?x:y;
    }
    public  int max(int x, int y){
        return (x>y)?x:y;
    }
    public  float max(float x, float y){
        return (x>y)?x:y;
    }
    public static void main(String[] args) {
        OverloadEx ob=new OverloadEx();
        System.out.println("큰수 : "+ob.max());
        System.out.println("큰수 : "+ob.max(75, 100));
        System.out.println("큰수 : "+ob.max(90.5f, 50.4f ));
    }
}
