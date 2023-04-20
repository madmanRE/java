package dz3;
import java.util.ArrayList;

/*
Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

Правильные ответы: 6 и 8
 */


public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("book1", "Abin", 2910.0, 2009, 312));
        books.add(new Book("book2", "Babin", 2910.0, 2019, 407));
        books.add(new Book("book3", "Bin", 2910.0, 2010, 11));
        books.add(new Book("book4", "Dibin", 2910.0, 2005, 7));
        books.add(new Book("book5", "Nubin", 2910.0, 2008, 3435));
        books.add(new Book("book6", "Labin", 2910.0, 2012, 151)); //
        books.add(new Book("book7", "Mbinov", 2910.0, 2015, 812));
        books.add(new Book("book8", "Bina", 2910.0, 2021, 199)); //
        books.add(new Book("book9", "Vi", 2910.0, 2000, 122));
        books.add(new Book("book10", "Vai", 2910.0, 2020, 1));
        System.out.println(sortByParametrs(books));
    }

    public static ArrayList<String> sortByParametrs(ArrayList<Book> books){
        ArrayList<String> result = new ArrayList<>();
        String searchChar = "A";
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).publishedYear >= 2010){
                if (simplePage(books.get(i).pagesAmount) && search(books.get(i).authorName.toLowerCase(), searchChar.toLowerCase())){
                    result.add(books.get(i).title);
                }
            }
        }
        return result;
    }

    public static Boolean simplePage(int x){
        if (x < 2)  return false;
        for (int i=1; i<=x/2; i++){
            if (x % i == 0 && i!=1){
                return false;
            }
        }
        return true;
    }

    public static Boolean search(String x, String y){
        if (x.contains(y)){
            return true;
        }
        else return false;
    }
}

