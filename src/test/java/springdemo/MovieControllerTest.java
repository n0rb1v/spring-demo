package springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MovieControllerTest {

    @Autowired
    MovieController movieController;

    @Test
    void listMovies() {
    }
}