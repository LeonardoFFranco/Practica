/**
 * Created by WINDOWS 8.1 on 30/04/2018.
 */
public class Series {
        public void pares(int n) {
            for (int i = 1; i <= n * 2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }


        public int fibonacci(int n){
            if(n == 0){
                return 0;
            }else if(n == 1){
                return 1;
            }else{
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        public void primos(int n) {
            for (int i = 1; i <= n; i++) {
                if (isPrimo(i)) {
                    System.out.println(i);
                }
            }
        }

        public boolean isPrimo(int n){
            int aux;
            for(int c=2;c<n;c++)
            {
                aux=n%c;
                if(aux==0)
                return false;
            }
            return true;
        }

}

