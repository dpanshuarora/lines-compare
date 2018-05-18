# Lines Equality Check

A line is defined by its x and y coordinates of its start and end point. It calculates the lengths of two lines using these coordinates, checks if they are equal in length and outputs the result.

### Prerequisites

Java JDK: (Version 1.8.0 or above)

### Installing

Compile the javac source code

```
javac LineHelper.java
```

Execute java application
```
java LineHelper
```

Initialize two lines with their x and y coordinates of the start and end points respectively.

```
Line a = new Line(0, 0, 1, 1);
Line b = new Line(1, 1, 2, 2);

boolean equalityCheck = a.equalTo(b);
```