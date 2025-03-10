package comparation.Homework.ex2;

import java.util.ArrayList;
import java.util.Comparator;

public class Book {

    String title;
    int year;

    public Book(String title, int year){
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Book{ " + title + ", " + year + " }";
    }

    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(new Book("Harry Potter", 1998));
        arrayList.add(new Book("Hamlet", 1782));
        arrayList.add(new Book("1984", 1984));

        System.out.println(arrayList);

        arrayList.sort(new BookYearComparator());
        System.out.println(arrayList);
    }

}

class BookYearComparator implements Comparator<Book>{

    @Override
    public int compare(Book b1, Book b2){
        return b1.year - b2.year;
    }
}