package step08_상속.objectarray;

// 오브젝트 배열 - 1
public class UserEx2 {
    public static void main(String[] args) {
//        int [] num = new int[3];
//        num[0]=10;
//        num[1]=20;
//        num[2]=30;

        User[] ob = new User[3];
        ob[0] = new User("홍길동", "010-1234-5678");
        ob[1] = new User("손오공", "010-1111-5678");
        ob[2] = new User("베지터", "010-1222-5678");
        for(int i=0; i<ob.length; i++){
            System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
        }
    }
}
