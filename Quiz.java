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
    ProblemSetting[] p = new ProblemSetting[6];
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
        p[5] =  new ProblemSetting("What is the time complexity of a binary search ?", "o(logn)");
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
        int pct = (int)(score*100/p.length);
        if(pct<30) {
            System.out.println("BETTER LUCK NEXT TIME!");
        } else if(pct>30 && pct<=60) {
            System.out.println("YOU CAN DO BETTER!");
        } else if(pct>60 && pct<=90) {
            System.out.println("YOU DID PRETTY WELL");
        } else if(pct>90) {
            System.out.println("EXCELLENT JOB!");
        }
    }
}
public class Quiz {
    public static void main(String[] args) {
        Play p = new Play();
        p.display();
    }
}
