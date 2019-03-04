package exercises;
import java.util.Scanner;

public class Gpa {

	public static void main(String[] args) {
		
		//declaring variables
		String course_unit, grade = null, name, regno;
		double cwork=0, exam=0;
		double coursework_mark, exam_mark, final_mark;
		double gp=0;
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//storing input values
		System.out.println("Name : ");
		name= scan.nextLine();
		System.out.println("RegNo : ");
		regno=scan.nextLine();
		System.out.println("Course Unit : ");
		course_unit=scan.nextLine();
		System.out.println("Coursework Mark : ");
		cwork= scan.nextDouble();
		System.out.println("Exam Mark : ");
		exam= scan.nextDouble();
		
		//calculating percentages
		coursework_mark = cwork*0.5;
		exam_mark = exam*0.5;
		
		//final percentage
		final_mark = coursework_mark + exam_mark;
		
		//setting the grade point and grade 
		if(final_mark>=80) {
		gp=5.0;
		grade="A";
	}
		else if((final_mark>=75) && (final_mark<80)) {
		gp=4.5;
		grade="B+";
	
		}
		else if((final_mark>=70) && (final_mark<75)) {
			gp = 4.0;
			grade="B";
			
		}
		else if ((final_mark>=65) && (final_mark<70)) {
			gp=3.5;
			grade="C+";
		}
		else if ((final_mark>=60) && (final_mark<65)) {
			gp=3.0;
			grade="C";
		}
		else if ((final_mark>=55) && (final_mark<60)) {
			gp=2.5;
			grade="D";
		}
		else if ((final_mark>=50) && (final_mark<55)) {
			gp=2.0;
			grade="E";
		}
		else if (final_mark<50){
			gp=0;
		grade="F";
		}
		else 
			System.out.println("Invalid marks");
		//displaying the information
		System.out.print("Name : "+name+"\nRegNo : "+regno+"\nCourse Unit : "+course_unit+"\nCourseWork Mark : "+cwork+"\nExam Mark : "+exam+"\nFinal Mark : "+final_mark+"\t"+gp+"\t"+grade);
	scan.close();	
	}
	
}
