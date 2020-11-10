package jp.ac.uryukyu.ie.nakarx;

public class EvalScore {
    public static char eval(int score){
        char answer = 'G';
        if(score >=90){
            answer = 'A';
        } else if(score >= 80){
            answer = 'B';
        } else if(score >= 70){
            answer = 'C';
        } else if(score >= 60){
            answer = 'D';
        } else {
            answer = 'F';
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] scores= {100,70,50};
        for(int i : scores){
            System.out.println(i + " -> " +eval(i));
        }
    }
}