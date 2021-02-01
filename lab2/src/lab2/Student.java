package lab2;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int midtermExam;
	private int finalExam;
	private double average;
	private String letterGrade;
	private String status;
	
	 public Student() {
		 
	 }
	 public Student(String firstName, String lastName, int midtermExam, int finalExam) {
		 	this.firstName = firstName;
	        this.lastName = lastName;
	        this.midtermExam =midtermExam;
	        this.finalExam =finalExam;
	        this.average = average;
	        this.letterGrade =letterGrade;
	        this.status =status; 
	 }
	 @Override
	 public String toString() {
		return "Student Information: \n" + "\tName : " + getFirstName() + "\n\tSurname : " + getLastName() + "\n\tMidterm Exam : " + getMidtermExam() + "\n\tFinal Exam : " + getFinalExam()+   "\n\taveraga : " +calculateAverage(getMidtermExam(),getFinalExam()) + "\n\tLetterGrade : " + getLetterGrade() + "\n\tStatus : " + getStatus() + "\n\tGpa : " + calculateCredit(getLetterGrade());
		
	}
		   
	
	public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    
	    public int getMidtermExam() {
	        return midtermExam;
	    }

	    public void setmidtermExam(int midtermExam) {
	        this.midtermExam =midtermExam;
	    }

	    public int getFinalExam() {
	        return finalExam;
	    }

	    public void setfinalExam(int finalExam) {
	        this.finalExam = finalExam;
	       
	    }
	 public double getAverage() {
		 return average;
		 
	 }
	 public void setAverage(double average) {
		 this.average=average;
		 
	 }
	 public String getLetterGrade() {
	        return letterGrade;
	    }

	    public void setLetterGrade(String letterGrade) {
	        this.letterGrade = letterGrade;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) 
	    {
	        this.status = status;
	    }
	     private double calculateAverage(int midtermExam, int finalExam) {
	    	 average=(0.4*midtermExam)+(0.6*finalExam);
	    	 if (average > 90) { 
			        letterGrade = "AA"; 
			    } else if ((average > 80) && (average< 90)) { 
			    	 letterGrade= "BA"; 
			    } else if ((average > 70) && (average < 80)) { 
			    	 letterGrade = "BB"; 
			    } else if ((average > 60) && (average <70)) { 
			    	 letterGrade = "CB"; 
			    } 
			    else if ((average > 50) && (average <60)) { 
			    	 letterGrade = "CC"; 
			    } else if ((average >0) && (average < 50))
			    { 
			     letterGrade = "F";}
	    	 String pass ;
	    	 String fail;
			if (letterGrade=="F") {
	    		 
				status ="fail";
	    		 
	    	 }else {
	    		 status= "pass";
	    	 }
			
	    	 return average;
	     }
	     
		 
	     private String calculateCredit(String letterGrade) {
	    	 double GPA = 0;
	    	 if (letterGrade=="AA") {
	    		GPA=4.0 ; 
	    	 }else if(letterGrade=="BA"){
	    		 GPA=3.5;
	    	 }
	    	 else if(letterGrade=="BB"){
	    		 GPA=3.0;
	    	 }
	    	 else if(letterGrade=="CB"){
	    		 GPA=2.5;
	    	 }
	    	 else if(letterGrade=="CC"){
	    		 GPA=2.0;
	    	 }
	    	 else if(letterGrade=="F"){
	    		 GPA=0;
	    	 }
			return GPA +" "+ "Credit";
	    	 
	     }


	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = sc.nextLine();
    System.out.println("Enter your surname : ");
    String soyad  = sc.nextLine();
    System.out.println("Enter your midterm : ");
    int midtermExam = sc.nextInt();
    System.out.println("Enter your final : ");
    int finalExam = sc.nextInt();
    Student student = new Student(name,soyad,midtermExam,finalExam);
    System.out.println(student.toString());
}





























}

	    
	   
	    	
	    	
	  