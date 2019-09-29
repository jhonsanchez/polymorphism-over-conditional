package pe.com.sanchez.polymorphismoverconditional;

import pe.com.sanchez.polymorphismoverconditional.bird.Bird;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Bird american = Bird.of("american");
        Bird african = Bird.of("african");
        Bird european = Bird.of("european");

        Stream.of(american, african, european)
                .map(Bird::getSpeed)
                .forEach(System.out::println);
    }
}
