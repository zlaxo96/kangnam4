package ch05_Dowhile;

public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c+1);
			System.out.println(c);
			
		}while(c<='z');
		
		
	}

}
