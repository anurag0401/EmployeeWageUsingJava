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

	int EmpHrs=4;
        if ( empCheck == Present )
        { 	wage=empRatePerHr*EmpHrs;
		System.out.println("Employee is present then Part time EmpWage:" +wage);
        }
        else
                System.out.println("Employee is absent then Part time EmpWage: 0");

	int isFullTime=1;
        int isPartTime=2;
        
        switch ((int) empCheck) {
	
            case 1:
                int fullTimeEmpHrs=8;
                 wage=empRatePerHr*fullTimeEmpHrs;
		System.out.println("Fulltime employee" +wage);
            case 2:
                int partTimeEmpHrs=4;
                wage=empRatePerHr*partTimeEmpHrs;
		System.out.println("Parttime Employee" +wage);
            default:
                wage=0;
		System.out.println("Wage" +wage);
	}

            int numWorkingDays = 20;
            int salary;
		if ( empCheck == Present )
        	{
			salary=numWorkingDays*empRatePerHr*empHrs;
                	System.out.println("Monthly Salary is " +salary);
        	}
        	else
                {
            		salary=0;
			System.out.println("Monthly Salary is " +salary);
		}

	    int totalempHrs=0;
            int totalempWorkDays=0;
            int maxWorkingHrs=100;
	    int Salary;
            while (totalempHrs<maxWorkingHrs && totalempHrs<numWorkingDays)
		{
                	switch ((int) empCheck){
                    	case 1:
                        	empHrs=8;
                        	totalempHrs=totalempHrs+empHrs;
                    	case 2:
                        	empHrs=4;
                        	totalempHrs=totalempHrs+empHrs;
                    	default:
                        	empHrs=0;
                }
            
            Salary=(totalempHrs*empRatePerHr);
		System.out.println("Salary is " +Salary);
        }

}

}
