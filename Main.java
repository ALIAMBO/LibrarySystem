import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Library library = new Library();
        Scanner sc =new Scanner(System.in);
        
        // Book [] books  = new Book[2];
        User user = new User(null,0);
        Book [] book = new Book[5];
        
         book[0] = new Book("Harry Potter", "J.K Rowling", "123456", false);
         book[1] = new Book("Lord of The Ring", "J.R.R Tolkien", "67890", false);
         book[2] = new Book("Magical Girl Raising Project", "Asari Endou", "2323", false);
         book[3] = new Book(null, null, null, false);
         book[4] = new Book(null, null, null, false);
         

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

        String input;
        
            System.out.println("Insert user name: ");
            user.setName(sc.next()); 

            System.out.println("Insert user age: ");
            user.setAge(sc.nextInt());
            sc.nextLine();

           System.out.println("Check to see if the book is avalaible");
           String search = sc.nextLine();
           library.searchByTitle(search);

           System.out.println("Please insert the book title to borrow");
           String buku = sc.nextLine();
           user.setBookTitle(buku);
           library.borrowBook(buku, user);
   
            user.displayDetails();

            System.out.println("*************************************");

            System.out.println("Do you want to add a new book.");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                System.out.println("please add the tile, author, ISBN ");
                System.out.println("Insert title ");
                String titleBook = sc.nextLine();
                System.out.println("Insert author ");
                String authorNew = sc.nextLine();
                System.out.println("Insert new ISBN ");
                String ISBNNEW = sc.nextLine();

                for(int i=0; i<book.length;i++){
                titleBook= book[i].getTitle();
                authorNew = book[i].getAuthor();
                ISBNNEW = book[i].getISBN();
                book[i].getIsAvalaible();
                library.addBook(book[i]);
               
                }
                for(int i=0; i< book.length;i++){
                    book[i].printBookInfo();
                }

            }else if(input.equalsIgnoreCase("no")){
                System.out.println("Ok have fun :) ");
            }else{
                System.out.println("Input not available");
            }
  
            sc.close();
       
        
        
    }

}
