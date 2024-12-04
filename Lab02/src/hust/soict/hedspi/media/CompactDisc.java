/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;
import java.util.*;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;


    public String getArtist() {
        return artist;
    }
    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public CompactDisc( int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    
    
    
    public CompactDisc(int id, String title, String category, float cost, int length, 
            String director, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }
    public void addTrack( Track tck){
        if ( tracks.contains(tck)){
            System.out.println("Already in the list!");}
        else{
            tracks.add(tck);
            System.out.println("Successfully added!");}
    }
    public void removeTrack( Track tck){
        if ( tracks.contains(tck)){
            tracks.remove(tck);
            System.out.println("Successfully removed");}
        else{
            System.out.println("Not on the list!");}
    }
    @Override
    public int getLength(){
        int lengthSum = 0;
        for ( Track x : tracks){
            lengthSum += x.getLength();
        }
        return lengthSum;
    }   
    @Override
    public void play() {
        for ( Track x : tracks)
        {
            x.play();
        }
    }

    @Override
    public String toString() {
        return "CompactDisc{" + super.toString();
    }
    
}
