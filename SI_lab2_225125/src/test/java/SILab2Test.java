import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void checkCartEveryBranch() {
        List<Item> allItems1 = null;
        List<Item> allItems2 = new ArrayList<Item>();
        List<Item> allItems3 = new ArrayList<Item>();
        List<Item> allItems4 = new ArrayList<Item>();
        List<Item> allItems5 = new ArrayList<Item>();

        Item item2 = new Item("", null, 160, 10);
        Item item3 = new Item("Кафе", "kafe", 160, 10);
        Item item4 = new Item("Кафе", "0123456789", 160, 10);
        Item item5 = new Item("Кафе", "0123456789", 160, 0);


        allItems2.add(item2);
        allItems3.add(item3);
        allItems4.add(item4);
        allItems5.add(item5);

        RuntimeException ex1;
        RuntimeException ex2;
        RuntimeException ex3;

        ex1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(allItems1, 160));
        assertTrue(ex1.getMessage().contains("allItems list can't be null!"));


        ex2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(allItems2, 160));
        assertTrue(ex2.getMessage().contains("No barcode!"));

        ex3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(allItems3, 160));
        assertTrue(ex3.getMessage().contains("Invalid character in item barcode!"));

        assertFalse(SILab2.checkCart(allItems4, 150));

        assertTrue(SILab2.checkCart(allItems5, 190));

    }

    @Test
    void MultipleCondition() {

        List<Item> allItems1 = new ArrayList<Item>();
        List<Item> allItems2 = new ArrayList<Item>();
        List<Item> allItems3 = new ArrayList<Item>();
        List<Item> allItems4 = new ArrayList<Item>();

        Item item1 = new Item("Кафе", "0123456789", 330, 1);
        Item item2 = new Item("Кафе", "123456789", 330, 1);
        Item item3 = new Item("Кафе", "0123456789", 330, 0);
        Item item4 = new Item("Кафе", "0123456789", 300, 0);

        allItems1.add(item1);
        allItems2.add(item2);
        allItems3.add(item3);
        allItems4.add(item4);

        assertTrue(SILab2.checkCart(allItems1, 300));
        assertFalse(SILab2.checkCart(allItems2, 300));
        assertFalse(SILab2.checkCart(allItems3, 300));
        assertFalse(SILab2.checkCart(allItems4, 200));
    }
}