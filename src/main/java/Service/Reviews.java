package Service;

import Entity.Comment;

import Entity.Movie;
import Entity.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reviews implements serviceAble<Comment> {
    private List<Comment> commentsList = new ArrayList<>();

    public void getAll() {
        Iterator<Comment> iterator = commentsList.iterator();
        while (iterator.hasNext()) {
            Comment element = iterator.next();
            System.out.println(element.toString());
        }
    }

    public void add(Comment comment) {

        commentsList.add(comment);
    }

    public Comment getByMovieName(Movie movie,User user) {

        Iterator<Comment> iterator = commentsList.iterator();
        Comment result = new Comment();
        while (iterator.hasNext()) {
            Comment element = iterator.next();
            if ((element.getMovieId() == movie.getMovieID()) && (element.getUserId() == user.getUserId()) ) {
                result = element;
            }
        }
        return result;
    }

    public void update(int movieId, int userId, String description) {
        Iterator<Comment> iterator = commentsList.iterator();
        while (iterator.hasNext()) {
            Comment element = iterator.next();
            if ((element.getMovieId() == movieId) && (element.getUserId() == userId)) {
                element.setDescription(description);
            }
        }
    }

    public double getRateByMovieID(Movie movie) {
        Iterator<Comment> iterator = commentsList.iterator();
        int amount = 0;
        int sum = 0;
        while (iterator.hasNext()) {
            Comment element = iterator.next();
            if (element.getMovieId() == movie.getMovieID()) {
                sum = sum + element.getRate();
                amount++;
            }
        }
        return sum / amount;
    }
    @Override
    public void delete(Comment comment) {
        commentsList.remove(comment);

    }
    public Comment getById(int userId,int movieId) {
        Comment comment=new Comment();
        Iterator<Comment> iterator = commentsList.iterator();
        while (iterator.hasNext()) {
            Comment element = iterator.next();
        if( (element.getUserId()== userId) && (element.getMovieId()== movieId)){
    comment=element;
            }
        }
        return comment;
    }
}
