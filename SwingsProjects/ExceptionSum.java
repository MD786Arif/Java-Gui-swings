package SwingsProjects;

public class ExceptionSum extends Exception {

    @Override
    public String toString() {
        return "Enter the other number ";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
