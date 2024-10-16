import java.util.Random;

public class Task8dieRoller
{
    public static void main(String[] args) {
        {
            Random rand = new Random();
            int throwNumber = 0;
            boolean valuesMatch = false;

            System.out.println("Throw\tDie 1\tDie 2\tDie 3\tSum");

            while (!valuesMatch) {
                throwNumber++;
                int Die1 = rand.nextInt(6) + 1;
                int Die2 = rand.nextInt(6) + 1;
                int Die3 = rand.nextInt(6) + 1;
                int sum = Die1 + Die2 + Die3;

                System.out.println(throwNumber + "\t\t" + Die1 + "\t" + Die2 + "\t" + Die3 + "\t" + sum);

                if (Die1 == Die2 && Die1 == Die3) {
                    valuesMatch = true;
                }


            }
        }
    }
}
