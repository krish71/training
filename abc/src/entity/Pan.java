package entity;

/**
 * author- Ragini and Nilesh
 * It's an entity to store Pan details
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pan1")
public class Pan {

	@Id
	@Column(name = "PAN_NO")
	private String pan;

	@Column(name = "CIBIL_SCORE")
	private int cibil;
	
	
	@OneToOne
	@JoinColumn(name="email")
	private Customer customer;
	

	public String getPan() {
		return pan;
	}

	public int getCibil() {
		return cibil;
	}

}
