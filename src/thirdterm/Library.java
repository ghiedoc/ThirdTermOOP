package thirdterm;

import java.util.ArrayList;

public class Library {

    // Add the missing implementation to this class
    String address;
    String title;
    Book book;
    
    // arrayList: storage of books
    ArrayList<Book> library = new ArrayList<>();
    

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    private Library(String address) {
        this.address = address;
    }

    private Library(Book book) {
        this.book = book;
    }
    
    //add books
    public void addBook(Book book) {
        
        /*
        problem ko here is hindi nag-aadd yung mga objects na pinapasok ko
        and hindi din siya nag-didisplay kasi walang na-aadd
         */
            library.add(book);

    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String title) {
        int x = 0;
        for(Book book : library){
            if(book.getTitle().equals(title)){
                if(x == 0){
                    x = 1;
                }
                if(!book.isBorrowed()){
                    book.borrowed();
                    x = 2;
                    break;
                }
            }
        }
        if(x == 0){
            System.out.println("Sorry, this book is not in our catalog");
        }
        else if(x == 1){
            System.out.println("Sorry, this book is already borrowed.");
        }
        else if(x == 2){
            System.out.println("You successfully borrowed " + title);
        }


    }

    public void returnBook(String title) {
        boolean found = false;

        for (int i = 0; i < library.size(); i++) {
            if(title.equals(library.get(i))){
                book.returned();
                found = true;
                break;
            }
            if(found){
                System.out.println("You successfully returned " + title);
            }
        }

    }

    public void printAvailableBooks() {
        Book libBooks;
        boolean availableBook = true;
        
        for(int i = 0; i < library.size(); i++){
            libBooks = library.get(i);
            if(!(libBooks.isBorrowed())){
                System.out.println(libBooks.getTitle());
                availableBook = false;
            }
        }
        if(availableBook){
            System.out.println("No books in catalog.");
        }
        


    }

    public static void main(String[] args) {
        //DONE
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        System.out.println("books:");
        firstLibrary.printAvailableBooks();
        System.out.println("-------------");

        // Add five books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        firstLibrary.addBook(new Book("To Kill A Mockingbord"));

        // Add five books to the second library
        secondLibrary.addBook(new Book("The Fault in the stars"));
        secondLibrary.addBook(new Book("Wonder"));
        secondLibrary.addBook(new Book("The Selection"));
        secondLibrary.addBook(new Book("Looking for Alaska"));
        secondLibrary.addBook(new Book("Paper Towns"));

        //DONE
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        //DONE
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("Paper Towns");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }

}
