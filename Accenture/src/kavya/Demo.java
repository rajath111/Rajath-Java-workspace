package kavya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int from = 0;
		int to = 0;
		Boolean condition = true;
		
		System.out.println("About the application:\n"
				+ "It will take from option, to option and a number.\n"
				+ "It will convert number from(from option) to(to option)\n"
				+ "Have a happy day!!\n");
		
		//When the user enters "no" the application will be terminated!
		while(true) {
			System.out.println("From Options:\n"
					+ "1. Binary\n"
					+ "2. Decimal\n"
					+ "3. Hex\n"
					+ "4. Octal\n");
			condition = true;
			while(condition) {
				System.out.println("Enter your from option : ");
				try {
					from = Integer.parseInt(sc.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Enter only numbers:\n"
							+ "Enter again : ");
					from = Integer.parseInt(sc.nextLine());
				}
				//Validating the input
				if(from<=0 || from>4) {
					System.out.println("Enter correct from value \nEnter again!");
				}
				else {
					condition = false;
				}
			}
			
			
			System.out.println("To Options:\n"
					+ "1. Binary\n"
					+ "2. Decimal\n"
					+ "3. Hex\n"
					+ "4. Octal\n"
					+ "5. All\n"
					+ "Note: Avoid using same from and to values, as they return input;\n");
			condition = true;
			while(condition) {
				System.out.println("Enter your to option : ");
				try {
					to = Integer.parseInt(sc.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Enter only numbers:\n"
							+ "Enter again : ");
					to = Integer.parseInt(sc.nextLine());
				}
				if(to<=0 || to>5) {
					System.out.println("Enter correct to value \nEnter again!");
				}
				else {
					condition = false;
				}
			}
			
			switch(from) {
			case 1:
				System.out.println("Enter a Binary number : ");
				long bin = 0;
				try {
					bin = Long.parseLong(sc.nextLine());
				}
				catch(InputMismatchException | NumberFormatException e) {
					System.out.println("Enter only numbers with length less than 20(<=19):\n"
							+ "Enter again : ");
					bin = Long.parseLong(sc.nextLine());
				}
				bin = Math.abs(bin);
				
				System.out.println("Binary Number(long) : "+bin);
				switch(to) {
				case 1:
					System.out.println("Converted to Binary : "+bin);
					break;
				case 2:
					System.out.println("Converted to Decimal : "+Converters.binaryToDecimal(bin));
					break;
				case 3:
					System.out.println("Converted to HexaDecimal : "+Converters.binaryToHex(bin));
					break;
				case 4:
					System.out.println("Converted to Octal : "+Converters.binaryToOctal(bin));
					break;
				case 5:
					System.out.println("Converted to Decimal : "+Converters.binaryToDecimal(bin));
					System.out.println("Converted to HexaDecimal : "+Converters.binaryToHex(bin));
					System.out.println("Converted to Octal : "+Converters.binaryToOctal(bin));
				}
				break;
				
			case 2:
				System.out.println("Enter a Decimal number(long) : ");
				long dec = 0;
				try {
					dec = Long.parseLong(sc.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Enter only numbers:\n"
							+ "Enter again : ");
					dec = Long.parseLong(sc.nextLine());
				}
				dec = Math.abs(dec);
				System.out.println("Decimal Number : "+dec);
				switch(to) {
				case 1:
					System.out.println("Converted to Binary : "+Converters.decimalToBinary(dec));
					break;
				case 2:
					System.out.println("Converted to Decimal : "+dec);
					break;
				case 3:
					System.out.println("Converted to HexaDecimal : "+Converters.decimalToHex(dec));
					break;
				case 4:
					System.out.println("Converted to Octal : "+Converters.decimalToOctal(dec));
					break;
				case 5:
					System.out.println("Converted to Binary : "+Converters.decimalToBinary(dec));
					System.out.println("Converted to HexaDecimal : "+Converters.decimalToHex(dec));
					System.out.println("Converted to Octal : "+Converters.decimalToOctal(dec));
				}
				break;
				
			case 3:
				System.out.println("Enter a HexaDecimal number(string) : ");
				String hex = sc.nextLine();
				System.out.println("HexaDecimal Number : "+hex);
				switch(to) {
				case 1:
					System.out.println("Converted to Binary : "+Converters.hexToBinary(hex));
					break;
				case 2:
					System.out.println("Converted to Decimal : "+Converters.hexToDecimal(hex));
					break;
				case 3:
					System.out.println("Converted to HexaDecimal : "+hex);
					break;
				case 4:
					System.out.println("Converted to Octal : "+Converters.hexToOctal(hex));
					break;
				case 5:
					System.out.println("Converted to Binary : "+Converters.hexToBinary(hex));
					System.out.println("Converted to Decimal : "+Converters.hexToDecimal(hex));
					System.out.println("Converted to Octal : "+Converters.hexToOctal(hex));
				}
				break;
				
			case 4:
				System.out.println("Enter a Octal number(long) : ");
				long oct = 0;
				try {
					oct = Long.parseLong(sc.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Enter only numbers:\n"
							+ "Enter again : ");
					oct = Long.parseLong(sc.nextLine());
				}
				oct = Math.abs(oct);
				System.out.println("Octal Number : "+oct);
				switch(to) {
				case 1:
					System.out.println("Converted to Binary : "+Converters.octalToBinary(oct));
					break;
				case 2:
					System.out.println("Converted to Decimal : "+Converters.octalToDecimal(oct));
					break;
				case 3:
					System.out.println("Converted to HexaDecimal : "+Converters.octalToHex(oct));
					break;
				case 4:
					System.out.println("Converted to Octal : "+oct);
					break;
				case 5:
					System.out.println("Converted to Binary : "+Converters.octalToBinary(oct));
					System.out.println("Converted to Decimal : "+Converters.octalToDecimal(oct));
					System.out.println("Converted to HexaDecimal : "+Converters.octalToHex(oct));
				}
				break;
			}
			System.out.println("\nWanna try again??\n"
					+ ">>>Type 'yes' or any string to continue\n"
					+ ">>>Type 'no' to exit");
			String option = sc.nextLine().toLowerCase().strip();
			if(option.equals("no")) {
				sc.close();
				System.out.println("Thanks for using our application!");
				System.exit(0);
			}
		}
	}

}