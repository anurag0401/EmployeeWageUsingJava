import java.util.*;
public class wage {
	public static final int isPartTime=1;
	public static final int isFullTime=2;

	private final String company;
	private final int empRatePerHr;
	private final int numWorkingDays;
	private final int maxWorkingHrs;
	int totalSalary;

	public EmpWageBuilder(String company, int empRatePerHr, int numWorkingDays, int maxWorkingHrs) {
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numWorkingDays=numWorkingDays;
		this.maxWorkingHrs=maxWorkingHrs;
	}

	public void computeEmpWage(){
		Random rand=new Random();
	//variables
		int totalWorkingDays=0,workingHrs=0;
		int salary,empHrs,empCheck;
		totalSalary=0;
	//computation
		while(totalWorkingDays<numWorkingDays && workingHrs<maxWorkingHrs){
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
			salary=empHrs*empRatePerHr;
			totalSalary=totalSalary+salary;
		}
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company: " +company+ " is: " +totalSalary;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWageBuilder Flipkart = new EmpWageBuilder("Flipkart",20,30,60);
		EmpWageBuilder Amazon = new EmpWageBuilder("Amazon",10,40,80);
		Flipkart.computeEmpWage();
		System.out.println(Flipkart);
		Amazon.computeEmpWage();
		System.out.println(Amazon);
	}
}
