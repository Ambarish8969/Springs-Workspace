package referenceInjection;

public class Companuy {
	private String companyName;
	private Employee employee;

	public Companuy(String companyName, Employee employee) {
		super();
		this.companyName = companyName;
		this.employee = employee;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Companuy [companyName=" + companyName + ", employee=" + employee + "]";
	}

}
