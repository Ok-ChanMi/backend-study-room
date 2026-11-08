package step08_상속.object.inheritance;
// ------------------ 1.
class Branch{
    public Branch() {  // 접근 지정자가 생략될 수 도 있음
        System.out.println("Branch default constructor");  // 4
    }
    public Branch(String str){
        this();  // 3
        System.out.println(str+"Branch constructor");  //5
    }
}
class Leaf extends Branch{
    public Leaf(){
        super("hi");  // 2
        System.out.println("Leaf default constructor");  // 6
    }
}
public class InheritanceEx3 {
    public static void main(String[] args) {
        new Leaf();  // 1, 7
    }
}
