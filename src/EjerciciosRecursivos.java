public class EjerciciosRecursivos {
    
    public int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public int sumaConsecutivos(int n){
        if(n==1) {
            return 1;
        }
        int resultadoParcial=sumaConsecutivos(n-1);
        int resultado=n+resultadoParcial;
        return resultado;
        //return sumaConsecutivos(n-1);
    }


    public int getPotencia(int base, int exponente){
        if (exponente==0){
            return 1;
        }
        int resultado=base*getPotencia(base, exponente-1);
        return resultado;
    }

    public int digito(int n){
        if(n<10){
            return n;
        }
        int ultimo=n%10;
        int resultado=ultimo+digito(n/10);
        return resultado;
    }

    public void orden(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        orden(n-1);
    }
    public void Inverso(int n){
        if(n < 10){
            System.out.print(n);
        }
        else{
            System.out.print(n% 10);
            Inverso(n /10);
        }  
    }
}

