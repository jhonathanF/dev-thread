package data.entities;

/**
 *
 * @author Jhonathan & Kaue
 */
public class Unloading extends Operation {

    public Unloading() {
        super.setName("Descarga");
        super.setTime(5000);
    }

     public Unloading(Integer type) {
        super.setName("Carga");
        super.setTime(5000);
        super.setType(type);
    }
}
