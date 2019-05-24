public class Main {
    public static void main(String[] args) {
        Payer payer = new Payer(0);

        for (int day = 2; day <= 365; day++) {
            payer.inspectorVisit(day, Debt.getDebt());
        }
        System.out.println("Долг по прошествии 1 года - " + Debt.getDebt().sum);
    }
}