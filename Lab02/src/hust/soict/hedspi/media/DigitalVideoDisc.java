
package hust.soict.hedspi.aims.media;
import java.util.*;
public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(int id, String title, String category, float cost,
            int length, String director) {
        super(id, title, category, cost, length, director);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        nbDigitalVideoDiscs++;
    }
    @Override
    public void play() 
    { 
        System.out.println("Playing DVD: " + this.getTitle()); 
        System.out.println("DVD length: " + this.getLength()); 
    } 

    @Override
    public String toString() {
        return "DigitalVideoDisc{" + super.toString();
    }
    
    
    
}

