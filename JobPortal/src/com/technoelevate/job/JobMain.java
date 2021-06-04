package com.technoelevate.job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class JobMain {
	public static void main(String[] args) {
		
	
	System.out.println("Welcome to Job Portal");
	System.out.println("____________________________________");
	
	Scanner sc = new Scanner(System.in);
	Set<Candidate> set = new HashSet<Candidate>();
	set = Register.register();
	List<Candidate> list = new ArrayList<Candidate>();
	list = Selection.selection(set);
	System.out.println("The List of Selected Students");
	for (Candidate candidate : list) {
		System.out.print(candidate.name);
		for(int i=0;i<35-(candidate.name).length();i++) {
			System.out.print(" ");
		}
		System.out.println(candidate.mobile);
	}
}

}
