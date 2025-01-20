public class Book {
    private String title;
    private String author;
    private double rating;
    private double price;

    public Book(String title,String author,double rating,double price){
        this.title=title;
        this.author=author;
        this.rating=rating;
        this.price=price;
    }

    public Book(Book source){
        this.title=source.title;
        this.author=source.author;
        this.rating=source.rating;
        this.price=source.price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
}
