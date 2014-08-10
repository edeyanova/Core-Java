package OddNumber;

import java.util.Arrays;

public class odd_n {
	public static void main(String[] args) {
		isOdd(3);
	}
		public static boolean isOdd(int n) {
			if(n%2!=0) {
			return true;
			}
			return false;
		}
		public static boolean isPrime(int N) {
			for (int i=2; i<Math.sqrt(N); i++) {
				if(N % i == 0) 
					return false;
			}
				return true;
		}
		public static void min(int[] array){
			int min=array[0];
			for(int i=0;i<(array.length);i++)
				if (array[i] < min ){
					min=array[i];
				}
			System.out.println("Min:" + min);
		}
		public static void getAverage(int[] array){
			int M=array.length;
			int A=0;
		
			for(int i=0; i<M;i++){
				A=A+array[i];
				
			}
			System.out.println("Average: " + A/array.length);
			
		}
		public static void kthMin(int[] array) {
			int N=array.length;
			int min=0;
			for(int i=1;i<N;i++){
				if(array[i] < array[min]){
					min=i;
				}
			}
			
		}
		 public static void isPrime1(int N){

		        while(N>0){

		            boolean isPrime=true;

		            for(int i=2;i<N/2;i++){

		                if(N%i==0) {

		                    isPrime=false;

		                    break;

		                }

		            }

		            if(isPrime=true){

		                System.out.println("Prime");

		                break;

		            }

		            else 

		            {

		                System.out.println("Not Prime");

		                break;

		            }

		        }

		    }
		  public int kthMin(int k, int[] array) {

		        Arrays.sort(array);

		        if (k - 1 < array.length) {

		            return array[k - 1];

		        }

		        return -1;

		    }
		  public static void average(int[] data) {  

			    int sum = 0;
			    for(int i=0; i < data.length; i++) 
			    sum = sum + data[i]; 
			    double average = sum / data.length;; 

			    System.out.println("Average value of array element is "  + average);

		
}
		public static long kthFac(int k, int n) {
			int p = 1;
			int l = n;
			for(int i=1; i<l; i++) {
				p*=i;
				if(i==l && k>0) {
					k--;
					l=p;
				}
				else if(k==0) {
					break;
				}
			}
			return p;
			
		}
		public static long doubleFac(int n) {
			if(n<2) {
				return 1;
			}
			int p=1;
			int r=1;
			for(int i=2; i<n; i++) {
				p*=i;
			}
			for(int i=2; i<p; i++) {
				r*=i;
			}
			return r;
			
		}
	//	 public long getLargestPalindrome(long N) {
		//        N--;
		//        if (Utils.isPalindrome(N)) {
		 //           return N;
		  //      } else {
		  //          return getLargestPalindrome(N);
		  //      }
		   // }

		public boolean isPalindrome(int argument) {
			int reverse = 0;
			int original = argument;
			while(original!=0) {
				int r = original % 10;
				reverse = reverse * 10 + r;
				original /= 10;
			}
			if(argument == reverse) {
				return true;
			}
			return false;
			
		}
		public boolean isPalindrome(String argument) {
			String reverse = " ";
			for(int i=argument.length()-1; i>=0; i--) {
				reverse += argument.charAt(i);
				if(argument.equals(reverse)) {
					return true;
				}	
			}
			return false;
		}
		public int[] histogram(short[][] image) {
	        int[] h = new int[256];
	        for (int i = 0; i < 256; i++) {
	            h[i] = 0;
	        }
	        for (int i = 0; i < image.length; i++) {
	            for (int j = 0; j < image[i].length; j++) {
	                h[image[i][j]] += 1;
	            }
	        }
	        return h;
	    }
		 public int getNearestPowerOf2(int x) {
			 int i = 0;
			 while(x != 1) {
				 x /= 2;
				 i++;
			 }
			return (int) Math.pow(2, i);
			 
		 }
		public String reverseMe(String argument) {
			StringBuilder sb = new StringBuilder();
			for(int i=argument.length()-1; i>=0; i--) {
				sb.append(argument.charAt(i));
			}
			return sb.toString();
			
		}
		 String reverseEveryChar(String arg)  {
			String[] words = arg.split(" ");
			for(String word: words) {
				arg = arg.replaceFirst(word, reverseMe(arg)).toString();
			}
			return arg;
			 
		 }
		 public static boolean haveEqualSubstrings(String a, String b) {
		        for (int i = 0; i < a.length(); i++) {
		            String substringA = a.substring(i, a.length());
		            String substringB = b.substring(i, a.length());
		            if (substringA.equals(substringB)){
		                return true;
		            }
		        }
		        return false;
		    }
		 public int sumOfNumbers(String input) {
			String[] StringArray = input.split(" ");
			int sum = 0;
			int e = 0;
			for(int i=0; i<StringArray.length; i++) {
				e = Integer.parseInt(StringArray[i]);
				sum += e;
			}
			return sum;
				 
		 }
		 
		 public String copyEveryChar(String input, int k) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<input.length(); i++) {
				do {
					k--;
					sb.append(input.charAt(i));
				}
				while(k>=1);
			} 
			return sb.toString();
			 
		 }
		 
		 public int countOcurrences(String needle, String haystack) {
			//return (needle.split(haystack).length - 1);
			int count = 0;
			for (int i = 0; i < haystack.length(); i++) {
				if(haystack.substring(i).startsWith(needle)) {
					count++;
				}
			}
			return count;
			 
		 }
		 
		 public boolean anagram(String A, String B) {
			 char[] word1 = A.replaceAll("[\\s]", "").toCharArray();
		     char[] word2 = B.replaceAll("[\\s]", "").toCharArray();
		     Arrays.sort(word1);
		     Arrays.sort(word2);
		     return Arrays.equals(word1, word2);
		 }
		 public long pow(int a, int b) {
			 if(b==0) {
				 return 1;
			 }
			 return pow(a, b-1) * a;
		 }
}