package Services.Factories;

import Models.Entitys.Users.User;

public interface IUserFactory {
    public User Create(Object... args);
}