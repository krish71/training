package entity;



import javax.persistence.CascadeType;

/**
 * author- Ragini and Nilesh
 * It's an entity to store customer details
 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer1")
public class Customer{
	
	@Id
	@Column(name = "Email_Id", length = 100)
	private String email;

	
	@Column(name = "Customer_Id")
	private int customerId;

	@Column(name = "Password", length = 100)
	private String password;

	@Column(name = "Answer", length = 100)
	private String answer;

	@OneToOne // unidirectional relationship with aadhar table
	private Aadhar aadhar;

	@OneToOne //unidirectional relationship with pan table
	private Pan pan;
	
	@Column(name = "Loan_Availability")
	private boolean loanAvail;


	@OneToOne// bidirectional relationship with loan table
	private Loan loan;

	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
	this.loan = loan;
}

}
