public class Bookstoretest {
    public static void main(String[] args) {

        Bookstore store=new Bookstore();

        store.addbook(new Paperbook("ww1",2000,800,"salma","Raafat",3));
        store.addbook(new Ebook("qq2",2001,900,"omar","mohamed","E"));
        store.addbook(new Demobook("ss3",2002,0,"Khaled","Kareem"));

        store.buybook("ww1",2,"Salma@hotmail.com","Benha, Egypt");
        store.buybook("qq2", 1, "Khaled@hotmail.com", "Giza, Egypt");
        store.buybook("ss3", 1, "Kareema@hotmail.com", "Alexandria, Egypt");

        store.deleteold(2023);


    }
}
