
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String answers[] = new String[5];

    public QuestionService() {
        this.questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        this.questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        this.questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        this.questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        this.questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        int score = 0;
        for(Question q : questions){
            System.out.println("Question no : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in); 
            answers[i] = sc.nextLine();
            if(this.questions[i].getAnswer().equals(answers[i])) {
                score++;
            }
            i++;
        }
        System.err.println("you scored : "+score);
    }
}