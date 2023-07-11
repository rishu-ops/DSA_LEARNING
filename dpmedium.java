/* *
    import java.io.*;
    import java.util.*;

public class dpmedium {

	public static int solution(int[][] arr) {
		//write your code here
        int min = 0;
        int [][] dp = new int [arr.length  ][arr[0].length ];
       
        for ( int i = 0; i < arr.length - 1; i ++){
        for ( int j = 0 ; j < arr[0].length - 1 ; j++){

        if(i == dp.length - 1 && j == dp[0].length -1){
          dp[i][j] = arr[i][j];
        }   
        else if ( i == dp.length - 1 )
           {
            dp [i][j] = arr[i][j];
           }        
         else if ( j == dp[0].length  -1){
            dp[i][j] = arr[i][j];
         }  
         else if (arr[i][j] == 0 )
         {
          dp[i][j] = arr[i][j];
         }
         else  {
          int ans = Math.min(arr[i][j + 1],  dp [i + 1] [j]);
            ans = Math.min(ans, arr[i + 1][j + 1]);
              dp[i][j] =  ans + 1;
            if ( dp[i][j] > min){
                min = dp[i][j];
            }
        }
        } 

     }
   
		return min ;
	
}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m =scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		System.out.println(solution(arr));
	}

}
*/
/* *
import java.time.chrono.MinguoChronology;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class dpmedium {
    public static void Solution(int arr[]){
        // write your code here
        int [] dp = new int [arr.length];
            dp[arr.length - 1 ] = 0 ;
               int min = Integer.MAX_VALUE;
               for ( int i = arr.length - 2; i <= 0 ; i++){
               int steps = arr[i];
               for ( int j = 1; j <=  steps && j < arr.length;  j++){
              if(dp[i + j]  != null && dp [i + j] < min ){
                    min = dp[i + j];
                  }
               }          
               if ( min != Integer.MAX_VALUE;){
                dp[i] = min + 1;
               }
                
            }
         }
    
        

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scn.nextInt();

        Solution(arr);
        scn.close();
    }
}

*/
/* *
import java.io.*;
import java.util.*;
import java.util.concurrent.DelayQueue;

public class dpmedium {

   private static class Pair {
      String psf;
      int i;
      int j;

      public Pair(String psf, int i, int j) {
         this.psf = psf;
         this.i = i;
         this.j = j;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }

      //write your code here
      int [][] dp = new int [arr.length][arr[0].length];

            for ( int i = dp.length - 1 ; i >= 0 ; i ++ ){
            for ( int j = dp[0].length - 1 ; j >= 0 ; j++){
            
            if(i == dp.length - 1 && j == dp[0].length - 1){
                 dp[i][j] = arr[i][j] ;                                                 
            }else if (i == dp.length){
                 dp[i][j] = arr[i][j] + dp[i][j + 1];
            }else if (j == dp[0].length){
                dp[i][j] = arr[i][j] + dp[i + 1][j];
            }else {
                 dp[i][j] = arr[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j] );
                                                                             
            }
         }
      }
      ArrayDeque <Pair> qDeque = new ArrayDeque<>(null);
       
      qDeque.add( new Pair (" ", 0 , 0));
      while ( qDeque.size() != 0){
         Pair rem = qDeque.remove();
         if (rem.i == dp.length -1 && rem.j ==dp[0].length -1 ){
            System.out.println(rem.psf);

         }else if (rem.i == dp.length -1 ){
            qDeque.add(new Pair(rem.psf + "H" , rem.i, rem.j + 1));         
         }else if (rem .j == dp[0].length -1){
            qDeque.add(new Pair(rem.psf + "V" ,rem.i + 1, rem.j)); 

         }else {
          if (dp[rem.i][rem.j + 1] < dp[rem.i + 1][rem.j]){
            qDeque.add(new Pair(rem.psf + "H" , rem.i, rem.j + 1));         
          }else if (dp[rem.i + 1][rem.j] < dp[rem.i][rem.j + 1]){
            qDeque.add(new Pair(rem.psf + "V" ,rem.i + 1, rem.j));
          }else {
            qDeque.add(new Pair(rem.psf + "H" , rem.i, rem.j + 1));         
            qDeque.add(new Pair(rem.psf + "V" ,rem.i + 1, rem.j));
            
          }
         }
      } 
      
   }

} */
/* *
import java.io.*;
import java.util.*;

public class  dpmedium {

   private static class Pair {
      String psf;
      int i;
      int j;

      public Pair(String psf, int i, int j) {
         this.psf = psf;
         this.i = i;
         this.j = j;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }

      //write your code here
     int [][] dp = new int [arr.length ][arr[0].length ];
     
     for (int j = arr[0].length - 1 ; j>= 0 ; j++ ){
     for (int i = 0 ; i <= arr.length - 1 ; i++){
     if (j == arr[0].length - 1){
      dp[i][j] = arr[i][j];
     }else if (i == 0){
      dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
     }else if (i == arr.length - 1){
      dp[i][j] = arr[i][j] + Math.max( dp[i][j + 1] , dp[i + 1][j + 1]);
     }else {
      dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1] , Math.max(dp[i - 1][j + 1 ] , dp[i + 1][j + 1]));
           } 
      }
   }

   int max = Integer.MAX_VALUE;
   for ( int i = 0; i<= dp.length ; i++){
      if(dp[i][0] > max){
         max = dp[i][0];
                        }
                                        }
   System.out.println(max);
   
   ArrayDeque<Pair> que = new ArrayDeque<>(null); 
   
   for ( int i = 0; i<= dp.length ; i++){
      if(dp[i][0] == max){
      que.add(new Pair(i + " ", i, 0));
      }
    }
  while (que.size() != 0){
   Pair rem = que.removeFirst();

   if ( rem.j == arr[0].length - 1){
     System.out.println(rem.psf);
   }
    else if(rem.i == 0){
     int x = Math.max(dp[rem.i][rem.j + 1],dp[rem.i +1][rem.j + 1] ); 
    
      if  (x == dp[rem.i][rem.j + 1]){
         que.add(new Pair(rem.psf + "d2", rem.i, rem.j + 1));
      } if (x == dp[rem.i +1][rem.j + 1] ){
         que.add(new Pair(rem.i + "d3", rem.i + 1, rem.j + 1));
      }
      
   
   }else if (rem.i== arr.length -1){
      int x = Math.max(dp[rem.i][rem.j + 1],dp[rem.i - 1][rem.j+ 1] ); 
               
      if  (x == dp[rem.i][rem.j + 1]){
         que.add(new Pair(rem.psf + "d2", rem.i, rem.j + 1));
      }
      if (x == dp[rem.i - 1][rem.j + 1] ){
         que.add(new Pair(rem.i - 1 + "d1", rem.i - 1, rem.j + 1));
      }
      
   }else {
      int x = Math.max(dp[rem.i][rem.j + 1], Math.max(dp[rem.i - 1][rem.j+ 1] , dp[rem. i - 1][rem .j + 1])); 
               
      if  (x == dp[rem.i][rem.j + 1]){
         que.add(new Pair(rem.psf + "d2", rem.i, rem.j + 1));
      }
       if ( x == dp[rem.i - 1][rem.j + 1] ){
         que.add(new Pair(rem.i - 1 + "d1", rem.i - 1, rem.j + 1));
      }
       if (x == dp[rem.i +  1][rem.j + 1] ){
         que.add(new Pair(rem.i +  1 + "d3", rem.i +  1, rem.j + 1));
            }
         }
      }
   }
} */
/* *
import java.io.*;
import java.util.*;

public class Main {

    public static class Pair{
        int i;
        int j;
        String psf;

        public Pair(int i, int j, String psf){
            this.i = i;
            this.j = j;
            this.psf = psf;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());

        //write your code here
         boolean dp [][] = new boolean [arr.length + 1][tar + 1];
        for ( int i = 0 ; i < dp.length ; i++){
         for ( int j = 0 ; j <= dp[0].length ; j++ ){
            if ( j ==0 ){
            dp[i][j] = true ;
            }else if (i == 0){
            dp[i][j] = false ;
            }else {
               if ( dp [i - 1][j] ){
               dp[i][j] = true ;
               }
            else if (j >= arr[i - 1]){
               if (dp[i - 1][j - arr[i - 1]] == true){
               dp[i][j] = true ;
               }
            }
            }
            }
         }
         System.out.println(dp[arr.length][tar]);
         ArrayDeque<Pair> out = new ArrayDeque<>(null);
         out.add(new Pair(n , tar , " "));
         while ( out.size() != 0){
            pair rem = out.removeFirst();                                        
            if ( rem.i == 0 & rem.j == 0){
               System.out.println(rem.psf);
            }
           boolean exc = dp[rem.i -1][rem.j];
           if (exc){
            out.add(new Pair(rem.i -1, rem.j, rem.psf));
           } 
           if (rem.j >= arr[ rem.i - 1]){
           boolean inc = dp[rem.i - 1][ rem.j - arr[rem.i - 1]];  
           if (inc){
           out.add(new Pair(rem.i -1, rem.j - arr[rem. i -1] , rem.psf + (rem.i -1)));
           } 
         }
         
      
      
      
      }

    }
}
*/

/* *
import java.io.*;
import java.util.*;

public class Main {
public static class pair{
   int i ;
   int j ;
   String psf ;
   pair(int i , int j , String psf ){
      this.i = i ;
      this.j = j ;
      this.psf = psf ;
   }
}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] values = new int[n];
        String str1 = br.readLine();
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(str1.split(" ")[i]);
        }

        int[] wts = new int[n];
        String str2 = br.readLine();
        for (int i = 0; i < n; i++) {
            wts[i] = Integer.parseInt(str2.split(" ")[i]);
        }

        int cap = Integer.parseInt(br.readLine());

        //write your code here
        int [][] dp =new int  [values.length + 1][wts.length + 1];
        for ( int i = 0 ; i <= dp.length - 1; i ++){
         for (int j = 0; j <= dp[0].length - 1; j ++){
             dp[i][j]= dp[i -1][j];

          
            if ( j >= wts[i - 1 ]){
               if ( dp[i - 1][j - wts[i -1]] + values[i - 1] > dp[i - 1][j]){
                  dp[i - 1][j]=  dp[i - 1][j - wts[i -1]] + values[i - 1];

               }
            }
         }
              int ans = dp[values.length ][cap];
              System.out.println(ans);
        
              ArrayDeque <pair> st  = new ArrayDeque<>(null); 
              st.add(new pair(values.length, cap ," ")) ;

             while ( st .size() != 0){
             pair rem = st.removeFirst();
             
            if ( rem.i == 0 || rem.j == 0){
             System.out.println(rem.psf);
            }else {
               int exe = dp[ rem .i - 1][rem.j];
               int inc = dp[rem.i - 1][rem.j - wts[rem.i - 1] + values[rem.i - 1]];
                  if (dp[rem.i][rem.j] == inc){
                     st.add((new pair(rem.i - 1, rem.j - wts[rem.i - 1], rem.psf + ( i + 1) + " ")));
                       }
              if (dp[rem.i][rem.j] == exe){
               st.add(new pair(rem.i - 1, rem.j , rem.psf  ));

              }                                                            
             }
           
            }  
            
            }

            }
         }
        */
        /* *
        import java.io.*;
import java.util.*;

public class dpmedium {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for ( int i = 0 ; i <= arr.length -1 ; i++){
     arr[i] = scn.nextInt(); 
                                               }
    if (arr.length == 0){
      return ;
                        }
    int max = Integer.MIN_VALUE;
    int overmax= 0;
    int [] dp = new int [arr.length ];
    for (int i = 0; i <= dp.length - 1; i++){
    for (int j = 0 ; j <= i ; j++){
     dp[0] = 1 ;
 
    if (arr[j] < arr[i]){
      if (dp[j] > max){
      max = dp[j];
        }
    }
}

  dp[i] = max + 1 ;

 if ( overmax > max ){
     overmax = max ;
        }  
     }
 System.out.println(overmax);
   }
}
 */


    
 import java.util.ArrayDeque;
 import java.util.Queue;
 import java.util.Scanner;
 
 public class dpmedium {
     
     public static class Pair {
         int l;
         int i;
         int v;
         String psf;
         
         Pair(int l, int i, int v, String psf) {
             this.l = l;
             this.i = i;
             this.v = v;
             this.psf = psf;
         }
     }
         
     public static void solution(int[] arr) {
         int[] dp = new int[arr.length];
   
         int overmax = 0;
         int max = 0;
         for (int i = 0; i < dp.length; i++) {
             max = 0; // Reset max for each element
             for (int j = 0; j < i; j++) {
                 if (arr[j] <= arr[i]) {
                     if (dp[j] > max) {
                         max = dp[j];
                     }
                 }
             }
             dp[i] = max + 1;
             if (dp[i] > overmax) {
                 overmax = dp[i];
             }
         }
         
         System.out.println(overmax);
         ArrayDeque<Pair> st = new ArrayDeque<>();
         for (int i = 0; i < dp.length; i++) {
             if (overmax == dp[i]) {
                 st.add(new Pair(overmax, i, arr[i], arr[i] + " "));
             }
         }
                      
         while (!st.isEmpty()) {
             Pair rem = st.removeFirst();
             if (rem.i == 0) {
                 System.out.println(rem.psf);
             }
             for (int j = rem.i - 1; j >= 0; j--) {
                 if (dp[j] == rem.l - 1 && arr[j] <= rem.v) {
                     st.add(new Pair(dp[j], j, arr[j], arr[j] + "->" + " " + rem.psf));
                 }
             }
         }
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
 
         int n = scn.nextInt();
 
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = scn.nextInt();
         }
 
         solution(arr);
 
         scn.close();
     }
 }
 
                        


                        


                        


                        


                        