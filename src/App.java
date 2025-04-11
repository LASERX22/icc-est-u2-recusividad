public class App {
    public static void main(String[] args){
        EjerciciosRecursivos serie=new EjerciciosRecursivos();
        
        int fibo=serie.fibonacci(5);
        System.out.println("Resultado del numero 5 de la serie fibonacci: "+fibo);
        int sum=serie.sumaConsecutivos(4);
        System.out.println("Suma de los numeros hasta "+4+" es igual a "+sum);
        int suma=serie.digito(125);
        System.out.println("Resultado de digitos: "+suma);
        int resul=serie.getPotencia(2, 3);
        System.out.println("Resultado de la potencia: "+resul);
    }
}
