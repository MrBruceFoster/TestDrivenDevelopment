package fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzbuzzTests {
    private static final FizzbuzzMain mainClass = new FizzbuzzMain();

    int testInput = 4;

    @Test
    void returnsFizzDivisibleByThree(){
        var test = mainClass.fizzbuzz(9);
        assert test.contains("fizz");
    }

    @Test
    void doesNotReturnFizzWhenNotDivisibleByThree() {
        var test = mainClass.fizzbuzz(8);
        assert !test.contains("fizz");
    }

    @Test
    void returnsBuzzWhenDivisibleByFive(){
        var test = mainClass.fizzbuzz(10);
        assert test.contains("buzz");
    }

    @Test
    void doesNotReturnBuzzWhenNotDivisibleByFive() {
        var test = mainClass.fizzbuzz(12);
        assert !test.contains("buzz");
    }

    @Test
    void returnsFizzBuzzWhenDivisibleByFifteen(){
        assert mainClass.fizzbuzz(30).contains("fizzbuzz");
    }

    @Test
    void doesNotReturnFizzbuzzWhenNotDivisibleByFifteen(){
        assert !mainClass.fizzbuzz(31).contains("fizzbuzz");
    }
}