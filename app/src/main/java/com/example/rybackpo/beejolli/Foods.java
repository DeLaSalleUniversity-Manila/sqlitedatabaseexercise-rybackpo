package com.example.rybackpo.beejolli;

/**
 * Created by rybackpo on 10/20/2015.
 */
public class Foods {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Foods[] foods = {
            new Foods("Fries", "Small, Medium and Large", R.drawable.image8),
            new Foods("Burgers", "Something about Burgers", R.drawable.image8),
            new Foods("Meals", "Something about Meals", R.drawable.image8)
    };

    private Foods(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
