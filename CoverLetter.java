import java.util.Scanner;
public class CoverLetter {
Scanner scan = new Scanner(System.in);
String job;
String company;
String xp1;
String xp2;
String xp3;
String fields;
String compliment;


public static void main(String[] args) {
		CoverLetter cov = new CoverLetter();
		System.out.println("Job Title");
		cov.job = cov.scan.nextLine();
		
		System.out.println("Company Name");
		cov.company = cov.scan.nextLine();
		
		System.out.println("I have experience with ? from ?");
		cov.xp1 = cov.scan.nextLine();
		
		System.out.println("I also have worked with ? in ?");
		cov.xp2 = cov.scan.nextLine();
		
		System.out.println("my time in ? ? ? (experience)");
		cov.xp3 = cov.scan.nextLine();
		
		System.out.println("fields/industries company covers");
		cov.fields = cov.scan.nextLine();
		
		System.out.println("General compliment regarding company");
		cov.compliment = cov.scan.nextLine();
		
		String cover = "Dear Hiring Manager, \n\n"
		+ "Thank you for this opportunity to be a "
		+ cov.job + " at " + cov.company + ". I am a recent graduate from"
		+ " the University of North Carolina at Charlotte."
		+ " I have a bachelor's degree in computer science "
		+ "from their computer science department with a "
		+ "concentration in software, systems, and networking."
			+ " I believe I have experience for this position."
		+ "\nI have experience with " + cov.xp1 + ". I also have "
				+ "worked with " + cov.xp2 + ". Through my time in "
				+ cov.xp3 + ".\n" + cov.company + " seems to be an upstanding"
				+ " company for which I would like to work. I admire "
				+ "the reach the company has in the " + cov.fields + 
				" fields in the industry. " + cov.compliment + ". Please "
				+ "contact me if you have any questions or concerns."
				+ "\n \nGod bless,\nSamuel Kilby";
		
		System.out.println(cover);
	}
	
}
