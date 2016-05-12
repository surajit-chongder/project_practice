package example;

public class FiftyRupeesHandler extends ProcessHandler {
    public void processRequest(AtmProcessor atmProcessor) {
        int noOfNotes = (int) (atmProcessor.getAmount() / 50);
        if (noOfNotes != 0) {
            System.out.println("user get 50 rupees notes " + noOfNotes);
        } else {
            System.out.println("enter a valid amount");
        }
    }
}
