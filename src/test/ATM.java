package test;

import java.util.Scanner;

public class ATM {

	double deposit;
	double withDrawal;
	double balance = 500;
	
	public void deposit(){
		System.out.println("Input money to deposit : ");
		Scanner mn = new Scanner(System.in);
		double money = mn.nextDouble();
		balance += money;
		System.out.println("Your deposit : " + money);
		System.out.println("balance : " + balance);
	}
	
	public void withDrawal(){
		System.out.println("Input money to withdrawal : ");
		Scanner sc = new Scanner(System.in);
		double withdrawal = sc.nextDouble();
		if(withdrawal%100==0){
			System.out.println("You can not withdrawal because it have no this");
			if(withdrawal >= balance){
				System.out.println("You can not withdrawal because your enough's not enough");
			}else {
				balance -= withdrawal;
				System.out.println("balance : " + balance);
			}
		}
	}
	
	public void balance(){
		System.out.println("balance : " + balance);
	}
	
	public static void main(String agrs[]){

		ATM atm = new ATM();
		int numCheck=0;
		while(numCheck != 13){
			System.out.print("Login : ");
			Scanner ac = new Scanner(System.in);
			int login = ac.nextInt();
			if (login == 1234){
				System.out.println("Welcome to ATM");
				int check=0;
				
				while(check != 9){
					System.out.print("What do you want to do? Please press the number(1 to 4) (1 = Deposit), (2 = Withdrawal), (3 = Balance), (4 = Log-out) : ");
					Scanner sc = new Scanner(System.in);
					int select = sc.nextInt();
					
					if(select == 1){
						atm.deposit();
					}else if(select == 2){
						atm.withDrawal();
					}
					else if(select == 3){
						atm.balance();
					}else if(select == 4){
						System.out.println("Do you want to exit? (1 Yes) : ");
						Scanner exit = new Scanner(System.in);
						int logout = exit.nextInt();
						if(logout == 1){
							System.out.println("Thank you!!");
							check=9;
							numCheck=13;
						}
					}
					else{
						System.out.println("Please choose only 1 to 4");
					}
				}
			}else{
				System.out.println("Your password wrong please enter password again");
				continue;
			}
			
		}
	}

}
