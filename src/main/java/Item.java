
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof Item)) {
            return false;
        }

        // let's convert the object to a Book-object
        Item comparedItem = (Item) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.name.equals(comparedItem.name)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }
    
    public int hashCode() {
        return (this.name.toLowerCase()).hashCode();
    }
    
}
