package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ClubMap {

public HashMap<String, TreeSet<Student>> map = new HashMap<String,TreeSet<Student>>();	
	
	public void add(String club, Student student) {
		if(map.get(club) == null) 
			map.put(club, new TreeSet<Student>());
		map.get(club).add(student);
	}
	
	public void printClubs() {
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Club: "+key);
			TreeSet<Student>students = map.get(key);
			for(Student student : students) {
				System.out.println(student.toString());
			}
			System.out.println("\n");
		}
	}
	
	public void printClubs(String name) {
		Set<String> keys = map.keySet();
			TreeSet<Student>students = map.get(name);
			for(Student student : students) {
				System.out.println(student.toString());
			}
	}
	
	
}
