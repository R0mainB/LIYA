package adventure.liya.mgr.com.liya.model;

import java.util.List;

/**
 * Created by Maxouxou on 02/04/2018.
 */

public class Chapitre {
    private long id;
    private String description;
    private List<Action> actions;

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


    public Chapitre(){}

    public Chapitre(long id, String description) {
        this.id = id;
        this.description = description;
    }
}
