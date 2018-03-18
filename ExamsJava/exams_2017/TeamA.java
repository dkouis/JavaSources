
/**
 * Write a description of class TeamA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamA
{
    /**
     * Constructor for objects of class TeamA
     */
    public TeamA()
    {

    }

    public void MethodForTeamA()
    {           
        int x = 5 & 4;     // 101 & 100 = 100 (4) // and    
        System.out.println("AND : " + x);
        x = 5 | 4;  // 101 | 100 = 101 (5) // or
        System.out.println("OR : " + x);
        x = 5 ^ 4;  // 101 ^ 100 = 001 (1) // xor 
        System.out.println("XOR : " + x);
        x = 4 << 1; // 100 << 1  =1000 (8) // left shift
        System.out.println("Shift left : " + x);
        x = 4 >> 1; // 100 >> 1  =  10 (2) // right shift
        System.out.println("Shift right : " + x);
        x = 4 >>>1; // 100 >>>1  =  10 (2) // zero-fill right shift  
        x = ~4;     // ~00000100 = 11111011 (-5) // invert
        System.out.println("invert : " + x);
    }
}

