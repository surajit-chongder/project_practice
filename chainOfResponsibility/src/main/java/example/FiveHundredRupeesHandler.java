package example;

public class FiveHundredRupeesHandler extends ProcessHandler {
    public void processRequest(AtmProcessor atmProcessor) {
        int noOfNotes = (int) (atmProcessor.getAmount() / 500);
        if (noOfNotes != 0) {
            atmProcessor.setAmount(atmProcessor.getAmount() - noOfNotes * 500);
            System.out.println("user get 500 rupees notes " + noOfNotes);
        }
        if (atmProcessor.getAmount() != 0){
            processHandler.processRequest(atmProcessor);
        }
    }
}
