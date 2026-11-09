package step08_상속.inheritance;
// 디폴트 생성자, 매개변수 2개 생성자, toString()
public class SuperTest {
    private String name;
    private String addr;
    public SuperTest(){

    }
    public SuperTest(String name, String addr){
        super();
        this.name = name;
        this.addr = addr;
    }
    @Override
    public String toString(){
        return "이름은 "+name+"이고, 사는 곳은 "+addr+"입니다\n";
    }
}
