package step06_객체.object;
/*
    클래스명 : Sales
    -item : String
    -qty : int
    -cost : int

    +getter & setter

    +toString():String
    +getPrice():int
    ------------------------
    품목 : apply
    수량 : 5
    단가 : 1200원
    금액 : 6000원 ==> main 함수에서 getter를 이용하여 출력

    apple 1200원짜리 5개를 구입하려면 6000원이 필요함 => 매인함수에서 toString() 을 호출하여 출력
 */
class Sales{
    private String item;
    private int qty;    // 수량
    private int cost;   // 단가


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return item+" "+cost+"원짜리 "+qty+"개를 구입하려면 "+getPrice()+"원이 필요함";
    }
    public int getPrice(){
        return qty * cost;
    }

}
public class ObjectEx5 {
    public static void main(String[] args) {
        Sales sales = new Sales();
        sales.setItem("apple");
        sales.setQty(5);
        sales.setCost(1200);

        System.out.println("품목 : "+sales.getItem());
        System.out.println("수량 : "+sales.getQty());
        System.out.println("단가 : "+sales.getCost()+"원");
        System.out.println("금액 : "+sales.getPrice()+"원");

        System.out.println();

        System.out.println(sales.toString());


    }
}
