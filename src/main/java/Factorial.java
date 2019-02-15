public class Factorial {
    public int factorial(double facto){

        if(facto == 0)
            return 1;
        else
            return (int) facto * factorial(facto-1);
    }
}
