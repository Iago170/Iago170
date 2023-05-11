import java.util.Scanner;

public class App {
    public static float Conversaofirenhait(float c1){
        float resultado = (float) (c1*1.8+32);
        return resultado;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float c1,resposta;
        System.out.println("Digite o numero que deseja converter");
        c1 = Float.valueOf(input.nextLine());
        resposta = Conversaofirenhait(c1);
        System.out.println("Digite a resposta"+resposta);
        

    }
}
