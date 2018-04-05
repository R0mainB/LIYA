package adventure.liya.mgr.com.liya;

import adventure.liya.mgr.com.liya.dao.database.LIYADatabase;

/**
 * Created by rbonhomme2016 on 05/04/2018.
 */

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        LIYADatabase.getInstance(Application.this);

    }
}
