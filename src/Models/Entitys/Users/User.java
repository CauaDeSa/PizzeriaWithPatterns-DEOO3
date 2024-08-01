package Models.Entitys.Users;

public abstract class User {
    protected String name;
    protected String contact;

    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName(){
        return name;
    }

    public String getContact() {
        return contact;
    };
}