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

	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public wage(){
		companyEmpWageArray=new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs) {
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHr,numWorkingDays,maxWorkingHrs);
		numOfCompany++;
	}

	public void computeEmpWage(){
		int totalWage;
		for(int i=0; i<numOfCompany; i++){
			totalWage=this.computeEmpWage(companyEmpWageArray[i]);
			companyEmpWageArray[i].setTotalEmpWage(totalWage);
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
		return (workingHrs*companyEmpWage.empRatePerHr);
	}

	public static void main(String[] args) {
		wage empWage = new wage();
		empWage.addCompanyEmpWage("Flipkart",20,30,60);
		empWage.addCompanyEmpWage("Amazon",10,40,80);
		empWage.computeEmpWage();
	}
}
