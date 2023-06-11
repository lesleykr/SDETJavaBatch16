package class26;

public class Entry {
    String key;
    Double price;

    public Entry(String key, Double value) {
        this.key = key;
        this.price = value;
    }

    public String getKey() {
        return key;
    }

    public Double getValue() {
        return price;
    }
//When "garbage"/location prints, generate this toString method in the class
    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", price=" + price +
                '}';
    }
}