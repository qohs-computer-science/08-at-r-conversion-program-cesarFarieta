import java.util.Scanner;

/*
 * Cesar Farieta
 * September 20
 * 3
 * This program as the usser if they want to do a conversion from Binary to decimal or if they want to do demial to binary. Then depending on what conversion they pick
 * 
 */
public class HelloWorld {

	public static void main(String[] args) {
		boolean cont= true;
		Scanner myObj = new Scanner(System.in);

		while(cont){
			System.out.println("Welcome!  You have the following options:");
			System.out.println("1. Binary to Decimal");
			System.out.println("2. Decimal to Binary");
			System.out.println("Which type of conversion would you like to perform?");
			int decision = myObj.nextInt();
			myObj.nextLine();
			while (decision != 1 && decision !=2) {
				System.out.println("Which type of conversion would you like to perform?");
				decision = myObj.nextInt();
				myObj.nextLine();
			}

			if(decision == 1 )
				binaryToDecimal();
			
			else
				decimalToBinary();


			System.out.println("Do you want to continue - yes or no?");
			String var= myObj.nextLine();
			if(var.equals("no"))
				cont=false;
					
			
			
		}
		

	} // end main

	public static void binaryToDecimal(){// start binaryToDecmial
		Scanner myObj = new Scanner(System.in);
		System.out.println("What is the binary number?");
		String bNum = myObj.nextLine();
		int outDecimal=0;
		int location=0;
		for(int x =bNum.length()-1;x>=0;x--){// start for loop
			if(bNum.charAt(x)==('1')){// start mini if
				outDecimal+=Math.pow(2, location);
			}// end mini if
			location++;
		}// end for loop
		System.out.println("The decimal equivalent is: " + outDecimal);

	}// end binaryToDecmial

	public static void decimalToBinary(){// start decimalToBinary
		Scanner myObj = new Scanner(System.in);
		System.out.println("What is the decimal number?");
		int dNum = myObj.nextInt();
		myObj.nextLine();
		String outBinary="";

		for(int x =dNum;x>0;x/=2){// start for
			outBinary= (x%2)+ outBinary;
		}
		System.out.println("The binary equivalent is: "+ outBinary);	
			

	} // end decimalToBinary




} // end class
