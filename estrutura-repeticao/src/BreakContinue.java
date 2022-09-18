public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break;
            // também pode utilizar o continue;

            System.out.println(numero);
        }
    }
}
