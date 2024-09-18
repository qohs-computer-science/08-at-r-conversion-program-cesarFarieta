import java.util.Scanner;

/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
public class HelloWorld {

	public static void main(String[] args) {

		boolean rightChoice= true;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Welcome!  You have the following options:");
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Decimal to Binary");
		System.out.println("Which type of conversion would you like to perform?");
		int decision = myObj.nextInt();

		while (decision != 1 && decision !=2) {
			System.out.println("Which type of conversion would you like to perform?");
			decision = myObj.nextInt();
		}

		if(decision == 1 ){
			binaryToDecimal();
		}
		else{
			decimalToBinary();
		}

	public static int binaryToDecimal(){// start binaryToDecmial
		Scanner myObj = new Scanner(System.in);
		System.out.println("What is the binary number?");
		String bNum = myObj.nextLine();
		int outDecimal=0;
		int location=0;
		for(int x =bNum.length()-1;x>=0;x--){// start for loop
			if(bNum.charAt(x)==('1')){// start mini if
				outDecimal+=Math.pow(2, location);
				location++;
			}// end mini if
		}// end for loop
		System.out.println(outDecimal);
	}// end binaryToDecmial

	public static decimalToBinary(){// start decimalToBinary
		Scanner myObj = new Scanner(System.in);
		System.out.println("What is the decimal number?");
		int dNum = myObj.nextInt();
		String outBinary;

		for(int x =dnum;x<0;x--){// start for

			outBinary+=dnum%2;
			dnum=dnum/2;
			

		}
			


		}// end for 
			







	} // end decimalToBinary




	} // end main

} // end class
