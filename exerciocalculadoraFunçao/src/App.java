import java.util.Scanner;

public class App {
    public static double  Valorsoma(double soma1,double soma2){
        double  Resultadosoma = soma1+soma2;
        return Resultadosoma;
    } 
    public static double Valorsubtracao(double sub1,double sub2){
        double Resultasubtracao = sub1-sub2;
        return Resultasubtracao;
    }
    public static double valordivisao(double div1,double div2){
        double resultadodiv = div1/div2;
        return resultadodiv;
    }
    public static double valormultiplicacao(double multi1,double multi2){
        double resultadomultiplicacao = multi1*multi2;
        return resultadomultiplicacao;
    }

    public static void main(String[] args) throws Exception {
        Scanner input  = new  Scanner(System.in);
        double n1,n2;
        System.out.print("Digite o valor da soma:");
        n1 = Double.valueOf(input.nextLine());
        System.out.print("Digite o valor da soma:");
        n2 = Double.valueOf(input.nextLine());
         double Resultadosoma = Valorsoma(n1, n2);
         System.out.println("Resposta soma"+Resultadosoma);

        System.out.print("Digite o primeiro numero subtraçao:");
        n1 = Double.valueOf(input.nextLine());
        System.out.print("Digite o segundo numero da subtraçao:");
        n2 = Double.valueOf(input.nextLine());
        double Resultasubtracao = Valorsubtracao(n1,n2);
        System.out.println("resultaqdo subtraçao"+Resultasubtracao);
        

        System.out.print("Digite o primeiro numero da divisao:");
        n1 = Double.valueOf(input.nextLine());
        System.out.print("Digite o segundo numero da divisao:");
        n2 = Double.valueOf(input.nextLine());
        double resultadodiv = valordivisao(n1,n2);
        System.out.println("resultado divisão:"+resultadodiv);
        


        System.out.println("Digite o primeiro valor da multiplicaçao");
        n1 = Double.valueOf(input.nextLine());
        System.out.println("Digite o segundo valor da multiplicaçao");
        n2 = Double.valueOf(input.nextLine());
        double resultadomultiplicacao = valormultiplicacao(n1,n2);
        System.out.println("resultado multiplicaçao:"+resultadomultiplicacao);

    }
}
