public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4,20);
        final Item item2 = new Item(3,18);
        final Item item3 = new Item(2,14);
        final Item[] items = {item1, item2, item3};
    }
}

class Item{
    private int weight;
    private int value;

    public Item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight(){
        return value/(double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
