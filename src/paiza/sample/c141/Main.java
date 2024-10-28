package paiza.sample.c141;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //System.out.print("クラスの人数 N を入力してください: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // 改行を消費
        
        Map<String, Integer> votes = new HashMap<>();
        
        // 投票を集計
        for (int i = 0; i < N; i++) {
           // System.out.print("投票 " + (i+1) + ": ");
            String vote = scanner.nextLine();
            votes.put(vote, votes.getOrDefault(vote, 0) + 1);
        }
        
        // 最多得票者を見つける
        String representative = "";
        int maxVotes = 0;
        
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                representative = entry.getKey();
            }
        }
        
        System.out.println(representative);
        
        scanner.close();
    }
}