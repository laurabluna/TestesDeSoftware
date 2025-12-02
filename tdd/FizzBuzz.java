
public class FizzBuzz implements InterfaceFizzBuzz {
    
    @Override
    public String answer(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        }
        
        if (number % 3 == 0) {
            return "fizz";
        }
        
        if (number % 5 == 0) {
            return "buzz";
        }
        
        return String.valueOf(number);
    }
    

    public static void main(String[] args) {
        FizzBuzz game = new FizzBuzz();
        
        System.out.println("=== Jogo FizzBuzz (1-30) ===\n");
        
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " -> " + game.answer(i));
        }
    }
}