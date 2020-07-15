package patterns.behavioral.templateMethod;

public abstract class LogTemplate {

    public void createLog() {
        this.getBeforeTime();
        System.out.println("Logging");
        this.getAfterTime();
    };

    protected abstract void getBeforeTime();
    protected abstract void getAfterTime();
}
