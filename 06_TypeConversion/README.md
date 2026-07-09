</> Markdown
# Type Conversion 
    Type conversion in java means converts one data type into another. It is mainly of two types:


    
### 1. Implicit Conversion(Widening/Automatic)
      Happens automatically when you assign a smaller data type to a larger one. No data loss occurs because the target type can 
      hold a large range of values. Destination type is larger than the source type.

      Widening hierarchy(low->high)

      ```text

      byte->short->int->long->float->double
              ▲
              |
            char->int->long->float->double 
      ```


### Why is it called as widening?
     Because the values moves from a smaller memory size to a larger memory size.

---


### 2. Explicit Conversion(Narrow/Casting)
       Required when converting a larger type to a smaller one,since data or precision can be lost. Must use a cast operator.

     
### Type conversion summary 
    Conversion        Automatic             Casting Needed?                      Data Loss?
    byte->int         Yes                   No                                   No 
    int->long         Yes                   No                                   No
    int->double       Yes                   No                                   No
    double->int       No                    Yes                                  Yes
    long->short       No                    Yes                                  Yes
    int->byte         No                    Yes                                  Possible
    char->int         Yes                   No                                   No
    int->char         No                    Yes                                  Depends on the value 

### Key points
    . Widening conversion is automatic becuase it's generally safe.
    . Narrowing conversion requires an explicit cast because it can lose information.
    . Converting a floating-point type(float/double) to an integer type(int, long) truncates the fractional part(it does not round).
    . Converting between incompitable types (such as string and int) requires helper methods like Integer.parseInt()
      or String.valueOf() not casting.
       

   



