
/**
 * Write a description of class TeamA here.
 *
 * @author (Dimitrios Kouis)
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

             
        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        int variable1 = numbers[0];
        int variable2 = numbers[0];       
        for(int i=1; i<numbers.length; i++)
        {
          if(numbers[i] > variable1)
            variable1 = numbers[i];
          else if (numbers[i] < variable2)
            variable2 = numbers[i];
        }
        System.out.println("Variable1 Number is : " + variable1);
        System.out.println("Variable2 Number is : " + variable2);

    }
}

