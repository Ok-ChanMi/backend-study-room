package step08_상속.object.constructor;
/*
    클래스명 : Book
    -title : String
    -author : String
    -page : int
    +Book()
    +Book(title, author, page)
    +getter & setter
    +toString() : String
 */
class Book{
    private String title;
    private String author;
    private int page;
    public Book() {

    }
    public Book(String title, String author, int page) {
        super();
        this.title=title;
        this.author=author;
        this.page=page;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    @Override
    public String toString(){
        return title+"의 저자는 "+author+"이고 "+page+"페이지로 구성됨";
    }

}
public class constructorTest2 {
    public static void main(String[] args) {
        // 자바꿈나무, 김자바, 300을 setter로 대입, toString()으로 출력
        // 자바꿈나무의 저자는 김자바이고 300페이지로 구성됨
        Book bk1 = new Book();
        bk1.setTitle("자바꿈나무");
        bk1.setAuthor("김자바");
        bk1.setPage(300);
        System.out.println(bk1.toString());

        // 생성자에 자바나라, 이자바, 350을 대입하고, getter를 이용하여 출력
        // 책이름 : 자바나라
        // 책저자 : 이자바
        // 페이지 : 350
        Book bk2 = new Book("자바나라", "이자바", 350);
        System.out.println("책이름 : "+bk2.getTitle());
        System.out.println("책저자 : "+bk2.getAuthor());
        System.out.println("페이지 : "+bk2.getPage());
    }
}
