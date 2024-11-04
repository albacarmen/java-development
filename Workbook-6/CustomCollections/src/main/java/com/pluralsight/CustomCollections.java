import com.pluralsight.collection.FixedList;
import com.pluralsight.collection.Potato;

public class CustomCollections {
    public static void main(String[] args) {
        // FixedList 4 Potato types
        FixedList<Potato> potatoList = new FixedList<>(5);

        //  Potato objects
        Potato russet = new Potato("Russet", "Starchy");
        Potato yukonGold = new Potato("Yukon Gold", "Buttery");
        Potato redPotato = new Potato("Red Potato", "Waxy");
        Potato fingerling = new Potato("Fingerling", "Nutty");
        Potato sweetPotato = new Potato("Sweet Potato", "Sweet");

        // Add potatoes to the list
        potatoList.add(russet);
        potatoList.add(yukonGold);
        potatoList.add(redPotato);
        potatoList.add(fingerling);
        potatoList.add(sweetPotato);

        try {
            potatoList.add(new Potato("Blue Potato", "Unique")); // This line should fail
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of items in potato list: " + potatoList.getItems().size());
        System.out.println("Potato list: " + potatoList.getItems());
    }
}

