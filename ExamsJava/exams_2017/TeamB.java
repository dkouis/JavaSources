
/**
 * Write a description of class TeamA here.
 *
 * @author (Dimitris Kouis)
 * @version (a version number or a date)
 */
public class TeamB
{
    /**
     * Constructor for objects of class TeamA
     */
    public TeamB()
    {

    }

    public void MethodForTeamB()
    {           
        int numbers[] = new int[]{2,3,7,4,2,5,3,8,3,6};
        int variable1 = 0;
        int variable2 = 0;       
        for(int i=0; i< numbers.length; i++)
        {
          if(numbers[i]%2==0)
            variable1 = variable1+numbers[i];
          else
            variable2 = variable2+numbers[i];
        }
        System.out.println("Variable1 Number is : " + variable1);
        System.out.println("Variable2 Number is : " + variable2);
    }
}

