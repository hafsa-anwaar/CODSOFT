import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
    private static int timeLimit = 60; // this 60 is in seconds
    private static int score=0;
 //the private keyword is used as an accesss modifier which means that the time limit variabe will only be accesed by its class Quiz.
//So static keyword is used for members that can be accesed in its class in any of the object . so its value will be used in different objects of same class
    private static Timer timer = new Timer();
     public static void main(String[] args) {
        startQuiz();
        Scanner mcqs = new Scanner(System.in);
		System.out.println("\t\t***********Quiz************* ");
		System.out.println("\n\t\tThere are 5 questions each of 2 points");
		System.out.println("\nQuestion 1:");
		System.out.println("What is the capital of Australia?");
		System.out.println("a)Sydeny \tb)Melbourne \tc)Canberra \td)Brisbane");
		System.out.print("Enter your answer:");
		String ans1 = mcqs.nextLine();
		if(ans1.equalsIgnoreCase("c")) //this method will ignore the case C and c both are right
			//we didn't use the == operator as in string it is will compare the memory location of the variable rather than its value
		{score+=2;}
		System.out.println("\nQuestion 2:");
		System.out.println("What is the chemical symol for gold?");
		System.out.println("a)Ag \tb)Au \tc)Fe \td) Cu");
		System.out.print("Enter your answer:");
		String ans2 = mcqs.nextLine();
		if(ans2.equalsIgnoreCase("b"))
		{score+=2;}
		System.out.println("\nQuestion 3:");
		System.out.println("Which sport is Pakistan particularly famous for internationally??");
		System.out.println("a)Hockey \tb)Football \tc)Cricket \td)Baseball");
		System.out.print("Enter your answer:");
		String ans3 = mcqs.nextLine();
		if(ans3.equalsIgnoreCase("c"))
		{score+=2;}
		System.out.println("\nQuestion 4:");
		System.out.println("Which Pakistani singer is known as the \"Queen of Melody\"?");
		System.out.println("a)Nazia Hassan \tb)Abida Parveen \tc)Noor Jahan \td)Farida Khanum");
		System.out.print("Enter your answer:");
		String ans4 = mcqs.nextLine();
		if(ans4.equalsIgnoreCase("c"))
		{score+=2;}
		System.out.println("\nQuestion 5:");
		System.out.println("Which programming language was developed by Guido van Rossum and is known for its readability and simplicity?");
		System.out.println("a)Python \tb)C++ \tc)Java \td)C#");
		System.out.print("Enter your answer:");
		String ans5 = mcqs.nextLine();
		if(ans5.equalsIgnoreCase("a"))
		{score+=2;}
		System.out.println("\n\t\tYour Final score is "+score+"/"+"10");
		//to summarize the result of correct/incorrect answers
		if(ans1.equalsIgnoreCase("c"))
 		{System.out.println("Question 1 is Correct");}
    	 else {
    		 System.out.println("Question 1 is Incorrect");
    	 }
    	 if(ans2.equalsIgnoreCase("b"))
  		{System.out.println("Question 2 is Correct");}
     	 else {
     		 System.out.println("Question 2 is Incorrect");
     	 }
    	 if(ans3.equalsIgnoreCase("c"))
  		{System.out.println("Question 3 is Correct");}
     	 else {
     		 System.out.println("Question 3 is Incorrect");
     	 }
    	 if(ans4.equalsIgnoreCase("c"))
  		{System.out.println("Question 4 is Correct");}
     	 else {
     		 System.out.println("Question 4 is Incorrect");
     	 }
    	 if(ans5.equalsIgnoreCase("a"))
  		{System.out.println("Question 5 is Correct");}
     	 else {
     		 System.out.println("Question 5 is Incorrect");
     	 }
		mcqs.close();
	}
    
    public static void startQuiz() {
        System.out.println("Welcome to the Quiz!");
        System.out.println("You have " + timeLimit + " seconds to complete the quiz.");
        
        // Start the timer
        timer.schedule(new QuizTimer(), timeLimit * 1000);
        //this schedule method works in milliseconds so that's why we convert our 60 sec to milliseconds by * by 1000
        
        // Start the quiz questions
        // Add your quiz questions and logic here
    }
    //static class means that it is a nested class of the outer class Quiz
    //the word extend is used to inherit the properties of super class(QuizTimer) to subclass(TimerTask)
    static class QuizTimer extends TimerTask {
    	//run is the method created to perform the task of timer
        public void run() {
            System.out.println("\nTime's up! Quiz is over.");
            System.out.println("\n\t\tYour Final score is "+score+"/"+"10");
            // Add logic to end the quiz when time is up
            // For example, you could stop accepting answers and display results
            timer.cancel(); // Cancel the timer
        }
        
    }
    }
    

	






