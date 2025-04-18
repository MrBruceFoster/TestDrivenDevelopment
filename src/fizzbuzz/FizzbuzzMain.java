package fizzbuzz;

public class FizzbuzzMain {

    public static void main(String[] args) {
    }

    public String fizzbuzz(int i) {
        String returnString;
        if ((i % 15) == 0){
            returnString = "fizzbuzz";
        }
        else if ((i % 3) == 0){
            returnString = "fizz";
        }
        else if ((i % 5) == 0) {
            returnString = "buzz";
        }
        else {
            returnString = String.valueOf(i);
        }
        return returnString;
    }
}