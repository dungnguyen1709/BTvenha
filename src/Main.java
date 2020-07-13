public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);

        book = new Book(1709,"CodeGym",65000.0,"VuThiKieuAnh");
        System.out.println(book);

        ProgrammingBook programmingBook = new ProgrammingBook();
        System.out.println(programmingBook);

        programmingBook = new ProgrammingBook("English",false);
        System.out.println(programmingBook);

        FictionBook fictionBook = new FictionBook();
        System.out.println(fictionBook);

        fictionBook = new FictionBook(" Java ");
        System.out.println(fictionBook);

    }
}
