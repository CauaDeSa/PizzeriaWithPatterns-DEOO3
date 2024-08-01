package Models.Dao;

import Models.Entitys.Users.Administrator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdmDaoImpl implements IAdmDao{
    private static AdmDaoImpl instance;
    private final Map<String, Administrator> administrators;

    private AdmDaoImpl(){
        administrators = new HashMap<String, Administrator>();
    }

    public static AdmDaoImpl getInstance(){
        if(instance == null){
            instance = new AdmDaoImpl();
        }
        return instance;
    }

    @Override
    public Administrator insert(Administrator adm) {
        Administrator finalAdm = new Administrator(adm.getName(), adm.getContact(), adm.getPassword());
        return administrators.putIfAbsent(finalAdm.getContact(), finalAdm) == null ? finalAdm : null;
    }

    @Override
    public Boolean update(Administrator adm) {
        return administrators.put(adm.getContact(), adm) != null;
    }

    @Override
    public Boolean delete(String email) {
        return administrators.remove(email) != null;
    }

    @Override
    public List<Administrator> getAll() {
        return new ArrayList<Administrator>(administrators.values());
    }

    @Override
    public Administrator getByEmail(String email) {
        return administrators.get(email);
    }
}