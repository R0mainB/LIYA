package adventure.liya.mgr.com.liya.model;

/**
 * Created by Maxouxou on 03/04/2018.
 */

public class Action {
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

    public Action(){}
    public Action(long id, String description) {
        this.id = id;
        this.description = description;
    }
}
