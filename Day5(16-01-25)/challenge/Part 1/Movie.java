public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name,String format,double rating){
        this.format=format;
        this.name=name;
        this.rating=rating;
    }

    public Movie(Movie sample){
        this.name=sample.name;
        this.rating=sample.rating;
        this.format=sample.format;
    }

    public String getFormat() {
        return format;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
    public void setFormat(String format) {
        this.format = format;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString(){
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
