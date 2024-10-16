public class Task6
{
    public static void main(String[] args)
    {

        int size = 5;
        for (int c = 0; c < size; c++)
        {
            for (int r = 0; r < size - c; r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
