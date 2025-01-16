public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name,String phoneNumber,String birthDate,int age){
        this.age=age;
        this.birthDate=birthDate;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public Contact(Contact source){
        this.age=source.age;
        this.birthDate=source.birthDate;
        this.name=source.name;
        this.phoneNumber=source.phoneNumber;
    }
}
