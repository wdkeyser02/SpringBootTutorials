package willydekeyser.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String firstname;
	private String lastname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Email.class)
	@JoinColumn(name ="users_id",referencedColumnName = "id")
	private List<Email> email;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Phone.class)
	@JoinColumn(name ="users_id",referencedColumnName = "id")
	private List<Phone> phone;
	
	public Users(String firstname, String lastname, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	
	public String getFullname() {
		return firstname + " " + lastname;
	}
	
}
