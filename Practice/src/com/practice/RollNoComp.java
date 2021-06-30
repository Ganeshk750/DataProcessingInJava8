package com.practice;

import java.util.Comparator;


public class RollNoComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			if(s1.getRollNumber() == s2.getRollNumber()) {
				return 0;
			}else if(s1.getRollNumber() > s2.getRollNumber()) {
				return +1;
			}else {
				return -1;
			}
		}
	}

	



