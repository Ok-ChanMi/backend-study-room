package step08_상속.inheritance;

/*
    디폴트 생성자, 인자 4개 생성자, toString()
 */
public class SubTest extends SuperTest {
    private int age;
    private double score;
    public SubTest(){

    }
    public SubTest(String name, String addr, int age, double score){
        super(name, addr);
        this.age = age;
        this.score = score;
    }
    @Override
    public String toString(){
        return super.toString()+"나이는 "+age+"세이고 점수는 "+score+"점입니다";
    }

    public static void main(String[] args) {
        SuperTest ob1 = new SuperTest("손오공", "지구");
        System.out.println(ob1.toString());
        // 이름은 손오공이고, 사는 곳은 지구입니다

        System.out.println("----------------------");
        SubTest ob2 = new SubTest("베지터", "지구", 35, 85.4);
        System.out.println(ob2.toString());
        // 이름은 베지터이고, 사는 곳은 지구입니다
        // 나이는 35세이고 점수는 85.4점입니다
    }
}
