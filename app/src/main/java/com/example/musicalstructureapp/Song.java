package com.example.musicalstructureapp;

public class Song {

    private String mArtistName;

    private String mSongName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Song(String artistName, int imageResourceId) {
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    public Song(String artistName, String songName, int imageResourceId) {
        mArtistName = artistName;
        mSongName = songName;
        mImageResourceId = imageResourceId;
        ;
    }


    public String getArtistName() {
        return mArtistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public int getImageResourceID() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
