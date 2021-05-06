import java.util.Scanner;

public class CoverLetter {

public static void main(String[] args) {
		String job;
		String company;
		String xp;
		String fields;
		String x;
		String y;
		String type;
		String compliment = new String("");
		Scanner scan = new Scanner(System.in);

		System.out.println("Job Title");
		job = scan.nextLine();
		
		System.out.println("Company Name");
		company = scan.nextLine();

		System.out.println("Staffing company? y/n");
		y = scan.nextLine();
		if (y == "n")
		{
			System.out.println("fields/industries company covers");
			fields = scan.nextLine();
			type = " through ";
		}
		else
		{
			System.out.println("General compliment regarding company");
			compliment = scan.nextLine();
			type = " at ";
		}
		

		System.out.println("a = agile and scrum\nb = java\nc = SQL and MySQL\n"
		+ "d = HTML, CSS, and Bootstrap\ne = object-oriented, data stru, algo\n"
		+ "f = Git");
		while (x != "x")
		{
			x = scan.nextLine();
			switch (x) {
			case x = "a":
				xp.append("I have experience with Agile and Scrum methodologies from my "
				+ "software engineering and capstone courses at UNCC. ");
				break;
			case x = "b":
				xp.append("I have the most experience with Java from my introduction to"
				+ " computer science 1 & 2, data structures and algorithms, and discrete"
				+ " structures courses at UNCC as well as my own personal uses, like a"
				+ " a cover letter generator. ");
				break;
			case x = "c":
				xp.append("My database implementation and design course gave me experience"
				+ " with SQL and MySQL. ");
				break;
			case x = "d":
				xp.append("I have hands-on experience with HTML, CSS, and Bootstrap from"
				+ " my software engineering and capstone courses at UNCC. ");
				break;
			case x = "e":
				xp.append("Over the course of my degree program I learned object-oriented"
				+ " programming, data structures, algorithms, and coding efficiency. ");
				break;
			case x = "f":
				xp.append("I have had courses that utilize Git and I have used Git for my"
				+ " own uses. ");
				break;
			default:
				break;
			}
		}
		
		String cover = new String("Dear Hiring Manager,\n\nThank you for this opportunity"
		+ " of " + job + type + company + ". I am a recent graduate from the University"
		+ " of North Carolina at Charlotte. I have a bachelor's of science in computer"
		+ " science with a concentration in software, systems, and networking. I believe"
		+ " I have experience for this position.\n" + xp + "\nI appreciate this opportunity"
		+ type + company + ". I know I could learn in this position, sharpen skills, and"
		+ " gain new skills. For that alone, I am highly interested. " + compliment
		+ "Please contact me if you have any questions or concerns.\n\nGod bless,\nSamuel Kilby");
		
		
		
		// String cover = "Dear Hiring Manager, \n\n"
		// + "Thank you for this opportunity of "
		// + job + " at " + company + ". I am a recent graduate from"
		// + " the University of North Carolina at Charlotte."
		// + " I have a bachelor's degree in computer science "
		// + "from their computer science department with a "
		// + "concentration in software, systems, and networking."
		// 	+ " I believe I have experience for this position."
		// + "\nI have experience with " + xp1 + ". I also have "
		// 		+ "worked with " + xp2 + ". Through my time in "
		// 		+ xp3 + ".\n" + company + " seems to be an upstanding"
		// 		+ " company for which I would like to work. I admire "
		// 		+ "the reach the company has in the " + fields + 
		// 		" fields in the industry. " + compliment + ". Please "
		// 		+ "contact me if you have any questions or concerns."
		// 		+ "\n \nGod bless,\nSamuel Kilby";
		
		System.out.println(cover);
	}
	
}
