package Level1;

public class Year2016 {

	public static void main(String[] args) {
//		2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
//		두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
//		요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//				입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
//				제한 조건
//				2016년은 윤년입니다.
//				2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//				입출력 예
//				a	b	result
//				5	24	TUE
		
		solution(1, 1);
		

	}
	
	public static String solution(int a, int b) {
		String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int totDay = 0;
		
		for(int i = 0; i < a-1; i++){
			if(a==1) break;
//			System.out.println("i: "+i+" date[i]: "+date[i]);
			totDay+=date[i];
		}
		totDay+=b;
//		System.out.println(totDay);
		
		if(totDay%7==1){
//			System.out.println(day[0]);
			return day[0];
		} else if(totDay%7==2){
//			System.out.println(day[1]);
			return day[1];			
		} else if(totDay%7==3){
//			System.out.println(day[2]);
			return day[2];
		} else if(totDay%7==4){
//			System.out.println(day[3]);
			return day[3];
		} else if(totDay%7==5){
//			System.out.println(day[4]);
			return day[4];
		} else if(totDay%7==6){
//			System.out.println(day[5]);
			return day[5];
		} else if(totDay%7==0){
//			System.out.println(day[6]);
			return day[6];
		}
		
	      String answer = "";
	      return answer;
	  }

}
