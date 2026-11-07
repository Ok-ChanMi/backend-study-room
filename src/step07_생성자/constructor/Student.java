package step07_생성자.constructor;
/*
    -name : String
    -kor : int
    -eng : int
    -mat : int
    +Student()
    +Student(name : String, kor : int, eng : int, mat : int)
    +getter & setter
    +toString() : String
    +getTotal() : int  <-- kor+eng+mat를 리턴
    +getAvg() : double   <-- getTotal()을 3으로 나눠서 평균을 구한 후 리턴
    +getGrade() : char  <-- A, B, C, D, F 학점을 구해서 리턴
 */
public class Student {


    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Student() {
        super();
    }

    public Student(String name, int kor, int eng, int mat) {
        super();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        //return name+"의 점수는 "+getTotal()+"점이며 평균은 "+String.format("%.2f", getAvg())+"점이고 학점은 "+getGrade()+"입니다.";
        return String.format("홍길동의 점수는 %d점이며 평균은 %.2f점이고 학점은 %c입니다.", getTotal(), getAvg(), getGrade());
    }

    public int getTotal() {
        return kor + eng + mat;
    }

    public double getAvg() {
        return getTotal() / 3.0;  // or (double)getTotal()/3;
    }

    public char getGrade() {
        switch ((int) getAvg() / 10) {  // 스위치 조건식은 정수자료형(int, char, long), String
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }
}