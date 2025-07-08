import java.util.*;

public class Bookstore {
    private List<Book> inventory = new ArrayList<>();

    public void addbook(Book b) {
        inventory.add(b);
    }

   public void deleteold(int maxyear){
        inventory.removeIf(b -> b.getyear()<maxyear);
   }

   public void buybook(String ISBN, int qty, String email, String address){
        for (Book b : inventory){
            if(b.getISBN().equals(ISBN)){
                if (b instanceof Demobook) {
                    b.deliver(email, address);
                    return;
                
                
                } else if (b instanceof Paperbook) {
                    Paperbook p =(Paperbook) b;
                    if (!p.Available(qty)){
                        System.out.println("Quantum Bookstore: Not enough stock.");
                        return;
                    }
                    p.reducepaper(qty);
                    p.deliver(email, address);
                    System.out.println("Quantum Bookstore: Amount paid: "+ (qty * p.getprice()));
                    return;
                }
                else {
                    b.deliver(email, address);
                    System.out.println("Quantum Bookstore: Amount paid: " +(qty * b.getprice()));
                    return;
                }
            }
        }
       System.out.println("Quantum Bookstore: Product not found");
   }
   }











