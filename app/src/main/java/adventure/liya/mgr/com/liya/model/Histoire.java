package adventure.liya.mgr.com.liya.model;

/**
 * Created by Maxouxou on 02/04/2018.
 */

public class Histoire {
    private long id;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Histoire(){}
    public Histoire(long id, String description) {
        this.id = id;
        this.description = description;
    }
}
