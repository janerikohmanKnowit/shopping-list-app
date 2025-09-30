package com.example.shoppinglist.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingList {
    private String id;
    private String name;
    private List<ShoppingItem> items;

    public ShoppingList() {
        this.id = UUID.randomUUID().toString();
        this.items = new ArrayList<>();
    }

    public ShoppingList(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShoppingItem> getItems() {
        return items;
    }

    public void setItems(List<ShoppingItem> items) {
        this.items = items;
    }

    public void addItem(ShoppingItem item) {
        this.items.add(item);
    }

    public void removeItem(String itemId) {
        this.items.removeIf(item -> item.getId().equals(itemId));
    }

    public int getItemCount() {
        return items.size();
    }
}
