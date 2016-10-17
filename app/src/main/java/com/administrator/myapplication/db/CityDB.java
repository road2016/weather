package com.administrator.myapplication.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;

import com.administrator.myapplication.bean.City;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
public class CityDB {

    public static final String CITY_DB_NAME = "city2.db";
    public static final String CITY_TABLE_NAME = "city";
    private SQLiteDatabase db;

    public CityDB(Context context, String path) {
        db = context.openOrCreateDatabase(CITY_DB_NAME, Context.MODE_PRIVATE, null);
    }

    public List<City> getAllCity() {
        List<City> list = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT * from " + CITY_TABLE_NAME, null);

        while (c.moveToNext()) {
            String province = c.getString(c.getColumnIndex("province"));
            String city = c.getString(c.getColumnIndex("city"));
            String number = c.getString(c.getColumnIndex("number"));
            String allPY = c.getString(c.getColumnIndex("allpy"));
            String allFirstPY = c.getString(c.getColumnIndex("allfirstpy"));
            String firstPY = c.getString(c.getColumnIndex("firstpy"));
            City item = new City(province, city, number, firstPY, allPY, allFirstPY);
            list.add(item);
        }
        return list;
    }
/*


    private CityDB openCityDB() {
        String path = "/data"
                + Environment.getDataDirectory().getAbsolutePath()
                + File.separator + getPackageName()
                + File.separator + "databases"
                + File.separator
                + CityDB.CITY_DB_NAME;
        File db = new File(path);
        Log.d("MyApp", path);

        if (!db.exists()) {
            Log.i("MyApp", "数据库不存在");

            try {
                InputStream is = getAssets().open("city.db");
                FileOutputStream fos = new FileOutputStream(db);
                int len = -1;
                byte[] buffer = new byte[1024];
                while ((len = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                    fos.flush();
                }
                fos.close();
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
            return new CityDB(this, path);
        }


    }
*/


}
