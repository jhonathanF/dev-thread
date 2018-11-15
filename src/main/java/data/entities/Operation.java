package data.entities;

/**
 *
 * @author Jhonathan & Kaue
 */
public abstract class Operation {

    public final static Integer PERECIVEL = 1;
    public final static Integer NORMAL = 0;
    public final static Integer CARGA = 0;
    public final static Integer DESCARGA = 1;

    private String name;
    private Integer time;
    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
