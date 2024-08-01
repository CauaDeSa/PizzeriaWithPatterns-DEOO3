package Models.Dao;

import Models.Entitys.Users.Administrator;

import java.util.List;

public interface IAdmDao {
    Administrator insert(Administrator adm);
    Boolean update(Administrator adm);
    Boolean delete(String email);
    List<Administrator> getAll();
    Administrator getByEmail(String email);
}
