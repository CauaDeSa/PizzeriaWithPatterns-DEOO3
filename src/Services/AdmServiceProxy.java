package Services;

import DTOs.AdministratorDTO;
import Models.Dao.AdmDaoImpl;
import Models.Entitys.Users.Administrator;

public class AdmServiceProxy implements IAdmService {
    private IAdmService admService;
    private AdmDaoImpl admDao;
    private AdministratorDTO current;

    public AdmServiceProxy() {
        admService = new AdmService();
        admDao = AdmDaoImpl.getInstance();
    }
    public boolean loginAdministrator(AdministratorDTO requestedAdministrator) {
        if (!admService.loginAdministrator(requestedAdministrator))
            return false;

        current = requestedAdministrator;
        return true;
    }
}