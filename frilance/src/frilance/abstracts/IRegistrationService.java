package frilance.abstracts;

import frilance.dto.UserDTO;
import frilance.entities.User;
import frilance.validation.EmailExistsException;

public interface IRegistrationService {

	 User registerNewUserAccount(UserDTO accountDto)     
		      throws EmailExistsException;
}