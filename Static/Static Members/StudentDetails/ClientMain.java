package checking;

import java.util.Date;
import java.util.Scanner;

class StudentDetails {
	private String name;
	private String college;
	private String rollNo;
	private static int count = 64;

	private String generateRollNo() {
		Date d = new Date();
		String rn = "Univ-" + (d.getYear() + 1900) + "-" + count;
		count++;
		return rn;
	}

	StudentDetails() {
		rollNo = generateRollNo();
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String s) {
		college = s;
	}
}

public class ClientMain {
	public static void main(String[] args) {
		StudentDetails s[] = new StudentDetails[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the Name of the new Student");
			String s1 = sc.nextLine();
			System.out.println("Enter the name of the College");
			String s2 = sc.nextLine();

			// sc.next();
			s[i] = new StudentDetails();
			s[i].setName(s1);
			s[i].setCollege(s2);

			System.out.println("Name:" + s[i].getName());
			System.out.println("College:" + s[i].getCollege());
			System.out.println("Roll:" + s[i].getRollNo());
		}
//		sc.close();
	}
}
