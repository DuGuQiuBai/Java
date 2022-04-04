package day11.Exception;

public class Teacher {
    public void ScoreCheck(int score) throws ScoreException{
        if (score < 0 || score > 100) {
            throw new ScoreException("Score out of range");
        } else {
            System.out.println("Score is good");
        }
    }
}
