package algorithm.programmers;

public class Progm_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt1 = 0;
        int cnt2 = 0;
        for(int i : lottos) {
            System.out.println(i);
        }


        return answer;
    }

    public static void main(String args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};


        Progm_77484 pro = new Progm_77484();
        pro.solution(lottos, win_nums);
    }
}
