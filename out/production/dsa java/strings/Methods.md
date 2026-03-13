In Java, the `String` class is part of the `java.lang` package and provides a wide range of methods to manipulate and inspect strings. Here's a categorized list of the most commonly used methods:

---

### 🔹 **1. Basic Methods**

| Method                           | Description                                               |
| -------------------------------- | --------------------------------------------------------- |
| `int length()`                   | Returns the length of the string                          |
| `boolean isEmpty()`              | Checks if the string is empty                             |
| `char charAt(int index)`         | Returns the character at the specified index              |
| `int codePointAt(int index)`     | Returns the Unicode code point at the specified index     |
| `int codePointBefore(int index)` | Returns the Unicode code point before the specified index |

---

### 🔹 **2. Comparison**

| Method                                     | Description                               |
| ------------------------------------------ | ----------------------------------------- |
| `boolean equals(Object another)`           | Compares two strings for equality         |
| `boolean equalsIgnoreCase(String another)` | Case-insensitive comparison               |
| `int compareTo(String another)`            | Lexicographically compares two strings    |
| `int compareToIgnoreCase(String another)`  | Lexicographically compares, ignoring case |
| `boolean contentEquals(CharSequence cs)`   | Compares the content of the string        |

---

### 🔹 **3. Searching and Matching**

| Method                              | Description                                             |
| ----------------------------------- | ------------------------------------------------------- |
| `boolean contains(CharSequence s)`  | Checks if the string contains the specified sequence    |
| `boolean startsWith(String prefix)` | Checks if the string starts with the given prefix       |
| `boolean endsWith(String suffix)`   | Checks if the string ends with the given suffix         |
| `int indexOf(int ch)`               | Returns the first index of the character                |
| `int indexOf(String str)`           | Returns the index of the first occurrence of the string |
| `int lastIndexOf(int ch)`           | Returns the last index of the character                 |
| `boolean matches(String regex)`     | Matches the string with a regular expression            |
| `String[] split(String regex)`      | Splits the string based on regex                        |

---

### 🔹 **4. Substrings**

| Method                                           | Description                         |
| ------------------------------------------------ | ----------------------------------- |
| `String substring(int beginIndex)`               | Returns substring from index to end |
| `String substring(int beginIndex, int endIndex)` | Returns substring between indexes   |

---

### 🔹 **5. Modification**

| Method                                                          | Description                           |
| --------------------------------------------------------------- | ------------------------------------- |
| `String toUpperCase()`                                          | Converts to uppercase                 |
| `String toLowerCase()`                                          | Converts to lowercase                 |
| `String trim()`                                                 | Removes leading and trailing spaces   |
| `String replace(char oldChar, char newChar)`                    | Replaces characters                   |
| `String replace(CharSequence target, CharSequence replacement)` | Replaces CharSequence                 |
| `String replaceAll(String regex, String replacement)`           | Replaces using regex                  |
| `String replaceFirst(String regex, String replacement)`         | Replaces first match                  |
| `String concat(String str)`                                     | Concatenates strings                  |
| `String join(CharSequence delimiter, CharSequence... elements)` | Joins multiple strings with delimiter |
| `String repeat(int count)`                                      | Repeats the string `count` times      |

---

### 🔹 **6. Conversion**

| Method                                                | Description                                                  |
| ----------------------------------------------------- | ------------------------------------------------------------ |
| `char[] toCharArray()`                                | Converts string to character array                           |
| `byte[] getBytes()`                                   | Converts string to byte array                                |
| `static String valueOf(...)`                          | Converts other data types to string (e.g., `valueOf(int i)`) |
| `static String format(String format, Object... args)` | Returns formatted string                                     |

---

### 🔹 **7. Miscellaneous**

| Method                   | Description                                                           |
| ------------------------ | --------------------------------------------------------------------- |
| `String intern()`        | Returns the canonical representation from the string pool             |
| `int hashCode()`         | Returns hash code for the string                                      |
| `String strip()`         | Removes leading and trailing white space (Java 11+)                   |
| `String stripLeading()`  | Removes leading white space (Java 11+)                                |
| `String stripTrailing()` | Removes trailing white space (Java 11+)                               |
| `boolean isBlank()`      | Checks if the string is empty or contains only white space (Java 11+) |
| `Stream<String> lines()` | Returns a stream of lines (Java 11+)                                  |

---

Let me know if you’d like to [see code examples of key methods](f) or get a [PDF cheatsheet of all these methods](f).
