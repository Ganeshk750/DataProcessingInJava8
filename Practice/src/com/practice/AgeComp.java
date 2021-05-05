package com.practice;

import java.util.Comparator;

public class AgeComp implements  Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			if(s1.getAge() == s2.getAge()) {
				return 0;
			}else if(s1.getAge() > s2.getAge()) {
				return +1;
			}else {
				return -1;
			}
	}

	

}
