import java.util.*;

class ProblemSetting {
    private String question;
    private String answer;
    public ProblemSetting(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestion() {
        return question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }
}
class Play {
    ProblemSetting[] p = new ProblemSetting[5];
    public Play() {
        p[0] = new ProblemSetting("What is the time complexity of accessing an element in an array ?",
        "constant");
        p[1] = new ProblemSetting("What type of data structure uses a Last In, First Out (LIFO) approach ?", 
        "stack");
        p[2] = new ProblemSetting("What is the name of the algorithm used for finding the shortest path in a graph ?", 
        "dijkstra");
        p[3] = new ProblemSetting("Which data structure is used for implementing a priority queue ?", 
        "heap");
        p[4] = new ProblemSetting("What is the process of removing duplicates from a collection called ?", 
        "deduplication");
    }
    public void display() {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int i = 1;
        System.out.println();
        ArrayList <String> wrongAns = new ArrayList<>();
        for(ProblemSetting q : p) {
            System.out.println("QUESTION " + i++ + " : "  + q.getQuestion());
            System.out.print("ENTER A 1-WORD ANSWER : ");
            String ans = sc.nextLine().toLowerCase();
            if(ans.equals(q.getAnswer())) {
                score++;
            }
            if(!ans.equals(q.getAnswer())) {
                wrongAns.add(ans);
            }
            System.out.println();
        }
        sc.close();
        System.out.println();
        System.out.println("YOUR TOTAL SCORE IS: " + score);
        System.out.println();
        if(wrongAns.size()!=0) {
            System.out.print("YOUR WRONG ANSWERS: ");
            for(String s : wrongAns) {
                System.out.print(s + " ");
            
            }
            System.out.println();
        }
        if(score<2) {
            System.out.println("BETTER LUCK NEXT TIME!");
        } else if(score>=2 && score<=4) {
            System.out.println("YOU DID WELL!");
        } else {
            System.out.println("EXCELLENT!!");
        }
    }
}
public class Quiz {
    public static void main(String[] args) {
        Play p = new Play();
        p.display();
    }
}