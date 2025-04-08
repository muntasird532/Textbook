public class Book {
    private String title;
    private double price;

    public Book(String booktitle, double bookprice)
    {
        title = booktitle;
        price = bookprice;
    }

    public String getTitle()
    {
        return title;
    }

    public String getBookInfo()
    {
        return title + "-" + price;
    }
}
