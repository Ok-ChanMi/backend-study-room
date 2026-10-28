package step06_객체.object;
/*
    -base:int
    -top:int
    -height:int

    +setTrapezoid(base:int, top:int, height:int):void
    +col():double   // 사다리꼴의 넓이를 구해서 리턴, (밑변+윗변)*높이 / 2
    +toString():String
 */
public class Trapezoid {
    private int base;
    private int top;
    private int height;
    public void setTrapezoid(int base, int top, int height){
        this.base=base;
        this.top=top;
        this.height=height;
    }
    public double col(){
        return (base + top)*height/2.0;
    }
    public String toString(){
        return "넓이 : "+col();
    }
}

