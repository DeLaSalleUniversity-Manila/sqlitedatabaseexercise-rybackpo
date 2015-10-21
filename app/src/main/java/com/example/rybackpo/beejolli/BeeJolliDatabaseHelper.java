package com.example.rybackpo.beejolli;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rybackpo on 10/20/2015.
 */
public class BeeJolliDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "beejolli";
    private static final int DB_VERSION = 1;

    BeeJolliDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        updateDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        updateDatabase(db, oldVersion, newVersion);
    }

    public void updateDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("CREATE TABLE FOODS ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER);");

        insertFoods(db, "Fries", "Small, Medium and Large", R.drawable.image8);
        insertFoods(db, "Burgers", "Something about Burgers", R.drawable.image8);
        insertFoods(db, "Meals", "Something about Meals", R.drawable.image8);
    }



    private static void insertFoods(SQLiteDatabase db, String name, String description, int resourceId){
        ContentValues foodsValues = new ContentValues();
        foodsValues.put("NAME", name);
        foodsValues.put("DESCRIPTION", description);
        foodsValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("FOODS", null, foodsValues);
    }
}
