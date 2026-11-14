package step09_바인딩.shape;
/*
    -x : int
    -y : int
    +Shape()
    +Shape(x, y)
    +getter & setter

    +getSize() : double
 */
public class Shape {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Shape() {

    }
    public Shape(int x, int y) {

    }
    public Double getShape() {
        return 0.0;
    }
}
