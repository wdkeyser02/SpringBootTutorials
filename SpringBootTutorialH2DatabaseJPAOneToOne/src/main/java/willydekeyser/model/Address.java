package willydekeyser.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String street;
	private String number;
	private String zipcode;
	private String city;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private Users users;
	
	public Address(String street, String number, String zipcode, String city) {
		this.street = street;
		this.number = number;
		this.zipcode = zipcode;
		this.city = city;
	}
	
}
