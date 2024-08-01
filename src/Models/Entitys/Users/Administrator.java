package Models.Entitys.Users;

import Models.Enums.UserProfile;

public class Administrator extends User {
    private final String email;

    public Administrator(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public UserProfile getProfile(){
        return UserProfile.Adm;
    }
}