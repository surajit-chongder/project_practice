package example;

public abstract class ProcessHandler {
    protected ProcessHandler processHandler;
    public void setSuccessor(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }
    abstract public void processRequest(AtmProcessor atmProcessor);
}
