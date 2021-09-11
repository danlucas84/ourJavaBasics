public class OurJavaBasics {

    public static void main(String[] args) {

/*================+=========+==================================================================================+
| Primitive type | Size    | Description                                                                       |
+================+=========+===================================================================================+
| byte           | 1 byte  | Stores whole numbers from -128 to 127                                             |
+----------------+---------+-----------------------------------------------------------------------------------+
| short          | 2 bytes | Stores whole numbers from -32,768 to 32,767                                       |
+----------------+---------+-----------------------------------------------------------------------------------+
| int            | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
+----------------+---------+-----------------------------------------------------------------------------------+
| long           | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
+----------------+---------+-----------------------------------------------------------------------------------+
| float          | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
+----------------+---------+-----------------------------------------------------------------------------------+
| double         | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits               |
+----------------+---------+-----------------------------------------------------------------------------------+
| char           | 2 bytes | Stores a single character/letter or ASCII values                                  |
+----------------+---------+-----------------------------------------------------------------------------------+
| boolean        | 1 bit   | Stores true or false values                                                       |
+----------------+---------+-----------------------------------------------------------------------------------+ */

        // primitives
        char character = 'a';
        boolean booleanValue = false;
        byte myByte = 120;

        int myInt = 1;
        short myShort = 32767;
        long myLong = 373923;
        double myDouble = 2.7;
        float myFloat = 52.3f;

        System.out.println(myFloat);

        // reference
        Boolean booleanValueRef = false;
        Character characterRef = 'a';
        Byte myByteRef = 120;

        Integer integerRef = 1;
        Short shortNumberRef = 32767;
        Long longNumberRef = 3713923L;
        Double doubleNumberRef = 2.7;
        Float floatNumberRef = 52.3f;


//        // == zeby pokazać różnice, mind the trick z factory konstruktorem
//        char characterRef1 = 'a';
//        char characterRef2 = 'a';
//
//        if (characterRef1 == characterRef2) {
//            System.out.println("Primitive chars == are the same.");
//        }
//
//        Character refChar1 = new Character('a');
//        Character refChar2 = new Character('a');
//
//        if (refChar1 == refChar2) {
//            System.out.println("Reference chars are == the same");
//        }
//
//        refChar1 = refChar2;
//
//
//        if (refChar1 == refChar2) {
//            System.out.println("After assignment, reference is the same.");
//        }
    }
}