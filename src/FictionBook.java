public class FictionBook extends Book {
    private String cateGory;
    private static double sumBookPrice = 0;

    public FictionBook(){
    }

    public FictionBook(double price) {
        super.setPrice(price);
        sumBookPrice += price;

    }

    public FictionBook(int bookCode, String name, double price, String author,String cateGory) {
        super(bookCode, name, price, author);
        this.cateGory = cateGory;
    }

    public static double getTotalMoney() {
        return sumBookPrice;

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
}
