package Fundamentals.Operators;

public class DemoBitwise
{
    public static void main(String[] args)
    {
//        a=240
//        b=340
//
//        256 128  64  32 16  8  4   2   1
//        0       1     1   1   1  0  0   0     0
//
//        1      0      1   0   1  0  1   0     0
//                --------------------------------------
//        0       0          1    0     1    0    0     0    0     Bitwise AND
//        ---------------------------------------
//
//
//                1          1       1     1     0    1   0    0    //Bitwise OR

        int rasagulla=240;
        int blackforest=340;
        System.out.println("Bitwise And:"+(rasagulla&blackforest));
        System.out.println("Bitwise OR:"+(rasagulla|blackforest));
    }
}

