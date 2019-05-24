class NotHomeException extends Exception {
    private int day;

    void printAiAiAiMessage() {
        System.out.println("Ай-ай-ай! День " + this.day);
    }

    NotHomeException(int day) {
        this.day = day;
    }
}