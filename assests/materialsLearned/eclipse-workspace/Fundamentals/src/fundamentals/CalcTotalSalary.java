//package fundamentals;
//
//import java.util.Scanner;
//
//public class CalcTotalSalary {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//			Scanner s = new Scanner(System.in);
//			
//			String str = s.nextLine();
//			
//			char RsLast = str.charAt(str.length()-1);				// access last element of the string
//			
//			String RsFirst = str.substring(0, str.length()-2);			// get string starting at index zero not including last index
//			
//			double Rs = Integer.parseInt(RsFirst);
//			
//			double hra = 0.20;
//			
//			double da = 0.50;
//			
//			double pf = 0.11;	
//			
//			if (RsLast == 'A') {
//				double SalaryA = Math.ceil((Rs + (Rs * hra) + (Rs * da)) + 1700-(Rs * pf));
//				int totalSalaryA = (int) SalaryA;
//				System.out.println(totalSalaryA);
//			}else if(RsLast == 'B') {
//				double SalaryB = Math.ceil((Rs + (Rs * hra) + (Rs * da) + 1500)-(Rs * pf));
//				int totalSalaryB = (int) SalaryB;
//				System.out.println(totalSalaryB);
//			}else {
//				double SalaryC = Math.ceil((Rs + (Rs * hra) + (Rs * da) + 1300) - (Rs * pf));
//				int totalSalaryC = (int) SalaryC;
//				System.out.println(totalSalaryC);
//			}		
//		
//	}
//
//}
