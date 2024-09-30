import java.util.Scanner;
	public class Calc{
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);

			System.out.println("Enter numbers to sum seperated by '\\n',','");
			String numStr=scanner.nextLine();
			int sum=0;
			int op=0;
			int index=0;
			numStr=numStr.replace("\\n", ",");
			System.out.println(numStr);
			String[] numArr = numStr.split(",");
        for(String s : numArr) {
            System.out.println(s);
        }			for(int i=0;i<numArr.length;i++){
				if(isInteger(numArr[i])){
					op=Integer.parseInt(numArr[i]);
				}else{
				System.out.println("String shouldn't have alphabets and special characters");
				break;
				}
				if(op<0){
				System.out.println("Operands should be positive");

				}else{
				System.out.println(op);
				sum+=op;
				}
			}
			System.out.println("The sum is "+sum);

		
	}
	    public static boolean isInteger(String str) {
		try {
		    Integer.parseInt(str);  
		    return true;  
		} catch (NumberFormatException e) {
		    return false;  
		}
	    }
}