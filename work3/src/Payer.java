class Payer {
    private double fine;

    Payer(double fine) {
        this.fine = fine;
    }

    void inspectorVisit(int day, Debt debt) {
        try {
            Inspector.checkHome(day);
        } catch (NotHomeException e) {
            e.printAiAiAiMessage();
        } finally {
            calculateDebt(debt);
        }
    }

    private void calculateDebt(Debt debt) {
        debt.sum = debt.sum + this.fine;
        this.fine = debt.sum - this.fine;
    }
}
