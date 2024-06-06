package LoanDataProject;

public class Loan {

	private String loan_ID;
	private String gender;
	private String married;
	private int dependents;
	private String education;
	private String self_Employed;
	private int applicantIncome;
	private float coapplicantIncome;
	private int LoanAmount;
	private int Loan_Amount_Term;
	private int Credit_History;
	private String property_Area;
	private String loan_Status;

	public String getLoan_ID() {
		return loan_ID;
	}

	public void setLoan_ID(String loan_ID) {
		this.loan_ID = loan_ID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender == "") {
			this.gender = "NA";
		} else {
			this.gender = gender;
		}
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		if (married == "") {
			this.married = "NA";
		} else {
			this.married = married;
		}

	}

	public int getDependents() {
		return dependents;
	}

	public void setDependents(int dependents) {
		this.dependents = dependents;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		if (education == "") {
			this.education = "NA";
		} else {
			this.education = education;
		}

	}

	public String getSelf_Employed() {
		return self_Employed;
	}

	public void setSelf_Employed(String self_Employed) {
		if (self_Employed == "") {
			this.self_Employed = "NA";
		} else {
			this.self_Employed = self_Employed;
		}

	}

	public int getApplicantIncome() {
		return applicantIncome;
	}

	public void setApplicantIncome(int applicantIncome) {
		this.applicantIncome = applicantIncome;
	}

	public float getCoapplicantIncome() {
		return coapplicantIncome;
	}

	public void setCoapplicantIncome(float coapplicantIncome) {
		this.coapplicantIncome = coapplicantIncome;
	}

	public int getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(int loanAmount) {

		LoanAmount = loanAmount;
	}

	public int getLoan_Amount_Term() {
		return Loan_Amount_Term;
	}

	public void setLoan_Amount_Term(int loan_Amount_Term) {
		Loan_Amount_Term = loan_Amount_Term;
	}

	public int getCredit_History() {
		return Credit_History;
	}

	public void setCredit_History(int credit_History) {
		Credit_History = credit_History;
	}

	public String getProperty_Area() {
		return property_Area;
	}

	public void setProperty_Area(String property_Area) {
		if (property_Area == null) {
			this.property_Area = "NA";
		} else {
			this.property_Area = property_Area;
		}
	}

	public String getLoan_Status() {
		return loan_Status;
	}

	public void setLoan_Status(String loan_Status) {
		if (loan_Status == null) {
			this.loan_Status = "NA";
		} else {
			this.loan_Status = loan_Status;
		}
	}

}
