package techacademy.saitou.junki.taskapp;

/**
 * Created by junki on 2018/06/03.
 */
import android.app.Application;

import io.realm.Realm;
import io.realm.annotations.PrimaryKey;

public class TaskApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
