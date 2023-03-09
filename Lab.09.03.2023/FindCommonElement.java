package NLab;

public class FindCommonElement {
  
  public static void main(String[] args) {
	  int[] arr1 = {1, 4, 6, 7, 9};
      int[] arr2 = {2, 4, 6, 8, 10};
      int[] arr3 = {3, 4, 5, 6, 7};

      int i = 0, j = 0, k = 0; 

   for (i = 0, j = 0, k = 0; i < arr1.length && j < arr2.length && k < arr3.length;) {
	   if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	        System.out.print(arr1[i] + " ");
	             i++;
	             j++;
	             k++;
	   }
    else if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) {
	            i++;
	     }
   else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) {
	            j++;
	     }
   else if (arr3[k] <= arr1[i] && arr3[k] <= arr2[j]) {
	            k++;
      }
	   }
	  }
	}


