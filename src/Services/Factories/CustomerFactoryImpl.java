package Services.Factories;

import Models.Entitys.Users.Customer;

public class CustomerFactoryImpl implements IUserFactory {
    @Override
    public Customer Create(Object... args){
        return new Customer(
                (String)args[0],
                (String)args[1]
        );
    }
}
