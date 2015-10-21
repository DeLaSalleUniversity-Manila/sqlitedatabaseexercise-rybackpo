package com.example.rybackpo.beejolli;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodsActivity extends Activity {

    public static final String EXTRA_FOODSNO = "foodsNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        int foodNo = (Integer)getIntent().getExtras().get(EXTRA_FOODSNO);
        Foods foods = Foods.foods[foodNo];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(foods.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(foods.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(foods.getImageResourceId());
        photo.setContentDescription(foods.getDescription());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_foods, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
