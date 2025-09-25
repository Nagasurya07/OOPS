Encapsulation (Java)

Encapsulation is the OOP principle of bundling data with the methods that use it, while hiding the internal state from direct access.

- Keep fields private (data hiding)
- Expose behavior through public methods (API)
- Validate inputs to keep objects in a valid state
- Make critical identifiers immutable when appropriate

Files
- EncapsulatedBankAccount.java — bank account with private fields, validation, and controlled updates
- EncapsulationDemo.java — small runner to show usage

Run
From the repository root:

javac encapsulation_demo/*.java && java encapsulation_demo.EncapsulationDemo
