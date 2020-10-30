public class wage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

        int Present = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Present)
                System.out.println("Present");
        else
                System.out.println("Absent");

	int empRatePerHr=20;
	int empHrs=8;
	int wage;
	if ( empCheck == Present )
	{
		wage=empRatePerHr*empHrs;
		System.out.println("Employee is present then DailyEmpWage:" +wage);
	}
	else
		System.out.println("Employee is absent then DailyEmpWage: 0");
}

}
