package vttp.d7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class BooksDatabase implements Predicate<String> {
    private final List<String> books = new LinkedList<>();
    private String searchBook = "";

    public BooksDatabase(String book) throws IOException { 
        FileReader fr = new FileReader(book);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while (null != (line = br.readLine())) {
            books.add(line);
        }
        fr.close();
    }

    @Override
    public boolean test(String v) {
        return v.toLowerCase().contains(searchBook);
    }

    public List<String> search(String terms) {
        final String t = terms.toLowerCase();
        return books.stream()
            .filter(v -> v.toLowerCase().contains(t)) // v refers to lines in books list
            .toList();
    }
 
    public List<String> search2(String terms) {
        searchBook = terms.toLowerCase();
        return books.stream()
            .filter(this)
            .toList();
    }


}