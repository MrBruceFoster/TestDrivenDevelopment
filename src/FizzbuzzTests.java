import org.junit.jupiter.api.Test;
import fizzbuzz.Main;

public class FizzbuzzTests {
    private static final Main mainClass = new Main();

    int testInput = 4;

    @Test
    void returnsFizzDivisibleByThree(){
        var test = mainClass.fizzbuzz(testInput);
        assert test.contains("fizz");
    }

    @Test
    void doesNotReturnFizzWhenNotDivisibleByThree() {
        var test = mainClass.fizzbuzz(testInput);
        assert !test.contains("fizz");
    }

    @Test
    void returnsBuzzWhenDivisibleByFive(){
        var test = mainClass.fizzbuzz(testInput);
        assert test.contains("buzz");
    }

    @Test
    void doesNotReturnBuzzWhenNotDivisibleByFive() {
        var test = mainClass.fizzbuzz(testInput);
        assert !test.contains("buzz");
    }

    @Test
    void returnsFizzBuzzWhenDivisibleByFifteen(){
        assert mainClass.fizzbuzz(testInput).contains("fizzbuzz");
    }

    @Test
    void doesNotReturnFizzbuzzWhenNotDivisibleByFifteen(){
        assert !mainClass.fizzbuzz(testInput).contains("fizzbuzz");
    }
}