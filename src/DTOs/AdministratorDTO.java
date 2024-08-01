package DTOs;

public class AdministratorDTO {
    private final String email;
    private final String password;

    public AdministratorDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getContact() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}