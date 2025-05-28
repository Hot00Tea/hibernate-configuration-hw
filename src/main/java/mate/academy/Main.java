package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    private static final String DAO_PATH = "mate.academy.dao";

    public static void main(String[] args) {

        Injector injector = Injector.getInstance(DAO_PATH);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
    }
}
