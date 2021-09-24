package ch06;

/* 자바7 이후의 예외적인 리터럴 초기화*/
public class LiteralEx7Exam {
	public static void main(String[] args) {
		
		//사용 예
		int price = 20_100;  // 20100과 동일
		long cardNumer = 1234_5678_1357_9998L; //1234567813579998L과 동일
		long controlBits = 0b10110100_01011011_10110011_11111000;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2_______5;  // 25와 동일
		
		//허용되지 않는 4가지 경우
		//int x = 15; 			//오류, 리터럴 끝에 사용할 수 없음
		//double pi = 3_.14 	// 오류, 소수점(.) 앞뒤에 사용할 수 없음
		//long idNum = 981231_1234567_L;	// _L(_F) 앞에 사용할 수 없음
		//int y = 0_x15;  		//오류, 0x 중간이나 끝에 사용할 수 없다
		
	}
}
