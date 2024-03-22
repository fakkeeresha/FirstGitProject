
public class Basic_Programs_Naveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(1);
	}
	
	//printing Number without for loop
	
	public static void printNumber(int num) {
		if(num<=100) {
		System.out.println(num);
		num++;
		printNumber(num);
		
		}
	}

}
