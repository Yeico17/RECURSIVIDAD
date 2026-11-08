public class recursividad {


    public static int factorial (int n){
        if (n==1||n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int suma (int n){
        if (n==1){
            return 1;
        }
        return n+suma(n-1);

    }

    public static int potencia (int base,int exponente){
        if (exponente==0){
            return 1;
        }
        return base*potencia(base, exponente-1);


    }

    

}
