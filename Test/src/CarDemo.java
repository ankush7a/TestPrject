import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		String str;
		String str1="quit";
		int start=0,stop=1;
		Scanner sc = new Scanner(System.in);
		System.out.print ("Please Input : ");
		while((str=sc.nextLine())!=str1){
			if(str.equals("start") && start==0) {
				System.out.println("Car Started");
				start++;
			}else if(str.equals("start")&&start>0){
				System.out.println("Car Already Started");
				start++;
				stop=0;
			}else if(str.equals("stop")&stop==0) {
					System.out.println("Car Stop");
					stop++;
					start=0;
				}else if(str.equals("stop")&&stop>0){
				System.out.println("Car Already Stoped");
				stop++;
				}else if(str.equals("quit")){
					break;
				}else {
					System.out.println("Invalid Input");	
				}
				}
		System.out.println("Quit");	
		sc.close();
}
}
