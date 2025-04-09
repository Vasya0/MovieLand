package Service;

import Entity.Comment;
import Entity.Movie;
import Entity.Rating;
import Entity.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Raitings implements serviceAble<Rating> {
    private List<Rating> raitingsList = new ArrayList<>();

    @Override
    public void getAll() {
        Iterator<Rating> iterator = raitingsList.iterator();
        while (iterator.hasNext()) {
            Rating element = iterator.next();

        }
    }

    @Override
    public void add(Rating rating) {
        raitingsList.add(rating);
    }

    @Override
    public void delete(Rating rating) {
        raitingsList.remove(rating);

    }

    public Rating getByMovieName(Movie movie) {
        Iterator<Rating> iterator = raitingsList.iterator();
        Rating result = new Rating();
        while (iterator.hasNext()) {
            Rating element = iterator.next();
            if (element.getMovieId() == movie.getMovieID()) {
                result = element;
            }
        }
        return result;
    }
}
