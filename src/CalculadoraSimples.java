import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculadoraSimples
{
    public static float Somar(float x, float y)
    {
        return x + y;
    }
    public static float Subtrair(float x, float y)
    {
        return x - y;
    }
    public static float Multiplicar(float x, float y)
    {
        return x * y;
    }
    public static float Dividir(float x, float y)
    {
        return x / y;
    }
    public static void main(String[] args)
    {
        int CONDICAO, STATUS, STATUSSM = 1, STATUSSB = 1, STATUSMT = 1, STATUSDV = 1, RUN = 1;
        float x, y;
        String Entrada, NOME;
        Scanner ENTRADA = new Scanner(System.in);
        NumberFormat nf = new DecimalFormat("0.##");

        System.out.println(" ***** » Programa Rodando! « *****");
        System.out.println();
        System.out.print(" Ola, qual o seu nome? ");
        NOME = ENTRADA.nextLine();
        System.out.println(" Bem vindo, "+NOME+" ao nosso programa de cálculos aritméticos!");
        do
        {
            System.out.println();
            System.out.print(" Digite o 1° valor: ");
            x = ENTRADA.nextFloat();
            System.out.println();
            System.out.print(" Digite o 2° valor: ");
            y = ENTRADA.nextFloat();
            System.out.println();
            System.out.print(" Digite: 0 - Somar "+"\n Digite: 1 - Subtrair "+"\n Digite: 2 - Multiplicar "+"\n Digite: 3 - Dividir "+"\n Operação: ");
            Entrada = ENTRADA.next();
            boolean b = Entrada.matches("[0-3]");
            ENTRADA.nextLine();
            if (b == true) {
                STATUS = Integer.parseInt(Entrada);
                if (STATUS == 0) {                                   //Soma.
                    System.out.println(" Soma: " + nf.format(x) + " + " + nf.format(y) + " = " + nf.format(CalculadoraSimples.Somar(x, y)));
                    System.out.println();
                    do{
                        System.out.print(" Digite: <0> para Continuar ou <1> para Encerrar: ");
                        Entrada = ENTRADA.next();
                        boolean csm = Entrada.matches("[0-1]");          //csm »» Continuar Soma.
                        if (csm == true) {
                            STATUS = Integer.parseInt(Entrada);
                            STATUSSM = STATUS + 2;
                            if(STATUS == 0) {
                                System.out.println();
                                System.out.println(" Continuar Rodando o Programa!");
                                RUN = RUN + STATUS;
                            }
                        else {
                                System.out.println();
                                System.out.println(" Encerrando o Programa!");
                                RUN = RUN + STATUS;
                            }
                        }
                    else {
                            System.out.println();
                            System.out.println(" Opção Inválida! Entre com um valor válido!");
                            STATUSSM = STATUSSM;
                    }
                    }while (STATUSSM == 1);
                } else if (STATUS == 1) {                            //Subtracao.
                    System.out.println(" Subtração: " + nf.format(x) + " - " + nf.format(y) + " = " + nf.format(CalculadoraSimples.Subtrair(x, y)));
                    System.out.println();
                    System.out.print(" Digite: <0> para Continuar ou <1> para Encerrar: ");
                    Entrada = ENTRADA.next();
                    boolean csb = Entrada.matches("[0-1]");//csb »» Continuar Soma.
                    if(csb == true){
                        STATUS = Integer.parseInt(Entrada);
                        if(STATUS == 0) {
                            System.out.println(" Continuar Rodando o Programa!");
                            RUN = RUN + STATUS;
                        }
                        else {
                            System.out.println(" Encerrando o Programa!");
                            RUN = RUN + STATUS;
                        }
                    }
                    else{
                        System.out.println(" Opção Inválida! Entre com um valor válido!");
                    }
                } else if (STATUS == 2) {
                    System.out.println(" Multiplicação: " + nf.format(x) + " * " + nf.format(y) + " = " + nf.format(CalculadoraSimples.Multiplicar(x, y)));
                } else {
                    System.out.println(" Divisão: " + nf.format(x) + " ÷ " + nf.format(y) + " = " + nf.format(CalculadoraSimples.Dividir(x, y)));
                }
            }
             else {
                System.out.println(" Opção Inválida! Entre com um valor válido!");
            }
        }
        while (RUN == 1);
                System.out.println(" Fim do Programa!");
    }
}
