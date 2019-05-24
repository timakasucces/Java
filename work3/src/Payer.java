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
//        Debt.setSum.(Debt.getSum() + fine);
//        fine = Debt.getSum();

        debt.sum = debt.sum + this.fine;
        this.fine = debt.sum - this.fine;
    }
}
