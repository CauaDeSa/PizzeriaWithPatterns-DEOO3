package Services;

import DTOs.AdministratorDTO;
import Models.Entitys.Users.Administrator;

public class AdmServiceProxy implements IAdmService {
    private static AdmServiceProxy instance;
    private AdmService admService;
    private Administrator lastAccess;

    private AdmServiceProxy() {
        admService = new AdmService();
    }

    public static AdmServiceProxy getInstance() {
        if (instance == null)
            instance = new AdmServiceProxy();
        return instance;
    }

    public Administrator getLastAccess() {
        return lastAccess;
    }

    @Override
    public Administrator loginAdministrator(AdministratorDTO requestedAdministrator) {
        if (lastAccess != null)
            if (lastAccess.getContact().equals(requestedAdministrator.getContact()) && lastAccess.getPassword().equals(requestedAdministrator.getPassword()))
                return lastAccess;

        var adm = admService.loginAdministrator(requestedAdministrator);

        if (adm == null)
            return null;

        lastAccess = adm;
        return adm;
    }
}