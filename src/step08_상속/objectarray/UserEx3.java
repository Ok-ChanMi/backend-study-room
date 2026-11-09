package step08_상속.objectarray;

// 오브젝트 배열 - 2
public class UserEx3 {
    public static void main(String[] args) {
//        int [] num = new int[] {10,20,30};
        User[] ob = new User[] {
            new User("홍길동", "010-1234-5678"),
            new User("손오공", "010-1111-5678"),
            new User("베지터", "010-1222-5678")
        };

        for(User m:ob){
            System.out.println(m.getName()+"\t"+m.getPhone());
        }
    }
}
