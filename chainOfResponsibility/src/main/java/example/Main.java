package example;

public class Main {
    public static void main(String[] args) {
        AtmProcessor atmProcessor = new AtmProcessor(6550.00);
        FiveHundredRupeesHandler fiveHundredRupeesHandler = new FiveHundredRupeesHandler();
        OneHundredRupeesHandler oneHundredRupeesHandler = new OneHundredRupeesHandler();
        FiftyRupeesHandler fiftyRupeesHandler = new FiftyRupeesHandler();
        fiveHundredRupeesHandler.setSuccessor(oneHundredRupeesHandler);
        oneHundredRupeesHandler.setSuccessor(fiftyRupeesHandler);

        fiveHundredRupeesHandler.processRequest(atmProcessor);

    }
}
