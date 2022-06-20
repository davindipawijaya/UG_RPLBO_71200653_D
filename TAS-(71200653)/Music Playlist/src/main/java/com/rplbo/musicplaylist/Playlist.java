package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private static ArrayList<Song> songs;
    private static int count;

    public Playlist(){
        songs = new ArrayList<>();
        count = 6;
    }

    public String getPlaylistName(){
        return playlistName;
    }

    public static void print(){
        System.out.println("Jumlah Lagu = "+songs.size()+" / Kapasitas Playlist = "+count);
        for(int i=0; i<songs.size(); i++){
            System.out.println("ListSong["+i+"] : "+songs.get(i).getName()+" - "+songs.get(i).getArtist());
        }
        System.out.println();
    }

    public void setPlayListName(String playlistname){
        this.playlistName = playlistname;
    }

    public String totalTime(){
        int total = 0;
        for(int i=0; i<songs.size(); i++){
            total += songs.get(i).getLength();
        }
        return "Total waktu [Favorite] = " + Integer.toString(total) + " detik";
    }

    public void add(Song s){
        if(songs.size() < count){
            songs.add(s);
        }else{
            System.out.println("Playlist Favorite penuh!. Tidak bisa menambah lagu lagi.");
        }
    }

    public Song remove(String name){
        Song s = null;
        int index = -1;
        for(int i=0; i<songs.size(); i++){
            if(songs.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }

        if(index != -1){
            s = songs.get(index);
            System.out.println(s.getName()+" terhapus...");
            songs.remove(index);
        }

        return s;
    }

    public int size(){
        return songs.size();
    }
}
