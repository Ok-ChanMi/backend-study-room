package step08_상속.inheritance;
class NumberEx1{
    int a, b;

    public NumberEx1(int a, int b){
        super();
        this.a = a;
        this.b = b;
    }
    public void view1(){
        System.out.println(a+"\t"+b);
    }
}
class NumberEx2 extends NumberEx1{
    int c;
    public NumberEx2(int a, int b, int c){
        super(a, b);
        this.c = c;
    }
    public void view2(){
        super.view1();
        System.out.println(c);
    }
}
public class InheritanceEx4 {
    public static void main(String[] args) {
        new NumberEx1(100, 200).view1();
        System.out.println();
        new NumberEx2(10, 20, 30).view2();
    }
}
