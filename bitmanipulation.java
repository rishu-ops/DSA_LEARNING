/* *
import java.util.Scanner;
public class bitmanipulation {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here

    int onmask  = ( 1 << i);
    int offmask = ( 1 << j);
    int task = ( 1 << k);
    int mask = ( 1 << m);

    System.out.println(n | onmask);
    System.out.println(n & offmask);
    System.out.println(n ^ task);
    System.out.println((n & mask) == 0 ? false : tr);
  }

}*/
/* *
import java.io.*;
import java.util.*;

public class bitmanipulation {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    //write your code here
    int ans = n  &  -n ;
    System.out.println(Integer.toBinaryString(ans));
  }

}*/

/* *


import java.io.*;
import java.util.*;

public class bitmanipulation {
   

        public static void main(String[] args){
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          //write your code here
          int counter = 0;
          while ( n != 0){
          int rsbm = n & -n;
          n -= rsbm ;
          counter ++; 
  
        }
      

        System.out.println(counter);
      
        
}
}
*/
/*
import java.io.*;
import java.util.*;

public class Main {
public static int powerof2(int  n){
    int i = 1 ;
    while ( i * 2 <= n){
      i = i * 2;
    }
    return i ;
}
  public static int solution(int n){
    //write your code here
    int hp2 = powerof2(n);
     int l = n - hp2;

    return 2 * l + 1;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }
  

}
*/
/* *
import java.io.*;
import java.util.*;
 
 public class bitmanipulation {
   
     public static ArrayList<String> grayCode( int n) {
 	 //Write your code here
     if ( n == 1){
        ArrayList<String> st =new ArrayList<>();
     
        st.add("0");
        st.add("1");
        return st ;
     }
     ArrayList <String > rres = grayCode(n - 1);
     ArrayList<String> mres = new ArrayList<>();
     for ( int i = 0 ; i< rres.size() ; i++){
        String rstr = rres.get(i);
        mres .add("0" + rstr);
     }
     for ( int i = rres.size() ; i< 0 ; i--){
        String rstr = rres.get(i);
        mres .add( "1" + rstr);
     }
     return mres ;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         ArrayList<String> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }
 */
/* *
import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Integer> sol = new ArrayList<>();

	public static void solution(int[] people, int nskills, int cp, ArrayList<Integer> onesol, int skills) {
		// write your code here
       if ( cp == people.length){
        if ( skills == ( 1 << nskills) - 1);
           if ( sol.size() == 0  || onesol.size() < sol.size())
             {
                 sol =  new ArrayList<>(onesol);
             }       }
             
        solution(people, nskills, cp + 1, onesol, skills);

        onesol.add(cp);
        solution(people, nskills, cp + 1, onesol, skills | people[cp]);
        onesol.remove(onesol.size() - 1);

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashMap<String, Integer> smap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			smap.put(scn.next(), i);
		}
	                                                      
		int np = scn.nextInt();         
		int[] people = new int[np];
		for (int i = 0; i < np; i++) {
			int personSkills = scn.nextInt();
			for (int j = 0; j < personSkills; j++) {
				String skill = scn.next();
				int snum = smap.get(skill);
				people[i] = people[i] | (1 << snum);
			}
		}

		solution(people, n, 0, new ArrayList<>(), 0);
		System.out.println(sol);
		
	}
}*/
/* *
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
    
    //write your code here
    int xor = 0;

    for ( int val: arr){
     xor = xor ^ val;
       
    }
 
     int maks = xor & -xor;
     int x = 0;
     int y = 0; 
     for ( int val : arr){
     if ( val & maks ) == 0{
      x = x ^ maks;
    }
     else {
      y = y ^ maks;
      }
   }
  
   if( x > y){
    System.out.println(x);
    System.out.println(y);
   }
   else{
    System.out.println(y);
    System.out.println(x);
   }
  }

}
*/
/* *
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   int xxor  = 0 ;
   for ( int i = 0; i <= arr.length ; i++){
    xxor = xxor ^= arr[i];
  
   }
   for( int i = 0; i <= arr.length; i++){
    xxor = xxor ^= i ;

   }
   int mask = xxor & -xxor ;
   int x =0 ;
   int y = 0;
   for (int val : arr){
    if ( val & mask) == 0 {
      x = x ^val ;
    }else{
       y = y ^ mask;
    }
   }
   for ( int i = 1 ; i<= arr.length ; i++ ){
    if (i & mask) ==0{
      x = x ^i ;
    }
    else {
    y =  y ^ i;
    }
   }
   for ( int val : arr){
    if ( val == x){
     System.out.println("missing number " + y);
     System.out.println("duplicate number " + x);
    }else {
    System.out.println("missing number "  + y);
    System.out.println("duplicate number " + x);   
    }
   }
  }

}
*/
/* *
import java.io.*;
import java.util.*;

public class bitmanipulation {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   int tn = Integer.MAX_VALUE , tn1 = 0, tn2  = 0 ;
   for ( int i = 0; i<= arr.length;i++){
      int tncnm = tn | arr[i];
      int t1cnm = tn1 | arr[i];
      int t2cmn = tn2 | arr[i];
   
    
   tn = tn & (~tncnm);
   tn1 = tn1 | tncnm;

   tn1 = tn1 & (~t1cnm);
   tn2= tn2 | t1cnm;
   
   tn2 = tn2 & (~t2cmn);
   tn = tn & t2cmn;

   
  }
System.out.println(tn1);
}

}*/
/* *
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(int[] arr){
		//write your code here
		
    }
	public static void main(String[] args) {a
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
	
	
}*/
/* *
import java.util.Stack;

class MyHashSet {
    static Stack<Integer> st = new Stack<>();

    public void add(int key) {
        st.push(key);
    }

    public void remove(int key) {
        st.removeAllElements(key);
    }

    public boolean contains(int key) {
        return st.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such: 
 * MyHashSet obj = new MyHashSet(); 
 * obj.add(key); 
 * obj.remove(key); 
 * boolean param_3 = obj.contains(key);
 *

import java.net.NetworkInterface;

class Node{
  int val ;
   Node next;
  public Node(int val){
    this .val = val;
  }
}
class MyLinkedList {
  private Node head;
  private Node tail;
  public MyLinkedList() {
      
  }
  
  public int get(int index){
      Node node = getNodeAtIndex(index);
      if (node != null){
        return node.val;
      }
  }
  
  public void addAtHead(int val) {
      Node newhead = new Node(val);
      newhead.next = head ;
      head = newhead;
      if ( tail == null){
        tail = head ;
      }
  }
  
  public void addAtTail(int val) {
      if ( tail == null){
        addAtHead(val);
      }else {
        Node newnoNode = new Node(val);
        tail.next = newnoNode;
        tail = newnoNode ;
      }
  }
  
  public void addAtIndex(int index, int val) {
      if ( index == 0){
        addAtHead(val);
      }else{
      Node preNode = getNodeAtIndex(index - 1);
      if (preNode != null){
        Node newnNode = new Node(val);
        newnNode .next = preNode.next;
        preNode.next = newnNode;
        if ( preNode .next == tail){
          tail = newnNode;
        }
      } 
      }
  }
  
  public void deleteAtIndex(int index) {
      if ( index == 0){
        if ( head != null){
          head = head.next ;
          if (head == null){
            tail = null;
          }
        }
      }
      else {
        Node prenNode = getNodeAtIndex( index - 1);
        if  ( prenNode != null && prenNode.next != null){
          prenNode .next = prenNode .next.next ;
          if ( prenNode .next == null){
            tail = prenNode ;          }
        }
      }
  }
private Node getNodeAtIndex(int index){
  Node currNode = head;
  int c = 0;
  while ( currNode != null && c < index){
    currNode = currNode.next ;
    c ++;
  }
  return currNode ;
}
}



/**
* Your MyLinkedList object will be instantiated and called as such:
* MyLinkedList obj = new MyLinkedList();
* int param_1 = obj.get(index);
* obj.addAtHead(val);
* obj.addAtTail(val);
* obj.addAtIndex(index,val);
* obj.deleteAtIndex(index);
*/


/* *
class KthLargest {
  PriorityQueue ( int , vector<int> , greater<int>Pq)
  int gk ;
  public KthLargest(int k, int[] nums) {
      gk= k;
      for ( int num  : nums){
            if ( pq.size() < k){
              pq.push(num);
            }else if (
              pq.size() == k && num >= pq.top())
              pq.push(num);
          }if ( pq > k){
            pq.pop();
          }

      
  }
 
  public int add(int val) {
   if (pq.size() > gk){
    pq.push(val);
  }else if (
    pq.size() == gk && val >= pq.top())
    pq.push(val);
}
if ( pq.size() > gk){
  pq.pop();
}

   }     
  

/**
* Your KthLargest object will be instantiated and called as such:
* KthLargest obj = new KthLargest(k, nums);
* int param_1 = obj.add(val);
*/


/*
import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.offer(val);
        } else if (val > pq.peek()) {
            pq.poll();
            pq.offer(val);
        }
        
        return pq.peek();
    }
}
*/
/* *
import java.io.*;
import java.util.*;

public class bitmanipulation {

  public static void solution(boolean[][] board, int row, int cols, int ndiag, int rdiag, String asf) {
    // write your code here
    for ( int i  = 0 ; i <= board[0].length; i++){
      if (   
         (cols & 1 <<i)== 0 &&
         (ndiag & 1<< row + cols )== 0&&
         (rdiag & 1<< row - cols + board.length - 1)== 0
      ){
         board[row][cols] = true;
          cols ^= (1 << i );
          ndiag ^= (1 << row + cols);
          rdiag ^= (1 << row - cols + board.length - 1);
          solution(board, row + 1, cols, ndiag, rdiag, asf + row  + "-" +  cols + ",");
          board[row][cols] = false;
          cols  ^= (1 << i );
          ndiag ^= (1 << row + cols);
          rdiag ^= (1 << row - cols + board.length - 1);
      
        }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    int cols = 0;
    int ndiag = 0;
    int rdiag = 0;
    solution(board, 0, cols, ndiag, rdiag, "");
  }

}
*/
/* *
import java.io.*;
import java.security.spec.RSAPublicKeySpec;
import java.util.*;

public class bitmanipulation {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    //write your code here
    int fliped = a ^ b ;
    int count = 0;
    while ( fliped != 0){
      int rsbm = fliped & - fliped ;
       fliped -= rsbm ;
       count ++;
    }
  System.out.println(count);
  }

}*/
/* *
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int left = scn.nextInt();
    int right = scn.nextInt();

   //write your code here
   int mask = ( 1 << right - left + 1);
   mask --;
   mask = ( 1 << left - 1);
   mask = a & mask ;
   
   mask = b | mask ;

 System.out.println(b);    
  }


}*/
/* *
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    int odmas = 0x55555555;
    int evmas = 0xAAAAAAAA;
    int ods = n  & odmas ;
    int ebs = n & evmas;
    ods >>= 1 ;
    ebs <<= 1 ;
    int ans = ods | ebs ;
    System.out.println(ans);

  }

} */
/* *
import java.io.*;
import java.util.*;

public class bitmanipulation {

  public static long happy(int[] arr){
    int res = 0;

    for (int i = 0; i <= 32; i++) {
      int counton = 0;
      for (int val : arr) {
        if (((val & 1) << i) != 0) {
          counton++;
        }
      }
      int couuntoff = arr.length - counton;
      int diff = counton * couuntoff * 2;
      res += diff;
    }
    return res;
  }

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(happy(arr));
  }
}
*/
/*
import java.io.*;
import java.util.*;

public class bitmanipulation{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
    //write your code here
    if (n == 0){
     return 0;
      }  
    int x  = returnvalofx(n);
    int firstside = ( 1 << x - 1) * x ;
    int midside =  n - (1 << x) + 1;
    int restside = n - ( 1 << x);
    int ans = firstside + midside + solution(restside);
    return ans ;

      }

    public static int returnvalofx( int n){
    int  x = 0;
    while ((1 << x) <= n );
    x ++;
    
    return x - 1;
  }

}
*/
                  // prin binarry and reverse order  
/* *
                  import java.io.*;
import java.util.*;

import javax.xml.transform.SourceLocator;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    int rev = 0 ;
    int j = 0;
    boolean state = false ;
    for ( int i = 0; i<= 32 ; i--){
     
     int maks = (1 << i);
      if (state){
        if ((n & maks) == 1)
        {
          System.out.println(1);

          int smaks = (1 << j);
          rev |= smaks;
          
        }
      else {
        System.out.println(0);    
      }

      j++;
      }
      else {
      if ((n >>maks)== 1){
      System.out.println(1);
      state = true ;
      int smaks = (1 << j); 
      rev |= smaks;
      j++ ;
                    }
      
        
      }
    }     

 System.out.println(rev);
  }

}

*/
/* *
import java.io.*;
import java.util.*;

public class Main {

    public static void solution(int[] arr) {
        //write your code here
        Arrays.sort(arr);
        ArrayList <String> st = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i<= arr.length -1  ; i++){
          int xor = arr[i] ^ arr[i + 1];
          if (xor < min){
          st = new ArrayList<>();
          st.add(arr[i] + " " + arr[i + 1]); 
        } else if (xor == min){
          st.add(arr[i] + " " + arr[i + 1]);
        }
        }
        for ( int val : st){
          System.out.println(val);
        }    
    }

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
    
    
} */
import java.io.*;
import java.util.*;

public class bitmanipulation {
    
   public static int getrev ( int n){
    int rev  = 0 ;
     while ( n != 0){
      int lowbit = ( n & 1);
      rev |= lowbit;
      
      rev <<= 1 ;
      n >>= 1 ;
      
    }
    rev >>= 1 ;

    return rev ;
   }
    public static int NthPalindromicBinary(int n) {
         //write your code here
        int count = 1;
        int len  = 1 ;
      while (count > n){
        len ++;
        int elmenetforthisem = (1 << (len - 1) / 2 );
         count +=  elmenetforthisem ;

      }
      count -= ( 1 << (len - 1) / 2);
      int offset = n - count - 1 ;
      
      int ans = ( 1 << (len - 1));
       ans |= (offset << ( len / 2 )); 
       
       int valforr = (ans >> ( len / 2));
       int rev = getrev(valforr);
      ans |= rev ;

       return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(NthPalindromicBinary(n));
    }

}