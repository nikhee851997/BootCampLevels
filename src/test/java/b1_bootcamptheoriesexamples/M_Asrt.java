package b1_bootcamptheoriesexamples;

	public class M_Asrt 
	{
	    int numberOfApplications = 10;
	    String student1 = "Kali";
	    int scholarshipPercent1 = 80;
	    String student2 = "Arjun";
	    int scholarshipPercent2 = 75;

	    public void displayApplicationDetails() 
	    {
	        System.out.println("Number of applications available for Indian students: " + numberOfApplications);
	        System.out.println("Student: " + student1 + ", Scholarship Percentage: " + scholarshipPercent1 + "%");
	        System.out.println("Student: " + student2 + ", Scholarship Percentage: " + scholarshipPercent2 + "%");

	        // Assertions to validate certain conditions
	        assert numberOfApplications >11 : "Number of applications should be greater than 1";
	        assert scholarshipPercent1 >= 0 && scholarshipPercent1 <= 80 : "Scholarship percentage for student1 should be between 0 and 85%";
	        assert scholarshipPercent2 >= 0 && scholarshipPercent2 <= 80 : "Scholarship percentage for student2 should be between 0 and 85%";

	    }

	    public static void main(String[] args) 
	    {
	        M_Asrt obj = new M_Asrt();
	        obj.displayApplicationDetails();
	    }
	}

