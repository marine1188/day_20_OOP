package quiz;
import java.util.Random;
public class Quiz_02_lotto {
	//로또 프로그램 
	/*
	 1~45 까지 6개 숫자 추출 (단, 같은 수 없어야함 
	 */	
		public static int lotto_num() {
			
			Random ran = new Random();
			
			for (int i = 0; i < 7; i++) {
				
				
				System.out.print(ran.nextInt(45)+1+"\t");
				
			}
			return 0;
			
		}
	
		public static void main(String[] args) {
			lotto_num();
		}
}
