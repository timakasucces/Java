class Debt {
    double sum;

    private static Debt debt = new Debt(1);

    static Debt getDebt() {
        return debt;
    }

    private Debt(double initSum) {
        sum = initSum;
    }
}
