package _15_DesignPatterns.builder2;

public class ContactBuilder {

    private String name;
    private String number;
    private String company;
    private String title;
    private String email;
    private String website;
    private String birthday;

    public ContactBuilder(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public ContactBuilder company(String company) {
        this.company = company;
        return this;
    }

    public ContactBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ContactBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder website(String website) {
        this.website = website;
        return this;
    }

    public ContactBuilder birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public Contact build() {
        return new Contact(name, number, company, title, email, website, birthday);
    }
}
