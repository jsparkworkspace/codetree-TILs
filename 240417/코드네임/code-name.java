import java.util.Scanner;

class Agent {
    char codeName;
    int score;

    public Agent(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agentList = new Agent[5];

        int lowScore = 0;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            agentList[i] = new Agent(codeName, score);

            if (lowScore > agentList[i].score) {
                lowScore = agentList[i].score;
                index = i;
            }
        }

        System.out.printf("%c %d", agentList[index].codeName, agentList[index].score);

        sc.close();
    }
}