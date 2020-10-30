
public class resume {

	public static void main(String[] args) {
	
		System.out.println("My Resume");
		System.out.println("\t");
		System.out.println("Name : Sasikala");
		Gender();
		System.out.println("Birthday : 1st May 1998");
		Age();
		System.out.println("Marital Status : Single");
		System.out.println("Citizenship : Malaysian");
		System.out.println("Home Address : 789-G Jalan Sungai Dua, 11700 Gelugor, Pulau Pinang.");
		System.out.println("Mobile Number : +601133905160");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("EDUCATION");
		System.out.println("High School : SMK Bukit Gambir");
		System.out.println("Diploma : Polytechnic of Seberang Perai");
		System.out.println("Diploma Result : 3.43");
		System.out.println("University : University of Northern Malaysia");
		System.out.println("Current CGPA : 3.63");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("WORKING EXPERIENCE");
		System.out.println("1. 3 months experience at chinese restaurant as a kitchen helper and waitress");
		System.out.println("2. 6 months practical at USM as an IT Researcher");
		System.out.println("3. 6 months experience in International school as bus marshall");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("SKILLS");
		System.out.println("IT Proficiency : Microsoft Office Applications, CISCO Packet Tracer, C++ and Mininet");
		System.out.println("Speaking Proficiency : Bahasa Malaysia(excellent),English language(excellent), Tamil language(excellent)");
		System.out.println("Writing Proficiency : Bahasa Malaysia(excellent), English language(excellent), Tamil language(moderate)");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("AWARDS AND CERTIFICATES");
		System.out.println("1. Deans Award(sem1,2 and 3 at polytechnic)");
		System.out.println("2. Muet Band 3");
		System.out.println("3. Vice President of Kolattam Club PSP(2018-2019)");
		System.out.println("4. Second Place in Intervarsity Dance Competition at UKM(2017)");
		System.out.println("5. RELASIS Camp-Participant(2016)");
		System.out.println("6. 1Malaysia PNB Investment Quiz Competition District level(Consolation)(2015)");
		
		System.out.println("\t");
		
		String Name = "Sasikala";
		
		System.out.println("Your name has " + Name.length() + " characters.");
		
		System.out.println("\t");
		
		double cgpa = displayCGPA(3.45, 3.67);
		System.out.println("CGPA = " + cgpa);
		
		double cgpa2 = displayCGPA(2.50, 3.80);
		System.out.println("CGPA2 = " + cgpa2);
		
		System.out.println("\t");
		
		
	}
public static void Gender() {
	System.out.println("Gender : Female");
	
}
public static void Age() {
	System.out.println("Age : 22");
	
}
static double displayCGPA(double a, double b) {
	double sum = (a + b)/2;
	return sum;
	
	
	}

	


		
	}


