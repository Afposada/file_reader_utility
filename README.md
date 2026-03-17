# Java File Reader Utility 

A simple and efficient Java utility tool for reading plain text files using **Java NIO.2**.

##  Features
* **Path Validation:** Checks if the file path is null or empty before processing to prevent crashes.
* **Error Handling:** Throws clear, descriptive exceptions if the file is not found or is unreadable.
* **UTF-8 Encoding:** Full support for special characters (accents, ñ, etc.) using the UTF-8 standard.
* **Performance:** Utilizes `Files.readAllLines` for optimized and modern file handling.

##  How to Use

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Afposada/file_reader_utility.git](https://github.com/Afposada/file_reader_utility.git)
Prepare a test file:
Create a file named data.txt in the project's root directory and add some text to it.

Run the utility:
Execute the FileUtil.java class from your preferred IDE (Eclipse, IntelliJ, or VS Code).

 Requirements
Java 8 or higher.

A Java IDE or configured terminal.

 Author
Andres Posada - Afposada
