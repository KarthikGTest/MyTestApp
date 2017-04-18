package com.karthik.learnings;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashCode {
    public static void main(String[] args) {

        Map<Employee, Integer> map = new HashMap<Employee, Integer>();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setName("Alex");
        e2.setName("Pandian");
        map.put(e1, 1);
        map.put(e2, 2);
        System.out.println(map.size());
        System.out.println(e1.equals(e2));
    }
}
class Employee{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		Employee test = (Employee) obj;
		return name == test.name && (name != null && name.equals(test.name));

	}
	
}
