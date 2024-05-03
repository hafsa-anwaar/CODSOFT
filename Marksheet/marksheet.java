//package to use scanner class
import java.util.Scanner;
public class marksheet {
	 //Marksheet program for students' grade
	public static void main(String[] args) {
		float obtained=0;
		float per;
		Scanner myObj = new Scanner(System.in);
		System.out.println("\t\tMARKSHEET");
		//object for scanner class
		System.out.print("\t\tEnter the number of subjects: ");
        int noOfsubj = myObj.nextInt();
//2 dimensional array of string data type where the structure is in table form having 2 columns and row acc to noofsub type by user
        String[][] subjectDetails = new String[noOfsubj][2]; // 2 columns for subject name and marks so 2nd array will declare the no of columns[2] two columns
       // Input subject details
        for (int i = 0; i < noOfsubj; i++) {
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            subjectDetails[i][0] = myObj.next();
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectDetails[i][1] = myObj.next();
             obtained += Float.parseFloat(subjectDetails[i][1]); // Convert string entered marks to float and sum up
        }
        int total=noOfsubj*100;
		  System.out.println("\n******************Result**********************");
		  System.out.println("\t\tTotal marks:"+total);
		  System.out.println("\t\tObtained marks:"+obtained);
		  per=(obtained*100/total);
		  System.out.println("\t\tPercentage:"+per);
		  if(per>=90)
		  {System.out.println("\t\tGrade: A+");}
		  else if(per>=80)
		  {System.out.println("\t\tGrade: A");}
		  else if(per>=70)
		  {System.out.println("\t\tGrade: B");}
		  else if(per>=60)
		  {System.out.println("\t\tGrade: C");}
		  else if(per>=50)
		  {System.out.println("\t\tGrade: D");}
		  else 
		  {System.out.println("\t\tGrade: F");}
		  myObj.close();

	}

}
