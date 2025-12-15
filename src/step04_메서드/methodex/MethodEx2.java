package step04_메서드.methodex;
//  call by name
public class MethodEx2 {

    public static int view1(){
        return 10;
    }

    public static char view2(){
        return 'A';
    }

    public static float view3(){
        return 50.3f;
    }

    public static double view4(){
        return 100.45;
    }

    public static String view5(){
        return "Hello";
    }

    public static boolean view6(){
        return true;
    }

    public static void main(String[] args) {
        int a=view1();
        System.out.println(a);
        char b=view2();
        System.out.println(b);
        float c=view3();
        System.out.println(c);
        double d=view4();
        System.out.println(d);
        System.out.println(view4());
        System.out.println(view5());
        System.out.println(view6());
    }
}
