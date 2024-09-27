public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvalaible;

    public Book(String title, String author, String isbn, boolean isAvalaible){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvalaible = isAvalaible;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getISBN(){
        return isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    public boolean getIsAvalaible(){
        return isAvalaible;
    }

    public void setIsAvalaible(boolean isAvalaible){
        this.isAvalaible = isAvalaible;
    }

    public void printBookInfo(){

        System.out.println("Title: " + title + ", Author: " + author +", ISBN: "+ isbn );
    }
}
