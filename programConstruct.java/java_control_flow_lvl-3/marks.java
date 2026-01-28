import java.util.Scanner;
class marks {
	public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			System.out.print("enter the  maths: ");
			int m =input.nextInt();
			System.out.print("enter the  physics: ");
			int p =input.nextInt();
			System.out.print("enter the  chemistry: ");
			int c =input.nextInt();
			double total = m+c+p;
			double percentage =(total/300)*100;
			System.out.println("the percentage is: "+percentage);
			if (percentage<39){
				System.out.println("Remedial standards");
			}
			else if (percentage>=40 && percentage<49){
				System.out.println("level 1");
			}
			else if (percentage>=50 && percentage<59){
				System.out.println("level 1");
			}
			else if(percentage>=60 && percentage<69){
				System.out.println("level 2 ");
			}
			else if (percentage>=70 && percentage<79){
				System.out.println("level 3");
			}
			else {
				System.out.println("level 4");
			}
		}
	}