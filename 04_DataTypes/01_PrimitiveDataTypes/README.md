</> Markdown

### Primitive Data Types 

These are the basic building blocks they store actual values but (not references) and are built into the language.There are 8 primitives
types.

```
Type        Size                               Range/Info                 stores            Example 
byte        8-bit(or)1 byte                   -128 to 127                 small integers    byte age = 5;
short       16-bit(or)2 bytes                 -32,768 to 32,767           small integers    short marks = 300; 
int         32-bit(or)4 bytes                 -2^31 to 2^31-1             Integers          int salary = 10000;
long        64-bit(or)8 bytes                 -2^63 to 2^63-1             Long Integers     long population = 150000000L;
float       32-bit(or)4 bytes                  Single-precision decimal   Decimal Numbers   float price = 19.99f;
double      64-bit(or)8 bytes                  double-precision decima    Decimal Numbers   double pi = 3.14159;
Char        2 bytes                            Single unicode character   Single character  char grade = 'A';
boolean     1-bit(JVM-dependent)(or)~1 byte    true or false              true or flase     boolean = true;                        
```

Notes:
  - long literals needs an L suffix float literals need and f suffix otherwise java treats decimals as double.
  - char uses single quotes 'A' while String (not primitive) uses double quotes "A".

  