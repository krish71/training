package entity;

/**
 * author- Ragini and Nilesh
 * It's an entity to store loan details
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan1")
public class Loan {

	@Id
	@Column(name = "Loan_Id", length = 10)
	private int loanId;
	
	@OneToOne
	@JoinColumn(name = "email") // unidirectional relationship with customer table
	private Customer customer;

	@Column(name = "Aadhar_no") // unidirectional relationship with aadhar table
	private String aadhar;

	@OneToOne
	@JoinColumn(name = "pan") // unidirectional relationship with pan table
	private Pan pan;

	@Column(name = "Annual_Income")
	private double income;

	@Column(name = "Occupation_Type")
	private String occupation;

	@Column(name = "Loan_Amount")
	private double loanAmount;

	@Column(name = "Loan_Tenure")
	private double tenure;

	@Column(name = "Amount_Paid")
	private double amountPaid;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

}
