package ru.netology.afisha;
public class filmLibrary {
    private String[] movies = new String[0];
    private int countMovies;

    public filmLibrary(int countMovies) {
        this.countMovies = countMovies;
    }

    public filmLibrary() {
        countMovies = 5;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (countMovies < movies.length) {
            resultLength = countMovies;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i=0; i < resultLength; i++) {
            result[i] = movies[movies.length - (1 + i)];
        }
        return result;
    }

}
