import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] fictionBook = new FictionBook[2];
        Book[] programBook = new ProgrammingBook[2];
        System.out.println(" FictionBook :");
        for (int i = 0; i < fictionBook.length; i++) {
            fictionBook[i] = new FictionBook();
            System.out.println(" Enter a id :  ");
            fictionBook[i].setBookCode((int)sc.nextInt());
            sc.nextLine();
            System.out.println(" Enter a name :  ");
            fictionBook[i].setName((String) sc.nextLine());
            System.out.println(" Enter a price :");
            fictionBook[i].setPrice((double) sc.nextDouble());
            sc.nextLine();
            System.out.println(" Enter a author :");
            fictionBook[i].setAuthor((String) sc.nextLine());
        }
        double sumFictionBook = FictionBook.getTotalMoney();
        System.out.println(" The Money: " + sumFictionBook);
        for (Book book : fictionBook)
            System.out.println(book.show());


        for (int j = 0; j < programBook.length; j++) {
            programBook[j] = new ProgrammingBook();
            System.out.println(" Enter a id2 :  ");
            programBook[j].setBookCode((int) sc.nextInt());
            sc.nextLine();
            System.out.println(" Enter a name2 :  ");
            programBook[j].setName((String) sc.nextLine());
            System.out.println(" Enter a price2 :");
            programBook[j].setPrice((double) sc.nextDouble());
            sc.nextLine();
            System.out.println(" Enter a author2 :");
            programBook[j].setAuthor((String) sc.nextLine());
            System.out.println(" Enter a language :");
            ProgrammingBook a = (ProgrammingBook) programBook[j];
            a.setLanguage((String) sc.nextLine());
            System.out.println(" Enter is framework : ");
            ProgrammingBook b = (ProgrammingBook) programBook[j];
            b.setFrameWork((boolean)sc.nextBoolean());

        }
        double sumProgrammingBook = ProgrammingBook.getTotalMoney();
        System.out.println(" The Money: " + sumProgrammingBook);
        for (Book book : programBook)
           System.out.println(book.show());

        System.out.println(" Counter of JAVA book = " + ProgrammingBook.getCountJava());

        }
    }


