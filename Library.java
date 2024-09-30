import java.util.ArrayList;
import java.util.function.Predicate;
import java.time.LocalDate;

public class Library {
    private ArrayList<Book>books = new ArrayList<>();
    private ArrayList<User>users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }   

    public void addUser(User user){
        users.add(user);
    }

    public void searchByTitle(String title ){

        boolean search = false;
        int i =0;

        while (i<books.size()) {        
            if (title.equalsIgnoreCase(books.get(i).getTitle())) {
                if (books.get(i).getIsAvalaible()) {
                    System.out.println("The book is avalaible");
                }else {
                    System.out.println("The book is not avalaible.");
                }
                search = true;
            }  
            i ++;
        }if (!search) {
            System.out.println("Book not found !");
        }
   
    }

    public void  borrowBook(String userBook,User user ){  
        LocalDate dateNow = LocalDate.now();
        boolean search = false;
        int i =0;
           while ( i<books.size() && !search) {
            if (userBook.equalsIgnoreCase(books.get(i).getTitle())) 
                {
                if (books.get(i).getIsAvalaible()) {
                    books.get(i).setIsAvalaible(false);

                   // user.borowBook(title);
                   user.updateDate(dateNow);
                   user.updateBook(userBook);
                    System.out.println("Book has been  borrowed ! ");
                    System.out.println("Title : "+ books.get(i).getTitle() );
                }else{
                    System.out.println("This book is not avalaible. ");
                     }
                search = true;           
                }
        i ++;
     } 
    if (!search) {
        System.out.println("There's no such book in the library.");
    }      
}
  
    public void lstAvalaibleBooks(){
        
        if (books.isEmpty()) {        
            System.out.println("No book avalaible");
        }else{
            System.out.println("----------------Book avalaible----------------");
            for(Book book : books){
               
                System.out.println(book.getTitle());
               
                book.setIsAvalaible(true);
            }
        }

    }

    // public void getBorrowedBooksForAllUser(User users, Book books){
        
    //       System.out.println();
      
    // }

}
