import java.util.Scanner;

public class ExmploCondicoes2 {
    //Add desconto gradativo
    //Valor > 1000 - 10%
    //Valor > 2000 - 20%
    //Valor > 3000 - 30%
    //Valor <= 1000 - 0%
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor bruto");
        double valorBruto = scanner.nextDouble();
        double valorLiquido = 0;
        double desconto = 0;
        if(valorBruto>=3000){
            desconto = valorBruto * 0.3;
        }else if(valorBruto>2000){
            desconto = valorBruto * 0.2;
        }else if(valorBruto>1000){
            desconto = valorBruto * 0.1;
        }else{
            //sem desconto
        }
        valorLiquido = valorBruto - desconto;
        System.out.println("O valor bruto é de: R$"+valorBruto+", o valor do desconto é de "+desconto+" e o valor com desconto é: R$"+valorLiquido);
        //Operadores logicos && - e, || - ou;
    }
}
