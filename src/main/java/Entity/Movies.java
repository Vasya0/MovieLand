package Entity;

import Service.Movie;
import Service.serviceAble;

import java.util.*;

public class Movies implements serviceAble<Movie> {




    private List<Movie> movieList = new ArrayList<>();


    //public void add(Movie movie) {
      //  movieList.add(movie);
   // }

    public void update(int id, String description, int year, String nameEng, String nameRus, Double price) {
        Iterator<Movie> iterator = movieList.iterator();
        while (iterator.hasNext()) {
            Movie element = iterator.next();
            if (element.getMovieID() == id) {

                element.setDescription(description);
                element.setYear(year);
                element.setNameENG(nameEng);
                element.setNameRUS(nameRus);
                element.setPrice(price);
            }
        }


    }

    public Movie getMovie(int id) {

        Iterator<Movie> iterator = movieList.iterator();
        Movie movie = new Movie();
        while (iterator.hasNext()) {
            Movie element = iterator.next();
            if (element.getMovieID() == id) {
                movie = element;
            }



        }
        return movie;
    }



    @Override
    public void getAll() {

        Iterator<Movie> iterator = movieList.iterator();

        while (iterator.hasNext()) {

            Movie element = iterator.next();

            System.out.println(element.toString());

        }
    }

    @Override
    public void add(Movie movie) {
        movieList.add(movie);
    }
@Override
    public void delete(Movie movie) {
        movieList.remove(movie);

    }

    public void delete(int id) {

        Iterator<Movie> iterator = movieList.iterator();
        while (iterator.hasNext()) {
            Movie element = iterator.next();
            if (element.getMovieID() == id) {
                System.out.println(element.toString());
                movieList.remove(element);
                break;
            }
        }
    }


}



