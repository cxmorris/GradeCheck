import java.util.*;
public class Gradechecker {
	
	//assuming that your homework, midterm, and final carry equal weight
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double avg=(hwrk() + midterm() + finale())/3;
		System.out.print("Your final grade: ");
		grade(avg);
		
	}
	public static double hwrk() {
		Scanner con = new Scanner(System.in);
		System.out.println("Total homework points earned: ");
		int you=con.nextInt();
		System.out.println("Total homework points possible:");
		int pts=con.nextInt();
		//con.close();
		double score = you/pts;
		return score;
	}
			
		
	
	public static double midterm() {
		Scanner con = new Scanner(System.in);
		System.out.println("Enter the number of points you earned on the midterm: ");
		double a=con.nextDouble();
		System.out.println("Enter how many points were possible to earn on the midterm: ");
		int b=con.nextInt();
		//con.close();
		double sc=a/b;
		return sc;
		
	}
	public static double finale() {
		Scanner con = new Scanner(System.in);
		System.out.println("How many points did you earn on the final? ");
		double a=con.nextDouble();
		System.out.println("How many points were possible to earn on the final?");
		int b = con.nextInt();
		//con.close();
		return a/b;
	}
	
	public static void grade (double avg) {
		
		 if (avg<.620 &&  (avg)>=.580 ) {
			System.out.print("D+");
			
		} if (avg<.680 && (avg)>=.620 ) {
			System.out.print("C-");
		} if (avg<.720 && (avg)>=.680 ) {
			System.out.print("C");
		} if (avg<.760 && (avg)>=.720 ) {
			System.out.print("C+");
		} if (avg<.800 && avg>=.760 ) {
			System.out.print("B-");
		} if (avg<.850 && avg>=.800 ) {
			System.out.print("B");
		} if (avg<.900 && avg>=.850 ) {
			System.out.print("B+");
		} if (avg<.950 && avg>=.900 ) {
			System.out.print("A-");
		} if (avg<=1.000 && avg>=.950 ) {
			System.out.print("A");
		} if(avg<=.580  ) {
			System.out.print("D");
	}
	
}
}
