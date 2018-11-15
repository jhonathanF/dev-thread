package data.entities;

import views.Harbor;

/**
 *
 * @author Jhonathan & Kaue
 */
public class Ship implements Runnable {

    private String name;
    private Operation operation;
    private Thread thrd;
    private Harbor harbor;

    public Ship() {
    }

    @Override
    public void run() {
        this.harbor.operation(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Thread getThrd() {
        return thrd;
    }

    public void setThrd(Thread thrd) {
        this.thrd = thrd;
    }

    public Harbor getHarbor() {
        return harbor;
    }

    public void setHarbor(Harbor harbor) {
        this.harbor = harbor;
    }

}
