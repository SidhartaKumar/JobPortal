package com.technoelevate.job;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class Selection {
	
	
	static List<Candidate> selection(Set<Candidate> set) {
		List<Candidate> list = new ArrayList<Candidate>();
		for (Candidate candidate : set) {
			if(candidate.percentage>=75.0 && candidate.yop==2021)
				list.add(candidate);
		}
		return list;
	}

}
