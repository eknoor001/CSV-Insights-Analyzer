package LoanDataProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FetchData fetch = new FetchData();
		while (true) {
			System.out.println("1. Calculate the count of Number of Male and Female\n"
					+ "2. Calculate the Count of graduate and non graduate people\n"
					+ "3. Calculate the Count of Self Employed or non self Employed\n"
					+ "4. Calculate the Count of people Propery area wise\n"
					+ "5. Calculate the Count of people By marraige status\n"
					+ "6. Calculate the Count of people By Education Percentage\n"
					+ "7. Calculate the Count of people by Credit History\n"
					+ "8. Calculate the Count of people by Loan Status\n"
					+ "9. Calculate the Count of people by Loan Term Amount\n"
					+ "10. Calculate the Count of people by Income wise\n"
					+ "11. Calculate the Count of people who are graduate and not married\n"
					+ "12. Calculate the Count of people by Income wise\n"
					);
			int key = 0;
			System.out.println("Enter the choice::");
			key = sc.nextInt();

			switch (key) {
			case 1:
                fetch.countByGender();
				break;
			case 2:
				fetch.countByEducation();
				break;
			case 3:
				fetch.countByEmployed();
				break;
			case 4:
				fetch.countByPropery();
				break;
			case 5:
				fetch.countByMarried();
				break;
			case 6:
				fetch.getPercentageByEducation();
				break;
			case 7:
				fetch.getCreditHistory();
				break;
			case 8:
				fetch.getLoanStatus();
				break;
			case 9:
				fetch.getLoanAmountTerm();
				break;
			case 10:
				fetch.getCountByIncome();
				break;
			case 11:
				
				fetch.getPeopleGraduateNmarry();
				break;
			}
		}

	}
}
