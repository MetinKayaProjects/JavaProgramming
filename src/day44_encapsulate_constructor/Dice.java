package day44_encapsulate_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Dice {
	public static void main(String[] args) {

		Job job1 = new Job(); // match with 1 in the Job class
		// No-args constructor

		Job job2 = new Job("Java Developer"); // match 2
		// 1-arg constructor

		Job job3 = new Job("SDET", "Amazon", 130000); // match 3
		// 3-args constructor

		System.out.println(job1.toString()); // Job [title=undefined, company=undefined, annualSalary=0.0]
		System.out.println(job2.toString()); // Job [title=Java Developer, company=undefined, annualSalary=0.0]
		System.out.println(job3.toString()); // Job [title=SDET, company=Amazon, annualSalary=130000.0]

		System.out.println();

		// create a list of jobs and add 5 defferent jobs, with company, salary, title

		List<Job> jobList = new ArrayList<>();

		jobList.add(job3);//Job job3 = new Job("SDET", "Amazon", 130000);
		jobList.add(new Job("Scrum Master", "Google", 123000)); // new lsit eklerken sag tarafa bu sekilde
		jobList.add(new Job("SDET", "FreddieMac", 115000));
		jobList.add(new Job("BA", "Leidos", 105000));
		jobList.add(new Job("Senior QA TEster", "Delta", 150000));
//		jobList.add(new Job("Senior QA TEster"));//1 arg'a gider

		// System.out.println(jobList);
		System.out.println();
		System.out.println(jobList.toString());
		System.out.println();
		System.out.println("Salary (SDET-job3): " + jobList.get(0).getAnnualSalary());
		System.out.println();
		System.out.println();
		// find the highest paying job and print toString for that
//		double largestSalary = jobList.get(0).getAnnualSalary();
		double maxsalary = 0;
		int highestIndex = -1;
		for (int i = 0; i < jobList.size(); i++) {
			if (jobList.get(i).getAnnualSalary() > maxsalary) {
				maxsalary = jobList.get(i).getAnnualSalary();
				highestIndex = i;
			}

		}

		Job bestJob = jobList.get(highestIndex);
		System.out.println("The best job: " + bestJob.toString());

//		System.out.println("Highest Salary: " + jobList.get(highestIndex));

	}

}
