import java.util.Scanner;

public class ExercicioFrases {

    public static void main(String[] args) {

        String frase;
        int contvogal=0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma frase");
        frase = ler.nextLine();
        frase = frase.toUpperCase();

        for(int i=0;i<frase.length();i++)
        {
            if (frase.charAt(i)=='A'||frase.charAt(i)=='E'||frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U')
                contvogal++;
        }
        System.out.println("Numero de Vogais na frase é" + contvogal);
    }
}
