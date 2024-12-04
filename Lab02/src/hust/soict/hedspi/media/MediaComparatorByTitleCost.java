/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media t, Media t1) {
        if (t.getTitle().compareTo(t1.getTitle()) !=0 )
        {
            return t.getTitle().compareTo(t1.getTitle());
        }
        else
        {
            return Double.compare(t.getCost(), t1.getCost());
        }    
    }   
    
    

}


