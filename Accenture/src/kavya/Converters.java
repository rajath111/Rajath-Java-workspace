package kavya;

//This is a utility class, which provides the different conversion methods.
public class Converters {

	//Decimal to Binary Conversion
	public static long decimalToBinary(long dec) {
		long binary = 0;
		long factor = 1;
		while(dec>0) {
			binary = binary + (dec%2) * factor;
			factor *= 10;
			dec /= 2;
		}
		return binary;
	}
	
	
	//Decimal to Octal Conversion
	public static long decimalToOctal(long dec) {
		long octal = 0;
		long factor = 1;
		while(dec>0) {
			octal = octal + (dec%8) * factor;
			factor *= 10;
			dec /= 8;
		}
		return octal;
	}
	
	
	//Decimal to HexaDecimal Conversion
	public static String decimalToHex(long dec) {
		 StringBuffer hex = new StringBuffer("");
		 while(dec>0) {
			 //Using int here because it does not take long as argument
			 int append = (int)(dec%16);
			 char next = ' ';
			 dec /= 16;
			 switch(append) {
			 case 10: next = 'A';
			 			break;
			 case 11: next = 'B';
						break;
			 case 12: next = 'C';
						break;
			 case 13: next = 'D';
				break;
			 case 14: next = 'E';
				break;
			 case 15: next = 'F';
				break;
			 default: next = String.valueOf(append).charAt(0);
			 }
			 hex.append(next);
		 }
		 hex.reverse();
		 return hex.toString();
	}
	
	
	//Binary To Decimal Conversion
	public static long binaryToDecimal(long bin) {
		long factor = 1;
		long dec = 0;
		while(bin>0) {
			dec = dec + (bin%10) * factor;
			factor *= 2;
			bin /= 10;
		}
		return dec;
	}
	
	
	//Octal To Decimal Conversion
	public static long octalToDecimal(long oct) {
		long factor = 1;
		long dec = 0;
		while(oct>0) {
			dec = dec + (oct%10) * factor;
			factor *= 8;
			oct /= 10;
		}
		return dec;
	}
	
	//HexaDecimal to Decimal Conversion
	public static long hexToDecimal(String hex) {
		hex = hex.toUpperCase();
		long dec = 0;
		long factor = 1;
		for(int i=hex.length()-1;i>=0;i--) {
			char current = hex.charAt(i);
			long num = 0;
			switch(current) {
				case 'A': num = 10;
				break;
				case 'B': num = 11;
				break;
				case 'C': num = 12;
				break;
				case 'D': num = 13;
				break;
				case 'E': num = 14;
				break;
				case 'F': num = 15;
				break;
				default:
					num = Integer.parseInt(current+"");
			}
			dec = dec + num * factor;
			factor *= 16;
		}
		return dec;
	}
	
	
	//Binary to Octal Conversion
	public static long binaryToOctal(long bin) {
		return decimalToOctal(binaryToDecimal(bin));
	}
	
	
	//Binary to HexaDecimal COnversion
	public static String binaryToHex(long bin) {
		return decimalToHex(binaryToDecimal(bin));
	}
	
	
	//Octal to Binary Conversion
	public static long octalToBinary(long oct) {
		return decimalToBinary(octalToDecimal(oct));
	}
	
	
	//Octal to HexaDEcimal Conversion
	public static String octalToHex(long oct) {
		return decimalToHex(octalToDecimal(oct));
	}
	
	
	//HexaDecimal to Binary Conversion
	public static long hexToBinary(String hex) {
		return decimalToBinary(hexToDecimal(hex));
	}
	
	
	//HexaDecimal to Octal Conversion
	public static long hexToOctal(String hex) {
		return decimalToOctal(hexToDecimal(hex));
	}
}