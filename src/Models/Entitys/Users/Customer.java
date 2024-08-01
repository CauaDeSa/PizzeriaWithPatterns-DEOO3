package Models.Entitys.Users;

import Models.Enums.UserProfile;

public class Customer extends User {
    private final String phone;

    public Customer(int id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public UserProfile getProfile(){
        return UserProfile.Customer;
    }
}
