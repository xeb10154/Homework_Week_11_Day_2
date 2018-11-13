import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library (){
        this.capacity = 5;
        this.stock = new ArrayList<Book>();
    }

    public int getStock(){
        return this.stock.size();
    }

    public void add(Book book){
        if(this.stock.size() < this.capacity){
            this.stock.add(book);
        }
    }


}