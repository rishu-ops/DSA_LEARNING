/* *
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
                                        
    HashSet<Character> unique = new HashSet<>();
    int maxlenght = 0 ;
    int start = 0 ;
    
    for (int end = 0 ; end < s.length (); end ++ ) {
        char ch = s.charAt( end);
        if ( unique.contains(ch)){
            while ( s.charAt(start) != ch){
        unique.remove(s.charAt(start));
        start ++ ;
        }
        start ++ ;}
    else {
         unique . add(ch);
        int currentlenght = end - start + 1 ;
        maxlenght = Math.max(maxlenght, currentlenght);
    }                                                      
}
    return maxlenght;
}
}
*/
                         // words k selection ;
   /* *
                         import java.io.*;

                         import java.util.*;
                         
                         public class Main {
                         
                           public static void generateSelection(String ustr, int cs, int ts, int lc, String asf) {
                                
                            if (cs > ts){
                                System.out.println( asf);
                                return ;
                            }
                            for ( int i = lc + 1 ; i <= ustr.length() ; i ++){
                                      char ch = ustr.charAt(i);
                                      generateSelection(ustr, cs + 1, ts, i,  asf + ch );                                                                                           
                                }                                            
                             }                                                            
                           } public static void main(String[] args) throws Exception { BufferedReader
                             br = new BufferedReader(new InputStreamReader(System.in));
                             String str = br.readLine();
                            
                            int  k = Integer.parseInt(br.readLine());
                             HashSet unique = new HashSet<>();
                             String ustr = "";
                             for (char ch : str.toCharArray()) {
                               if (unique.contains(ch) == false) {
                                 unique.add(ch);
                                 ustr += ch;
                               }
                             }
                         
                             generateSelection(ustr, 1, k, -1, "");
                           }
                         */
                        
   /*
                         import java.io.*;
                         import java.util.*;
import java.util.Locale.Category;
                         
               public class leetcode {                                      
                         
               public void generateSelection(int cc , String ustr , int ssf , int ts , Character[] spots){                                                                        
                               if ( cc == ustr.length()){
                                if ( ssf == ts ){
                                    for ( int i = 0; i < spots.length ; i++ ){
                                   {
                                    System.out.println(spots[i]);
                                                                                   
                                 }
                                   System.out.println();
                                   return ;

                                  } 
                                  char ch = ustr.charAt(cc);
                                  for(int i = 0 ; i < spots.length ;  i++) {
                                  if ( spots [i] == null){
                                        spots[i] = ch ;
                                        generateSelection(cc + 1, ustr, ssf +  1, ts, spots);
                                        spots[i] = null;     
                                    }
                                }                                          
                                generateSelection(cc + 1, ustr, ssf + 0, ts, spots) ;
                               }
                                                                                                  
                           public static void main(String[] args) throws Exception {
                             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                             String str = br.readLine();                                                                
                             int k = Integer.parseInt(br.readLine());
                          
                             HashSet<Character> unique = new HashSet<>();
                             String ustr = "";
                             for (char ch : str.toCharArray()) {
                               if (unique.contains(ch) == false) {
                                 unique.add(ch);
                                 ustr += ch;
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
               
               public class Main {
               
                   public static void coinChange(int i, int[] coins, int amtsf, int tamt, String asf){
                       // write your code here
                       if ( i == asf.length()){
                        if ( amtsf == tamt){
                            System.out.println(asf);

                        }                                            
                        return ;
                       }
                       coinChange(i, coins, amtsf + coins[i], tamt, asf + coins[i] + ".");
                       coinChange(i, coins, amtsf + 0, tamt, asf + ".");
                   }
                   public static void main(String[] args) throws Exception {
                       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                       int n = Integer.parseInt(br.readLine());
                       int[] coins = new int[n];
                       for (int i = 0; i < n; i++) {
                           coins[i] = Integer.parseInt(br.readLine());
                       }
                       int amt = Integer.parseInt(br.readLine());
                       
                       coinChange(0, coins, 0, amt, "");
                   }
               }                         
                       */
/* *
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
class Solution {
    public int pairSum(ListNode head) {
 ListNode curr = head;
 List<Integer> st = new ArrayList<>();

     while ( curr != null){
        st.add(curr.val);
        curr = curr.next;

        int i = 0 ;
        int j = st.size() - 1;
        int maxmal = 0;
      while(i < j ){
       Math.max(maxmal, st.get(i) + st.get(j) ); 
     i ++ ;
     j --; 
    }
    return maxmal;
     }
    }

    }          */
  
    
   // import java.io.*;

   /* *

import java.util.*;

import javax.swing.text.FlowView.FlowStrategy;

public class Main {
  public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void solveSudoku(int[][] board, int i, int j) {
    // write yopur code here
    if ( i == board .length ){
      display(board);
      return ;
    }
    int nc = 0 ;
    int nr = 0 ;
    if ( j > board[0] .length ){
     nr = i + 1;
     nc = 0 ;
    }
    else {
      nr  = i;
     nc = j + 1 ;
    }
   if ( nc != 0 ){
    solveSudoku(board, nr, nc);
    else {
      for ( int po =  1 ; po <=9 ; po ++ ){
      ifsaveplace ( board , i , j , po ) ;
       {
        board[i][j] = po ;
        solveSudoku(board, nr, nc );
        board[i][j] = 0 ; 
      }
    }
   
  }
}
  public boolean ifsaveplace( int [][] board , int x , int y , int val ) {
     for ( int x = 1 ; x <= board.length - 1 ; x++){
      if ( board[x][j]  != val){
        return true ;
      }
      else {
        return false;
      }
     }
     for ( int y = 1 ; y <= board[0].length - 1; y ++){
      if ( board[i][y] != val){
        return true ;
      }
      else{
        return false ;
      }

     }
     int smix = x / 3 * 3;
     int smiy = y / 3 * 3;

     for ( int i = 0 ; i <= 3 ; i++)
  {
    for ( int j  = 0; j <=3  ; j++){
      if ( board[ smix + i ] [smiy + j] == val  ){
        return false ;
      }
    }
  }
  } 

  

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }
}
}
   *
  import java.io.*;
import java.rmi.dgc.Lease;
import java.util.*;

import javax.swing.ScrollPaneLayout;
  
  public class Main {   
  
    public static void solution(char[][] arr, String[] words, int vidx) {
      //write your code here
      if ( videx == words.length){
        print(arr);
        return ;
      }
      String word = words[vidx];
      for ( int i = 0 ; i< arr. length ; i++ ){
        for ( int j = 0 ; j < arr[0].length ; j++ ){
          if ( arr[i][j] =='-' || arr[i][j] == word.charAt(0)){
            if ( canplacewordhor(arr , word , i , j)){
           boolean[]  wpplaced =   placewordhor ( arr , word , i , j);
            solution(arr, words, vidx + 1);
            unplacehor ( arr , wpplaced, i , j );
          }
         
            if ( canplacewordver(arr , word , i , j)){
              placewordver ( arr , word , i , j);
            solution(arr, words, vidx + 1);
            unplacever( arr , word , i , j );
          }
        }
      }
    }

    }
  public static boolean placewordhor(char [][] arr , String word , int i , int j  ) {
    if ( j - 1 >= 0 &&  arr[i][j - 1] != '+'){
      return false ;
    }
    else if ( j + word.length() <= arr[0].length && arr[i][j + word.length()] != '+')  {
      return false ;
    }
    for ( int jj= 0 ; jj < word.length(); jj++){
      if ( j + jj >= arr[0].length){
        return false ;
      }
      if ( arr[i][j + jj] == '-' || arr[i][j+ jj] == word.charAt(jj)){
        continue ;
      }
      else {
        return false ;
      }


      public static boolean placewordver(char [][] arr , String word , int i , int j  ) {
        if ( i - 1 >= 0 &&  arr[i - 1][j] != '+'){
          return false ;
        }                                                          
        else if ( i + word.length() <= arr[0].length && arr[i + word.length()][j ] != '+')  {
          return false ;
        }
        for ( int jj= 0 ; jj < word.length(); jj++){
          if ( i + jj >= arr[0].length){
            return false ;
          }
          if ( arr[i + jj][j ] == '-' || arr[i + jj][j] == word.charAt(jj)){
            continue ;
          }
          else {
            return false ;
          }
    }
    return true ;

  }
  public static void    unplacehor(char [][]arr , boolean [] wpplaced , int i , int j  ) {
    for ( int jj = 0 ; jj  < wpplaced.length() ; j++ );
   if ( wpplaced [jj] = true );
    arr[i][j + 1] = '-';   
  }
    public static boolean[] placewordhor (char [][] arr , String word , int i , int j ){
        boolean [] wpplaced = new boolean[word.length()];
           for ( int jj = 0 ; jj < word.length() ; jj++){
            if ( arr[i][j + jj] == '-'){
              arr[i][j + jj] == word.charAt(jj);
              wpplaced [jj] = true ;
            }
           }
           return wpplaced;
    }
    public static void    unplacever(char [][]arr , boolean [] wpplaced , int i , int j  ) {
      for ( int jj = 0 ; jj  < wpplaced.length() ; jj++ );
     if ( wpplaced [jj] = true );
      arr[i + 1][j] = '-';   
    }
      public static boolean[] placewordver (char [][] arr , String word , int i , int j ){
          boolean [] wpplaced = new boolean[word.length()];
             for ( int jj = 0 ; jj < word.length() ; jj++){
              if ( arr[i + jj][j ] == '-'){
                arr[i + jj][j] == word.charAt(jj);
                wpplaced [jj] = true ;
              }
             }
             return wpplaced;
      }
    
    public static void print(char[][] arr) {
      for (int i = 0 ; i < arr.length; i++) {
        for (int j = 0 ; j < arr.length; j++) {
          System.out.print(arr[i][j]);
        }
        System.out.println();
      }
  
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      char[][] arr = new char[10][10];
      for (int i = 0 ; i < arr.length; i++) {
        String str = scn.next();
        arr[i] = str.toCharArray();
      }
      int n = scn.nextInt();
      String[] words = new String[n];
      for (int i = 0 ; i  < words.length; i++) {
        words[i] = scn.next();
      }
      solution(arr, words, 0);
    }
  }
}
  } */
 /* *
  class Solution {
    private int f(int[] piles, int p, int i, int m) {
        if (i == piles.length) {
            return 0;
        }
        int res = p == 1 ? 1000000 : -1, s = 0;
        for (int x = 1; x <= Math.min(2 * m, piles.length - i); x++) {
          s += piles[i + x - 1];
            if (p == 0) {
                res = Math.max(res, s + f(piles, 1, i + x, Math.max(m, x)));
            }
            else {                                                     
                res = Math.min(res, f(piles, 0, i + x, Math.max(m, x)));
            }                                                              
          }
        return res;                              
    }
    public int stoneGameII(int[] piles) {
        return f(piles, 0, 0, 1);
    }
}  */

/* *
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	static int max = 0;
  public static void travel( int [][] arr , int i , int j , boolean [][] visited, ArrayList<Integer> bag) {
if ( i < 0 || j  < 0 || arr[i][j] == 0 ||  i >= arr.length || j >= arr[0] .length|| visited [i][j] == true ){
  return ;
}    
visited [i][j] = true ;
bag .add ( arr[i][j]);
travel(arr, i - 1, j, visited, bag);
travel(arr, i, j + 1, visited, bag);
travel(arr, i, j - 1, visited, bag);
travel(arr, i + 1, j, visited, bag);
  }
	public static void getMaxGold(int[][] arr){
      
    boolean [][] visited = new boolean[arr.length] [arr[0].length];

    for ( int i = 0; i < arr.length ; i++){
      for ( int j = 0; j <= arr[0].length ; j++){
        if (arr[i][j] != 0 && visited[i][j] == false ){
          ArrayList <Integer> bag = new ArrayList<>();
          travel( arr, i , j , visited , bag);
          int sum = 0 ; 
          for ( int val : bag ){
            sum += val ;

          }
          if ( sum > max ){
            max = sum ;
          }
        }
      }
    }

		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		getMaxGold(arr);
		System.out.println(max);
	}
		
}
*/

                                // Lexicographical Numbers
                                /* *
import java.io.*;
import java.util.*;

public class leetcoode{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
   
		//write your code here

    for ( int i = 1  ; i < 10 ; i ++)
  {  
    f ( i, n);
  }
     }
	
	public static void f( int i , int n){
	   if ( i > n){
	       return ;
	   }
	   System.out.println (i) ;
	   for ( int j = 1 ; j < 10 ; j ++){
	  f ( j * 10 + i, n) ;
	}
}
}

*/
/* *




class Solution {
  private int f( int [] piles , int p , int i , int m ){
      // p = alex turn 
      // i = index starting from 0
      // m = maximum 

           // base case 
     if ( i == piles.length){
         return 0 ;
     }      
      int res = p == 1 ? 1000000 : -1, s = 0;
                     //loop
    for ( int x = 1 ; x <= Math.min(2 * m, piles.length - i) ; x++){
s += piles [i + x - 1 ] ;
if (p == 0 ){
    res = Math.max(res , s + f (piles , 1 , i + x , Math.max(m , x)));

}
else {
    res = Math.min (res, f (piles , 0 , i + x , Math.max(m , x)));
}
    }
   return res ; 
  }



    public int stoneGameII(int[] piles) {
        return f ( piles , 0 , 0 , 1 );
                
    }
}
*/

/**
 * leetcoode
 */
/**
 * leetcoode
 */
/* *
import java . util . Scanner;
public class leetcoode {

  
public static void main(String[] args) {
  
 Scanner scn = new Scanner( System.in);
  String[] options = {"you are a gay" ,"probably you are a gay " , " how many time should i need to tell you are a gay" , " absolutely you are gay -->6" , " maybe your a gay" , " no your not  a gay"};
   
  int randomIndex = (int) (Math.random() * options.length);
  String generatedString = options[randomIndex];
   System.out.println(" enter your name please");
   String st = scn.nextLine();
      if (st == "rishu" ){
        System.out.println("no you are not a gay ");
         
      }
      
    
   
   else if (st instanceof String) {
  System.out.println("Generated string: " + generatedString);
}
  
  else {
    System.out.println("plese enter a valid name");
  }
}
}
*/
/* *
import java.io.*;
import java.util.*;

public class Main {
   static int count = 0;
	public static void solution(int i, int n, int k, int rssf, ArrayList<ArrayList<Integer>> ans) {
		//write your code here
  
    if ( i > n){
      if ( rssf == k){
        count ++ ;
        System.out.println(count + "(" );
        for ( ArrayList <Integer> set : ans){
          System.out.println(set + ")");
        }
      }
      System.out.println();
    }

    for ( int j = 0 ; j < ans.size(); j ++){
      if ( ans.get(j).size() > 0 ){
        ans.get(j).add(i);
        solution( i + 1, n, k, rssf , ans);
        ans.get (j).remove(ans.get(j).size()-1);
      }
      else {
        ans.get(j).add(i);
        solution(i + 1, n, k, rssf+ 1 , ans);
         ans.get(j).remove(ans.get(j).size() - 1);
   break ;
      }
   
    }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i  = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(1, n, k, 0, ans);

	}

}



/**
 * leetcoode
 *
public class leetcoode {

  public static void main(String[] args) {
    int l = 0 ;
    int r = nums.length - 1;
   while( l< r){
    int mid = l + ( r - 1)/ 2;
    if ( nums [mid] > nums[r]){
      l = mid +  1;
      if ( nums[mid] < nums[l]){
        r = mid ;
       
      }
    else {
      r -- ;
    }

    }
  
   }
   return nums[l];
  }
}



import java.util.Stack;

class Solution {
  public boolean isSubsequence(String s, String t) {
    Stack<Character> st = new Stack<>();
    
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      st.push(ch);
    }

    for (int i = t.length() - 1; i >= 0; i--) {
      char ch = t.charAt(i);
      if (!st.isEmpty() && ch == st.peek()) {
        st.pop();
      }
    }
    
    return st.isEmpty();

  }
}

*/
/* *


import java.util.Stack;

class Solution {
  public String decodeString(String s) {
    Stack<Integer> numb = new Stack<>();
    Stack<String> c = new Stack<>();
    String rep = "";

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (Character.isDigit(ch)) {
        int num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
          num = num * 10 + (s.charAt(i) - '0');
          i++;
        }
        i--; // Decrement i to process the correct character next time
        numb.push(num);
      } else if (ch == '[') {
        c.push(rep);
        rep = "";
      } else if (ch == ']') {
        int repeatCount = numb.pop();
        String decodedString = c.pop();
        StringBuilder sb = new StringBuilder(decodedString);
        for (int j = 0; j < repeatCount; j++) {
          sb.append(rep);
        }
        rep = sb.toString();
      } else {
        rep += ch;
      }
    }

    return rep;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String encodedString = "3[a2[bc]d]";
    String decodedString = solution.decodeString(encodedString);
    System.out.println("Decoded String: " + decodedString);
  }
}
*/
/* *
import java.io.*;
import java.util.*;

public class leetcoode {

    public static void solution(String str, String asf,int count, int pos){
        //write your code here
        if ( pos == str.length()){
          if ( count == 0){
            System.out.println(asf);
          }
          else{
          System.out.println(asf +  count);
         }
         return ;
        }
         if ( count > 0){
          solution(str, asf + count + str.charAt(pos) , count , pos + 1);
         } else{
           solution(str, asf + str.charAt(pos), count , pos + 1);
         }
        solution(str, asf, count + 1, pos + 1);   
    }                                                                 
  
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
*/

/* *
import java.io.*;
import java.security.Key;
import java.util.*;

public class Main {

	public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
	   if ( cs > ts ){
      String rev = " "
    ;
    for ( int i = asf .length()- 1 ; i >= 0 ; i--)  {
     rev += asf.charAt(i);
    }
     String res = asf ;
     if ( odd != null ){
         res += rev ;
         System.out.println(res);

     
    return;
     }
    
  
    for ( char ch : fmap.keySet()){
      int freq = fmap.get(ch);
      if ( freq > 0){
      fmap.put(ch , freq - 1);
      generatepw(cs + 1, ts, fmap, oddc, asf + ch);
      fmap.put(ch, freq);
      
      }
    }
	}
  }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<Character, Integer> fmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		 if ( fmap.containsKey(ch)){
      int of = fmap.get(ch);
      fmap.put(ch, of + 1);
     }
     else{
      fmap.put(ch, 1);
     }
		}
  Character odd =null ;
  int odds = 0;
  int len = 0;
   
  for ( char ch : fmap.keySet()){
    int fres = fmap.get(ch);

    if ( fres % 2 == 1){
      odd = ch ;
      odds++ ;
    }
    fmap.put(ch, fres / 2);
    len = fres / 2 ;
    
  }
  generatepw(1, len , fmap, odd , " ");
	}
	
}

*/

/* *
import java.io.*;
import java.util.*;

public class leetcoode {
  public static boolean ispellindrom(String str) {
   int li =0 ;
   int ri = str.length() - 1;
   while ( li < ri ){
    char left = str.charAt(li);
    char right = str.charAt(ri);
    if ( left != right) {
      return false;
    }
    li++ ;
    ri--;
   }return true;
  }
	public static void solution(String str, String asf) {
		//write you code here
	    for ( int i = 0; i <= str.length() ;  i++){
        String perfix = str.substring(0 , i + 1);
        String ros = str.substring( i + 1);
      b{
           solution( ros , asf + "(" + perfix + ")");
         }
      }
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str, "");
	}

}
*/
         /* *
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

import javax.swing.text.AbstractDocument.LeafElement;

public class Main {

  
	public static void solution(String str, String pattern, HashMap<Character,String> map, String op){
	
    //write your code here
    if ( pattern . length() == 0){
      if ( str.length() == 0){
        HashSet<Character> appeared = new HashSet<>();
        for ( int i = 0 ; i < op.length() ; i ++ ){
           char ch = op.charAt(i)
          if ( appeared.contains(ch) == false){
            System.out.println(ch + "->" + map.get(ch) + ", ");
           appeared .add(ch);

          }
        }
        System.out.println(.);
      }
    }

  char ch = pattern.charAt(0);
  String rop = pattern.substring(1);

   if ( map.containsKey(ch)){
     String previousString = map.get(ch);

     if ( str.length() >= previousString.length()){
     String left = str.substring(0 ,  previousString.length());
      String right = str.substring(previousString.length());

     
     if ( previousString.equals(left)){
      solution(previousString, pattern, map, rop);
     }
   }


    for  ( int i = 0; i < str.length() ; i++){
      String left = str.substring(0, i +1);
      String rigth = str.substring(i + 1);

      map.put(ch, left);
      solution(rigth, rop, map, op);
       map.remove(ch);
    }
  }	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		HashMap<Character,String> map = new HashMap<>();
		solution(str,pattern,map,pattern);
  
}
}
*/

/* *
class Solution {
  public int maxFrequency(int[] nums, int k) {
       int l = 1 ;
       int r = nums.length- 1;
       int ans =0 ;
       while ( l < r){
        int mid = l + ( r - l) / 2;
        if  (posible ( nums , mid , k)){
          ans = mid;
          l = mid + 1;
        } else{
          r = mid - 1;
        }
       }
  }
  public static boolean posible( int [] nums , int mid , int k) 
  {
    int window = 0, total = 0 ;
    for ( int i = 0 ; i < mid ; i++){
      window += nums[i];
      total =  nums [mid - 1]* mid; 
    }
  }
}
 
*/
/* *

class Solution {
  public int maxFrequency(int[] nums, int k) {
      int l = 0;
      int r = nums.length - 1;
      int ans = 0;

      while (l <= r) {
          int mid = l + (r - l) / 2;
          
          if (isPossible(nums, mid, k)) {
              ans = mid;
              l = mid + 1;
          } else {
              r = mid - 1;
          }
      }

      return ans;
  }

  public static boolean isPossible(int[] nums, int size, int k) {
      int window = 0;
      int total = 0;
      
      for (int i = 0; i < size; i++) {
          window += nums[i];
      }
      
      total = window;
      
      for (int i = size; i < nums.length; i++) {
          window += nums[i] - nums[i - size];
          total += nums[i];
          
          if (total - window <= k) {
              return true;
          }
      }
      
      return false;
  }
}
*/

/* *

import java.io.*;
import java.util.*;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

public class leetcoode{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
		System.out.println(ans);
	}

	static int mindiff = Integer.MAX_VALUE;
	static String ans = "";

	public static void solve(int[] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int soset1,
			int soset2) {
        if ( vidx == arr.length){
         int delta = Math.abs(soset1 - soset2);
          if ( delta < mindiff){
             mindiff = delta ;
           ans = set1 + " " + set2;
          }
          return ;
        }
		//write your code here
      if (set1 .size() >=  (arr.length + 1) / 2){
         set1.add(arr[vidx]);
         solve(arr, vidx + 1, set1, set2, soset1 + arr[vidx], soset2);
         set1.remove(set1.size() - 1);

      }        
      if ( set2.size() >= (arr.length + 1) / 2){
        set2.add(arr[vidx]);
        solve(arr, vidx + 1, set1, set2, soset1, soset2 + arr[vidx]) ;
        set2.remove(set2.size() -1);
      }
      }
  
                                                                          
	}
  */
   /* *
  import java.io.*;
import java.util.*;

public class leetcoode{
  public static String swap( String str , int i , int j ) 
  {
    char ith = str.charAt(i);
    char jth = str.charAt(j);

   String left = str.substring(0, i);
   String mid = str.substring(i +1 , j);
   String  right = str.substring(j + 1);
   
   return   left + jth + mid + ith + right;
 
  }
	static String max;
	public static void findMaximum(String str, int k) {
		//write your code here
    if (Integer.parseInt(str) > Integer.parseInt(max)){
      max = str ;
    }
    if ( k == 0){
      return ;
    }
     for ( int i =0 ; i <= str .length() ; i++){
      for ( int j = i ; j<= str.length(); j ++){
         if ( str.charAt(j) > str.charAt(i)){
          str = swap (  str , i , j);
          findMaximum(str, k - 1);
           str = swap ( str , i , j);
         }
      }
     }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		 max = str;
		findMaximum(str, k);
		System.out.println(max);
	}

}
*/
/* *
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leetcoode {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a line of text: ");
            String line = br.readLine();
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
*/
import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt){
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for(int i = 0; i < vtces; i++){
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      // write your code here
      boolean[] visited = new boolean[vtces];
      boolean path = haspath( graph , src , dest , visited);
       System.out.println(path);
    }
  
    public static boolean haspath ( ArrayList <Edge>[] graph , int src , int dest , boolean[]visited){
      if (src == dest){
        return true ;
      }   
      visited [src] = true ;
      for (  <Edge> edge : graph[src]){
        if ( visited [edge.nbr] == false){
        boolean hasmorepath =  haspath(graph, edge.nbr, dest, visited);
         if (hasmorepath == true ){
           return true ;
         }
        }

      }
      return false ;
    
    
  }



    }

