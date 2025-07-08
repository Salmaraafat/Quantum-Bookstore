
public class Paperbook implements Book {

private String ISBN;
private int year;
private int price;
private String auther;
private String name;
private int paper;

    public Paperbook(String ISBN,int year,int price,String auther,String name,int paper){
         this.ISBN=ISBN;
         this.year=year;
         this.price=price;
         this.auther=auther;
         this.name=name;
         this.paper=paper;
    }

    public boolean Available(int qty){
        return paper >=qty;
    }
    public void reducepaper(int qty){
         paper -=qty;
   }
    public String getISBN(){
        return ISBN;
    }
    public int getyear(){
        return year;
    }
    public int getprice(){
        return price;
    }
  public String getauther(){
        return auther;
    }
    public  String getname(){
        return name;
    }

    public void deliver(String email, String address) {
        System.out.println("Quantum Bookstore: Shipping to \" " + address);
    }
}
