

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Codinhoto
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altura, peso, imc;
Scanner scan = new Scanner(System.in);
System.out.println("IMC");
System.out.println("Informe seu peso em Quilogramas2");
peso = scan.nextFloat();
System.out.println("Informe seu altura em Metros2");
altura = scan.nextFloat();
imc = (peso / (altura * altura));
System.out.println(imc);
if (imc < 20) 
System.out.println( "Abaixo do Peso2");

else if((imc >= 20) && (imc < 25)) {
System.out.println("Peso Ideal");
}
else if((imc >= 25)&&(imc < 30)) {
System.out.println("Sobrepeso");
}
else if((imc >= 30)&&(imc < 35)) {
System.out.println("Obesidade Grau I");
}
else if((imc >= 35)&&(imc < 40)) {
System.out.println("Obesidade Grau II(Severa)");
}
else {
System.out.println("Obesidade Grau III(Mórbia)");
}
}
    }
    

