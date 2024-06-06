package LoanDataProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class FetchData {
	ArrayList<Loan> list = null;
	public FetchData() {
		try {
			fetchFileData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void fetchFileData() throws Exception {
		list = new ArrayList<Loan>();
		Loan loan = null;
		BufferedReader reader = new BufferedReader(
				new FileReader("loan_data.csv"));

		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			String[] parts = line.split(",");
			loan = new Loan();
			loan.setLoan_ID(parts[0]);
			loan.setGender(parts[1]);
			loan.setMarried(parts[2]);
			if (!parts[3].isEmpty()) {
				loan.setDependents(Integer.parseInt(parts[3]));
			} else {
				loan.setDependents(-1);
			}
			
			loan.setEducation(parts[4]);
			loan.setSelf_Employed(parts[5]);
			if (!parts[6].isEmpty()) {
				loan.setApplicantIncome(Integer.parseInt(parts[6]));
			} else {
				loan.setApplicantIncome(-1);
			}
			if (!parts[7].isEmpty()) {

				loan.setCoapplicantIncome(Float.parseFloat(parts[7]));
			} else {
				loan.setCoapplicantIncome(-1);
			}
			if (!parts[8].isEmpty()) {

				loan.setLoanAmount(Integer.parseInt(parts[8]));
			} else {
				loan.setLoanAmount(-1);
			}
			if (!parts[9].isEmpty()) {

				loan.setLoan_Amount_Term(Integer.parseInt(parts[9]));
			} else {
				loan.setLoan_Amount_Term(-1);
			}
			if (!parts[10].isEmpty()) {

				loan.setCredit_History(Integer.parseInt(parts[10]));
			} else {
				loan.setCredit_History(-1);
			}

			loan.setProperty_Area(parts[11]);
			loan.setLoan_Status(parts[12]);
			list.add(loan);

		}
		System.out.println("Data fetch Successfully......");
		reader.close();
	}
	
	void countByGender()
	{
	Map<String, Long> map= list.stream()
		.collect
		(Collectors.groupingBy(Loan::getGender,Collectors.counting()));
	System.out.println(map);
	}
	
	void countByEducation()
	{
		Map<String, Long> map = list.stream()
				.collect
				(Collectors.groupingBy(Loan::getEducation,Collectors.counting()));
		System.out.println(map);
	}
	
	void countByEmployed()
	{
		Map<String, Long> map = list.stream()
				.collect
				(Collectors.groupingBy(Loan::getSelf_Employed,Collectors.counting()));
		System.out.println(map);
	}
	
	void countByPropery()
	{
		Map<String, Long> map = list.stream()
				.collect
				(Collectors.groupingBy(Loan::getProperty_Area,Collectors.counting()));
		System.out.println(map);
	}
	
	void countByMarried()
	{
		Map<String, Long> map = list.stream()
				.collect
				(Collectors.groupingBy(Loan::getMarried,Collectors.counting()));
		System.out.println(map);
	}
	
	void getPercentageByEducation()
	{
		Map<String, Long> map = list.stream()
                .collect
                (Collectors.groupingBy(Loan::getEducation, Collectors.counting()));

        long totalsize = list.size();

        
		double gper =map.get("Graduate") * 100 / totalsize;
        double  ngper= map.get("Not Graduate") * 100 / totalsize;

        System.out.println("Graduate percentage: " + gper + "%");
        System.out.println("Not graduate percentage: " + ngper + "%");
	}
	
	void getCreditHistory()
	{
		Map<Integer, Long> map = list.stream()
				.collect(Collectors
						.groupingBy(Loan::getCredit_History,Collectors.counting()));
		System.out.println(map);
	}
	
	void getLoanStatus()
	{
		Map<String, Long> map = list.stream()
				.collect
				(Collectors.groupingBy(Loan::getLoan_Status,Collectors.counting()));
		System.out.println(map);
	}
	
	void getLoanAmountTerm()
	{
		Map<Integer, Long> map = list.stream()
				.collect
				(Collectors.groupingBy(Loan::getLoan_Amount_Term,Collectors.counting()));
		System.out.println(map);
	}
	
	void getCountByIncome()
	{
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(applicant -> {
			double in = applicant.getApplicantIncome();
			if(in >=100 && in < 5000)
				return "100-5K";
			else if (in >= 5000 && in < 10000) {
				return "5k-10k";
			} else if (in >= 10000 && in < 15000) {
				return "10k-15k";
			} else if (in >= 15000 && in <= 20000) {
				return "15k-20k";
			} else {
				return "Others";
			}
		}, Collectors.counting()));
		System.out.println(map);
	}
	
	void getPeopleGraduateNmarry()
	{
		long countGraduateMarried = list.stream()
                .filter(
                		p -> p.getEducation().equals("Graduate") && p.getMarried().equals("yes")
                		)
                .count();
		long countGraduateNotMarried = list.stream()
                .filter(
                		p -> p.getEducation().equals("Graduate") && p.getMarried().equals("No")
                		)
                .count();
		long countNotGraduateMarried = list.stream()
                .filter(
                		p -> p.getEducation().equals("Not Graduate") && p.getMarried().equals("Yes")
                		)
                .count();
		long countNotGraduatenotMarried = list.stream()
                .filter(
                		p -> p.getEducation().equals("Not Graduate") && p.getMarried().equals("No")
                		)
                .count();
		
		System.out.println("Graduate and married ::"+countGraduateMarried);
		System.out.println("Graduate and not married ::"+countGraduateNotMarried);
		System.out.println("Not Graduate and  married ::"+countNotGraduateMarried);
		System.out.println("Not Graduate and not married ::"+countNotGraduatenotMarried);
		
	}
	
	

}
