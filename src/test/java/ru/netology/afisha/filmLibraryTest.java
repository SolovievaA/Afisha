package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filmLibraryTest {
    @Test
    public void testFindAllMovies(){
        filmLibrary manager = new filmLibrary();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);

        String[] expected = {"Бладшот", "Вперёд", "Отель 'Белград'", "Джентельмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAmountMoreThanLimit(){
        filmLibrary manager = new filmLibrary();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Холоп";
        String movie9 = "Бременские музыканты";
        String movie10 = "Последний наемник";
        String movie11 = "Воздух";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        String[] expected = {"Воздух", "Последний наемник", "Бременские музыканты", "Холоп", "Номер один"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAmountEqualLimit(){
        filmLibrary manager = new filmLibrary();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);


        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель 'Белград'", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAmountMoreThanLimit2(){
        filmLibrary manager = new filmLibrary(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Холоп";
        String movie9 = "Бременские музыканты";
        String movie10 = "Последний наемник";
        String movie11 = "Воздух";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        String[] expected = {"Воздух", "Последний наемник", "Бременские музыканты"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAmountLessThanLimit(){
        filmLibrary manager = new filmLibrary();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);


        String[] expected = {"Джентельмены", "Отель 'Белград'", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAmountLessThanLimit2(){
        filmLibrary manager = new filmLibrary(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);

        String[] expected =  {"Джентельмены", "Отель 'Белград'", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}