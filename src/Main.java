public class Main {
    public static void main(String[] args) {
        int goldClubCard = 150_000;
        int silverClubCard = 15_001;
        int blueClubCard = 1;
        int totalPurchases = 173_000;
        int currentPurchase = 6_700;
        int bonusBound = 1_000;
        int bonusesPerBound;
        if (totalPurchases >= goldClubCard){
            bonusesPerBound = 100;
            System.out.println(currentPurchase / bonusBound * bonusesPerBound);
        } else if (totalPurchases >= silverClubCard && totalPurchases <= goldClubCard) {
            bonusesPerBound = 70;
            System.out.println(currentPurchase / bonusBound * bonusesPerBound);
        } else if (totalPurchases >= blueClubCard && totalPurchases < silverClubCard){
            bonusesPerBound = 50;
            System.out.println(currentPurchase / bonusBound * bonusesPerBound);
        }
    }
}