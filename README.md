# Assignment 1: Builder Pattern Workstation

**Author:** Zhalynuly Zhassyn

## 1. What the product is

A Java implementation of the Builder pattern for workstation configuration. There is a single Product type (`Workstation`) and two ConcreteBuilders: gaming and office. Rather than relying on a constructor with a long list of parameters, object assembly is broken into small, chainable steps. The resulting `Workstation` is immutable once built.

---

## 2. Project structure

```graphql
src/
├── Workstation.java                 Product (immutable)
├── WorkstationBuilder.java          Builder interface
├── AbstractWorkstationBuilder.java  Shared builder logic and validation
├── GamingWorkstationBuilder.java    ConcreteBuilder #1
├── OfficeWorkstationBuilder.java    ConcreteBuilder #2
├── WorkstationDirector.java         Director - reusable configurations
└── Application.java                 Client - demo entry point
```

---

## 3. How to build each representation

**Using the Director (recommended, reusable configurations):**

```java
WorkstationDirector director = new WorkstationDirector();

Workstation gamingWorkstation = director.createStandardGamingWorkstation(
        new GamingWorkstationBuilder());

Workstation officeWorkstation = director.createStandardOfficeWorkstation(
        new OfficeWorkstationBuilder());
```

**Fully custom, fluent chaining (no Director needed):**

```java
Workstation customGamingWorkstation = new GamingWorkstationBuilder()
        .withProcessor("AMD Ryzen 9 7900X")
        .withGraphicsCard("NVIDIA GeForce RTX 4080 SUPER")
        .withMemoryGb(64)
        .withStorageGb(4000)
        .withMonitor("32-inch 4K 144 Hz monitor")
        .withOperatingSystem("Windows 11 Pro")
        .addAccessory("Streaming microphone")
        .build();
```

---

## 4. How to run it

Requires JDK 17+ and IntelliJ IDEA (recommended) or a terminal.

1. Open the `builder-pattern-workstation` folder in IntelliJ IDEA.
2. Set Project SDK to Java 17 (`File` -> `Project Structure` -> `Project`).
3. Navigate to `src/Application.java`.
4. Run via the green **Run** arrow or `Shift + F10`.

**Terminal:**

```powershell
javac -d out src/*.java
java -cp out Application
```
