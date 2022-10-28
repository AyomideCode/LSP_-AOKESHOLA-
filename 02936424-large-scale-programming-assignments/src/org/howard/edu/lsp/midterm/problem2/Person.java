/**
 * 
 */
package org.howard.edu.lsp.midterm.problem2;

/**
 * @author thebe
 
A programmer has created the following class Person to represent person records: 

In summary, you are responsible for the following:

1.	Write an appropriate constructor for class Person.  (5 pts.)
2.	In class Person, override the default implementation of the toString() method and return the person’s name, age and social security number. (5 pts.)
3.	In class Person, override the default implementation of the equals(Object) method.  Two Person instances are equal if their social security numbers are the same. (10 pts.)
…
Person p1 = new Person(“name1”, “111-11-1111”);
Person p2 = new Person(“name2”, “111-11-1111”);
If (p1.equals(p2)) {
    System.out.println(“These are the same!”);	// in this case, they would be the same
} else {
    System.out.println(“Not the same!”);
}
…
4.	You can prove your implementation works by either providing an appropriate Driver or writing JUnit test cases.  Your choice.

 */

public class Person { 
private String name; 
private int age; 
private String socialSecurityNumber;

	public Person(String name,  String socialSecurityNumber, int age) {
		// initialize private variables
	}
} 
