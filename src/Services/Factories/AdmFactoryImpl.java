package Models.Entitys.Users;

public class AdmFactoryImpl implements IUserFactory {
    @Override
    public Administrator Create(Object... args) {
        return new Administrator(0,
                (String)args[0],
                (String)args[1]
        );
    }
}