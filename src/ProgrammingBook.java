public class ProgrammingBook extends Book {
    private String language;
    private boolean frameWork = true;
    private final String JAVA_BOOK = "JAVA";
    private static int countJava = 0;


    public ProgrammingBook() {

    }

    public ProgrammingBook(String language, double price) {
        this.language = language;
        super.setPrice(price);


        if (language.equals(JAVA_BOOK)) {
            countJava++;
        }
    }

    public static int getCountJava() {
        return countJava;
    }


    public ProgrammingBook(int bookCode, String name, double price, String author, String language, boolean frameWork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
        if (language.equals(JAVA_BOOK)) {
            countJava++;
        }
    }

    public boolean isFrameWork() {
        return frameWork;
    }

    public void setFrameWork(boolean frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public String toString() {
        return " the language : " + getLanguage() +
                " the framework : " + (isFrameWork() ? " framework " : " not framework ") + super.toString();
    }

    @Override
    public String show() {
        return "[" +
        this.getBookCode()+ "\t" +
                this.getName() + "\t" + this.getPrice() + "\t" + this.getAuthor() + "\t" + this.getLanguage() + "\t" + this.isFrameWork()+ "]";
    }
}
