package com.manny;

public class Car {
    // The "public" keyword is an access modifier that we use to determine
    // what access we want to allow others to have to this new class (Car).
    // The word "public" means unrestricted access to the class.
    // Other access modifiers we can use are "private"
    // That's when no other class can access that class
    // "protected" allows classes in its package to access your class.
    // Classes allow us to create variables that can be seen and are accessible
    // anywhere within the class that we're creating.
    // When creating a field for a class you need to specify access modifier that
    // works the same way as access modifier for class definition did
    // As a general rule, when your defining fields in Java in a class, you go
    // with the access modifier "private", unlike the class where we went "public"
    // What "private" means when we're talking about fields: What we're really
    // doing to it is we're adhering to encapsulation, which is a key fundamental rule of OOP.
    // "Encapsulation" in Java is used to hide fields and methods from access publicly.
    // In other words, the internal representation of an object is going to be hidden from view
    // outside of the object's definition (i.e. internal workings of the particular object
    // are only allowed to be accessed by this class/object). We're not allowing any access.
    // Concept of encapsulation: By not allowing people to access the field directly,
    // and by forcing them to assign a model by method, we can really make sure that the data
    // within our objects have been validated and are correct.

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
