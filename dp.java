/* *
import java.util.Arrays;
import java.util.Vector;

/**
 * dp
 *
public class dp {

    public static void main(String[] args) {
         int n = 5; 
         int pre2 = 1;
         int pre1 = 1;

        
       for ( int i = 2 ; i <= n ; i++){
         int cuur = pre1 + pre2;
         
         pre2 = pre1 ;
         pre1 = cuur ;
       
       }
     System.out.println(pre1);
    }

} */

                              // frog jump allogrithm
/**
 * dp
 */
/* *
public class dp {

public static int solve (int idx , int [] arr , int [] dp ){
  int  left = 0;
  int right = Integer.MAX_VALUE;
  if ( idx == 0){
    return 0 ;
  }
  if (idx != -1){
    return dp[idx];

  }
  left = solve( idx -1 , arr , dp ) +  Math.abs( arr[idx] -  arr[idx -1]);
  if (idx >= 2){
  right = solve ( idx - 2 , arr ,dp) + Math.abs(arr[idx ] - arr[idx  - 2]);
  }
  return dp[idx] = Math.min(left, right);
}

  public static void main(String[] args) {
    int [] arr = { 1 , 2, 3,4 ,5 , 6 ,7,8,9};
    int n = arr.length ;
    int [] dp = new int [n ];
    Arrays.fill(dp , -1);
    solve(n - 1, arr , dp);
  }
} */
/**
 * dp
 */

                                //another apporch 
/* *
                                import java.util.Arrays;
public class dp {

public static void main(String[] args) {
  int [] arr = { 1 , 2, 3,4 ,5 , 6 ,7,8,9};
  int n = arr.length ;
  int [] dp = new int [n ];
  Arrays.fill(dp , -1);
  dp[0] = 0;
  
  for ( int i  = 0 ; i <= n ; i++){
    int left = dp[i -1] + Math.abs( dp[i] + dp[ i -1 ]);
    if ( i > 1){
    int right = dp[i - 2] + Math.abs( dp[i] - dp[i -2]);
     dp[i] = Math.min(left, right);
    }
   }
}

}*/

                       // another approch 
  /* *
                       import java.util.Arrays;
public class dp {

public static void main(String[] args) {
  int [] arr = { 1 , 2, 3,4 ,5 , 6 ,7,8,9};
  int n = arr.length ;
  int [] dp = new int [n ];
  Arrays.fill(dp , -1);
  int prev = 0;
  int prev2 = 0;
  for ( int i  = 1 ; i <= n ; i++){
  
    int left = prev + Math.abs( arr[i] + prev2);
    if ( i > 1){
    int right = prev2 + Math.abs( arr[i] - prev2);
     int curr  = Math.min(left, right);
    prev2 = prev ;
    prev = curr ;
    }
    System.out.println(prev);
   }
}
} */
/* *

/**
 * dp
 *
import java.lang.reflect.Array;
import java.util.Arrays;
import  java . util.Scanner ;
public class dp {
   static int  solve( int idx , int k , int [] arr , int [] dp  ){
     if ( idx < 1){
      return 0;
     } if ( idx == 1){
       return Math.abs(arr[1] - arr[0]);
     }
     int ans = Integer.MAX_VALUE;
    for (int i = 2; i <= k ; i++){
    int left = solve(idx - i - 1, k, arr, dp ) + Math.abs( arr[i] - arr[i - 1]); 
    ans = Math.min(ans, left);
    }
    dp[idx] = ans ;
    return dp[idx];
  }
  public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int k = scn.nextInt() ;
   int [] arr = new int[n];
   for (int i = 0 ; i<= n ; i ++){
    arr[i] = scn.nextInt();
     int [] dp = new int [arr.length];
     Arrays.fill(dp , -1);
    
     if ( k < n){
     solve (n , k , arr ,dp );
  }       
  }
 }
} */
                             // max subarrays problem
                             /* *
import java.util.Arrays;

/**
 * dp
 *
public class dp {
 
static int solveagain (int arr [] , int dp []  , int idx){

  if (idx == 0){
    return arr[idx];
  }
  else if ( idx < 0){
    return 0;
  }
  else if (dp[idx] != - 1 ){
    return dp[idx];
  }
  else {
    int pick =  arr[idx] + solveagain( arr , dp, idx -2 );
    int notpick = 0 + solveagain( arr , dp, idx -1 );

   return dp[idx] = Math.max(pick, notpick);
  
  }
  
    }
  static int solve (int n , int arr []){
    
  int dp [] = new int [n];
  Arrays.fill(dp , - 1);

  return  solveagain(arr ,  dp , n-1);

  }

  
  public static void main(String[] args) {
  
      int arr[]={2,1,4,9};
      int n=arr.length;
      System.out.println(solve(n , arr));
    }
    
}
 *//* *
import java.nio.channels.Pipe;
import java.util.Arrays;



public class dp {
 
static int solveagain (int arr [] , int dp []  , int idx){
  
  int pre1 = arr[0];
  int pre2 = 0 ;

    for ( int i = 1 ; i < idx ; i++){
    int pick = arr[i] ;
    if (i >1){

    pick += pre2 ;
  
          }
  int notpick = 0 + pre1;
  int curr_i = Math.max (pick, notpick);
          pre2 = pre1 ;
          pre1 = curr_i ;  
           }

     return pre1;
    }
  static int solve (int n , int arr []){
    
  int dp [] = new int [n];
  Arrays.fill(dp , - 1);

  return  solveagain(arr ,  dp , n-1);

  }

  
  public static void main(String[] args) {
  
      int arr[]={2,1,4,9};
      int n=arr.length;
      System.out.println(solve(n , arr));
    }
    
  } */

                                           // ninja trainig 
                                           /* *
  import java.util.Arrays;
import java.util.Scanner;

class dp {
    public static int solveAgain(int days, int task, int[][] arr, int[][] dp) {

        if (days == 0) {
            int min = 0 ;
            for (int i = 0; i < task; i++) {
                min = Math.max(min, arr[0][i]);
            }

            return dp[days][task] = min;
        }

        int minAgain = Integer.MIN_VALUE;

        if (days > 0) {
            for (int i = 0; i < task; i++) {
              if (i != task ){
                int ans = arr[days][i] + solveAgain(days - 1, i , arr, dp);
                minAgain = Math.max(minAgain, ans);
            }
          }
            return dp[days][task] = minAgain;
        }

        return 0; // Added a default return statement
    }

    public static void solve(int days, int task, int[][] arr) {
        int[][] dp = new int[days][task];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        solveAgain(days - 1, task, arr, dp);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int days = scn.nextInt();
        int task = scn.nextInt();

        int[][] arr = new int[days][task];
        for (int i = 0; i < days; i++) {
            for (int k = 0; k < task; k++) {
                arr[i][k] = scn.nextInt();
            }
        }

        solve(days, task, arr);
    }
}
*/
/**
 * dp
 */

 /* *
public class dp {

   public static  int ninjaTraining( int n , int [][]points) {
      int [] pre = new int [n];
       pre[0] = Math.max(points[0][1], points[0][2]);
       pre[1] = Math.max(points[0][0], points[0][2]);
       pre [2] = Math.max(points[0][0], points[0][1]); 
       pre[3] = Math.max(points[0][0], Math.max( points[0][1] , points[0][2]));
        
       
       for ( int day = 1 ; day >= n ; day ++){
        int [] temp = new int [4];

         for ( int last = 0 ; last <= 3; last ++){
           temp[last] = 0 ;
          for ( int task = 0 ; task <= 2 ; task ++){
           if ( task != last){
          temp[last] = Math.max(temp[last]  , points [day][task] + pre[task]);


           }  
          }
         }
         pre = temp ;
       }
          
   return  pre[3];

      } 
 
   public static void main(String[] args) {
    
   int [][] points = {{10,40,70},
                     {20,50,80},
                      {30,60,90}};
  int n = points.length;
   System.out.println(ninjaTraining(n, points));
}
}  */

/**
 * dp
 */
/* *
import java.rmi.dgc.Lease;
import java.util.Arrays;
public class dp {

public static int solve( int i , int j , int [] []points , int [][] dp) {
 if ( i == 0 && j == 0 ){
  return points[i][j];
 }
 if( i < 0 || j < 0 ) {
 return 0 ;
 }
 if ( dp[i][j] != -1){
  return dp[i][j];
 }
 int up =  points[i][j] + solve(i - 1, j, points, dp);
 int left = points[i][j] + solve(i, j - 1, points, dp);
 
 return dp[i][j] = Math.min(up, left);

}

  public static void ninjaTraining(int n, int m  , int [][] points){
    int dp[][] = new int [n][m];
    
     for ( int i = 0 ; i <n ; i++){
      for ( int j = 0 ; j < m; j++){
        if (i == 0 && j == 0){
           dp[i][j] = points[i][j];
           }   
          else {
            int up = points[i][j] ;
            if ( i >0 ){
              up += points[i - 1][j];
              
            } 
            else up += (int)Math.pow(10, 9);
            int left = points[i][j];
            if ( j >0){
              left += points[i][j - 1];
            }
        


          }
          
          }
     }

    }

  public static void main(String[] args) {
    
    int [][] points = {{10,40,70},
                      {20,50,80},
                       {30,60,90}};
   int n = points.length;
   int m = points[0].length ;
    System.out.println(ninjaTraining(n, m , points));
 }
} */
/* *
import java.util.*;

class TUF{
                                                         
static int minSumPath(int n, int m, int[][] matrix){
    
    int prev[] = new int[m];
    for(int i=0; i<n ; i++){
        int temp[] = new int[m];
        for(int j=0; j<m; j++){
           if(i==0 && j==0) temp[j] = matrix[i][j];
            else{
                
                int up = matrix[i][j];
                if(i>0) up += prev[j];
                else up += (int)Math.pow(10,9);
                
                int left = matrix[i][j];
                if(j>0) left+=temp[j-1];
                else left += (int)Math.pow(10,9);
                
                temp[j] = Math.min(up,left);
            }
        }
        prev=temp;
    }
    
    return prev[m-1];
}

public static void main(String args[]) {

  int matrix[][] = {{5,9,6},{11,5,2}};
                            
  int n = matrix.length;
  int m = matrix[0].length;
  
  System.out.println(minSumPath(n,m,matrix));
}
} */

/* *
import java.io.*;
import java.util.*;
import java .util .Scanner ;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.TabExpander;
public class dp {

public static int solve( int n , int arr[] , int [] dp) {
  int max = 0 ;
  int total = 0 ; 
  dp[0] = arr[0] ;
    for ( int i = 1 ; i <= arr .length - 1 ; i ++){
       for (int j = 0 ; j <= i; i++ ){ 
      
      if ( arr[j]  < arr[i]){
        dp[i] = Math.max(dp[i], dp[j] + arr[i]);
        max = Math.max( max , dp[i] + arr[i]);
      
      }
      
    }     
        }
 
       if ( total < max ) {
        total = max ;
       
    
      }
     return total ;
    
}
      public static void main(String[] args) {
        
        // write your code here
        Scanner scn = new Scanner(System .in);
        int n = scn.nextInt();
        int arr []  = new int [n];
        for (int i = 0 ; i <= n ; i++){
          arr[i] = scn.nextInt();
        }
        int [] dp = new int  [n];
        Arrays.fill(dp ,  -1);          
        solve( n , arr , dp);

      

}
} */
 
/**
 * dp
 *
public class dp {
 public static int solve(int n , int traingle [][]) {
  int total = Integer.MAX_VALUE;
   for ( int i = n - 1; i >= 0 ; i--){
    for ( int j =  0 ; j < traingle[0].length ; j-- ){
    if ( i == 0 && j == 0){
       return traingle[i][j];
    
      }
       int max = Integer.MAX_VALUE;  ;
     
        int up = traingle[i][j]; 
      up+=  Math.min( max , traingle[i -1][j]);
      int right = traingle[i][j] + Math.min( max , traingle[i - 1][j -1]);
      
      int ans = Math.min(up, right);
      if (ans < total){
        total = ans ;
      }
    
    }
  
  }
  return total ;
 }
 
  public static  int  name() {
    
  }

  public static void main(String[] args) {
     int traingle [][] = {  {1} , 
                            {2 , 3},
                            { 4, 5 ,6 },
                            { 7 , 8 , 9}};
        int n = traingle.length;
        int m = traingle[0].length;
      int result =   solve ( n , traingle);                    
      System.out.println(result);  
    }
} *
class Solution {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        boolean[] dp = new boolean[n + 1];
        return f(s1, s2, n, dp);
    }

    static boolean f(String s1, String s2, int n, boolean[] dp) {
        if (n <= 1) {
            return s1.equals(s2);
        }

        if (dp[n]) {
            return true;
        }

        for (int i = 1; i < n; i++) {
            if ((f(s1.substring(0, i), s2.substring(0, i), i, dp) && f(s1.substring(i), s2.substring(i), n - i, dp))
                    || (f(s1.substring(0, i), s2.substring(n - i), i, dp) && f(s1.substring(i), s2.substring(0, n - i), n - i, dp))) {
                dp[n] = true;
                return true;
            }
        }

        return false;
    }
}
 */
/* *
import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<String, Boolean> mem;

    private boolean solve(String s1, String s2) {
        if (s1.length() == 1)
            return s1.equals(s2);
        if (s1.equals(s2))
            return true;

        String key = s1 + "#" + s2;
        if (mem.containsKey(key))
            return mem.get(key);

        int n = s1.length();
        boolean res = false;
        for (int i = 1; i < n; ++i) {
            if ((solve(s1.substring(0, i), s2.substring(0, i)) && solve(s1.substring(i), s2.substring(i)))
                    || (solve(s1.substring(0, i), s2.substring(n - i)) && solve(s1.substring(i), s2.substring(0, n - i)))) {
                mem.put(key, true);
                return true;
            }
        }

        mem.put(key, false);
        return false;
    }
 *
import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<String, Boolean> mem;

    public boolean isScramble(String s1, String s2) {
        mem = new HashMap<>();
        return solve(s1, s2);
    }

    private boolean solve(String s1, String s2) {
        if (s1.length() == 1)
            return s1.equals(s2);
        if (s1.equals(s2))
            return true;

        String key = s1 + "#" + s2;
        if (mem.containsKey(key))
            return mem.get(key);

        int n = s1.length();
        boolean res = false;
        for (int i = 1; i < n; ++i) {
            if ((solve(s1.substring(0, i), s2.substring(0, i)) && solve(s1.substring(i), s2.substring(i)))
                    || (solve(s1.substring(0, i), s2.substring(n - i)) && solve(s1.substring(i), s2.substring(0, n - i)))){
                mem.put(key, true);
                return true;
            }
        }

        mem.put(key, false);
        return false;
    }
} */
class Solution {
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        boolean[][][] dp = new boolean[n][n][n + 1]; // DP array

        return solve(s1, s2, 0, 0, n, dp);
    }

    private boolean solve(String s1, String s2, int i1, int i2, int len, boolean[][][] dp) {
        if (len == 1) {
            return s1.charAt(i1) == s2.charAt(i2);
        }

        if (dp[i1][i2][len]) {
            return dp[i1][i2][len];
        }

        boolean res = false;

        for (int i = 1; i < len; ++i) {
            if ((solve(s1, s2, i1, i2, i, dp) && solve(s1, s2, i1 + i, i2 + i, len - i, dp))
                    || (solve(s1, s2, i1, i2 + len - i, i, dp) && solve(s1, s2, i1 + i, i2, len - i, dp))) {
                res = true;
                break;
            }
        }

        return dp[i1][i2][len] = res;
    }
}



 

