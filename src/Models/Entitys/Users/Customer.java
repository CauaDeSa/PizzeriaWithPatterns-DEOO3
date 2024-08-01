package Models.Entitys.Users;

import Models.Enums.UserProfile;

public class Customer extends User {

    public Customer(String name, String phone) {
        super(name, phone);
    }

    public UserProfile getProfile(){
        return UserProfile.CUSTOMER;
    }
}