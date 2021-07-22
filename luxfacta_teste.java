import java.io.IOException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws IOException  {
        //Declarando as variavéis
        int a, resultado;
        float b, quadrao, cubo, x1 = 0, y1 = 0, x2 = 0, y2 = 0, distancia;

        Scanner input = new Scanner(System.in);
        scanner.useLocale(Locale.pt_BR);

        //Lendo o valor para tabuada
        System.out.println("Informar um inteiro para o qual deseja ver a tabuada: \n");
        a = input.nextInt();

        //calculando a tabuada
       for ( int i = 0; i<=10; i++) {
            resultado = a * i;
            System.out.printf("%d x %d = %d\n", a, i, resultado);   
        }

        //Lendo o valor para o quadrado e o cubo

        System.out.println("Informar um inteiro para o qual deseje obter o quadrado e o cubo: \n");
        b = input.nextFloat();

        // calculando o quadrado e o cubo;

        quadrado = math.pow(b,2);
        cubo = math.pow(b,3);
        System.out.printf("%.1f | %.2f | %.3f \n", b, quadrado, cubo);

        //Lendo os valores para distancia entre dois pontos: 

        System.out.println("Informar as coordenadas do primeiro ponto: \n");
        x1 = input.nextFloat();
        y1 = input.nextFloat();

        System.out.println("Informar as coordenadas do segundo ponto: \n");
        x2 = input.nextFloat();
        y2 = input.nextFloat();

        //Calculando a distancia:

        Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((x2 - x1),2));
        
        System.out.printf("O distancia entre o potos informados é de: %f.2 \n");

        input.close();


    }
}