package Datatypes;

public class Byte {
    public static void main(String[] args) 
    {
        byte x=118;
        System.out.println(x);
    }
}
// size 1byte(8bits)
//max_value +127
//min_value +128
//range +128 to 127


/* sign bit
0 - +ve
1 - -ve
*/

// 64+32+16+8+4+2+1=127

//byte b=128 invalid compile time error possible lossy conversion

//Streams

/*
two typess of streams 
charater stream
byte stream 
 */

// bit is the best  choice in term of streams either from the file or network file supported from network support is bit