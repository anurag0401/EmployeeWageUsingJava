import java.util.*;

interface wageInterface{
	public void addCompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs);
	public void computeEmpWage();
	}

class CompanyEmpWage {
	public final String company;
   public final int empRatePerHr;
   public final int numWorkingDays;
   public final int maxWorkingHrs;
   public int totalSalary;

	public CompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs){
      this.company=company;
      this.empRatePerHr=empRatePerHr;
      this.numWorkingDays=numWorkingDays;
      this.maxWorkingHrs=maxWorkingHrs;
   }

	public void setTotalEmpWage(int totalSalary){
		this.totalSalary=totalSalary;
	}
	@Override
   public String toString() {
      return "Total Employee Wage for Company: " +company+ " is: " +totalSalary;
   }
}

public class wage implements wageInterface {
	public static final int isPartTime=1;
	public static final int isFullTime=2;

	ArrayList<CompanyEmpWage> companies;
	HashMap<String, Integer> totalEmpWages;

	public wage(){
		companies=new ArrayList<>();
		totalEmpWages=new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs) {
		CompanyEmpWage companyob=new CompanyEmpWage(company,empRatePerHr,numWorkingDays,maxWorkingHrs);
		companies.add(companyob);
		totalEmpWages.put(company,0);
	}

	public void computeEmpWage(){
		int totalWage;
		for(CompanyEmpWage company: companies){
			totalWage=this.computeEmpWage(company);
			company.setTotalEmpWage(totalWage);
		}
	}

	int computeEmpWage(CompanyEmpWage companyEmpWage){
		Random rand=new Random();
	//variables
		int totalWorkingDays=0,workingHrs=0;
		int empHrs,empCheck;
	//computation
		System.out.println("Company: "+companyEmpWage.company);
		while(totalWorkingDays<companyEmpWage.numWorkingDays && workingHrs<companyEmpWage.maxWorkingHrs){
			empCheck=(int)rand.nextInt(3);
			switch(empCheck){
				case isFullTime:
				   empHrs=16;
					break;
				case isPartTime:
					empHrs=8;
					break;
				default:
					empHrs=0;
					break;
			}
			totalWorkingDays++;
			workingHrs=workingHrs+empHrs;
			System.out.println("Day#:"+totalWorkingDays+" Emp Hr: " +empHrs);
		}
		int salary=workingHrs*companyEmpWage.empRatePerHr;
		totalEmpWages.put(companyEmpWage.company,salary);
		return salary;
	}

	public int getEmpWages(String company){
			return totalEmpWages.get(company);
	}

	public static void main(String[] args) {
		wage empWage = new wage();
		empWage.addCompanyEmpWage("Flipkart",20,30,60);
		empWage.addCompanyEmpWage("Amazon",10,40,80);
		empWage.computeEmpWage();
		System.out.println("Total Wage for Flipkart Company: "+empWage.getEmpWages("Flipkart"));
	}
}
