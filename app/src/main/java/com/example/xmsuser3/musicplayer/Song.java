package com.example.xmsuser3.musicplayer;

/**
 * Created by XMS User3 on 3/27/2018.
 */

class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

}
