
public class Globally {
    MyClass obj = new MyClass();
    obj.pubNonStatic(); // valid
    obj.pubStatic();    // valid
    MyClass.pubStatic(); // valid

    obj.privNonStatic(); // invalid
    obj.privStatic();    // invalid
    MyClass.privStatic(); // invalid
    MyClass.pubNonStatic(); // invalid

}
