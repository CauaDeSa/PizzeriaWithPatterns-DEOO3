package Models.Entitys.Users;

public class CustomerFactoryImpl implements IUserFactory {
    @Override
    public Customer Create(Object... args){
        return new Customer(0,
                (String)args[0],
                (String)args[1]
        );
    }
}
