import java.util.ArrayList;
import java.util.function.Predicate;

public class Library {
    private ArrayList<Book>books = new ArrayList<>();
    private ArrayList<User>users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }   

    public void addUser(User user){
        users.add(user);
    }

    // public void searchByTitle(String title ){

    // for(Book book : books){
    //     if (title.contains("Harry Potter")) {
            
    //         book.setIsAvalaible(true);
    //         System.out.println(title + " found !");
                   
    //     }else if (title.contains("Lord of The Ring")) {
           
    //         book.setIsAvalaible(true);
    //         System.out.println(title + " found !");

    //     }
    //     else{

    //         System.out.println("Book not found !");

    //         }

    //     } 
    // }

 
    public void  borrowBook(User user, String title ){  

        for (Book book : books){
            
            if (book.getTitle().equalsIgnoreCase(title) && book.getIsAvalaible()) {
                if (book.getIsAvalaible()) {
                    book.setIsAvalaible(false);
                   // user.borowBook(title);
                    System.out.println("Book found ! " );
                }else{
                    System.out.println("This book is not avalaible");
                }
            return;

        }

    }
}
    
    
    public void lstAvalaibleBooks(){
        
        if (books.isEmpty()) {        
            System.out.println("No book avalaible");
        }else{
            System.out.println("Book avalaible");
            for(Book book : books){
               
                System.out.println(book.getTitle());
               
                book.setIsAvalaible(true);
            }
        }

    }

    public void getBorrowedBooksForAllUser(User users, Book books){
        
            System.out.println("User: " + users.toString() +", Borrowed: "+ books.toString() );
      
    }

}
