import java.util.Random;
public class RandomQuoteGenerator {
    public static void main(String[] args) {
        // Quotes to choose from
        String[] quotes = {
            "The way to get started is to quit talking and begin doing. - Walt Disney",
            "If life were predictable it would cease to be life, and be without flavor. - Eleanor Roosevelt",
            "If you look at what you have in life, you’ll always have more. - Oprah Winfrey",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "Do not watch the clock. Do what it does. Keep going. - Sam Levenson",
            "You miss 100% of the shots you don’t take. - Wayne Gretzky",
            "Success usually comes to those who are too busy to be looking for it. - Henry David Thoreau",
            "Believe you can and you’re halfway there. - Theodore Roosevelt"
        };
        // Randomly select a quote
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);
        // Print the selected quote
        System.out.println("Here is your random quote:");
        System.out.println(quotes[randomIndex]);
    }
}
