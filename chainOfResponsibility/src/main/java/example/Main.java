package example;

public class Main {
    public static void main(String[] args) {
        AtmProcessor atmProcessor = new AtmProcessor(6550.00);
        FiveHundredRupeesHandler fiveHundredRupeesHandler = new FiveHundredRupeesHandler();
        OneHundredRupeesHandler oneHundredRupeesHandler = new OneHundredRupeesHandler();
        FiftyRupeesHandler fiftyRupeesHandler = new FiftyRupeesHandler();
        fiveHundredRupeesHandler.setNextHandler(oneHundredRupeesHandler);
        oneHundredRupeesHandler.setNextHandler(fiftyRupeesHandler);

        fiveHundredRupeesHandler.processRequest(atmProcessor);

    }
}
