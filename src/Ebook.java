public class Ebook implements Book {
    private String ISBN;
    private int year;
    private int price;
    private String auther;
    private String name;
    private String E;

    public Ebook(String ISBN,int year,int price,String auther,String name,String E){
        this.ISBN=ISBN;
        this.year=year;
        this.price=price;
        this.auther=auther;
        this.name=name;
        this.E=E;
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
        System.out.println("Quantum Bookstore: Shipping Ebook with" +E+ "to" + address);
    }
}
