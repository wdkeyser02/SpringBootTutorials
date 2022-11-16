package willydekeyser.dto;

import java.util.List;

import willydekeyser.model.Email;
import willydekeyser.model.Phone;

public record UsersDto(Integer id, String firstname, String lastname, List<Email> email, List<Phone> phone) {}
