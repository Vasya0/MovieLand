package Service;

import Entity.Comments;
import Entity.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Raitings {
    private List<Comments> commentsList = new ArrayList<>();

    public void getAll() {
        Iterator<Comments> iterator = commentsList.iterator();
        while (iterator.hasNext()) {
            Comments element = iterator.next();
            System.out.println(element.toString());
        }
    }

    public void add(Comments comment) {

        commentsList.add(comment);
    }
    public Comments getByMovieName(Movie movie){

        Iterator<Comments> iterator = commentsList.iterator();
        Comments result=new Comments();
        while (iterator.hasNext()) {
            Comments element = iterator.next();
            if( element.getMovieId()== movie.getMovieID()){
            result=element;
            }
        }
        return result;
    }




}
