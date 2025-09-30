package com.example.shoppinglist.service;

import com.example.shoppinglist.model.ShoppingItem;
import com.example.shoppinglist.model.ShoppingList;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ShoppingListService {
    
    private Map<String, ShoppingList> shoppingLists = new ConcurrentHashMap<>();

    @PostConstruct
    public void initialize() {
        loadDefaultData();
    }

    public void loadDefaultData() {
        shoppingLists.clear();

        // List 1: Grocery List Friday
        ShoppingList groceries = new ShoppingList("Grocery List Friday");
        groceries.addItem(new ShoppingItem("Milk"));
        groceries.addItem(new ShoppingItem("Bread"));
        groceries.addItem(new ShoppingItem("Eggs"));
        groceries.addItem(new ShoppingItem("Cheese"));
        groceries.addItem(new ShoppingItem("Apples"));
        shoppingLists.put(groceries.getId(), groceries);

        // List 2: Weekend Party
        ShoppingList party = new ShoppingList("Weekend Party");
        party.addItem(new ShoppingItem("Chips"));
        party.addItem(new ShoppingItem("Soda"));
        party.addItem(new ShoppingItem("Pizza"));
        party.addItem(new ShoppingItem("Ice Cream"));
        party.addItem(new ShoppingItem("Paper Plates"));
        party.addItem(new ShoppingItem("Napkins"));
        shoppingLists.put(party.getId(), party);

        // List 3: School Start Clothes
        ShoppingList school = new ShoppingList("School Start Clothes");
        school.addItem(new ShoppingItem("Backpack"));
        school.addItem(new ShoppingItem("Notebooks"));
        school.addItem(new ShoppingItem("Pencils"));
        school.addItem(new ShoppingItem("Lunch Box"));
        school.addItem(new ShoppingItem("Gym Shoes"));
        shoppingLists.put(school.getId(), school);

        // List 4: Hardware Store
        ShoppingList hardware = new ShoppingList("Hardware Store");
        hardware.addItem(new ShoppingItem("Nails"));
        hardware.addItem(new ShoppingItem("Hammer"));
        hardware.addItem(new ShoppingItem("Paint"));
        hardware.addItem(new ShoppingItem("Brushes"));
        hardware.addItem(new ShoppingItem("Screwdriver"));
        shoppingLists.put(hardware.getId(), hardware);
    }

    public List<ShoppingList> getAllLists() {
        return new ArrayList<>(shoppingLists.values());
    }

    public ShoppingList getListById(String id) {
        return shoppingLists.get(id);
    }

    public ShoppingList createList(String name) {
        ShoppingList newList = new ShoppingList(name);
        shoppingLists.put(newList.getId(), newList);
        return newList;
    }

    public void deleteList(String id) {
        shoppingLists.remove(id);
    }

    public void addItemToList(String listId, String itemName) {
        ShoppingList list = shoppingLists.get(listId);
        if (list != null) {
            list.addItem(new ShoppingItem(itemName));
        }
    }

    public void removeItemFromList(String listId, String itemId) {
        ShoppingList list = shoppingLists.get(listId);
        if (list != null) {
            list.removeItem(itemId);
        }
    }

    public void resetToDefaults() {
        loadDefaultData();
    }
}
