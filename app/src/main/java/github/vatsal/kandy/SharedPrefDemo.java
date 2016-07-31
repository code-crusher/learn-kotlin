package github.vatsal.kandy;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by
 * --Vatsal Bajpai on
 * --31/07/16 at
 * --12:36 PM
 */
public class SharedPrefDemo {

    SharedPreferences sharedPreferences;
    Context context;

    public void editSharedPref() {
        sharedPreferences = context.getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("key", "name");
        editor.apply();
    }
}
