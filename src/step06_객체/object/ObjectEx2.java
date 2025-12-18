package step06_객체.object;

public class ObjectEx2 {
    public static void main(String[] args) {
        User ob=new User();
        ob.setUser("홍길동", 97, 55, 79); // 이름은 홍길동이고 총점은 231점입니다
        System.out.println(ob.getUser());
    }
}
