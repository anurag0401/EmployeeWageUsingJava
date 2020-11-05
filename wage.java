import java.util.*;
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

public class wage {
	public static final int isPartTime=1;
	public static final int isFullTime=2;

<<<<<<< HEAD
	private final String company;
	private final int empRatePerHr;
	private final int numWorkingDays;
	private final int maxWorkingHrs;
	int totalSalary;

	public wage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs) {
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numWorkingDays=numWorkingDays;
		this.maxWorkingHrs=maxWorkingHrs;
=======
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public wage(){
		companyEmpWageArray=new CompanyEmpWage[5];
>>>>>>> uc-10-Manage-empwage-different-company
	}

	private void addCompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs) {
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHr,numWorkingDays,maxWorkingHrs);
		numOfCompany++;
	}

	private void computeEmpWage(){
		int totalWage;
		for(int i=0; i<numOfCompany; i++){
			totalWage=this.computeEmpWage(companyEmpWageArray[i]);
			companyEmpWageArray[i].setTotalEmpWage(totalWage);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage){
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
		return (workingHrs*companyEmpWage.empRatePerHr);
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Welcome to Employee Wage Computation Program");
		wage flipkart = new wage("Flipkart",20,30,60);
		wage amazon = new wage("Amazon",10,40,80);
		flipkart.computeEmpWage();
		System.out.println(flipkart);
		amazon.computeEmpWage();
		System.out.println(amazon);
=======
		wage empwage = new wage();
		empwage.addCompanyEmpWage("DMart",20,30,60);
		empwage.addCompanyEmpWage("Reliance",10,40,80);
		empwage.computeEmpWage();
>>>>>>> uc-10-Manage-empwage-different-company
	}
}
