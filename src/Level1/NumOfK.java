package Level1;

public class NumOfK {

	public static void main(String[] args) {
//		배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//		예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//		array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//		1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//		2에서 나온 배열의 3번째 숫자는 5입니다.
//		배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//		제한사항
//		array의 길이는 1 이상 100 이하입니다.
//		array의 각 원소는 1 이상 100 이하입니다.
//		commands의 길이는 1 이상 50 이하입니다.
//		commands의 각 원소는 길이가 3입니다.
//		입출력 예
//		array					commands							return
//		[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
//		입출력 예 설명
//		[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
//		[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
//		[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
		
		int[] 	array = {1, 5, 2, 6, 3, 7, 4};
		int[][]	commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	}
	
	public static int[] solution(int[] array, int[][] commands) {

		//시작점 2, 끝점 5, 정렬후 3번째수
//		int str = 2;
//		int end = 5;
//		int k =3;
		
        int[] answer = new int[commands.length];
		
		for(int i=0; i< commands.length; i++){
//			System.out.println("YEAH!: " + sort(array, commands[i][0], commands[i][1], commands[i][2]));
			answer[i] = sort(array, commands[i][0], commands[i][1], commands[i][2]);
//			System.out.println("kkkk "+ answer[i]);
		}
		
        return answer;
    }
	
	public static int sort(int[] array, int str, int end, int k){
		
		//배열자르기
		int[] arr = new int[end-str+1];
		for(int i=0; i<end-str+1; i++){
			arr[i] = array[str-1+i];
//			System.out.println(arr[i]);
		}
		
		int temp = 0;
		
		//정렬
		for(int i = 0; i<end-str+1; i++){
			for(int j = 0; j<end-str; j++){
				if(arr[j]>arr[j+1]){
					temp 	= arr[j];
					arr[j] 	= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
//		System.out.println("====정렬결과====");
//		
//		for(int i=0; i<end-str+1; i++){
//			System.out.println(arr[i]);
//		}
//		System.out.println("============");
		
//		System.out.println(arr[k-1]);
		
		return arr[k-1];
	}

}
