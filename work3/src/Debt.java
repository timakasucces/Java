class Debt {
    double sum;

    private static Debt debt = new Debt(1);

    static Debt getDebt() {
        return debt;
    }

    private Debt(double initSum) {
        sum = initSum;
    }

//    static double getSum() {
//        return debt.sum;
//    }
//
//    static void setSum(double newSum) {
//        debt.sum = newSum;
//    }
}
