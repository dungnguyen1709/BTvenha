public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);

        book = new Book(1709, " CodeGym ", 65000.0, "VuThiKieuAnh");
        System.out.println(book);
        ProgrammingBook prgB1 = new ProgrammingBook(" JAVA ", 65000.0);
        ProgrammingBook prgB2 = new ProgrammingBook(" JAVA ", 65000.0);
        ProgrammingBook prgB3 = new ProgrammingBook(" PHP ", 32500.0);
        ProgrammingBook prgB4 = new ProgrammingBook(" JAVA ", 65000.0);
        ProgrammingBook prgB5 = new ProgrammingBook(" PHP ", 32500.);

        FictionBook fb1 = new FictionBook(43000.0);
        FictionBook fb2 = new FictionBook(43000.0);
        FictionBook fb3 = new FictionBook(43000.0);
        FictionBook fb4 = new FictionBook(43000.0);
        FictionBook fb5 = new FictionBook(43000.0);

        System.out.println(" Counter of JAVA book = " + ProgrammingBook.getCountJava());
        System.out.println(" Total Money = " + (ProgrammingBook.getTotalMoney() +
                FictionBook.getTotalMoney()));
    }
}
