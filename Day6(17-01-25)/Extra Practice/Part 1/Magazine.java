public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public void setIssueNumber(int issueNumber) {
        if(issueNumber<=0){
            throw new IllegalArgumentException("Issue number must be greater than 0.");
        }
        this.issueNumber = issueNumber;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear<=0){
            throw new IllegalArgumentException("Publication year must be greater than 0.");
        }
        this.publicationYear = publicationYear;
    }

    public void setPublisher(String publisher) {
        if(publisher.isBlank() || publisher.equals(null)){
            throw new IllegalArgumentException("Publisher cannot be null or blank.");
        }
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        if(title.isBlank() || title.equals(null)){
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        this.title = title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }
}
