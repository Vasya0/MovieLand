package Service;

import Entity.Movie;

public interface serviceAble<T> {


    public void getAll();

    public void add(T Entity);

    public void delete(T Entity);



}
