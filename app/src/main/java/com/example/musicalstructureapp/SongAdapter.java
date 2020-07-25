package com.example.musicalstructureapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Song currentSong = getItem(position);

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentSong.getArtistName());


        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentSong.getSongName());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentSong.hasImage()) {
            imageView.setImageResource(currentSong.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }

}
