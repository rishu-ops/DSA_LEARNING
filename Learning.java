/* *
import javax.swing.plaf.TableUI;

/**
 * learning
 *
public class learning {
 public static int solveagain( int i , int  j , int [][]  traingle ) {
  if ( i == traingle.length - 2 ){
    return traingle[i][j];

  }

 int d = traingle[i ][j] + solveagain(i + 1 , j, traingle   );
 int dg = traingle[i][j] + solveagain(i + 1, j + 1 , traingle ); 
 
 return Math.min(d, dg);

 }
 public static void solve( int [][] traingle ) {
   int ret  = solveagain(0 , 0 , traingle );
   System.out.println(ret);
   

 }

  public static void main(String[] args) {
    int traingle [][] = {  {1} , 
                           {2 , 3},
                           { 4, 5 ,6 },
                           { 7 , 8 , 9}};
      
      solve ( traingle );                            
        
   }
}  */
/* *
import javax.sound.midi.Track;

/**
 * learning
 *
public class learning {   
    static int minimumPathSum(int[][] triangle, int n){
     
      int front[] = new int[n];
      int cur[] = new int[n];
     
     for(int j=0;j<n;j++){
         front[j] = triangle[n-1][j];
     }
     
     for(int i=n-2; i>=0; i--){
         for(int j=i; j>=0; j--){
             
             int down = triangle[i][j]+front[j];
             int diagonal = triangle[i][j]+front[j+1];
             
             cur[j] = Math.min(down, diagonal);
         }
         front=cur;
     }
     
     return front[0];
     
 
}
 public static void main(String args[]) {
 
   int triangle [][] = {{1},
                        {2,3},
                        {3,6,7},
                        {8,9,6,10}};
                             
   int n = triangle.length;
   
   System.out.println(minimumPathSum(triangle,n));
 }
} */
/* *
import java.util.*;

class TUF{


  public static void main(String args[]) {

    int matrix[][] = {{1,2,10,4},
                      {100,3,2,1},
                      {1,1,20,2},
                      {1,2,2,1}};
    
    int n = matrix.length;
    int m = matrix[0].length;
    
    int dp[][]= new int[n][m];
    for(int j=0; j<m; j++){
    dp[0][j] = matrix[0][j]; 

    }
    for (int  i = 1 ; i<n ; i++){
      for ( int  j = 0 ; j<m ; j++){
        
    int up = matrix[i][j] +dp[i- 1][j];
     if ( j - 1>= 0){
    int leftDiagonal = matrix[i][j] + dp[i -1][j- 1];
     
     if ( j + 1 <= m){

    int rightDiagonal = matrix[i][j] + dp[i - 1][j+ 1];
      
  
    
   dp[i][j] = Math.max( up , Math.min(leftDiagonal, rightDiagonal));
     }
    }
    }
    int maxi = Integer.MIN_VALUE;
    
    for(int j=0; j<m;j++){
        maxi = Math.max(maxi,dp[n-1][j]);
    }
    
   System.out.println(maxi);
 
}


  
 
}
}
*/
/* *
import java.util.*;

class TUF {


  static int maximumChocolates(int n, int m, int[][] grid) {

    int dp[][][] = new int[n][m][m];

    for (int row1[][]: dp) {
      for (int row2[]: row1) {
        Arrays.fill(row2, -1);
       for ( int j1 = n -1 ; j1 <= n ; j1++){
        for ( int j2 = 0 ; j2 <= m ; j2 ++ ){
          if ( j1 == j2)
           dp[n -1 ][j1][j2] = grid[n -1 ][j1];
          else
          dp[n -1][j1][j2] = grid[n -1 ][j1] + grid[n -1 ][j2];
          }
       }

     for ( int  i = n - 2 ; i >= 0; i --){
      for( int j1 = 0; j1<= m; j1 ++ ){
        for(int j2 = 0 ; j2 <=m ; j2++){
        int maxi = Integer.MIN_VALUE;

        for ( int di = - 1 ; di <= 1 ; di++){
          for ( int dj = -1 ; dj <= 1; dj++ ){
            int ans;
            if (j1 == j2)
              ans = grid[i][j1];
              else 

              ans = grid[i][j1] + grid[i][j2] 
              
              if ((j1 + di < 0 || j1 + di >= m) ||
                (j2 + dj < 0 || j2 + dj >= m))
                 ans += (int)Math.pow(-10, 9);
                 else 
                 ans += dp[i + 1][j1 + di][j2 + dj];
           
              maxi = Math.max(maxi, ans);
          }
        }
        dp[i][j1][j2] = maxi;
      }
          }
        }
       return dp[0][0][m- 1];
     
    }

    return maxChocoUtil(0, 0, m - 1, n, m, grid, dp);
  }

  public static void main(String args[]) {

    int matrix[][] = {{2,3,1,2},
                      {3,4,2,2},
                      {5,6,3,5}};
    int n = matrix.length;
    int m = matrix[0].length;

    System.out.println(maximumChocolates(n, m, matrix));
  }

   }
}
  
* */
/*

import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * learning
 *
public class learning {
 static boolean subsetsustilk( int  n, int k int [] arr){
   boolean pre [] = new boolean[k +1 ];
   pre[0] = true ;

   if ( arr[0] <= k)
    pre[arr[0]] = true ;
  
   for ( int i = 1 ; i < n ; i ++){
    boolean cur[] = new boolean[k + 1];
    for ( int tar = 1 ; tar <= k ; tar ++){
       boolean nottake = pre[tar];
       boolean taken = false ;
       if ( arr[i] <= tar)
       taken = pre[tar - arr[ i]]; 
        curr[tar]  = nottake || taken ;
    }
     pre = curr; 
   }
 return  pre[k];
 }

  public static void main(String args[]) {

    int arr[] = {1,2,3,4};
    int k=4;
    int n = arr.length;
                                   
    if(subsetsustilk(n, k  , int [] arr));
      System.out.println("Subset with given target found");
    else 
      System.out.println("Subset with given target not found");
  }
  }
  */

/**
 * learning
 */ /* *   
     public class learning {
     public static boolean solve(int n , int sum , int[] arr) {
     boolean pre [] = new boolean[sum + 1 ];
     pre[0]= true ;
     if ( arr[0] <= sum)
     pre[arr[0]] = true ;
     
     
     for ( int i = 1 ; i < n ; i ++){
     boolean cur[] = new boolean[ sum + 1];
     cur[0] = true ;
     for ( int tar = 1 ; tar <= sum ; tar ++){
     Boolean nottake =  pre[tar];
     Boolean take = false ;
     if ( arr[i] <= tar)
     
     take  = pre[tar - arr[i]];
     cur[tar] = nottake || take ; 
     
     }
     pre = cur ;
     
     }
     return pre[sum];
     }
     
     public static void main(String[] args) {
     int arr [] = {2, 2, 5 ,2 ,3 ,1};
     int sum = 0;
     int tar = 0 ;
     int n = arr.length ;
     for ( int  i = 0; i <= n; i++){
     sum +=  arr[i];
     
     if (sum % 2 != 0)
     System.out.println("invalid ans ");
     else 
     tar = sum / 2 ;
     
     if(solve(n, tar, arr))
     System.out.println("The Array can be partitioned into two equal subsets");
     else 
     System.out.println("The Array cannot be partitioned into two equal subsets");
     }
     } 
     
     
     }
     
     */
/* *
  public class learning {
    public static boolean solve(int n, int sum, int[] arr) {
         boolean [][] dp = new boolean [n][sum + 1];
         for ( int i = 0 ; i < n ; i++){
         dp[i][0] = true;
         }
        if (arr[0] <= sum)
            dp[0][arr[0]] = true;

        for (int i = 1; i < n; i++) {
            for (int tar = 1; tar <= sum; tar++) {
                boolean nottake =  dp[i - 1][tar];
                boolean take = false;
                if (arr[i] <= tar)
                    take = dp[i -1][tar - arr[i]];
                dp[i][tar] = nottake || take;
            }
            
        }
        return  dp[n -1 ][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 5, 2, 3, 1 };
        int sum = 0;
        int tar = 0;
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            sum += arr[i];

            if (sum % 2 != 0)
                System.out.println("Invalid answer");
            else
                tar = sum / 2;

            if (solve(n, tar, arr))
                System.out.println("The array can be partitioned into two equal subsets");
            else
                System.out.println("The array cannot be partitioned into two equal subsets");
        }
    }
} */
/* *

public class learning {
  public static boolean solve( int i , int sum, int[] arr) {
      if ( sum == 0)
         return true ;
       if (i == 0)
       return arr[0] == sum;
      
          boolean nottake  =  solve(i - 1,  sum, arr);
          boolean take = false ;
          if ( arr[i] <= sum){
            take =  solve(i - 1,  sum - arr[i], arr);
       
          }   
          return nottake  || take ;
    
  
       }
  

  public static void main(String[] args) {
      int arr[] = { 2, 2, 5, 2, 3, 1 };
      int sum = 0;
      int tar = 0;
      int n = arr.length;
      for (int i = 0; i <= n; i++) {
          sum += arr[i];

          if (sum % 2 != 0)
              System.out.println("Invalid answer");
          else
              tar = sum / 2;

          if (solve( n - 1, tar, arr))
              System.out.println("The array can be partitioned into two equal subsets");
          else
              System.out.println("The array cannot be partitioned into two equal subsets");
      }
  }
} */
/* *
import javax.swing.text.html.MinimalHTMLWriter;

/**
   * learning
   *
  public class learning {
  
     public static boolean subset( int i , int total , int [] arr , int[][]) {
     for  ( int i = 0; i <= n ; i ++){
      return  dp[i][0] = true ;
     }
     if (dp[i] <= t)
       return  dp[i][arr[0]] == true ;
       
       for ( int n = 1; n < i ; n++){

        for(int j = 0 ; j < total ; j ++){
          boolean nottake =  dp [i -1][total];
          boolean take = false ;
          if ( arr[i] <= total)
          take =  dp[i - 1][total - arr[i]];
         
          dp[i][total] = nottake || take;
        }
       }
       int mini = 1e9 ;
       for ( int  i =0; i <= total ; i++){
        if ( dp [n - 1] [i] == true )
        {
          int dif = Math.abs( i - (total - 1));
          mini = Math.min(mini, dif);

        }
       }
       return mini ;

      }


    public static void minSubsetSumDifference( int [] arr & int n ) {
       int total = 0 ;
       for ( int n = 0 ; i <n ; i++){
        total  += arr[i];
       }
       int [][]dp = new int[n][total];
       for ( int i = 0 ; i <= total ; i++){
        boolean dumy = subset( n -1 ,total , arr , dp );
       } 
    }
  
    public static void main(String[] args) {
      int [] arr = { 1 , 2 , 3, 4 };
      int n  = arr.length ;
      minSubsetSumDifference(arr, n);
    }
  }  */
/*
import java.lang.reflect.Array;
import java.util.Arrays;

/**
   * learning
   *
  public class learning {
   public static int solveagain  (int [] arr  ,  int  n , int [][] dp  , int tar) {
  
    for ( int i = 0 ; i <= n   ; i++){
       dp [i][0] = 1;
    }
     if ( arr[0] <= tar )
     dp[0][arr[0]] = 1 ;
  
       for ( int  i= 1 ; i< n ; i++){
        for (int  j = 0 ; j< tar ; j++){
          int nottake  = dp[ i-1 ][j];
          int take  = 0;
          if ( arr[i] <= j  )     
          take  = dp[n -1][j - arr[i]]; 
          dp[i][j] = nottake + take ;
           
          }
     
      }
       return dp[n - 1][tar] ;
    
       
    } 
   
    public static int solve(int [] arr , int n ){
    int tar = 3;
    int [][] dp = new int [n][tar + 1];
    for ( int[] row : dp){
      Arrays.fill(dp , -1);
     
    }

    return  solveagain(arr, n, dp, tar);
   }

    public static void main(String[] args) {
      int arr [] = { 1 , 2, 3   };
      int n = arr.length ;
      System.out.println(solve( arr , n ));
    }
  } */
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * learning
 *
public class learning {
 public static int solve(int [] wt , int [] val , int W , int n) {
   int dp [][] = new int  [n][W + 1];
   for ( int row [] : dp){
    for ( int i = wt[0] ; i <= W ; i ++){
       dp[0][i] = val[0];
    }

   
if ( dp[n][W] != - 1)   
   return dp[n][W];
    int  nottake = 0 +  dp[n - 1][W];
    int take =  Integer.MIN_VALUE;
    if ( wt[n] <= W)
    take  = val[n] +   dp [n - 1][W - wt[n]];
    
    return  dp [n][W] = Math.max(nottake, take);

  }

}
 public static void main(String[] args) {
    int wt[] = {1,2,4,5};
    int val[] = {5,4,8,6};
    int W=5;
     int n = wt.length ;
      
     System.out.println(solve(wt , val,W , n));
                }

}
*/
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
* learning
*
public class learning {
public static int solve( int [] arr ,int tar , int n) {
int ans = 0;
if ( n == 0){
if ( tar %  arr[n] == 0  )
return arr[n];
else  return 0 ;
}
int nottake = 0 + solve( arr , tar, n - 1);
int take = Integer.MAX_VALUE;
if ( arr[n] <= tar)
take =  1 + solve (arr, tar - arr[n] , n);
ans = Math.min(nottake, take);
return ans ;
} 



}
public static void main(String[] args) {
int coin[] = {1,2,4,5};

int tar = 8;
int n = coin.length ;

System.out.println(solve( coin , tar ,  n));
  }

} */
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
  * learning
  */
/* *
  public static int solveagain( int [] arr , int [][]dp , int tar , int n) {
    if ( n == 0)
    if (tar % arr[0] == 0)
    return tar / arr[0];
     else return  (int)Math.pow(10,9);
     
      
   
      if ( dp [n][tar] != -1)
        return dp[n][tar];
   
        int nottake = 0 + solveagain( arr , dp  ,tar, n - 1 );
        int take = Integer.MAX_VALUE;
   
        if ( arr[n] <= tar)
        take =  1 + solve (arr, tar - arr[n] , n);
         dp[n][tar] = Math.min(nottake, take);
       return  dp[n - 1][tar] ;
     
    } */
/* *
public class learning {

public static int  solve(int [] coins , int tar , int n) {
int ans = 0 ;
int dp [][] = new int [n][tar + 1];
for ( int [] i : dp){
  Arrays.fill(i , -1);
  for ( int j = 0; j<= tar ; j++){
    if (n == 0)
       if (  tar % coins[j] == 0)
        return tar / coins[j]; 
      }
   for ( int k = 1 ; k<= n; k ++){
    for ( int j = 0 ; j <= tar ;j++){
      int notake = dp[n -1][tar];
      int  take = Integer.MAX_VALUE;
      take = dp[n -1][ tar - coins[k]];

         dp[n][tar] =  notake + take ;

    }
   }    
    
}
return  dp[n -1][tar];
}
public static void main(String[] args) {
int coin[] = {1,2,4,5};

int tar = 8;
int n = coin.length ;
  
 System.out.println(solve( coin , tar ,  n));
            }


}
*/

/* *
import java.util.*;


class learning{
static int cutRodUtil(int[] price, int ind, int N,int[][] dp){
if ( ind == 0){
  return N * price[0];
}
  if ( dp[ind][N] !=  -1){
   return  dp[ind][N] ;
  }
int nottake  = 0 + cutRodUtil(price, ind -1 , N , dp);
int take = Integer.MIN_VALUE;
 int rod = ind  + 1 ;
 if ( rod <= N )

take = price[ind] +  cutRodUtil(price, ind , N - rod , dp);
   return  dp[ind][N] = Math.max( nottake,take);
 
}


static int cutRod(int[] price,int N) {

 int dp[][]=new int[N][N+1];
   
   for(int row[]:dp)
   Arrays.fill(row,-1);

   for ( int n = 0 ; n <= N ; n++){
     dp[0][n]  = n * price[0];
   }

   for ( int ind = 1 ; ind < N ; ind++){
     for ( int j = 0 ; j <= N ; j++){
   
       int notake =  0 + dp[ind - 1][j];
     
       int take = Integer.MIN_VALUE;
      int rod  = ind + 1;
      if ( rod <= j)
     take  = price[ind] + dp[ind][j - rod];
     dp[ind][j] = Math.max( notake,take);
   }
 }
 return dp[ N - 1][N];
}

public static void main(String args[]) {

 int price[] = {2,5,7,8,10};
 
 int n = price.length;
                                
 System.out.println("The Maximum price generated is "+cutRod(price,n));
}
}
*/
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * learning
 *
public class learning {
  /* *
static int solve ( String s1 , String s2 ,int dp[][] , int n , int m){
if ( n < 0|| m < 0){
  return 0;
}
 if ( dp [n][m] != -1 )
 return dp[n][m];

 if ( s1.charAt(n) == s2.charAt(m) )
 
 return dp[n][m] =  1 + solve(s1, s2, dp, n - 1, m - 1);
  else
  return dp[n][m]= 0 +  Math.max(solve(s1 , s2, dp,  n -1 , m) , solve(s1, s2, dp,  n , m - 1));
 

} *



static  int lcs ( String s1 , String s2){
 int n = s1.length() ;
 int m = s2.length();
 int pre [] = new int [n + 1];
 int cur [] = new int [ m +1];
 
 /* *
 for ( int i [] : dp)
  Arrays.fill(i , - 1);
  
  for (int i = 0; i <= n ;i++){
    dp[i][0] = 0;
   } 

   for ( int i = 0; i <= m; i++){
    dp[0][i] = 0 ;
   } *
   for ( int i = 1; i <= n ; i++){

    for ( int j = 1; j<= m ; j++){
      if ( s1.charAt(n - 1) == s2.charAt(m -1))
         cur[j] =  1 +  pre[j -1];
      else 
       cur[m] =  0+ Math.max(pre[j] , cur[j -1]);
    }
     pre = ( int[])( cur .clone());
   }
    return pre[m];
  }
  
  public static void main(String[] args) {
    String s1 = " abcdccc";
    String s2 =  "abfdecc";
    System.out.println( lcs (s1 , s2 ) );
  }
} */
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * learning
 *
public class learning {
 public static int solve( String s1 , String s2 , int n , int m ){
   int dp [][] = new int  [n +1][m +1];
 
   for ( int k = 0; k<=n ; k++){
        dp[k][0] = 0;
   }
 for ( int j = 0; j<=m ; j++){
        dp[0][j] = 0;
   }
  for ( int ind = 1 ; ind <= n ; ind++){
    for ( int ind2 = 1 ; ind2 <= m ; ind2 ++){

      if ( s1.charAt(ind -1 ) == s2.charAt(ind2 - 1))
       dp[n][m] = 1 + dp[ind - 1][ind2 - 1];
      else
        dp[n][m] = 0 + Math.max(dp[n -1][m] , dp[n][m -1]);
        
         }
  } 
  
  int len = dp[n][m] ;
   int t = n;
   int j = m;
   int ind = len - 1 ;
   String str = " ";  
   for  (int k = 1 ; k <= len ; k++){
    str += "$";
   }
   StringBuilder ss = new StringBuilder(s1);
   StringBuilder str2 = new StringBuilder(str);
   while ( t >0 && j > 0){
  if ( ss.charAt(t -1) == s2.charAt(j-1) ){
   str2.setCharAt(ind, ss.charAt(t - 1));
   ind -- ;
   t--;
   j--;
   }
 else if ( ss.charAt(t -1 ) > s2.charAt(j -1)){
   t--;
 }
 else 
   j--;

   }
   System.out.println(str2);
  }

  public static void main(String[] args) {
    String s1 = " abc" ;
    String s2 = " cba" ;
    int n = s1.length() ;
    int m = s2.length() ;
   solve( s1 , s2 , n , m );
  }
}
 */
/* *
import java.util.*;

class TUF{
static int lcs(String s1, String s2){
	//	Write your code here.
    
    int n = s1.length();
    int m = s2.length();
    
    int prev[]=new int[m+1];
    int cur[]=new int[m+1];

    int ans = 0;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                int val = 1 + prev[j-1];
                cur[j] = val;
                ans = Math.max(ans,val);
            }
            else
                cur[j] = 0;
        }
        prev=cur;
    }
    
    return ans;
    
}

public static void main(String args[]) {

  String s1= "abcjklp";
  String s2= "acjkp";
                                 
  System.out.println("The Length of Longest Common Substring is "+lcs(s1,s2));
}
} */
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * learning
 *
public class learning {
 
  public static int lcs (String s1 , String s2) {
     int n = s1.length() ;
     int m = s2.length() ;
     int pre [] = new int[n + 1];
     int curr [] = new int [m + 1];
      
      
    for ( int j = 1 ; j<= n; j++){
    for ( int k = 1; k <= m ; k++){
    if (s1.charAt(j - 1) == s2.charAt(k - 1))
    curr[k]  = 1 +  pre[k-1];
  
  else 
   curr[k] = Math.max (pre[k], curr[k -1]);

  }
  pre = curr ;
}
return  pre[m];
  }  
  static int longestPalindromeSubsequence(String s){
    String t = s;
    String ss=new StringBuilder(s).reverse().toString();
    return lcs(ss,t);
}

public static void main(String args[]) {

  String s= "bbabcbcab";
                                 
  System.out.print("The Length of Longest Palindromic Subsequence is ");
  System.out.println(longestPalindromeSubsequence(s));
}
}
 */
/**
 * learning
 *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * learning
 *
public class learning {
 
  public static int lcs (String s1 , String s2) {
     int n = s1.length() ;
     int m = s2.length() ;
     int pre [] = new int[n + 1];
     int curr [] = new int [m + 1];
      
      
    for ( int j = 1 ; j<= n; j++){
    for ( int k = 1; k <= m ; k++){
    if (s1.charAt(j - 1) == s2.charAt(k - 1))
    curr[k]  = 1 +  pre[k-1];
  
  else 
   curr[k] = 0 + Math.max (pre[k], curr[k -1]);

  }
  pre = curr ;
}
return  pre[m];
  }  
  static int longestPalindromeSubsequence(String s){
    String t = s;
    String ss=new StringBuilder(s).reverse().toString();
    return lcs(ss,t);
}

 static int mininisertion (String s){
  int m = s.length() ;
  int k = longestPalindromeSubsequence(s);
  return m -k ;
 }
public static void main(String args[]) {

  String s= "abcaa";
                            
  System.out.println("The Minimum insertions required to make string palindrome: "
  +mininisertion(s));
}
} */
/* *
import java.util.Arrays;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

/**
  * learning
  *
 public class learning {
  static int lcs ( String s1 , String s2 ){
      int m = s1.length() ;
      int n = s2 .length() ;
    int dp[][] = new int [m + 1][n + 1];
   for ( int  i[] : dp)
    Arrays.fill( i , -1);
    for ( int  i = 0 ; i<= m ; i++){
      dp[i][0] = 0 ;
    }
    for ( int j = 0 ; j<= n ; j++){
      dp[0][j] = 0 ;
    }
   
    for ( int  k = 1 ; k <= m ; k ++){
      for ( int  j = 1 ; j <= n ; j++ ){
      if ( s1.charAt(k -1) == s2.charAt(j -1))
       dp[k][j] =  1 + dp[k - 1][j -1];
      else 
      dp[k][j] = 0 + Math.max(dp[k -1][j], dp[k][ j-1]); 
      }
         
  }
  return dp[m][n]; 
}
  static int solve( String s1 ,  String s2){
   int m = s1.length() ;
   int n = s2 .length() ;
   int k = lcs( s1 , s2  );
   return ( m - k) + ( n- k);  
   
  }
  public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = " ans";
    System.out.println(solve( s1 , s2));
  }
 } */
/**
 * learning
 */
/* *
import java.util.Arrays;
public class learning {
static String lcs ( String s1 , String s2 ){
    int m = s1.length() ;
    int n = s2 .length() ;

  int dp[][] = new int [m + 1][n + 1];
  for ( int  i = 0 ; i<= m ; i++){
    dp[i][0] = 0 ;
  }
  for ( int j = 0 ; j<= n ; j++){
    dp[0][j] = 0 ;
  }
 
  for ( int  k = 1 ; k <= m ; k++){
    for ( int  j = 1 ; j <= n ; j++ ){
    if ( s1.charAt(k -1) == s2.charAt(j -1))
     dp[k][j] =  1 + dp[k - 1][j -1];
    else 
    dp[k][j] = 0 + Math.max(dp[k -1][j], dp[k][ j-1]); 
    }
}
int len = dp[m][n];
int i = m ;
int j = n;

int  ind  = len - 1 ;
String ans = " ";

while ( i > 0 && j > 0 ) {
if ( s1.charAt( i -1) == s2.charAt(j -1)){
  ans  += s1.charAt( i -1);
  ind -- ;
  i -- ;
  j -- ;

}
else if ( dp[i -1][j] > dp[i][j -1]){
  ans += s1.charAt(i -1);
  i--;
}
else {
  ans += s2.charAt(j -1);
  j--;
  }
}

  while ( i >= 1){
  ans += s1.charAt(i -1);
  i --;

}
while ( j >= 1 ){
ans += s2.charAt(j -1);
j--;

   }
String ans2 = new StringBuilder(ans).reverse().toString();

return  ans2;    
} 

  public static void main(String[] args) {
  String s1 = "broot";
  String s2 = " grote";
  System.out.println(lcs( s1 , s2));
}
} */
/* *
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * learning
 *
public class Learning {
  static int prime = ( int) ( Math.pow(10, 9) + 7);
  public static int solve(String s1 , String s2 , int n ,int m , int [][] dp) {
    if ( n < 0)
    return 0 ;
    if ( m < 0)
    return 1 ;    
     if (dp[n][m] != -1)
            return dp[n][m];
 if ( s1.charAt(n) == s2.charAt(m )){
   int leaveOne = solve(s1,s2,n-1,m-1,dp);
        int stay = solve(s1,s2,n-1,m,dp);
        
        return dp[n][m] = (leaveOne + stay)%prime;
 }else {

  return dp[n][m ] = solve(s1, s2, n - 1, m, dp);
  }
  }
public static int  Subsequence( String s1 , String s2  ,int n , int m) {
  int dp [][] = new int[ n + 1][m  + 1 ];
  for ( int[] i : dp)
  Arrays.fill( i , - 1);
  
               return    solve( s1 , s2 , n - 1, m - 1, dp)  ;
}


  public static void main(String[] args) {
    String s1  = " babgbad" ;
    String s2 =   "bag";
    System.out.println(Subsequence( s1 , s2 ,  s1.length() , s2.length()));
  }
  
}
  /* *
import java.util.*;

class TUF{
static int prime = (int)(Math.pow(10,9)+7);

static int countUtil(String s1, String s2, int ind1, int ind2,int[][] dp){
    if(ind2<0)
        return 1;
    if(ind1<0)
        return 0;
    
    if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
    
    if(s1.charAt(ind1)==s2.charAt(ind2)){
        int leaveOne = countUtil(s1,s2,ind1-1,ind2-1,dp);
        int stay = countUtil(s1,s2,ind1-1,ind2,dp);
        
        return dp[ind1][ind2] = (leaveOne + stay)%prime;
    }
    
    else{
        return dp[ind1][ind2] = countUtil(s1,s2,ind1-1,ind2,dp);
    }
}

static int subsequenceCounting(String t, String s, int lt, int ls) {
    // Write your code here.
    
    int dp[][]=new int[lt][ls];
    for(int rows[]: dp)
    Arrays.fill(rows,-1);
    return countUtil(t,s,lt-1,ls-1,dp);
} 

public static void main(String args[]) {

  String s1 = "babgbag";
  String s2 = "bag";

  System.out.println("The Count of Distinct Subsequences is "+
  subsequenceCounting(s1,s2,s1.length(),s2.length()));
}
} */
/**
 * Learning
 *
import java.util.Arrays;
public class Learning {
    public static int solver(String s1, String s2, int n, int m , int [][]dp) {
        if (n < 0)
            return m + 1;
        if (m < 0)
            return n + 1;
               if ( dp[n][m] != -1 ){
                return dp[n][m];
               }
        if (s1.charAt(n) == s2.charAt(m)) {
            return dp[n][m] = solver(s1, s2, n - 1, m - 1 , dp) ;
        } else {
           return dp[n][m] =  1 + Math.min(solver(s1, s2, n - 1, m - 1 ,dp),
                    Math.min(solver(s1, s2, n - 1, m , dp), solver(s1, s2, n, m - 1 , dp)));
        }
    } */

/* *    
import java.util.*;

class TUF{

static int editDistance(String S1, String S2){
  
  int n = S1.length();
  int m = S2.length();
  
  int[][] dp=new int[n+1][m+1];
   for(int i=0;i<=n;i++){
      dp[i][0] = i;
  }
  for(int j=0;j<=m;j++){
      dp[0][j] = j;
  }
  
  for(int i=1;i<n+1;i++){
      for(int j=1;j<m+1;j++){
          if(S1.charAt(i-1)==S2.charAt(j-1))
              dp[i][j] = 0+dp[i-1][j-1];
          
          else dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
      }
  }
  
  return dp[n][m];
}

public static void main(String args[]) {

String s1 = "horse";
String s2 = "ros";

System.out.println("The minimum number of operations required is: "+
editDistance(s1,s2));
}
} */
/* *
import java.util.*;

class TUF {
  static boolean isAllStars(String S1, int i) {
    for (int j = 0; j <= i; j++) {
      if ( S1.charAt(j) != '*' )
          return false;
    }
      return true;
  }
  /* *

  static int wildcardMatchingUtil(String S1, String S2, int i, int j, int[][] dp) {

    //Base Conditions
    if (i < 0 && j < 0)
      return 1;
    if (i < 0 && j >= 0)
      return 0;
    if (j < 0 && i >= 0)
      return isAllStars(S1, i) ? 1 : 0;

    if (dp[i][j] != -1) return dp[i][j];

    if (S1.charAt(i) == S2.charAt(j) || S1.charAt(i) == '?')
      return dp[i][j] = wildcardMatchingUtil(S1, S2, i - 1, j - 1, dp);

    else {
      if (S1.charAt(i) == '*')
        return (wildcardMatchingUtil(S1, S2, i - 1, j, dp) == 1 || wildcardMatchingUtil(S1, S2, i, j - 1, dp) == 1) ? 1 : 0;
      else return 0;
    }
  }  *

  static boolean wildcardMatching(String S1, String S2) {

    int n = S1.length();
    int m = S2.length();

   boolean pre [] = new boolean [n + 1];
     boolean cur [] = new boolean [m + 1];
   
     pre[0] = true ;
     /* *
     for ( int  i= 1 ; i <= n ; i ++){
       cur[0] = false ;
     }
      for ( int j = 1 ; j<= n ; j++){
         pre[j] =  true;
      }
      for ( int i = 1 ; i<= n ; i++){
        dp[i][0] = isAllStars(S1, i);
      }
      *

      for ( int i = 1 ; i <= n ; i ++){
       for ( int  j = 1 ; j <= m ;  j ++){
        if ( S1.charAt(i - 1) == S2.charAt(j -1) || S1.charAt(i - 1)== '?' )
         cur[j] =  pre[j - 1];
       
      else  if  ( S1.charAt( i -1) == '*'){
           cur[j] =  pre[j] || cur[j -1];
        }
        else  cur[j] = false ;
       }
       pre = (boolean[]) cur.clone();    
      }
  return  pre[m];
  }

  public static void main(String args[]) {

    String S1 = "ab*cd";
    String S2 = "abdefcd";

     if (wildcardMatching(S1, S2) == 1 
     if ( wildcardMatching(S1, S2) ) 
   System.out.println("String S1 and S2 do match");
    else System.out.println("String S1 and S2 do not match");
  }
} */

/**
 * Learning
 */

/* * 
class TUF{
static int maximumProfit(int []Arr){
    // Write your code here.
	int maxProfit = 0;
	int mini = Arr[0];
	
	for(int i=1;i<Arr.length;i++){
        int curProfit = Arr[i] - mini;
        maxProfit = Math.max(maxProfit,curProfit);
        mini = Math.min(mini,Arr[i]);
        }
	return maxProfit;
}

public static void main(String args[]) {

  int[] Arr  ={7,1,5,3,6,4};

  System.out.println("The maximum profit by selling the stock is "+
  maximumProfit(Arr));
}
}

public class Learning {
    public static int maximumprofit(int[] Arr) {
        int maxp = 0;
        int mini = Arr[0];

        for (int i = 1; i < Arr.length; i++) {
            int cur = Arr[i] - mini;
            maxp = Math.max(maxp, cur);
            mini = Math.min(mini, Arr[i]);
        }
        return maxp;
    }

    public static void main(String[] args) {
        int[] Arr = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + maximumprofit(Arr));
    }
} *

import java.sql.Array;
import java.util.Arrays;

/**
 * Learning
 */
/*
public class Learning {
  public static  int  maxprofit(int [] prices , int n , int i , int buy , int cap ) {
     if ( i == n || cap == 0){
      return 0 ;
     }
    int profit = 0;

    if ( buy == 0  ){
    profit = Math.max(0 + maxprofit(prices, n, i + 1 , 1, cap),
    -prices[i] + maxprofit(prices, n, i + 1 , 0 ,  cap));

  }
  if ( buy == 1){
    profit = Math.max( 0 + maxprofit(prices, n, i + 1, 0 , cap) ,
     prices[i] + maxprofit(prices, n, i + 1 , 1, cap - 1));
  } 

 return profit ;

  }
  

  public static void main(String[] args) {
    int prices  [] = { 3 , 3 , 5, 0 , 0 , 3 ,1, 4};
    int  n = prices.length;
    System.out.println(maxprofit(prices , n - 1 , 0  ,0 , 2)); 
  }
}
 */
/* *
class Solution {
    static boolean isAllStars(String S1, int i) {
    for (int j = 0; j <= i; j++) {
      if ( S1.charAt(j) != '*' )
          return false;
    }
      return true;
  }
    public  boolean isMatch(String s, String p ) {
     int n = s.length() ;
     int m = p.length() ;
    int dp[][] = new int [n + 1 ][m + 1] ;
    for( int rows[] : dp)
     Arrays.fill(rows,-1);
      return wildcardMatchingUtil(s , p , n , m , dp) == 1 ;
    
      }
  

      public static boolean wildcardMatchingUtil(String s , String p ,int i ,int j , int [][]dp) {
      
        //Base Conditions
    if (i < 0 && j < 0)
      return 1;
    if (i < 0 && j >= 0)
      return 0;
    if (j < 0 && i >= 0)
      return isAllStars(s, i) ? 1 : 0;
          if (dp[i][j] != -1)
      return dp[i][j];

    if (dp[i][j] != -1) return dp[i][j];

    if (s.charAt(i) == s.charAt(j) || p.charAt(i) == '*')
      return dp[i][j] = wildcardMatchingUtil(s, p, i - 1, j - 1, dp);

    else {
      if (s.charAt(i) == '.')
        return (wildcardMatchingUtil(s, p, i - 1, j, dp) == 1 || wildcardMatchingUtil(s, p, i, j - 1, dp) == 1) ? 1 : 0;
      else return 0;
    }
  } 
} *
class Solution {
    static boolean isAllStars(String S1, int i) {
    for (int j = 0; j <= i; j++) {
      if ( S1.charAt(j) != '*' )
          return false;
    }
      return true;
  }
    public  boolean isMatch(String s, String p ) {
     int i = s.length() ;
     int j = p.length() ;
      
   if (i < 0 && j < 0)
      return true;
    if (i < 0 && j >= 0)
      return false;
    if (j < 0 && i >= 0)
      return isAllStars(s, i) ;
                      if (s.charAt(i) == p.charAt(j) || p.charAt(i) == '*')
     if ( isMatch(s, p, i - 1, j - 1 ) == true)
     return true ;
   

    else {
      if (s.charAt(i) == '.')
        if (  (isMatch(s, p, i - 1, j )   || isMatch(s, p, i, j - 1)) == true)
      else { return false;
      }
       

    }
      }
 */
/* *
import java.util.Arrays;

class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] rows : dp)
            Arrays.fill(rows, -1);
        return wildcardMatchingUtil(s, p, n - 1, m - 1, dp) == 1;
    }

    private static int wildcardMatchingUtil(String s, String p, int i, int j, int[][] dp) {
        // Base Conditions
        if (i < 0 && j < 0)
            return 1;
        if (i < 0 && j >= 0)
            return isAllStars(p, j) ? 1 : 0;
        if (i < 0 )
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '*')
            return dp[i][j] = wildcardMatchingUtil(s, p, i - 1, j - 1, dp);

        if (p.charAt(j) == '.') {
            return (wildcardMatchingUtil(s, p, i - 1, j, dp) == 1 ||
                    wildcardMatchingUtil(s, p, i, j - 1, dp) == 1)   ||
                    wildcardMatchingUtil(s, p, i - 1, j - 1, dp) == 1 ? 1 : 0;
        } else {
            return 0;
        }
    }

    private static boolean isAllStars(String p, int j) {
        for (int k = 0; k <= j; k++) {
            if (p.charAt(k) != '*')
                return false;
        }
        return true;
    }
}
 */
/* *
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        return f(n - 1, m - 1, s, p);
    }

    private boolean f(int n, int m, String s, String p) {
        if (n < 0 && m < 0)
            return true;
        if (n > 0 && m <=  0)
        return false ;
         if ( n < 0 && m >= 0){
            return isAllStars(p, m);
         }
        if (s.charAt(n) == p.charAt(m) || p.charAt(m) == '*') {
            return f(n - 1, m - 1, s, p);
        }

        if (p.charAt(m) == '.') {
            return f(n , m - 1, s, p) || f(n - 1, m, s, p);
        }

        return false;
    }

    private boolean isAllStars(String p, int j) {
        for (int k = 0; k <= j; k++) {
            if (p.charAt(k) != '*')
                return false;
        }
        return true;
    }
}
  *

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Learning
 *
  public class Learning {
 /* *
  public  static int getAns(int [] poins  , int n , int ind , int buy , int cap , int [][][] dp){
    if(ind==n || cap==0) return 0; //base case
    
    if(dp[ind][buy][cap]!= -1)
        return dp[ind][buy][cap];

  int profit ;
  
  if ( buy == 0){
    profit = Math.max( 0 + getAns(poins, n, ind + 1 , 1, cap , dp) ,
    profit = -poins[ind] + getAns(poins, n,  ind  + 1,  0 , cap  , dp)); 
  }
   else {
     profit  = Math.max( 0 +  getAns(poins, n, ind  + 1, 0 , cap - 1 , dp ),
     profit = poins[ind] +   getAns(poins, n, ind  + 1, 1 , cap , dp));
     
   }
return dp[ind][buy][cap] =  profit ;

  } */
/* *
 public static int solve(int [] poins  , int n  ) {
   int dp [][][] = new int [n + 1][2][3]; // 0  based conditons deal karne ke liye hai 
    for (int i = 0; i < n; i++) {
   for (int j = 0; j < 2; j++) {
       for (int k = 0; k < 3; k++) {
           dp[i][j][k] = -1;
       }
     }
   }

         
      for ( int in = n -1 ; in >= 0 ; in--){
       for( int jn = 0 ; jn<= 1 ; jn++){
         for ( int c = 1 ; c <= 2 ; c++ ){

        if ( jn == 0){
           
      dp[in][jn][c] = Math.max (0 + dp[in + 1][1][c] , 
      dp[in][jn][c ]= -poins[in] +  dp[in + 1] [0] [c] ); 
 }
   if( jn == 1) {
        dp[in][jn][c] = Math.max (0 + dp[in + 1][0][c - 1] , 
        dp[in][jn][c]  = poins[in] +  0 + dp[in + 2][1][c ]);
    
  }


        }

         }
       }
 return dp[0][0][2] ;
 }
  public static void main(String[] args) {
   int [] poins = {3,3,5,0,0,3,1,4};
   int  n = poins.length ;
   
   System.out.println (solve ( poins , n ) );
  }
}
*/
/* *
public static int solve(int [] poins  , int n  ) {
    int dp [][] = new int [n + 2][2]; // 0  based conditons deal karne ke liye hai 
        
       for ( int in = n -1 ; in >= 0 ; in--){
        for( int jn = 0 ; jn<= 1 ; jn++){
     

         if ( jn == 0){
            
       dp[in][jn] = Math.max (0 + dp[in + 1][1] , 
       dp[in][jn]= -poins[in] +  dp[in + 1] [0]); 
  }
    if( jn == 1) {
         dp[in][jn] = Math.max (0 + dp[in + 1][0] , 
         dp[in][jn]  = poins[in] +  0 + dp[in + 2][1]);
     
   }


         }

          }
      
  return dp[0][0] ;
  }
   public static void main(String[] args) {
    int [] poins = {3,3,5,0,0,3,1,4};
    int  n = poins.length ;
    
    System.out.println (solve ( poins , n ) );
   }
  }*
import java.util.Arrays;

/**
   * InnerLearning
   */

/*public static int solve(int [] poins , int n , int i  , int buy , int [][] dp ) {
   if (i == n ){
   return 0 ;
 }
 int profit = 0 ; 
 if ( dp[i][buy] != -1 ){
   return dp[i][buy];
 }

 if ( buy == 0){
    profit =  Math.max( 0 + solve(poins, n, i + 1, 1 , dp) , 
    -poins[i] +  solve(poins, n, i + 1, 0 , dp));
 }
 if( buy == 1){
 profit =  Math.max( 0 + solve(poins, n, i + 1, 0 , dp) , 
     poins[i] - 2 +  solve(poins, n, i + 1, 1 , dp));
 }
 return  dp[i][buy] = profit ;

   }
*/
/* *

  public static int anh(int[] poins, int n) {
      if (n == 0)
          return 0;

      int[][] dp = new int[n + 1][2];

      for (int i = n - 1; i >= 0; i--) {
          for (int j = 0; j <= 1; j++) {
              if (j == 0) {
                  dp[i][j] = Math.max(0 + dp[i + 1][0], -poins[i] + dp[i + 1][1]);
              }
              if (j == 1) {
                  dp[i][j] = Math.max(0 + dp[i + 1][0], poins[i] - 2 + dp[i + 1][1]);
              }
          }
      }
      return dp[0][0];
  }

  public static void main(String[] args) {
      int[] poins = {3, 3, 5, 0, 0, 3, 1, 4};
      int n = poins.length;

      System.out.println(anh(poins, n));
  }
}

 */

/* *
public class Learning {
    public static int  getAns(int[] arr, int n, int i, int pre , int [][]dp) {
        if (i == n) {
            return 0;
        }
         if ( dp[i][pre + 1] != - 1){
          return dp[i][pre + 1 ];
    
         }
        int take = 0;
        if (i == -1 || arr[i] > arr[pre]) {
            take = 1 + getAns(arr, n, i + 1, i , dp);
        }
        int nottake = getAns(arr, n, i + 1, pre , dp);
         dp[i][pre] = Math.max(take, nottake);
        return dp[i][pre + 1];
    }
    static int longestIncreasingSubsequence(int arr[], int n){
    
    int dp[][]=new int[n][n+1];
    for(int row[]: dp)
    Arrays.fill(row,-1);
    
    return getAns(arr,n,0,-1,dp);
}

 
    public static void main(String[] args) {
        int arr[] = { 10, 9, 18, 20, 100, 16 };
        int n = arr.length;

        int result = longestIncreasingSubsequence(arr, n );
        System.out.println(result);
    }
}
 */
/**
 * Learning
 */
/* *
public class Learning {
static int longestIncreasingSubsequence(int arr[], int n){
 int dp [][] = new int [n + 1][n  + 1 ];
 for ( int i = n -1 ; i >= 1; i --){
  for ( int j = i - 1 ; j >= 0 ; j--){
     int notetake = 0 + dp[i + 1][j + 1]; 
   int take = 0 ;
   if ( arr[i ] > arr[j]){
       take = 1 +    dp[i + 1][i + 1];
   }
  dp[i][j + 1] = Math.max(notetake, take);
  
    }
 }
return dp[0][0];


}
  public static void main(String args[]) {
	
	int arr[] = {10,9,2,5,3,7,101,18};
	
	int n = arr.length;
	
	System.out.println("The length of the longest increasing subsequence is "+longestIncreasingSubsequence(arr,n));
	
  }
}    */
/* *
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Learning
 *
public class Learning {
static int longestIncreasingSubsequence(int arr[], int n){
int dp [] = new int[n];
    Arrays.fill(dp,1);
int hash [] = new int [n];
   Arrays.fill(hash,1);

    for ( int i = 0 ; i< n ; i++){
      for ( int  pre  = 0 ; pre < i ; pre ++){
     if ( arr[i] > arr[pre] &&  1 + dp[pre]  >  dp[i]  ){
      dp[i] = Math.max( 1 + dp[pre], dp[i]);
      hash[i] = dp[pre]; 
         }
    
        }
      }
      int  ans = -1 ;
      int lastind = -1; 
      int h  =  0;
       while ( h != n){ 
      if ( ans < dp[h])
       ans = dp[h];
       lastind = h ;
       h++;
    }
   
  ArrayList <Integer> temp = new ArrayList<>();
  temp.add(arr[lastind]);
  
  while( hash[lastind] != lastind ){
   lastind = hash[lastind];
   temp.add(arr[lastind]);


  }
  System.out.println(" longest increaing  subsequnce");
 for ( int i = temp.size() - 1 ; i <= 0; i--){
      System.out.println(temp.get(i));
 }
System.out.println();

  
    return ans ;

}
public static void main(String args[]) {
	
	int arr[] = {10,9,2,5,3,7,101,18};
	
	int n = arr.length;
	
	System.out.println("The length of the longest increasing subsequence is  "+longestIncreasingSubsequence(arr,n));
	
}
}
   */
/**
 * Learning
 *
public class Learning {

public static void  f( int n ) {

  if ( n == 5){
  System.out.println( " mission complete  "  + n );
    return ;
}
System.out.println( " jai shree ram");
f( n +  1);

}
  public static void main(String[] args) {
   int n = 0;
   f( n);       
  }
}
*/
/**
 * Learning
 *

public class Learning {
public static void f(int n ) {
if ( n == 0){
  return ;
}
f (n - 1);
System.out.println(n);
 
}
  public static void main(String[] args) {
    int  n = 11;
    f(n);
  }
}*/
/**
 * Learning
 *
public class Learning {
 public static int f(int n ) {
   if ( n == 0 ){
   return 1;
   }

    return n * f( n - 1); 
  
 }
  public static void main(String[] args) {
    int n = 30 ;
     System.out.println(f(n));
  }
} */
/* *
import java.lang.reflect.Array;

/**
 * Learning
 *
public class Learning {

 public static  void f( int [] arr , int n   ) {
   
 if ( n < 0){
  return ;
 }
  System.out.println(arr[n] + " ");
  f(arr, n - 1);   
  
  }
  

  public static void main(String[] args) {
    int arr[] = { 2 , 4, 3 ,2, 1};
    int n = arr.length -1 ; 
    f(arr , n); 
  }

} */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * Learning
 */
/* *
public class Learning {


public static  void f( int [] arr ,  int r  ) {
   
if ( r < 0 ) {
  return ;
}
  System.out.println(arr[r] + " ");   
      f(arr, r-1);

  }
  

  public static void main(String[] args) {
    int arr[] = { 2 , 4, 3 ,2, 1};
    int n = arr.length - 1; 

    for ( int i = 0 ; i <= n ; i++) {
    System.out.println(arr[i]);}
    
     int r =  n ;
    

     f( arr ,  r );
}
}
*/
/* *
public class Learning {
  public static void  swap( int l , int r , int arr[]) {
    if ( l + r / 2 <= r){
      return ;
    }
     l = r ;
    System.out.println(arr[l]);
    swap( l + 1, r -1, arr);
     
      

  }
  public static void main(String[] args) {
    int arr[] = { 2 , 4, 3 ,2, 1};
    int n = arr.length - 1; 
     int l = 0 ;
     int r = n ;

    swap(l , r , arr) ;
    for ( int i = r ; i <= n ; i++){
      System.out.println(arr[i]);
    }
} 
} */

/**
 * Learning
 *
public class Learning {
 public static void f(int [] arr , int n , int i  ){
 if ( i >= n / 2)
  return ;
  int temp = arr[i];
 arr[i] = arr[n - i];
 arr[n - i]  = temp ;
  f(arr, n, i + 1);

 }
  public static void main(String[] args) {
    int arr[] = { 2 , 4, 3 ,2, 1};
    int n = arr.length - 1; 
    f(  arr ,  n ,0)  ;
    for ( int i = 0 ; i<= n ; i++){
     System.out.println(arr[i] + " ");
    }
  
  }
} */

/* *
public class Learning {
 public static boolean f( String pal , int n ,  int i   ){ 
  if ( i >= n){
    return true ;
  }
  
   if ( pal.charAt(i) == pal.charAt(n ) ){
    
     return f(pal, n - 1 , i + 1);  
   
  }
  return false ;
}
  public static void main(String[] args) {
    String pal = "raaaar" ;
  
    int n = pal.length() - 1;
    if (f( pal ,  n , 0)){
    System.out.println(" string is pallindrome");
    }
     else {
      System.out.println("not palindrome");
    }
  }
}  */
/**
 * Learning
 *
import java . util.Scanner ;
 public class Learning {
 public static int  f(  int n) {
   if( n <= 1){
    return n;
   }
      return f(n - 1) +f( n -2);
 }
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in );
 int tar = 4 ;
 int n  = sc.nextInt();  
 System.out.println( f(n));
  }
}
 *
import java.util.*;

class TUF{
static ArrayList <Integer> longestIncreasingSubsequence(int arr[], int n){
  
   Arrays.sort(arr);

    int[] dp=new int[n];
    Arrays.fill(dp,1);
    int[] hash=new int[n];
    Arrays.fill(hash,1);
    
    for(int i=0; i<=n-1; i++){
        
        hash[i] = i; // initializing with current index
        for(int prev_index = 0; prev_index <=i-1; prev_index ++){
            
            if((arr[prev_index] % arr[i] )== 0 && 1 + dp[prev_index] > dp[i]){
                dp[i] = 1 + dp[prev_index];
                hash[i] = prev_index;
            }
        }
    }
    
 
       int lastIndex = 0;
        for (int i = 1; i < n; i++) {
            if (dp[i] > dp[lastIndex]) {
                 lastIndex= i;
        }
    }
    
    ArrayList<Integer> temp=new ArrayList<>();
    temp.add(arr[lastIndex]);
   
    while(hash[lastIndex] != lastIndex){ // till not reach the initialization value
        lastIndex = hash[lastIndex];
        temp.add(arr[lastIndex]);    
    }
    
    // reverse the array 
    
     Collections.reverse(temp);
    
    return temp;
}

public static void main(String args[]) {
	
	int arr[] = {4 , 8, 12  ,2 , 16};
	
	int n = arr.length;
	longestIncreasingSubsequence(arr,n);
	
}
} *
import java.util.*;

class TUF {
    static ArrayList<Integer> longestIncreasingSubsequence(int arr[], int n) {

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int[] hash = new int[n];
        Arrays.fill(hash, -1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    hash[i] = j;
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(arr[maxIndex]);
            maxIndex = hash[maxIndex];
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String args[]) {

        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};

        int n = arr.length;
        ArrayList<Integer> lis = longestIncreasingSubsequence(arr, n);

        System.out.println("Longest Increasing Subsequence: " + lis);
    }
}
 */
/**
 * Learning
 *
public class Learning {
 public static void f( int  n){
   if ( n == 6){
    return;
   }
   System.out.println(n + n - 1);
      f( n  + 1);

  }
  public static void main(String[] args) {
    int n = 1;
    f( n);
  }
}
 *
import java.util.*;

class TUF{
static ArrayList <Integer> longestIncreasingSubsequence(int arr[], int n){
  
   Arrays.sort(arr);

    int[] dp=new int[n];
    Arrays.fill(dp,1);
    int[] hash=new int[n];
    Arrays.fill(hash,1);
    
    for(int i=0; i<=n-1; i++){
        
        hash[i] = i; // initializing with current index
        for(int prev_index = 0; prev_index <=i-1; prev_index ++){
            
            if((arr[prev_index] % arr[i] )== 0 && 1 + dp[prev_index] > dp[i]){
                dp[i] = 1 + dp[prev_index];
                hash[i] = prev_index;
            }
        }
    }
    
      int  ans  = -1;
       int lastIndex = 0;
        for (int i = 1; i < n; i++) {
            if (dp[i] >  ans) {
                  ans = dp[i];
                  lastIndex = i;
          }
    }
    
    ArrayList<Integer> temp=new ArrayList<>();
    temp.add(arr[lastIndex]);
   
    while(hash[lastIndex] != lastIndex){ // till not reach the initialization value
        lastIndex = hash[lastIndex];
        
    }
    
    // reverse the array 
    
     Collections.reverse(temp);

     
    return temp;
  }

public static void main(String args[]) {
	
	int arr[] = {4 , 8, 12  ,2 , 16};
	
	int n = arr.length;
    ArrayList<Integer> ans = longestIncreasingSubsequence(arr,n);
	for ( int  i = 0 ; i< ans.size();i++){
    System.out.println(ans.get(i) + " ");
  }
}
} *
import java.util.*;

class TUF {
    static ArrayList<Integer> divisibleSet(int arr[], int n) {
        Arrays.sort(arr);

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int[] hash = new int[n];
        Arrays.fill(hash, -1);

        int maxIndex = 0;
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    hash[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        ArrayList<Integer> subset = new ArrayList<>();
        while (maxIndex != -1) {
            subset.add(arr[maxIndex]);
            maxIndex = hash[maxIndex];
        }

        Collections.reverse(subset);

        return subset;
    }

    public static void main(String args[]) {
        int arr[] = {4, 8, 12, 2, 16};
        int n = arr.length;
        ArrayList<Integer> ans = divisibleSet(arr, n);
        System.out.print("The longest divisible subset elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
} */
/**
 * Learning
 *
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Learning {

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length() + 1) {
            return false;
        }

        int a = 0;
        int b = 0;

        while (a < s1.length()) {
            if (b < s2.length() && s1.charAt(a) == s2.charAt(b)) {
                a++;
                b++;
            } else {
                a++;
            }
        }

        if(a == s1.length() && b == s2.length()){
          return true ;
        }
        else return false ;
    }
 
    public static int f(String[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
          
        Collections.sort(Arrays.asList(arr), new MyComparator());

        int maxi = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (compare(arr[i], arr[j]) && 1 + dp[j] > dp[i]) {
                    dp[i] = 1 + dp[j];
                 
                }
            }
               if (dp[i] > maxi) {
                        maxi = dp[i];
                    }
        }

        return maxi;
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "ba", "bca", "bda", "bdca"};
        int result = f(arr);
        System.out.println("Longest divisible subset length: " + result);
    }

    static class MyComparator implements Comparator<String> {
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
    }
}  */
/**
 * Learning
 *

public class Learning {
public static int f(int[] arr , int n) {

 int maxi = -1;
  int dp [] = new int [n];
    Arrays.fill(dp , 1);
    for ( int i = 0 ; i < n ; i ++){
    for ( int j = 0 ; j < i ; j ++){
    if ( arr[i] > arr[j] &&  1 + dp[j] > dp[i] ){
      dp[i] = 1 + dp[j];
       }
    }
  } 
   int dp1 [] = new int [n];
    Arrays.fill(dp1 , 1);
    for ( int i = n -1 ; i >= 0; i --){
    for ( int j = n -1 ; j > i ; j --){
    if ( arr[i] > arr[j] &&  1 + dp1[j] > dp1[i] ){
      dp1[i] = 1 + dp1[j];
       }
    }
  }
   for ( int i = 0 ; i < n; i++){
    maxi = Math.max(maxi , dp[i] + dp1[i] - 1);
   }
   return maxi ;
}
  public static void main(String[] args) {
    int [] arr = { 1, 11, 2, 10, 4, 5, 2, 1 };
     int n = arr.length ;
     System.out.println( f(  arr , n ));
  }
} */
/**
 * Learning
 *
public class Learning {
static int findNumberOfLIS(int[] arr){
 int n= arr.length ;
 int[]dp = new int [n];
 int[]ct = new int [n];
 
  Arrays.fill(dp  , 1 );
  Arrays.fill( ct ,1);
 int  mxi = 1 ;
 for ( int i = 0 ; i < n ; i++){
  for( int j = 0 ; j < i ; j++){
  if ( arr[j] < arr[i] && dp[i] < 1  + dp[j]){
    dp[i] = dp[j] + 1 ;
    ct[i] = ct[j];

  }
else if ( arr[j] < arr[i] && dp[j] + 1 ==  dp[i]){
  ct[i] = ct[i] + ct[j] ;
     }
  }
  
   mxi = Math.max(mxi , dp[i]);
   
}
 int ros = 0 ;
 for ( int i = 0 ; i < n ; i++){
  if ( dp [i] == mxi ) ros += ct[i];

 }
 return ros ;

}

  public static void main(String[] args) {
    	int[] arr = {1,5,4,3,2,6,7,2};
	
	System.out.println("The count of LIS is "+findNumberOfLIS(arr));
  }
}
 */
/**
 * Learning
 *
public class Learning {

  static int matrixMultiplication(int[] arr, int N){
    
    int i =1;
    int j = N-1;
    
    
    return f(arr,i,j);
    
    
}
   	static int f(int[] arr, int i, int j){
   if ( i ==  j)
   return 0 ;
   int mini = Integer.MAX_VALUE;
   for ( int k = i ; k < j ; k++){
   int ans  = f ( arr , i , k) + f ( arr , k + 1 , j) + arr[i - 1] * arr[k] * arr[j];
    mini = Math.min(mini, ans);
     
    }    
  
  return mini ;
  }
public static void main(String args[]) {
  
  
	int arr[] = {10, 20, 30, 40, 50};
	
	int n = arr.length;
	
	System.out.println("The minimum number of operations are "+
        matrixMultiplication(arr,n));
 }

}
 */
/* *

 static int matrixMultiplication(int[] arr, int N){
    
    int [][] dp=new int[N][N];
    for(int row[]: dp)
    Arrays.fill(row,-1);
    
    for(int i=1; i<N; i++){
        dp[i][i] = 0;
    }
    
    for(int i=N-1; i>=1; i--){
        
        for(int j=i+1; j<N; j++){
            
            int mini = Integer.MAX_VALUE;
    
            // partioning loop
            for(int k = i; k<= j-1; k++){
                
                int ans = dp[i][k]+ dp[k+1][j] + arr[i-1]*arr[k]*arr[j];
                
                mini = Math.min(mini,ans);
                
            }
            
            dp[i][j] = mini;
    
        }
    }
    
    return dp[1][N-1];
    
    
}
public static void main(String args[]) {
	
    int[] arr = {10, 20, 30, 40, 50};
	
	int n = arr.length;
	
	System.out.println("The minimum number of operations are "+
        matrixMultiplication(arr,n));
	
	
}
}*/

/**
 * Learning
 *
public class Learning {
 public static int f( int i , int c , ArrayList<Integer>cuts ) {
   
 if ( i > c){
  return 0 ;
 }
 int mini = Integer.MAX_VALUE;

 for ( int ind = i ; ind <= c ; ind ++){
   int ans  =  cuts.get(c + 1) - cuts.get(i - 1) 
    + f(i, ind - 1, cuts) + 
   f(ind + 1, c, cuts);
   mini = Math.min(mini, ans);

 } 

 return mini ;


 }
 public static int cost( int n , int c , ArrayList<Integer> cuts){
 cuts.add(n);
 cuts.add(0 , 0);
 Collections.sort(cuts);
 return f ( 1 , c , cuts);

 }
  public static void main(String[] args) {
    ArrayList <Integer> cuts = new ArrayList<>();
        cuts.add(3);
        cuts.add(5);
        cuts.add(1);
        cuts.add(4);
    int c = cuts.size();
    int n = 7 ;
    System.out.println(cost(n , c , cuts));
  }
}  /*
import java.util.ArrayList;
import java.util.Collections;

public class Learning {

    public static int f(int i, int j, ArrayList<Integer> cuts) {

        // base case
        if (i > j)
            return 0;

        int mini = Integer.MAX_VALUE;

        for (int ind = i; ind <= j; ind++) {

            int ans = cuts.get(j + 1) - cuts.get(i - 1) +
                    f(i, ind - 1, cuts) +
                    f(ind + 1, j, cuts);

            mini = Math.min(mini, ans);

        }

        return mini;
    }

    public static int cost(int n, int c, ArrayList<Integer> cuts) {

        // modify the cuts array

        cuts.add(n);
        cuts.add(0, 0);
        Collections.sort(cuts);

        return f(1, c, cuts);
    }

    public static void main(String[] args) {

        ArrayList<Integer> cuts = new ArrayList<>();
        cuts.add(3);
        cuts.add(5);
        cuts.add(1);
        cuts.add(4);

        int c = cuts.size();

        int n = 7;

        System.out.println("The minimum cost incurred: " + cost(n, c, cuts));

    }
}
*/
/**
 * Learning
 *
public class Learning {
 public static int f ( int i, int j , ArrayList <Integer> a){
  if ( i > j){
  return 0;
  }
  int maxi = Integer.MIN_VALUE;
  for( int ind = i ; ind <= j ; ind++){
    int co = a.get(ind - 1) * a.get(ind ) * a.get(j+ 1) +
    f ( i , ind -1 , a) + f( ind + 1, j , a);
    maxi  = Math.max(maxi, co);
  }
 

 return maxi ; 
 }
 public static int maxcoins( ArrayList <Integer> a ){
  int n = a.size() ;
  a.add(0, 1);
  a.add( 1);
  return f ( 1 , n  , a );

 } 
  public static void main(String[] args) {
    ArrayList <Integer> a =  new ArrayList<>();
        
        a.add(3);
        a.add(1);
        a.add(5);
        a.add(8);
        int ans  = maxcoins (a) ;
  System.out.println(ans );
  }
} */

/**
 * Learning
 *
    import java .util.Scanner;
    public class Learning {
   
      static int mod = 1000000007;
      static int f ( int i , int j ,int istrue , String exp ){
      if ( i > j) return 0 ;
      if ( i == j){
      if ( istrue == 1){
      return exp.charAt(i) == 'T' ? i : 0;
      }
      else return exp.charAt(i) == 'F' ? 1 : 0;
      }
    
          int ways = 0;
          for (int in = i + 1 ; in <= j ; in ++){
            int lT = f(i, in - 1, 1, exp);
            int lF = f(i, in - 1, 0, exp);
            int rT = f(in + 1, j, 1, exp);
            int rF = f(in + 1, j, 0, exp);
 if (exp.charAt(in) == '&') {
                if (istrue == 1) ways = (ways + (lT * rT) % mod) % mod;
                else ways = (ways + (lF * rT) % mod + (lT * rF) % mod + (lF * rF) % mod) % mod;
            }
            else if (exp.charAt(in) == '|') {
                if (istrue == 1) ways = (ways + (lF * rT) % mod + (lT * rF) % mod + (lT * rT) % mod) % mod;
                else ways = (ways + (lF * rF) % mod) % mod;
            }
            else {
                if (istrue == 1) ways = (ways + (lF * rT) % mod + (lT * rF) % mod) % mod;
                else ways = (ways + (lF * rF) % mod + (lT * rT) % mod) % mod;
            }
          }
          return ways;
       }
        
  public static int evaluate(String exp){
   int n = exp.length() ;
   return f( 0 , n - 1, 1 , exp);

  } 
   
  public static void main(String[] args) {
  Scanner str = new Scanner(System.in );
  String  exp = str.nextLine();
  int ways = evaluate(exp);
  System.out.println("ans is"  + ways);
  } 
    }      
   */
/**
 * Learning
 *
public class Learning {
 static boolean ispalindrome(int i , int j, String st){
     while (i < j) {
          if (st.charAt(i) != st.charAt(j)) {
              return false;
          }
          i++;
          j--;
      }
      return true;
  }
/* *
 static int f( int i , int n , String str ){
 if ( i == n){
  return 0 ;
 }
 int mincount = Integer .MAX_VALUE;
 for ( int j = i ; j < n ; j++){
 if ( ispalindrome(i , j , str)) {
  int count = 1 + f(j + 1 , n , str);
    mincount = Math.min(mincount, count);
}

 }
  return mincount; 
} *
 static int  palindromepariton( String str){
 int n = str.length(); 
 int dp[] = new int [n + 1];
 Arrays.fill(dp , 0);
 dp[n] = 0 ;
 for ( int i = n- 1; i >= 0 ; i -- ){
  int mincount = Integer.MAX_VALUE;
  for ( int j = i ; j < n ; j++){
  if ( ispalindrome(i, j, str)){
  int count = 1 + dp[j + 1];
     mincount = Math.min(mincount, count);
        }
     }
     dp[i] = mincount ;
  }
return dp[0] - 1;
}

  public static void main(String[] args) {
     String str =  "BABABCBADCEDE";
     int partion = palindromepariton(str);
      System.out.println(partion);                                     
        
  }
}  */
/**
 * Learning
 */
  /*
   * static int f (int i , int [] num , int k ){
   * int n = num.length ;
   * if ( i == n)
   * return 0 ;
   * int len = 0 ;
   * int maxi = Integer.MIN_VALUE;
   * int maxans = Integer.MIN_VALUE;
   * for ( int j = i ; j < Math.min(i + k, n); j++){
   * len++;
   * maxi = Math.max(maxi, num[j]);
   * int sum = len * maxi + f(j +1, num, k);
   * maxans = Math.max(maxans, sum);
   * }
   * 
   * return maxans ;
   * 
   * }
   */
  /* *
import java.util.Arrays;

public class Learning {
    static int maxSumAfter( int[] num, int k) {
        int n = num.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);
        for ( int i = n -1 ; i >= 0 ; i --){
        int len = 0;
        int maxi = Integer.MIN_VALUE;
        int maxans = Integer.MIN_VALUE;
        for (int j = i ; j < Math.min(i + k,n); j++) {
            len++;
            maxi = Math.max(maxi, num[j]);
            int sum = len * maxi + dp[j + 1];
            maxans = Math.max(maxans, sum);
         
        }
           dp[i] = maxans;
    }
    return dp[0];
  }
   
    public static void main(String[] args) {
        int[] num = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        int maxSum = maxSumAfter( num, k);
        System.out.println(maxSum);
    }

} */
/**
 * Learning
 *
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Learning {
    static int largestrrectangle( int [] histo){
    Stack <Integer > st = new Stack<>();
    int maxa = 0 ;
    int n = histo.length ;
     for ( int i = 0 ; i <= n ; i++){
     while (!st.empty() && (i == n ) || histo[st.peek()] >= histo[i]){
      int height = histo[st.peek()];
      st.pop();
      int widht;
      if ( st.empty())
      widht = i ;
      else 
       widht = i - st.peek() - 1 ;
      maxa = Math.max(maxa, widht * height); 
      }
      st.push(i);
    }
 
   return maxa;

   }
  
   public static int maximalarea( int [][] mt , int n , int m ){
     int maxarea = 0 ;
     int [] height = new int [m];
     for ( int i = 0 ; i < n; i++){
     for ( int j = 0 ; j <m; j++){
       if ( mt[i][j] == 1 )height[j]++;
       else height[j] = 0;
     }
 int araa = largestrrectangle(height);
 maxarea  = Math.max(maxarea, araa);
   }
   public static void main(String[] args) {
    int [][] mt = {
      { 1 , 0 , 1, 0 , 0},
      {1 , 0 , 1,  1,  1},
      {1,  1,  1,  1,  ,1},
      {1 ,0 , 0,  1  , 0}
    };
    int n = 4 , m = 5 ;
    int maxaarea = maximalarea( mt ,n , m);
    System.out.println(" the maximum lenght of the rectangle is" + maxaarea);
      
       } 
  }
} */
/**
 * Learning
 *
public class Learning {
 public static int f(int [] arr , int n , int i) {
   
   int maxval = arr[0];
   
   
   for ( int j = i ; j < n ; j++){
    if ( arr[j] < maxval){
     maxval += arr[j];

     }
    else if ( arr[j] > maxval){
      maxval = arr[j] ;
    }
  }
    return maxval;
    
  }
  public static void main(String[] args) {
    int arr [] = { 3 , -2, 2, 3 };
     int n = arr.length ;
   System.out.println(f(arr , n , 1));
  } 
}
*\
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        rescrse( res , 0  , 0 ,"" , n);
        return res;  
    }
    static void rescrse( List<String> res , int left , int right , String s ,  int n ){
     if ( s.length() == n * 2 ){
      res.add(s);
      return ; 
    }
   if ( left < n){
      rescrse(res, left  + 1, right, s + "(", n);
   }
  if ( right < left ){
     rescrse(res, left, right + 1, s + ")", n);
  }

    }
}
*
 import java.util.Stack;  

class Solution {
    public int longestValidParentheses(String s) {
      int maxlength = 0 ;
      Stack <Integer> stack = new Stack<>();
      stack.push(-1);
     
    for  (int i = 0 ; i< s.length() ; i++){
      char c = s.charAt(i);
      if (c == '('){
        stack.push(i);
      }
      else {
        stack.pop();
      }
      if (stack.isEmpty()){
        stack.push(i);
      }
      else {
        int len = i - stack.peek();
        maxlength  = Math.max(maxlength, len);
      }
    }

    return maxlength ;  
  }
    
  } */
/* *
  class Solution {
    public int trap(int[] height) {
      int lmaxi = 0;
      int rmaxi = 0;
      int l = 0;
      int r = height.length-1;
      int ans = 0;
      int count = 0;
      
      while ( l < r){
      if ( height[l] < height[r]){
      if (height[l] >= lmaxi){
      lmaxi = height[l];
      }
      else {
        count += lmaxi - height[l];
      }
      l ++;
    }else{if 
         (height[r] >= rmaxi){
        rmaxi = height[r];
      }
      else {
        count  += rmaxi - height[r];
      }
      r--;
    }
  }   
  return count ;  
    
  }
} *
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        boolean [] pre= new boolean [n + 1];
        Boolean curr [] = new Boolean[m + 1];
         curr[0] = true; // Empty strings match
        
        // Handle patterns starting with '*'
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                 pre[j] = pre[j - 1];
            }
        }
        
        for (int i = 1; i <= n; i++) {
          curr[0] = false ;
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    curr[j] = pre[j - 1]; // Characters match
                } else if (p.charAt(j - 1) == '*') {
                    curr[j] = pre[j] || curr[j - 1]; // Either skip or match any character
                }
                else{
                  curr[j] = false ;
                }
            }
             pre = curr;
          }
        
          return pre[m] == Boolean.TRUE;
        }
}*
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        return f(n - 1, m - 1, s, p);
    }

    private boolean f(int n, int m, String s, String p) {
        if (n < 0 && m < 0)
            return true;
        if (n > 0 && m <=  0)
        return false ;
         if ( n < 0 && m >= 0){
            return isAllStars(p, m);
         }
        if (s.charAt(n) == p.charAt(m) || p.charAt(m) == '*') {
            return f(n - 1, m - 1, s, p);
        }

        if (p.charAt(m) == '?') {
            return f(n , m - 1, s, p) || f(n - 1, m, s, p);
        }

        return false;
    }

    private boolean isAllStars(String p, int j) {
        for (int k = 0; k <= j; k++) {
            if (p.charAt(k) != '*')
                return false;
        }
        return true;
    }
} *

class Solution {
    public int maxSubArray(int[] nums) {
       int curr  =  nums[0];
       int globel = nums[0];
      for ( int i = 1 ; i < nums.length ; i ++ ){
         curr = Math.max(nums[i], curr + nums[i]);
         globel = Math.max(globel , curr);
      }
      return globel ;
    }
}
 *
import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[] left = new int[n + 1];
        int[] down = new int[m + 1];
         

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) {
                     down[j] = 1;
                } else {
                     down[j] = ( j > 0 ?  down[j - 1] : 0 )+ left[j];
                }
            }
             left = down.clone();
          }

        return  left[m - 1];
    }
}*

class Solution {
   public int maxProfit(int[] prices, int fee) {
     int  n = prices.length ;
      
    int dp[][]= new int[n][fee];
    
    for(int row[]: dp)
    Arrays.fill(row,-1);
    
    if(n==0) return 0;
  return f(0 , n , prices , fee , 0  ,dp);
 
  }
  static int f(int i , int n , int [] prices, int fee , int buy){
     if ( i == n){
      return  0;
     } 
     
     int take = Integer.MIN_VALUE;
     if ( buy == 0){
       return  Math.max( -prices[i] + f( i + 1, n, prices, fee , 0) - fee ,
        0  + f(i +1 , n, prices, fee , 1) );
     }
       else {
         return  Math.max( prices[i] + f(i + 2 , n, prices, fee, 1) - fee , f(i + 1, n, prices, fee, 0));
         
      
  }
}
} *
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        return calculateMaxProfit(prices, fee, 0, 0, dp);
    }

    private int calculateMaxProfit(int[] prices, int fee, int day, int ownStock, int[][] dp) {
        // Base case: If we reach the last day, return 0
        if (day == prices.length) {
            return 0;
        }
        
        // Check if the result is already memoized
        if (dp[day][ownStock] != 0) {
            return dp[day][ownStock];
        }

        // Recursive case: Calculate the maximum profit for the two possible actions on the current day
        
        // 1. If we own a stock, we can either sell it or do nothing
        if (ownStock == 1) {
            // Sell the stock and calculate the profit
            int sellProfit = calculateMaxProfit(prices, fee, day + 1, 0, dp) + prices[day] - fee;
            // Do nothing and move to the next day
            int noSellProfit = calculateMaxProfit(prices, fee, day + 1, 1, dp);
            int maxProfit = Math.max(sellProfit, noSellProfit);
            dp[day][ownStock] = maxProfit;
            return maxProfit;
        }
        
        // 2. If we don't own a stock, we can either buy a stock or do nothing
        else {
            // Buy the stock and subtract the cost from the profit
            int buyProfit = calculateMaxProfit(prices, fee, day + 1, 1, dp) - prices[day];
            // Do nothing and move to the next day
            int noBuyProfit = calculateMaxProfit(prices, fee, day + 1, 0, dp);
            int maxProfit = Math.max(buyProfit, noBuyProfit);
            dp[day][ownStock] = maxProfit;
            return maxProfit;
        }
    }
}
*
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        dp[0][0] = 1;

        for (int i = 1; i < n; i++) {
            if (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) {
                dp[i][0] = 1;
            }
        }

        for (int j = 1; j < m; j++) {
            if (obstacleGrid[0][j] == 0 && dp[0][j - 1] == 1) {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}
 *
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length; 
        long sum = 0;
        for ( int i = 0; i < n ; i++){
          sum += cost [i];
        }
        long N = (sum + 1 ) / 2;
        int x = -1;
        for ( int i = 0 ; i < n ; i++){
          N -= cost[i];
          if ( N <= 0){
            x = nums[i];
            break ;
          }
        }
        long ans = 0 ;
        for ( int i = 0 ; i < n ; i++){
          ans  += Math.abs((long) x * cost[i] - (long) nums[i] * cost[i]);
        }
          return ans ; 
    }
} *
class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        
        dp[0][0] = grid[0][0];
        
        // Initialize the first row
        for (int i = 1; i < m; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        
        // Initialize the first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        // Fill the remaining cells
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        return dp[n-1][m-1];
    }
}
*
class Solution {
    public int climbStairs(int n) {
     if ( n ==1 ){
      return 1;
     }
      if ( n ==2 ){
      return 2;
     }
     int [] a = new int[n];
     for ( int i = 0 ; i < n ; i++){
      a[i] = 1 + 2;  
       return a[n-1];
    }
  }
} *
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp [][] = new int [n][m];
      return  f( n  -1, m -1 ,word1 , word2 , dp);
    }
    static int f(int i , int j , String word1, String word2 , int [][] dp){
    if ( i < 0) return j + 1;
    if ( j < 0) return i + 1;
     char ch = word1.charAt(i);
     char dh = word2.charAt(j);
     if (  ch == dh ) 
      f(i , j , word1 , word2 , dp)
    }
} *
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
} */


class Solution {
   static int largestrectangle(int [] histo){
    Stack <Integer> st = new Stack <>();
    int maxa = 0;
    int n = histo.length ;
    for ( int i = 0;  i<= n ; i++){
      while ( !st.empty() && (i == n) || histo[st.peek()] >= histo[i]){
          int height = histo[st.pop()];
          int width ;
          if ( st.empty()){
            width = i ;
          }
else {
  width = i - st.peek() - 1 ;
  maxa = Math.max(maxa , width * height);
}
}
st.push(i);
    }
    return maxa;
   }

    public int maximalRectangle(char[][] matrix) {
       
       int n = matrix.length ;
       int m = matrix[0].length; 
        if ( n == 1 && m == 1){
          return matrix[0][0] == '1' ? 1 : 0 ;
        }
       int maxarea = 0;
      int [] height = new int [m];
        for ( int  i = 0; i < n ; i++){
          for ( int j = 0 ; i < m ; j++){
            if  (matrix[i][j]  1){
              height[j]++;
            }
            else 
            height[j] = 0;
          }
          int area = largestrectangle(height);
          maxarea = Math.max(maxarea, area);

        }
        return maxarea;
    }
}