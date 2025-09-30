# 🛒 Shopping List Manager

A demonstration Java web application with intentionally retro 2005-style UI, perfect for showcasing LLM-assisted development and modernization exercises.

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
