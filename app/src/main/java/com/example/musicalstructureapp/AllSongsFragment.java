package com.example.musicalstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllSongsFragment extends Fragment {


    public AllSongsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);

        final ArrayList<Song> albums = new ArrayList<Song>();
        albums.add(new Song("All My Love", "George Ezra", R.drawable.george_ezra_staying_at_tamara));
        albums.add(new Song("Always in my head", "Coldplay", R.drawable.coldplay_ghost_stories));
        albums.add(new Song("Crawling", "Linkin Park", R.drawable.linkin_park_hybrid_theory));
        albums.add(new Song("Good Guy(feat. Jessie Reyez)", "Eminem", R.drawable.eminem_kamikaze));
        albums.add(new Song("Ink", "Coldplay", R.drawable.coldplay_ghost_stories));
        albums.add(new Song("Kamikaze", "Eminem", R.drawable.eminem_kamikaze));
        albums.add(new Song("Lucky You(feat. Joyner Lucas)", "Eminem", R.drawable.eminem_kamikaze));
        albums.add(new Song("Magic", "Coldplay", R.drawable.coldplay_ghost_stories));
        albums.add(new Song("Ordinary Love", "U2", R.drawable.u2_the_saints_are_comming));
        albums.add(new Song("Papercut", "Linkin Park", R.drawable.linkin_park_hybrid_theory));
        albums.add(new Song("Pon Da Replay", "Rihanna", R.drawable.rihanna_a_girl_like_me));
        albums.add(new Song("SOS", "Rihanna", R.drawable.rihanna_a_girl_like_me));
        albums.add(new Song("The beautiful dream", "George Ezra", R.drawable.george_ezra_staying_at_tamara));
        albums.add(new Song("Vertigo", "U2", R.drawable.u2_the_saints_are_comming));
        albums.add(new Song("With or without you", "U2", R.drawable.u2_the_saints_are_comming));


        SongAdapter adapter = new SongAdapter(getActivity(), albums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
