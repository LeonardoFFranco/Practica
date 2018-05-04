/**
 * Created by WINDOWS 8.1 on 30/04/2018.
 */
public class Series {

    public static int[] pares(int n) {
        int [] a = new int[n];
        int j=0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                a[j] = i;
                j++;
            }
        }

        return a;
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

        public static void numerosPrimos(int n){
            int [] v = new int[n];
            int b=1;
            for(int i=0;i<v.length;i++){
                while(i!=n){
                    if(b%2==1){
                        v[i]=b;
                        i++;
                        b++;
                    }else{
                        b++;
                    }
                }
            }
            for(int i=0;i<v.length;i++){
                System.out.print(""+v);
            }
        }
}

