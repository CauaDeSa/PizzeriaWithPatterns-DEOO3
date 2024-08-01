package Models.Enums;

public enum UserProfile {
    ADMINISTRATOR("Administrator"),
    CUSTOMER("Customer");

    private final String name;

    UserProfile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
