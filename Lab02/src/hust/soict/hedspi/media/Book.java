/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;
import java.util.*;
public class Book extends Media {
    
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, 
            List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    
    public List<String> getAuthors() {
        return authors;
    }
    
    public void setAuthors(List<String> authors) {
        this.authors = authors;
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
    
    

    @Override
    public String toString() {
        return "Book{" + super.toString();
    }
    
    
}
