package willydekeyser.dto;

import java.util.List;

import willydekeyser.model.Email;
import willydekeyser.model.Phone;

public record UsersAddressDto(Integer id, String fullname, AddressDto address, List<Email> email, List<Phone> phone) {}
