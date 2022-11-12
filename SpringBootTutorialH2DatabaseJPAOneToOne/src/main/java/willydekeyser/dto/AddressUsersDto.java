package willydekeyser.dto;

public record AddressUsersDto(Integer id, String street, String number, String zipcode, String city, UsersDto users) {}
