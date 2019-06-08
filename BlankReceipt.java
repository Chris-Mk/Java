public class BlankReceipt {
    private static void printReceiptHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    private static void printReceiptBody() {
        System.out.println("Charged to______________________________");
        System.out.println("Received by______________________________");
    }

    private static void printReceiptFooter() {
        System.out.println("------------------------------");
        System.out.println("(c) SoftUni");
    }

    private static void printReceipt() {
        printReceiptHeader();
        printReceiptBody();
        printReceiptFooter();
    }

    public static void main(String[] args) {
        printReceipt();
    }
}
