package Version1.Entity;//package Service;
//
//import Entity.Movies;
//import Entity.Raitings;
////import Entity.Reviews;
//import Entity.Users;
@Deprecated
public class ServiceCache {
//
////    public Movies initFilms() {
////
//////        Movies movies = new Movies();
//////        //countries and genres
//////        Country USA = new Country(1, "USA");
//////        Country Canada = new Country(2, "Canada");
//////        Country GreatBritain = new Country(3, "GreatBritain");
//////        Genre Thriller = new Genre(1, "Thriller");
//////        Genre Drama = new Genre(2, "Drama");
//////        Genre Crime = new Genre(3, "Crime");
//////        Genre Fantasy = new Genre(4, "Fantasy");
//////        Genre Action = new Genre(5, "Action");
//////        Genre Detective = new Genre(5, "Detective");
//////        //movie 1
//////        List<Genre> genresShowshank = new ArrayList<>();
//////        genresShowshank.add(Drama);
//////        List<Country> countriesShowhank = new ArrayList<>();
//////        countriesShowhank.add(USA);
//////        Movie movie1 = new Movie(1, "Побег из Шоушенка", "The Shawshank Redemption", countriesShowhank, genresShowshank, 1994,
//////                "Страх - это кандалы. Надежда - это свобода", 25);
//////        //movie 2
//////        List<Genre> genresGodfather = new ArrayList<>();
//////        genresGodfather.add(Crime);
//////        List<Country> countriesGodfather = new ArrayList<>();
//////        countriesGodfather.add(USA);
//////        Movie movie2 = new Movie(2, "The Godfather", "Крестный отец", countriesGodfather, genresGodfather, 1972, "Настоящая сила не может быть дана, она может быть", 6);
//////        //movie 3
//////        List<Genre> genresGodfather2 = new ArrayList<>();
//////        genresGodfather2.add(Crime);
//////        genresGodfather2.add(Drama);
//////        List<Country> countriesGodfather2 = new ArrayList<>();
//////        countriesGodfather2.add(USA);
//////        Movie movie3 = new Movie(3, "Крестный отец 2", "The Godfather: Part II", countriesGodfather2, genresGodfather2, 1974, "All the power on earth cant change destiny", 13);
//////        //movie 4
//////        List<Genre> genresDarkKnight = new ArrayList<>();
//////        genresDarkKnight.add(Crime);
//////        genresDarkKnight.add(Drama);
//////        genresDarkKnight.add(Action);
//////        genresDarkKnight.add(Fantasy);
//////        genresDarkKnight.add(Thriller);
//////        List<Country> countriesDarkKnight = new ArrayList<>();
//////        countriesDarkKnight.add(USA);
//////        countriesDarkKnight.add(GreatBritain);
//////        Movie movie4 = new Movie(4, "Темный рыцарь", "The Dark Knight", countriesDarkKnight, genresDarkKnight, 2008, "Добро пожаловать в мир Хаоса", 185);
//////        //movie 5
//////        List<Genre> genresAngryMen = new ArrayList<>();
//////        genresAngryMen.add(Crime);
//////        genresAngryMen.add(Drama);
//////        genresAngryMen.add(Detective);
//////        List<Country> countriesAngryMen = new ArrayList<>();
//////        countriesAngryMen.add(USA);
//////        Movie movie5 = new Movie(5, "12 разгневанных мужчин", "12 Angry Men", countriesAngryMen, genresAngryMen, 1956, "they have twelve scraps of paper twelve chances", 34);
//////        //movie 6
//////        List<Genre> genresGreenMile = new ArrayList<>();
//////        genresGreenMile.add(Crime);
//////        genresGreenMile.add(Drama);
//////        genresGreenMile.add(Fantasy);
//////        List<Country> countriesGreenMile = new ArrayList<>();
//////        countriesGreenMile.add(USA);
//////        Movie movie6 = new Movie(6, "Зеленая миля", "The Green Mile", countriesGreenMile, genresGreenMile, 1999, "Пол Эджкомб не верил в чудеса. Пока не столкнулся", 90);
//////
//////
//////        movies.add(movie1);
//////        movies.add(movie2);
//////        movies.add(movie3);
//////        movies.add(movie4);
//////        movies.add(movie5);
//////        movies.add(movie6);
//////        return movies;
////return;
////    }
//
//    public Users initUsers() {
//        Users users = new Users();
//
//        User user1 = new User(1, "Admin", "admin1@gmail.com", "pass1");
//        User user2 = new User(2, "watcher", "admin2@gmail.com", "pass2");
//        User user3 = new User(3, "observer", "observer@gmail.com", "pass3");
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//
//        return users;
//
//    }
//
////    public Reviews initReview() {
////
////        Reviews reviews = new Reviews();
////comments adding
////        Comment com1Movie1 = new Comment(1, 1, "nice movie", 9);
////        Comment com2Movie1 = new Comment(1, 2, "not nice movie", 8);
////        Comment com3Movie1 = new Comment(1, 3, "can be better", 6);
////        Comment com4Movie2 = new Comment(2, 2, "nice movie", 9);
////        Comment com5Movie3 = new Comment(3, 1, "not nice movie", 8);
////        Comment com6Movie4 = new Comment(4, 2, "can be better", 7);
////        Comment com7Movie5 = new Comment(5, 2, "nice movie", 9);
////        Comment com8Movie6 = new Comment(6, 1, "not nice movie", 5);
////        Comment com9Movie3 = new Comment(3, 2, "can be better", 7);
////        Comment com10Movie2 = new Comment(2, 3, "can be better", 6);
//
////        reviews.add(com1Movie1);
////        reviews.add(com2Movie1);
////        reviews.add(com3Movie1);
////        reviews.add(com4Movie2);
////        reviews.add(com5Movie3);
////        reviews.add(com6Movie4);
////        reviews.add(com7Movie5);
////        reviews.add(com8Movie6);
////        reviews.add(com9Movie3);
////        reviews.add(com10Movie2);
//        //return reviews;
//    }
//
//    public Raitings initRatings(Reviews reviews, Movies movies) {
//        Raitings raitings = new Raitings();
//
//        //Raitings
//        Rating ratingMovie1 = new Rating(1, reviews.getRateByMovieID(movies.getMovie(1)));
//        Rating ratingMovie2 = new Rating(2, reviews.getRateByMovieID(movies.getMovie(2)));
//        Rating ratingMovie3 = new Rating(3, reviews.getRateByMovieID(movies.getMovie(3)));
//        Rating ratingMovie4 = new Rating(4, reviews.getRateByMovieID(movies.getMovie(4)));
//        Rating ratingMovie5 = new Rating(5, reviews.getRateByMovieID(movies.getMovie(5)));
//        Rating ratingMovie6 = new Rating(6, reviews.getRateByMovieID(movies.getMovie(6)));
//        ratingMovie1.setIMDb(9.3);
//        ratingMovie2.setIMDb(8.7);
//        ratingMovie3.setIMDb(8.5);
//        ratingMovie4.setIMDb(8.5);
//        ratingMovie5.setIMDb(8.5);
//        ratingMovie6.setIMDb(8.6);
//
//        raitings.add(ratingMovie1);
//        raitings.add(ratingMovie2);
//        raitings.add(ratingMovie3);
//        raitings.add(ratingMovie4);
//        raitings.add(ratingMovie5);
//        raitings.add(ratingMovie6);
//        return raitings;
//    }
//
}
