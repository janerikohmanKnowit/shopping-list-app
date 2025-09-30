package com.example.shoppinglist.controller;

import com.example.shoppinglist.model.ShoppingList;
import com.example.shoppinglist.service.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShoppingListController {

    @Autowired
    private ShoppingListService shoppingListService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("lists", shoppingListService.getAllLists());
        return "index";
    }

    @GetMapping("/list/{id}")
    public String viewList(@PathVariable String id, Model model) {
        ShoppingList list = shoppingListService.getListById(id);
        if (list == null) {
            return "redirect:/";
        }
        model.addAttribute("list", list);
        return "detail";
    }

    @PostMapping("/list/create")
    public String createList(@RequestParam String listName) {
        if (listName != null && !listName.trim().isEmpty()) {
            shoppingListService.createList(listName.trim());
        }
        return "redirect:/";
    }

    @PostMapping("/list/{id}/delete")
    public String deleteList(@PathVariable String id) {
        shoppingListService.deleteList(id);
        return "redirect:/";
    }

    @PostMapping("/list/{id}/add-item")
    public String addItem(@PathVariable String id, @RequestParam String itemName) {
        if (itemName != null && !itemName.trim().isEmpty()) {
            shoppingListService.addItemToList(id, itemName.trim());
        }
        return "redirect:/list/" + id;
    }

    @PostMapping("/list/{listId}/item/{itemId}/delete")
    public String deleteItem(@PathVariable String listId, @PathVariable String itemId) {
        shoppingListService.removeItemFromList(listId, itemId);
        return "redirect:/list/" + listId;
    }

    @PostMapping("/reset")
    public String resetData() {
        shoppingListService.resetToDefaults();
        return "redirect:/";
    }
}
