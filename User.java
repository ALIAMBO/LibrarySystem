import java.util.ArrayList;
import java.util.Formatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBook = new ArrayList<>() ;
    ArrayList<LocalDate> borrowedDate = new ArrayList<>();
    ArrayList<LocalDate> borrowedDue = new ArrayList<>();
    private ArrayList<Book>books = new ArrayList<>();
    private String bookTitle;
    Library library = new Library();
    
    //private Map<String,LocalDate>borrowedBooksDueDates = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
   
    
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

    public String getBook(){
        return bookTitle;
    }

    public void updateBook(String bookTitle){
        borrowedBook.add(bookTitle);
    }

    public void updateDate(LocalDate newDate){
        borrowedDate.add(newDate);
        updateDue();
    }

    public void updateDue(){
        for(int i=0; i<borrowedDate.size(); i++){
            LocalDate dateDue = LocalDate.now().plusDays(14);
            borrowedDue.add(dateDue);
        }
    }
    //return the book method
    public void borowBook(String bookTitle){

    boolean found =false;
    int i=0;
    while(i<borrowedBook.size() && !found){
        if(bookTitle.equalsIgnoreCase(borrowedBook.get(i))){
            found = true;
          
            // LocalDate returnDate = LocalDate.now();
            System.out.println( borrowedBook.get(i) + " has been returned");
            borrowedBook.remove(i);
            //checkedOverDueDates(returnDate, borrowedDue.get(i));   
        }
        i++;
    }
    if(!found){
        System.out.println("  There is no book found in the library");
    }
   
    }

    public void returnBook(String bookTitle){
         boolean found =false;
         int i=0;
    while(i<borrowedBook.size() && !found){
        if(bookTitle.equalsIgnoreCase(borrowedBook.get(i))){
            found = true;
            
            // LocalDate returnDate = LocalDate.now();
            System.out.println( borrowedBook.get(i) + " has been returned");
            borrowedBook.remove(i);

            //checkedOverDueDates(returnDate, borrowedDue.get(i));   
        }
        i++;
    }
    if(!found){
        System.out.println("  There is no book in the library");
    }
   
    }

    public String printBorrowedBooks(){
        return bookTitle;
    }

    public void displayDetails(){
    
       if (!borrowedBook.isEmpty()) {
        System.out.println("-----------------------------------");
        for(int i =0 ; i < borrowedBook.size(); i++){
            String bookBorrow = borrowedBook.get(i);
            String Date = formatter.format(borrowedDate.get(i).plusDays(14));
            long dueDate = ChronoUnit.DAYS.between(borrowedDate.get(i),LocalDate.now().plusDays(14));
            System.out.println("User " + name + " has borrowed the book " +bookBorrow );
            System.out.println("Due date  " + Date );
            System.out.println("Due in " +dueDate+ " days. " );
        }
          
       }else{
        System.out.println("No borrowed books. ");
    }

    }

}
