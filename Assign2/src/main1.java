public class main1 {  

public static void main(String[] args) {
	personal p = new personal(); //create new object for personal class
	cgpa q = new cgpa();
	exam e = new exam();	
	workExperience w = new workExperience();
	skills s = new skills();
	talent t = new talent();
	
	 System.out.println("My name is " + p.name);
		
	p.printName();
	q.printCGPA();
	e.printExam();
	q.printGPA();
	System.out.println("Final CGPA " +q.calculateCGPA());
	
	w.Workexperience();
	s.Skills();
	t.Thingsicando();

	
}
		}
		
		



