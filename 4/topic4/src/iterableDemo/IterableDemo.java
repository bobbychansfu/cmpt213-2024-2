package iterableDemo;

import sharedreference.Person;

import java.util.Iterator;

public class IterableDemo {
	public static void main(String args[]) {
		Degree sosyMajor = new Degree("SOSY Major");
		sosyMajor.addCourse(new Course("CMPT 130"));
		sosyMajor.addCourse(new Course("CMPT 135"));
		sosyMajor.addCourse(new Course("CMPT 213"));
		sosyMajor.addCourse(new Course("CMPT 276"));
		sosyMajor.addCourse(new Course("CMPT 373"));

		// malicious

//		Iterator<Course> citr = sosyMajor.iterator();
//		citr.next();
//		citr.remove();

		//

		System.out.println(sosyMajor + " includes:");

		for (Person c : sosyMajor.students()){
			System.out.println(" " + c);
		}


	}
}
