package comparation.Homework;

import java.util.ArrayList;
import java.util.Comparator;

public class Book {

    String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return this.title;
    }

    public static void main(String[] args) {
        ArrayList<Book> aL = new ArrayList<>();
        aL.add(new Book("Harry Potter"));
        aL.add(new Book("World and war"));
        aL.add(new Book("Spring in action"));
        aL.add(new Book("Hamlet"));
        aL.add(new Book("Atlant"));

        System.out.println("Before sorting");
        System.out.println(aL);
        System.out.println();

        System.out.println("After sorting");
        aL.sort(new BookComparator());
        System.out.println(aL);
    }
}

class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2){
        if (b1.title.length() == b2.title.length()){
            return b1.title.compareTo(b2.title);
        }
        return b1.title.length() - b2.title.length();
    }
}

