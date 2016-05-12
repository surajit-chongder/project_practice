package example;

public class OneHundredRupeesHandler extends ProcessHandler{
    public void processRequest(AtmProcessor atmProcessor) {
        int noOfNotes = (int) (atmProcessor.getAmount() / 100);
        if (noOfNotes != 0){
            atmProcessor.setAmount(atmProcessor.getAmount() - noOfNotes * 100);
            System.out.println("user get 100 rupees notes "+noOfNotes);
        }
        if (atmProcessor.getAmount() != 0){
            processHandler.processRequest(atmProcessor);
        }
    }
}
