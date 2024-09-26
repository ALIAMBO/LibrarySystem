import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    ArrayList<String> borrowedBook;

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

    
}
