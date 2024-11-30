/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author admin
 */

import java.util.*;
public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book() {
    }
    
    public void addAuthor (String authorName)
    {
        if ( !authors.contains(authorName))
        {
            authors.add(authorName);
            System.out.println("Successfully added");
        }
        else System.out.println("Already listed");
    }
    
    public void removeAuthor (String authorName)
    {
        if ( authors.contains(authorName))
        {
            authors.remove(authorName);
            System.out.println("Successfully removed");
        }
        else System.out.println("Not on the list");
    }
    
    
}
