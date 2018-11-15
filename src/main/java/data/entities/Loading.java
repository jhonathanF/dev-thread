package data.entities;

/**
 *
 * @author Jhonathan & Kaue
 */
public class Loading extends Operation {

    public Loading() {
        super.setName("Carga");
        super.setTime(10000);
    }

    public Loading(Integer type) {
        super.setName("Carga");
        super.setTime(10000);
        super.setType(type);
    }

}
