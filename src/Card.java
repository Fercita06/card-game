public class Card {
    public String SPADE = "\u2660";
    public String HEARTS = "\u2661";
    public String DIAMONDS = "\u2662";
    public String CLUBS = "\u2663";

    private String symbol;
    private String value;
    private String suit;

    public Card(String symbol, String value, String suit) {
        this.symbol = symbol;
        this.value = value;
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
