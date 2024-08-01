package Services.Factories;

import Models.Entitys.Users.Administrator;
import Services.AdmService;

public class AdmFactoryImpl implements IUserFactory {
    private AdmService admService;

    public AdmFactoryImpl() {
        this.admService = new AdmService();
    }

    @Override
    public Administrator Create(Object... args) {
        return admService.createAdministrator( new Administrator(
                (String)args[0],
                (String)args[1],
                (String)args[2]));
    }
}