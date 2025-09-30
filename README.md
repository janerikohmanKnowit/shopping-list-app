# 🛒 Shopping List Manager

A demonstration Java web application with intentionally retro 2005-style UI, perfect for showcasing LLM-assisted development and modernization exercises.

## Project Overview
This project was created in full by an LLM, in this case Claude 4.5 was used to generate all code, documentation, and configuration.
The initial project structure and basic functionality were established by the LLM, providing a solid foundation for further development and enhancement.  
You can view the original prompt given to the LLM in [initial-prompt.txt](./initial-prompt.txt).



## 📋 Features

- ✅ View multiple shopping lists
- ✅ Add/remove items from lists
- ✅ Create and delete shopping lists
- ✅ Reset to default data
- ✅ In-memory storage (no database required)
- ✅ Single executable JAR file
- ✅ Authentic 2005 corporate intranet aesthetic

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Building the Application

```bash
# Build with Maven
mvn clean package

# The executable JAR will be created at:
# target/shopping-list-app-1.0.0.jar
```

### Running the Application

```bash
# Run the JAR file
java -jar target/shopping-list-app-1.0.0.jar

# Application will start on http://localhost:8080
```

Open your browser and navigate to: **http://localhost:8080**

## 📁 Project Structure

```
shopping-list-app/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/com/example/shoppinglist/
    │   │   ├── ShoppingListApplication.java      # Main entry point
    │   │   ├── controller/
    │   │   │   └── ShoppingListController.java   # Web endpoints
    │   │   ├── model/
    │   │   │   ├── ShoppingList.java             # List entity
    │   │   │   └── ShoppingItem.java             # Item entity
    │   │   └── service/
    │   │       └── ShoppingListService.java      # Business logic
    │   └── resources/
    │       ├── application.properties             # Configuration
    │       ├── static/css/
    │       │   └── style.css                      # 2005-style CSS
    │       └── templates/
    │           ├── index.html                     # Home page
    │           └── detail.html                    # List detail page
```

## 🎨 UI Design Philosophy

The application intentionally uses a **2005 corporate intranet design** featuring:
- Table-based layouts
- Classic gradients and borders
- Verdana font
- Blue/gray color scheme
- No rounded corners, gradients minimal
- Basic HTML buttons (no fancy styling)
- Server-side rendering only

This design is **intentional** and perfect for demonstrating UI modernization with AI assistance!

## 🧪 Testing the Application

### Default Data
The application comes with 4 pre-populated shopping lists:
1. **Grocery List Friday** - Basic groceries
2. **Weekend Party** - Party supplies
3. **School Start Clothes** - School items
4. **Hardware Store** - DIY supplies

### Key Functionality to Test
- ✅ View all lists on home page
- ✅ Click "View" to see list details
- ✅ Add new items to a list
- ✅ Remove items from a list
- ✅ Create a new shopping list
- ✅ Delete a shopping list
- ✅ Reset all data with the "Reset" button

## ⚙️ Configuration

### Change Port
Edit `src/main/resources/application.properties`:
```properties
server.port=9090
```

### Enable Production Mode
For production, enable Thymeleaf caching:
```properties
spring.thymeleaf.cache=true
```

## 🐛 Known Limitations (By Design)

- ❌ Shopping lists cannot be renamed
- ❌ Checkboxes don't save state
- ❌ No data persistence (in-memory only)
- ❌ No authentication/authorization
- ❌ Single-user only
- ❌ Deliberately outdated UI

These are **intentional** to provide learning opportunities!

## 📦 Distribution

To distribute the application to other computers:

1. Build the JAR file:
   ```bash
   mvn clean package
   ```

2. Copy the JAR to target machine:
   ```bash
   cp target/shopping-list-app-1.0.0.jar /destination/
   ```

3. Run on any machine with Java 17+:
   ```bash
   java -jar shopping-list-app-1.0.0.jar
   ```

No additional files or configuration needed!

## 🛠️ Technology Stack

- **Framework**: Spring Boot 3.2.0
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven
- **Java Version**: 17
- **Packaging**: Executable JAR
- **Server**: Embedded Tomcat

## 📝 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | View all shopping lists |
| GET | `/list/{id}` | View specific list |
| POST | `/list/create` | Create new list |
| POST | `/list/{id}/delete` | Delete list |
| POST | `/list/{id}/add-item` | Add item to list |
| POST | `/list/{listId}/item/{itemId}/delete` | Delete item |
| POST | `/reset` | Reset to defaults |

## 🤝 Contributing

This is a demonstration project. Feel free to fork and modify for your own AI development exercises!

## 📄 License

This is a demo application for educational purposes.

---

**Happy Shopping! 🛒**

*Built with Spring Boot | Styled like 2005 | Ready for AI modernization*


## 🎯 LLM Development Exercises

This application is designed to demonstrate AI-assisted development. Try these exercises:

### Exercise 1: Add Rename Functionality
Currently, lists cannot be renamed. Ask an LLM to add this feature.

### Exercise 2: Modernize the UI
The UI is deliberately outdated. Use an LLM to:
- Add modern CSS framework (Bootstrap, Tailwind)
- Make it responsive
- Add smooth animations
- Improve color scheme

### Exercise 3: Add New Features
- Item quantities (e.g., "2x Milk")
- Categories for items
- Mark items as completed (persistent)
- Export/import lists as JSON
- Search functionality

### Exercise 4: Add Persistence
Convert from in-memory to real database:
- Add H2/PostgreSQL
- Add JPA entities
- Add repositories

## 🎯 LLM Development Exercises Take 2

Additional, categorized tasks intended for AI-assisted (GitHub Copilot) practice. Each category has two tasks escalating in scope. You can turn any of these into GitHub Issues directly.

### 🟢 Simple Change

#### 1. Externalize App Version String
Goal: Replace hardcoded `v1.0` occurrences in templates with a configurable property (e.g., `app.ui.version`).
Files: `application.properties`, `index.html`, `detail.html`, optional helper (controller or `@ControllerAdvice`).

Acceptance Criteria:
- Changing the property updates both pages without code changes.
- No literal `v1.0` remains in templates.
Stretch: Also show build time or Git commit (placeholder if not available).
Sample Copilot Prompts:
- "Add a controller advice that injects a version property into every model."
- "Replace hardcoded version text in the Thymeleaf templates with a model attribute."

#### 2. Constructor Injection Refactor
Goal: Replace field injection in `ShoppingListController` with constructor injection and make dependency `final`.
Files: `ShoppingListController.java`.

Acceptance Criteria:
- No `@Autowired` on fields.
- Controller compiles and app runs normally.
Stretch: Add a brief comment explaining why constructor injection is preferred.
Sample Prompts:
- "Refactor the controller to use constructor-based dependency injection."
- "Explain in a Java comment why constructor injection improves testability."

### 🟡 Simple Bug Fix

#### 3. Prevent Blank & Duplicate List Names
Goal: Disallow creation of lists that are blank or duplicate (case-insensitive).
Files: `ShoppingListController.java`, `ShoppingListService.java`.

Acceptance Criteria:
- Attempting to create a duplicate or blank list results in no new list being added.
- Existing functionality unaffected.
Stretch: Show a user-facing warning message on the home page.
Sample Prompts:
- "Add validation in the service to reject duplicate list names ignoring case."
- "Validate the listName parameter and skip creation if invalid."

#### 4. Deterministic List Ordering
Goal: Ensure home page lists are always sorted alphabetically by name.
Files: `ShoppingListService.java` (in `getAllLists()`).

Acceptance Criteria:
- Lists appear alphabetically after each reload.
Stretch: Add a secondary sort by creation timestamp (requires adding a timestamp field).
Sample Prompts:
- "Sort the shopping lists by name before returning them."
- "Add a createdAt field to ShoppingList and sort by it."

### 🟠 Major Bug Fix / Hardening

#### 5. Thread-Safe Item Collection
Goal: Make per-list item mutations thread-safe (currently `ArrayList` is not safe under concurrent access).
Files: `ShoppingList.java`, possibly `ShoppingListService.java`.

Acceptance Criteria:
- Items collection updated to a thread-safe mechanism OR guarded by synchronization.
- `getItems()` returns an unmodifiable view (no accidental external mutation).
Stretch: Brief Javadoc comment documenting chosen concurrency approach.
Sample Prompts:
- "Convert internal items list to CopyOnWriteArrayList and return an unmodifiable list."
- "Explain in a comment why CopyOnWriteArrayList suits this read-heavy scenario."

#### 6. Immutable Entity IDs
Goal: Prevent mutation of entity identity by removing `setId` and making `id` final in both model classes.
Files: `ShoppingItem.java`, `ShoppingList.java`.

Acceptance Criteria:
- No `setId` methods exist.
- IDs generated once in constructor and never changed.
Stretch: Implement `equals`/`hashCode` based solely on `id`.
Sample Prompts:
- "Make the id field final and remove its setter in both model classes."
- "Generate equals and hashCode using only the id field."

### 🔵 Full-Stack Feature Addition

#### 7. Persistent Item Completion State
Goal: Add a `completed` boolean to `ShoppingItem` and allow toggling from the UI.
Files: `ShoppingItem.java`, `ShoppingListService.java`, `ShoppingListController.java`, `detail.html`.

Acceptance Criteria:
- Checkbox reflects persistent state after page reload.
- Toggling updates the model (not just visual).
Stretch: Add a filter (All / Active / Completed) via query parameter.
Sample Prompts:
- "Add a completed field to ShoppingItem with default false and getters/setters."
- "Create a POST endpoint to toggle an item's completion status."

#### 8. Rename Shopping List Feature
Goal: Allow renaming an existing shopping list with validation (reuse duplicate/blank constraints).
Files: `ShoppingListService.java`, `ShoppingListController.java`, `detail.html`.

Acceptance Criteria:
- Rename form appears on list detail page.
- Submitting a valid new name updates the list and redirects back.
Stretch: Show a transient success or error message.
Sample Prompts:
- "Add a service method renameList that validates uniqueness and non-blank input."
- "Add a Thymeleaf form under the list title to rename the list."

### 🧪 Suggested Order (If Running a Workshop)
1. Task 2 (Constructor Injection)
2. Task 1 (Externalize Version)
3. Task 4 (Sorting) 
4. Task 3 (Validation) 
5. Task 6 (Immutable IDs) 
6. Task 5 (Thread Safety) 
7. Task 8 (Rename) 
8. Task 7 (Completion State)

### 🛠️ General Copilot Prompt Tips
- Be explicit about the file: "In ShoppingListService.java, add…"
- Ask for reasoning: "Explain why you chose CopyOnWriteArrayList in a comment."
- Iterate: "Refactor that method to use streams while preserving behavior."
- Validate: "Write a quick JUnit test for renameList success and duplicate rejection." (after adding test deps)

---
