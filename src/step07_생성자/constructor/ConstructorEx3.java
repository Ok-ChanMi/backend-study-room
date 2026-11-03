package step07_생성자.constructor;
/*
   클래스명 : UserInfo
   -name:String
   -addr:String
   +UserInfo()
   +UserInfo(name:String, addr:String)
   +getter
 */
/* ***** 주소록 *****   <-- 디폴트 생성자에서 출력
   이름 : 손오공         <-- main함수에서 getter를 이용하여 이름, 주소를 출력
   주소 : 서울시
 */
class UserInfo{
    private String name;
    private String addr;
    public UserInfo() {
        System.out.println("***** 주소록 *****");
    }
    public UserInfo(String name, String addr) {
        this();
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }
}
public class ConstructorEx3 {
    public static void main(String[] args) {
        // new UserInfo() // 메인함수 수정 금지
        UserInfo ob = new UserInfo("손오공", "서울시");
        System.out.println("이름 : "+ob.getName());
        System.out.println("이름 : "+ob.getAddr());
    }
}
