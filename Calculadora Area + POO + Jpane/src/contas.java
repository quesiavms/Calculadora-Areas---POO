import java.util.Scanner;
import java.math.*;
public class contas {
    Scanner entrada = new Scanner(System.in);
    public void quadrado(){
        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = entrada.nextDouble();
        double areaQuadrado = lado*lado;
        System.out.println("A area é: " + areaQuadrado);     
        System.out.println("--------------------------------------------------------");   
    } 
    public void triangulo(){
        System.out.print("Digite o valor da base do triangulo: ");
        double base = entrada.nextDouble();
        System.out.print("Digite o valor da altura do triangulo: ");
        double altura = entrada.nextDouble();
        double areaTriangulo = (base*altura)/2;
        System.out.println("A area é: " + areaTriangulo);
        System.out.println("--------------------------------------------------------");   
    }
    public void trapezio(){
        System.out.print("Digite o valor da base MENOR do trapezio: ");
        double baseMenor = entrada.nextDouble();
        System.out.print("Digite o valor da base MAIOR do trapezio: ");
        double baseMaior = entrada.nextDouble();
        System.out.print("Digite o valor da altura do trapezio: ");
        double altura = entrada.nextDouble();
        double areaTrapezio = ((baseMenor+baseMaior)*altura)/2;
        System.out.println("A area é: " + areaTrapezio);
        System.out.println("--------------------------------------------------------");   
    }
    public void retangulo(){
        System.out.print("Digite o valor da base do retangulo: ");
        double base = entrada.nextDouble();
        System.out.print("Digite o valor da altura do triangulo: ");
        double altura = entrada.nextDouble();
        double areaRetangulo = base*altura;
        System.out.println("A area é: " + areaRetangulo);
        System.out.println("--------------------------------------------------------");   
    }
    public void paralelogramo(){
        System.out.print("Digite o valor da base do paralelogramo: ");
        double base = entrada.nextDouble();
        System.out.print("Digite o valor da altura do paralelogramo: ");
        double altura = entrada.nextDouble();
        double areaParalelogramo = base*altura;
        System.out.println("A area é: " + areaParalelogramo);
        System.out.println("--------------------------------------------------------");   
    }
    public void circulo(){
        System.out.print("Digite o valor do raio do circulo: ");
        double raio = entrada.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é: " + areaCirculo);
        System.out.println("--------------------------------------------------------");   
    }
}
