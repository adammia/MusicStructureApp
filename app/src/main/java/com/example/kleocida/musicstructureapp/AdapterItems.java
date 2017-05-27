package com.example.kleocida.musicstructureapp;

/**
 * Created by Kleocida on 2017. 05. 23..
 */

public class AdapterItems {
    public int ID;
    public String Title;
    public String Artist;

    //for details
    AdapterItems(int ID, String Title, String Artist) {
        this.ID = ID;
        this.Title = Title;
        this.Artist = Artist;
    }
}