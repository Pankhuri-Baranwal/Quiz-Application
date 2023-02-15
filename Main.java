package quizapp;

import java.util.*;
public class Main {
	public static void main(String args[]) {
		Quiz q = new Quiz();
		q.logic();
	}
}

class Quiz{
	Scanner sc= new Scanner (System.in);
	public void logic() {
		Questions q1 = new Questions("What is the size of byte variable ? ", "a. 16 bit","b. 8 bit","c. 32 bit","d. 64 bit");
		Questions q2 = new Questions("Which operator is considered to be with highest precedence ?","a. ()","b. = ","c. ? ","d. %");
		Questions q3 = new Questions("What is the default value of byte variable ?"," a. 0.0","b. null","c. 0","d. not defined");
		Questions q4 = new Questions("What is the size of short variable ?","a. 8 bit","b. 16 bit","c. 32 bit","d. 64");
		Questions q5 = new Questions("What is an applet ?","a. It is a java program that runs in a Web browser","b. It is a standalone","c. It is a tool","d. It is a runtime environment");
		
		Map<Questions,Character> hashmap =new HashMap<>();
		
		hashmap.put(q1, 'b');
		hashmap.put(q2, 'a');
		hashmap.put(q3, 'c');
		hashmap.put(q4, 'b');
		hashmap.put(q5, 'a');
		
		for(Map.Entry<Questions, Character> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey().getQuestioins());
			System.out.println(entry.getKey().getOption1());
			System.out.println(entry.getKey().getOption2());
			System.out.println(entry.getKey().getOption3());
			System.out.println(entry.getKey().getOption4());
			
			System.out.println("Enter your answers : ");
			Character ans = sc.next().charAt(0);
			
			if(ans==entry.getValue()) {
				System.out.println("Correct");
			}
			else {
				System.out.println("Wrong");
			}
		}
	}
}
