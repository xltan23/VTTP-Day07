package vttp.d7;

import java.io.IOException;

public class BooksMain {
    public static void main( String[] args ) throws IOException {
        BooksDatabase db = new BooksDatabase(args[0]); // Input books.txt into file reader in database
        Session sess = new Session(db);
        sess.run();
    }
}
