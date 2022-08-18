import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        int x;
        System.out.println("Digite um valor");
        x = sc1.nextInt();
        int valor = fatorialcomrecursao(x);
        System.out.println(valor);
    }
        public static int fatorialcomrecursao(int valor)
        {
            if (valor == 0) {
                return 1;
            }
            return valor * fatorialcomrecursao(valor -1);
        }
}
