public class Demobook implements Book {
    private String ISBN;
    private int year;
    private int price;
    private String auther;
    private String name;

    public Demobook(String ISBN,int year,int price,String auther,String name) {
        this.ISBN=ISBN;
        this.year=year;
        this.price=price;
        this.auther=auther;
        this.name=name;
    }

    public String getISBN(){
        return ISBN;
    }
    public int getyear(){
        return year;
    }
    public int getprice(){
        return 0;
    }
    public String getauther(){
        return auther;
    }
    public  String getname(){
        return name;
    }
    public void deliver(String email, String address) {
        System.out.println("Quantum Bookstore: This device is for display only.");
    }
}
