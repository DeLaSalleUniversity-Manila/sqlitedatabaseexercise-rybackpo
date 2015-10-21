package com.example.rybackpo.beejolli;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by rybackpo on 10/20/2015.
 */
public class FoodsCategoryActivity extends ListActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listFoods = getListView();
        ArrayAdapter<Foods> listAdapter = new ArrayAdapter<Foods>(this, android.R.layout.simple_list_item_2, Foods.foods);
        listFoods.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int Position, long id){
        Intent intent = new Intent(FoodsCategoryActivity.this, FoodsActivity.class);
        intent.putExtra(FoodsActivity.EXTRA_FOODSNO, (int)id);
        startActivity(intent);
    }
}
