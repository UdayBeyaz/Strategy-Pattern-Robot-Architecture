# 🤖 Robotic System - Strategy Design Pattern Implementation

This repository contains an object-oriented Java application demonstrating the **Strategy Design Pattern** to manage dynamic robotic behaviors, developed for the **SE 3317 Software Design and Architecture** course at Yaşar University.

## 📌 Architectural Overview

The core objective of this application is to enforce the principle of **"Composition over Inheritance"**, allowing robots to change their movement and communication strategies dynamically at runtime without altering their concrete class hierarchy.

### Key Components
* **Abstract Base Class (`Robot`):** Defines the structural template for robots and delegates movement and communication behaviors to interface strategies.
* **Concrete Subclasses (`WorkerRobot`, `ExplorerRobot`):** Inherit core properties and initialize specific operational profiles.
* **Behavior Interfaces (`MovementBehavior`, `CommunicationBehavior`):** Decouple algorithms from client execution.
* **Behavior Implementations:** Concrete classes for actions such as `FlyWithWings`, `WalkWithLegs`, `RollWithWheels`, `RadioSignalCommunication`, etc.

## 🛠️ Key Takeaways & Design Principles
* **Encapsulate What Varies:** Separated behavioral algorithms from the core `Robot` class.
* **Runtime Behavior Modification:** Demonstrated dynamic swapping of strategy instances via setter methods (`setMovementBehavior`, `setCommunicationBehavior`).
* **Program to Interfaces, Not Implementations:** High cohesion and loose coupling achieved.

## 💻 Tech Stack
* **Language:** Java (JDK 8+)
* **Design Pattern:** Strategy Pattern (Behavioral)
* **Concepts:** Object-Oriented Design (OOD), Software Architecture, Interfaces, Encapsulation

---
*Developed by Uday Beyaz - Yaşar University, Software Engineering*
