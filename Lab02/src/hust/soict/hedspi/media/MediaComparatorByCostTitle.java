/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media t, Media t1) {
        if (Double.compare(t.getCost(), t1.getCost()) !=0 )
        {
            return Double.compare(t.getCost(), t1.getCost());
        }
        else
        {
            return t.getTitle().compareTo(t1.getTitle());
        }
    }  
}
