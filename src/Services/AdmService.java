package Services;

import DTOs.AdministratorDTO;
import Models.Dao.AdmDaoImpl;
import Models.Entitys.Users.Administrator;

public class AdmService implements IAdmService {
    private AdmDaoImpl admDao;

    public AdmService() {
        admDao = AdmDaoImpl.getInstance();
    }

    @Override
    public Administrator loginAdministrator(AdministratorDTO requestedAdministrator) {
        Administrator adm = admDao.getByEmail(requestedAdministrator.getContact());

        if (adm != null) {
            if (adm.getPassword().equals(requestedAdministrator.getPassword()) && adm.getContact().equals(requestedAdministrator.getContact())){
                return adm;
            }
        }
        return null;
    }

    public Administrator createAdministrator(Administrator administrator) {
        return admDao.insert(administrator);
    }
}