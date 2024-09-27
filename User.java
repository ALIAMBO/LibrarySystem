import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBook = new ArrayList<>() ;
    private ArrayList<Book>books = new ArrayList<>();
    private String bookTitle;

   
    //private Map<String,LocalDate>borrowedBooksDueDates = new HashMap<>();

    LocalDate dateDue = LocalDate.now().plusDays(14);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
    long dueDate = ChronoUnit.DAYS.between(LocalDate.now(), dateDue);
    
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public String getName(){
        return name;
    }       

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public void borowBook(String bookTitle){
        
       if (bookTitle.equalsIgnoreCase("Harry Potter")) {
        borrowedBook.add(bookTitle);
        System.out.println("Book borrowed !" );
        System.out.println("User : " + name + " Age: " + age + " Book : " + bookTitle );
        System.out.println("Due date : " + dueDate);
       
       }else if (bookTitle.equalsIgnoreCase("Lord of The Ring")) {
        borrowedBook.add(bookTitle);
        System.out.println("Book borrowed ! " );
        System.out.println("User : " + name + " Age: " + age + " Book : " + bookTitle );
        System.out.println("Due date : " + dueDate);
       
       }else if (bookTitle.equalsIgnoreCase("Magical Girl Raising Project")) {
        borrowedBook.add(bookTitle);
        System.out.println("Book borrowed ! " );
        System.out.println("User : " + name + " Age: " + age + " Book : " + bookTitle );
        System.out.println("Due date : " + dueDate);
       
       }
       else {
        System.out.println("Book not found");
       }
   
    }

    public void returnBook(String bookTitle){

        if (bookTitle.equals("Harry Potter")) {

            borrowedBook.remove(bookTitle);    

        }else if (bookTitle.equals("Lord of The Ring")) {
        
            borrowedBook.remove(bookTitle);

        }

    }

    public String printBorrowedBooks(){

        return bookTitle;

    }

    public void displayDetails(){
        

       
    }


}
