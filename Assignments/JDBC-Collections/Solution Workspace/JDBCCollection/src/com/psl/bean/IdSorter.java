package com.psl.bean;

import java.util.*;

public class IdSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getEmpId()-o2.getEmpId();
	}

}
