package Services;

import DTOs.AdministratorDTO;
import Models.Entitys.Users.Administrator;

public interface IAdmService {
    Administrator loginAdministrator(AdministratorDTO requestedAdministrator);
}