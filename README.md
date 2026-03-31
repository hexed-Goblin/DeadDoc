# DeadDoc  

##  Introduction  

As software projects grow, they often accumulate **dead code** , unused variables, redundant methods, and unnecessary imports. While invisible at first glance, this unused code gradually **degrades code quality and increases maintenance cost**.

**DeadDoc** is a lightweight Java-based static analysis tool designed to automatically detect such inefficiencies and help developers maintain **clean, optimized, and readable codebases**.

---

##  Problem Statement  

In real-world development:

- Developers frequently leave unused code during testing or refactoring  
- Large projects make manual cleanup difficult  
- Code reviews may miss hidden redundancies  

This leads to:
- Poor readability  
- Increased debugging time  
- Confusing project structure  

---

##  Solution: DeadDoc  

DeadDoc solves this by:

-  Scanning Java source files  
-  Analyzing code structure  
-  Detecting dead code patterns  
-  Generating a structured report  

---

##  Why This Project Stands Out  

Unlike basic academic projects, DeadDoc:

-  Solves a **real developer problem**  
-  Uses **static code analysis concepts**  
-  Is **expandable into IDE tools**  
-  Can scale for large codebases  

---

##  System Architecture -> Working Flowchart 
    +------------------+
    |  Input Java File |
    +--------+---------+
             |
             v
    +------------------+
    |     Parser       |
    | (Reads Code)     |
    +--------+---------+
             |
             v
    +------------------+
    |    Analyzer      |
    | (Detect Issues)  |
    +--------+---------+
             |
             v
    +------------------+
    | Report Generator |
    | (Outputs Result) |
    +------------------+

    
---

##  Tech Stack  

- **Language:** Java  
- **Concepts Used:**
  - Object-Oriented Programming (OOP)  
  - File Handling  
  - String Parsing  
  - Static Code Analysis  

---

##  Project Structure  
```bash
DeadDoc/
│── src/
│ ├── Main.java
│ ├── Parser.java
│ ├── Analyzer.java
│ └── ReportGenerator.java
│
│── test/
│ └── SampleCode.java
│
│── DeadDoc.jar
│── README.md
```
###  File Explanation  

- **Main.java**  
  Controls program flow, takes user input, and connects all components.

- **Parser.java**  
  Reads Java files and converts raw code into structured data for analysis.

- **Analyzer.java**  
  Core engine that identifies:
  - Unused variables  
  - Unused methods  
  - Redundant imports  

- **ReportGenerator.java**  
  Displays findings in a clear, structured format.

- **SampleCode.java**  
  Test file containing intentional dead code for validation.

---

##  Setup & Installation  

Follow these steps to run DeadDoc on your system:

---

### Step 1: Install Java

DeadDoc requires Java (JDK 8 or above).

1. Download and install Java from the official website.
2. Verify installation by opening terminal or command prompt and running:

```bash
java -version
```

If Java is installed correctly, the version will be displayed.

---

### Step 2: Download the Project

**Option 1 (Download ZIP):**

* Download the repository as a ZIP file from GitHub
* Extract it to a folder

**Option 2 (Using Git):**

```bash
git clone https://github.com/<your-username>/DeadDoc.git
cd DeadDoc
```

---

### Step 3: Navigate to Project Directory

Open terminal or command prompt and navigate to the folder where `DeadDoc.jar` is located.

Example:

```bash
cd DeadDoc
```

---

### Step 4: Run the Application

To analyze a Java file and detect unused methods:

```bash
java -jar DeadDoc.jar analyze examples/AdvancedSample.java
```

To generate code explanations:

```bash
java -jar DeadDoc.jar explain examples/AdvancedSample.java
```

---

### Step 5: Example Output

```text
Dead Code Analysis:

Unused Method: unusedHelper
Unused Method: anotherUnusedMethod

Code Health Score: 80/100
```

---

### Troubleshooting

* If you see "java is not recognized", install Java and add it to your system PATH.
* If you see "Unable to access jarfile", ensure you are in the correct directory.
* If you see "file not found", verify the file path or use an absolute path.

---

### Notes

* The application runs entirely in the terminal.
* Sample input files are available in the `examples` folder.
* No additional dependencies are required.

---

###  Compile  

```javac -d bin src/*.java```
###  Run

Using compiled classes:
``` java -cp bin Main ```

Using JAR:

``` java -jar DeadDoc.jar ```

### Usage
**Run the program**
**Enter path of Java file / project**
**Tool analyzes code**
**View detected issues**

### Sample Output
```[WARNING] Unused Variable: tempVar at line 23 ```

``` [WARNING] Unused Method: calculateSum() at line 45 ```

```[INFO] Redundant Import: java.util.* at line 2 ```

###  Future Enhancements
**GUI Interface**
**IDE Integration (IntelliJ / VS Code)**
**Multi-language Support**
**Auto-fix Suggestions**
### Testing Strategy
**Tested on sample Java files with intentional dead code**

**Verified detection accuracy manually**

**Ensured no false positives in basic scenarios**
### NOTE : This project includes both source code and an executable JAR for ease of use.
