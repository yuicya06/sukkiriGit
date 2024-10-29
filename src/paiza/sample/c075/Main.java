import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 初期チャージ額を入力
        int initialCharge = scanner.nextInt();
        
        // 利用回数を入力
        int usageCount = scanner.nextInt();
        
        int balance = initialCharge;
        int points = 0;
        
        for (int i = 0; i < usageCount; i++) {
            int fare = scanner.nextInt();
            
            if (points >= fare) {
                // ポイントで支払う場合
                points -= fare;
            } else {
                // 現金で支払う場合
                int cashPayment = fare - points;
                balance -= cashPayment;
                points = 0;
                
                // ポイントを加算
                int newPoints = (int) (cashPayment * 0.1);
                points += newPoints;
            }
            
            // 残高とポイントを出力
            System.out.println(balance + " " + points);
        }
        
        scanner.close();
    }
}