public class bytecode 
{
    public static void main(String args[]) 
    {
        System.out.println("Hello world from bytecode class with sh script");
        increment_variable_in_loop();
    }

    private static void increment_variable_in_loop()
    {
        int variable = 1;


        System.out.println("Variable before----"+variable);

        for(int i=0;i<1;i++)
        {
            variable+=1;
        }

        System.out.println("Variable after-----"+variable);
    }
}