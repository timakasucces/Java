public class Main {
    public static void main(String[] args) {
        Payer payer = new Payer(0);
        double debtSum = Debt.getDebt().sum;

        for (int day = 2; day <= 365; day++) {
            payer.inspectorVisit(day, Debt.getDebt());
            debtSum = Debt.getDebt().sum;
        }
        System.out.println(Debt.getDebt().sum);
    }
}