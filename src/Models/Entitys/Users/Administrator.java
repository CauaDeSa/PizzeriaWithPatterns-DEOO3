package Models.Entitys.Users;

import Models.Enums.UserProfile;

public class Administrator extends User {
    private String password;

    public Administrator(String name, String email, String password) {
        super(name, email);
        this.password = password;
    }

    public UserProfile getProfile(){
        return UserProfile.ADMINISTRATOR;
    }

    public String getPassword(){
        return password;
    }
}