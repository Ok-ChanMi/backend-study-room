package step08_상속.objectarray;

// 오브젝트 변수
public class UserEx1 {
    public static void main(String[] args) {
        User ob1 = new User("홍길동", "010-1234-5678");
        User ob2 = new User("손오공", "010-1111-5678");
        User ob3 = new User("베지터", "010-1222-5678");

        System.out.println(ob1.getName()+"\t"+ob1.getPhone());
        System.out.println(ob2.getName()+"\t"+ob2.getPhone());
        System.out.println(ob3.getName()+"\t"+ob3.getPhone());
    }
}
