package Models.Entitys.Users;

import Models.Enums.UserProfile;

public abstract class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}