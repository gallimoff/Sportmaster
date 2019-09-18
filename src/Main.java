public class Main {
    public static void main(String[] args) {
        int totalPurchases = 173_000;
        int currentPurchase = 6_700;
        int bonusBound = 1_000;
        int bonusesPerBound;
        if (totalPurchases >= 150_000) {
            bonusesPerBound = 100;
            System.out.println(currentPurchase / bonusBound * bonusesPerBound);
        } else if (totalPurchases >= 15_001 && totalPurchases <= 150_000) {
            bonusesPerBound = 70;
            System.out.println(currentPurchase / bonusBound * bonusesPerBound);
        } else if (totalPurchases >= 1 && totalPurchases <= 15_000){
            bonusesPerBound = 50;
            System.out.println(currentPurchase / bonusBound * bonusesPerBound);
        }
    }
}