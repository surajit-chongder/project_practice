package example;

public abstract class ProcessHandler {
    protected ProcessHandler processHandler;
    public void setNextHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }
    abstract public void processRequest(AtmProcessor atmProcessor);
}
