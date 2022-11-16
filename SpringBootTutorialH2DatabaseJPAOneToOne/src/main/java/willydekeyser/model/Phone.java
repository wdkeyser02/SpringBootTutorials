package willydekeyser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "phone")
public class Phone {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String phone;
	
	public Phone(String phone) {
		this.phone = phone;
	}
	
	
}
