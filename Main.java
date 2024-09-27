import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Library library = new Library();
        Scanner sc =new Scanner(System.in);
        
        // Book [] books  = new Book[2];
        User user = new User(null,0);
        Book [] book = new Book[3];
        
         book[0] = new Book("Harry Potter", "J.K Rowling", "123456", false);
         book[1] = new Book("Lord of The Ring", "J.R.R Tolkien", "67890", false);
         book[2] = new Book("Magical Girl Raising Project", "Asari Endou", "2323", false);

         for(int i=0; i<book.length; i++){
            book[i].getTitle();
            book[i].getAuthor();
            book[i].getISBN();
            book[i].getIsAvalaible();
            library.addBook(book[i]);
         }

         library.lstAvalaibleBooks();
         System.out.println("------------ Book Details-------------");

         for(int i=0; i< book.length;i++){
            book[i].printBookInfo();
        }

        // User user1 = new User("Alice", 23);
        // User user2 = new User("Bob", 18);

        //books = {"Harry Potter", "J.K Rowling", "123456", false);

      
            System.out.println("Insert user name: ");
             user.setName(sc.next()); 

             System.out.println("Insert user age: ");
             user.setAge(sc.nextInt());
             sc.nextLine();

             System.out.print("Please insert the book's title: ");
             String buku = sc.nextLine();
             user.setBookTitle(buku);

            //library.borrowBook(user, buku);

            user.borowBook(buku);
            
            user.displayDetails();
            //library.getBorrowedBooksForAllUser(user, buku);
                     
       
               
            sc.close();
       
        // library.addBook(book1);
        // library.addBook(book2);
        
        // System.out.println("-----Avalaible Books----");

        // // book1.printBookInfo();
        // // book2.printBookInfo();

        // System.out.println("----Borrowing a Books-----");
    
        // System.out.println("----Overdue Books----");
        
    }

}
