import java.util.Scanner;

public class CoverLetter {

public static void main(String[] args) {
		String job;
		String company;
		String xp = new String("");
		String x = new String("");
		String y;
		String z = new String("");
		String type;
		String remote;
		String compliment = new String("");
		Scanner scan = new Scanner(System.in);

		System.out.println("Job Title");
		job = scan.nextLine();
		
		System.out.println("Company Name");
		company = scan.nextLine();

		System.out.println("Staffing company? y/n");
		y = scan.nextLine();
		// System.out.println(y);
		// System.out.println(y.equals("n"));
		if (y.equals("n"))
		{
			System.out.println("General compliment regarding company + '. '");
			compliment = scan.nextLine();
			type = " at ";
		}
		else
		{
			type = " through ";
		}
		

		System.out.println("a = agile and scrum\nb = java\nc = SQL and MySQL\n"
		+ "d = HTML, CSS, and Bootstrap\ne = object-oriented, data stru, algo\n"
		+ "f = Git");
		while (x != "x")
		{
			x = scan.nextLine();
			if (x.equals("a"))
			{
				xp = xp.concat("I have experience with Agile and Scrum methodologies from my "
				+ "software engineering and capstone courses at UNCC. ");
				// System.out.println(xp);
			}
			else if (x.equals("b"))
			{
				xp = xp.concat("I have the most experience with Java from my introduction to"
				+ " computer science 1 & 2, data structures and algorithms, and discrete"
				+ " structures courses at UNCC as well as my own personal uses, like a"
				+ " cover letter generator. ");
				// System.out.println(xp);
			}
			else if (x.equals("c"))
			{
				xp = xp.concat("My database implementation and design course gave me experience"
				+ " with SQL and MySQL. ");
				// System.out.println(xp);
			}
			else if (x.equals("d"))
			{
				xp = xp.concat("I have hands-on experience with HTML, CSS, and Bootstrap from"
				+ " my software engineering and capstone courses at UNCC. ");
				// System.out.println(xp);
			}
			else if (x.equals("e"))
			{
				xp = xp.concat("Over the course of my degree program I learned object-oriented"
				+ " programming, data structures, algorithms, and coding efficiency. ");
				// System.out.println(xp);
			}
			else if (x.equals("f"))
			{
				xp = xp.concat("I have had courses that utilize Git and I have used Git for my"
				+ " own uses. ");
				// System.out.println(xp);
			}
			else
			{
				x = "x";
			}
			
		}
		
		System.out.println("a = Python\nb = Ruby & Rails\nc = C/C++\n"
				+ "d = Microsoft Office\ne = Windows\nf = Mac");
				while (z != "x")
				{
					z = scan.nextLine();
					if (z.equals("a"))
					{
						xp = xp.concat("In my information visualization course at UNCC I gained"
								+ " experience in Python. ");
						// System.out.println(xp);
					}
					else if (z.equals("b"))
					{
						xp = xp.concat("In my software engineering course, I also gained experience"
								+ " with Ruby and Ruby on Rails for our semester project. ");
						// System.out.println(xp);
					}
					else if (z.equals("c"))
					{
						xp = xp.concat("Between my introduction to computer architecture course and"
								+ " my introduction to computer networks course, I gained experience"
								+ " with C and C++. ");
						// System.out.println(xp);
					}
					else if (z.equals("d"))
					{
						xp = xp.concat("I have been using Microsoft Office for several years and"
								+ " Google's copycat software programs both in college and in"
								+ " volunteer work. ");
						// System.out.println(xp);
					}
					else if (z.equals("e"))
					{
						xp = xp.concat("I have been exposed to the Windows operating systems for years"
								+ ", both in courses and out-of-school personal use. ");
						// System.out.println(xp);
					}
					else if (z.equals("f"))
					{
						xp = xp.concat("Over the years, in both primary school and volunteer work, I have utilized Mac"
								+ " computers to complete tasks. ");
						// System.out.println(xp);
					}
					else
					{
						z = "x";
					}
					
				}
		
		System.out.println("Remote? y/n");
		remote = scan.nextLine();
		if (remote.equals("y"))
		{
			xp = xp.concat("My time in my last few semesters at UNCC and several"
			+ " online courses gave me experience working and communicating remotely.");
		}
		
		String cover = new String("Dear Hiring Manager,\n\nThank you for this opportunity"
		+ " of " + job + type + company + ". I am a recent graduate from the University"
		+ " of North Carolina at Charlotte. I have a bachelor's of science in computer"
		+ " science with a concentration in software, systems, and networking. I believe"
		+ " I have experience for this position.\n" + xp + "\nI appreciate this opportunity"
		+ type + company + ". I know I could learn in this position, sharpen skills, and"
		+ " gain new skills. For that alone, I am highly interested. " + compliment
		+ "Please contact me if you have any questions or concerns.\n\nGod bless,\nSamuel Kilby");
		
		System.out.println(cover);
	}	
}
		// switch (x) {
		// 	case x = "a":
				
		// 		break;
		// 	case x = "b":
				
		// 		break;
		// 	case x = "c":
				
		// 		break;
		// 	case x = "d":
				
		// 		break;
		// 	case x = "e":
				
		// 		break;
		// 	case x = "f":
				
		// 		break;
		// 	default:
		// 		break;
		// 	}
		
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
