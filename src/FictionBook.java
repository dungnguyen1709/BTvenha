import java.util.Scanner;

public class FictionBook extends Book {
    private String cateGory;


    public FictionBook(){
    }

    public FictionBook(double price) {
        super.setPrice(price);


    }

    public FictionBook(int bookCode, String name, double price, String author,String cateGory) {
        super(bookCode, name, price, author);
        this.cateGory = cateGory;
    }





    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }

    @Override
    public String toString() {
        return " The category : " + getCateGory() + super.toString();
    }

    @Override
    public String show() {
        return "[" +
                this.getBookCode()+ "\t" +
                this.getName() + "\t" + this.getPrice() + "\t" + this.getAuthor() +  "]";
    }
}
