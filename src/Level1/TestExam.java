package Level1;

import java.util.ArrayList;

public class TestExam {

	public static void main(String[] args) {
//		수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//		1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//		제한 조건
//		시험은 최대 10,000 문제로 구성되어있습니다.
//		문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//		가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//		입출력 예
//		answers		return
//		[1,2,3,4,5]	[1]
//		[1,3,2,4,2]	[1,2,3]
//		입출력 예 설명
//		입출력 예 #1
//
//		수포자 1은 모든 문제를 맞혔습니다.
//		수포자 2는 모든 문제를 틀렸습니다.
//		수포자 3은 모든 문제를 틀렸습니다.
//		따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
//
//		입출력 예 #2
//
//		모든 사람이 2문제씩을 맞췄습니다.
		int[] answers = {1, 2, 3, 4, 5};
		System.out.println(solution(answers));
		for(int i : solution(answers)){
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[] answers) {
        
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
        int supo1Cnt = 0;
        int supo2Cnt = 0;
        int supo3Cnt = 0;
        
        //{1,2,3,4,5,1}
        for(int i = 0 ; i < answers.length; i++){
//        	System.out.println(i);
        	if(supo1[i%5]==answers[i]){
//        		System.out.println("수포1 정답!");
        		supo1Cnt++;
        	}
        	if(supo2[i%8]==answers[i]){
//        		System.out.println("수포2 정답!");
        		supo2Cnt++;
        	}
        	if(supo3[i%10]==answers[i]){
//        		System.out.println("수포3 정답!");
        		supo3Cnt++;
        	}
        }
        
//        System.out.println(supo1Cnt);
//        System.out.println(supo2Cnt);
//        System.out.println(supo3Cnt);
        
        ArrayList<Integer> answer = new ArrayList<>();

        if(supo1Cnt==supo2Cnt && supo2Cnt==supo3Cnt){
        	//동점인경우
        	answer.add(1);
        	answer.add(2);
        	answer.add(3);
        } else if(supo1Cnt==supo2Cnt && supo1Cnt>supo3Cnt){
        	//1,2가 동점이고, 3이 젤 작은 경우
        	answer.add(1);
        	answer.add(2);
        } else if(supo2Cnt==supo3Cnt && supo2Cnt>supo1Cnt){
        	//2,3이 동점이고, 1이 젤 작은 경우
        	answer.add(2);
        	answer.add(3);
        } else if(supo1Cnt==supo3Cnt && supo1Cnt>supo2Cnt){
        	//1,3이 동점이고, 2가 젤 작은 경우
        	answer.add(1);
        	answer.add(3);
        } else if(supo1Cnt>supo2Cnt && supo1Cnt>supo3Cnt){
        	//1이 가장 큰 경우
        	answer.add(1);
        } else if(supo2Cnt>supo1Cnt && supo2Cnt>supo3Cnt){
        	//2이 가장 큰 경우
        	answer.add(2);
        } else if(supo3Cnt>supo1Cnt && supo3Cnt>supo2Cnt){
        	//3이 가장 큰 경우
        	answer.add(3);
        }
        
        int[] ans = new int[answer.size()];
        
        int size = 0;
        for(int answ : answer){
        	ans[size++] = answ;
        }
        return ans;
    }

}
