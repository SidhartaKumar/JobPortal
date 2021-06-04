package com.technoelevate.job;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.technoelevate.job.Candidate;

public class Register {
	
	static Set<Candidate> register() {
		Scanner sc = new Scanner(System.in);
		Set<Candidate> set = new HashSet<Candidate>();
		
		System.out.println("Enter The Candidates Details");
		while(true) {
			boolean isDuplicate = false;
			System.out.print("Enter the name ");
			String name = sc.nextLine();
			System.out.print("Enter Mobile ");
			long mob = sc.nextLong();
			System.out.print("Enter Percentage ");
			double per = sc.nextDouble();
			System.out.println("Enter The Year of Passout");
			int yop=sc.nextInt();
			for (Candidate candidate : set) {
				if(candidate.mobile==mob) {
					isDuplicate=true;
					System.err.println("Duplicate Values Are not Allowed");
					break;
				}
			}
			if(!isDuplicate)
				set.add(new Candidate(name, mob, per, yop));
			System.out.println();
			System.out.println("Do you want to add more?Y/N");
			String ans = sc.next();
			sc.nextLine();
			if(ans.equalsIgnoreCase("Y"))
				continue;
			else
				break;
		}
		return set;
		
		

}
}
