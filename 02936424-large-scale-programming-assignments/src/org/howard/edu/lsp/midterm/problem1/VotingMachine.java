/**
 * 
 */
package org.howard.edu.lsp.midterm.problem1;
import java.util.*;

/**
 * @author thebe

Requirements: 
Designing an electronic voting machine is a challenging task.  
You are asked to implement a very simplified voting machine class with the following requirements. 
A voting machine has a list of candidates and the following methods: 

In summary, you are responsible for the following:
1.	Implementation of the aforementioned methods. 
	(5 pts. for each, 20 pts. total)
2.	JUnit test cases for getVotes and sum methods.  
	Use appropriate naming conventions for your test class and respective methods in it. 
	(5 pts. for each, 10 pts. total)
3.	Make sure you include javadocs in your source code but you do not have to generate html. 

 */

public class VotingMachine {
	// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.
	
	
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		
	} 

	public void castVotes(String name, int votes) {
		// Cast votes to the candidate with the given name
		
	}

	public int getVotes(String name)  throws UnknownCandidateException {
		// Return the number of votes for a given candidate.  Throws
// UnknownCandidateException if name not present.  Make this a 
// checked exception.
		
	}

	public int sum() {
		// Return the total number of votes for all candidates.	
		
	}
}
