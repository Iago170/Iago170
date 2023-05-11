import java.util.Scanner;

public class App {
    public static  int ValorArea(int base,int altura){
       int resultado = base*altura;
    return resultado;

    } 
    public static int Valorperimetro(int base2, int altura2){
        int resultadoperimetro = base2+base2+altura2+altura2;
        return resultadoperimetro;

    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int base1,altura1;
        System.out.print("Digite a base");
        base1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite a altura ");
        altura1 = Integer.valueOf(input.nextLine());
        int resultado = ValorArea(base1, altura1);
        System.out.println("o resultado:"+resultado);
        int resultadoperimetro = Valorperimetro(base1, altura1);
        System.out.println("Resultado perimetro"+resultadoperimetro);
        


    }
}
