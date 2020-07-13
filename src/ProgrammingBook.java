public class ProgrammingBook extends Book {
    private String language;
    private boolean frameWork = true;

    public ProgrammingBook(){

    }

    public ProgrammingBook(String language, boolean frameWork) {
        this.language = language;
        this.frameWork = frameWork;
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
                " the framework : " + (isFrameWork() ? " framework " : " not framework " ) + super.toString();
    }
}
