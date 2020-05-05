# 常用排序算法


## 面试中经常会被问到或现场写：冒泡、快速



![](img\1.png)

----------

#### （1）冒泡排序 Bubble Sort
  * * ```java
         /**
         - 冒泡排序
           - @param arr 需要排序的数组 
             */
         public void bubbleSort(int[] arr){ 
             for(int i= 0;i<arr.length;i++){
             	for(int j = 0;j<arr.length-1;j++){
             		if(arr[j]  > arr[j+1]){
             			int temp;
             			temp = arr[j];
             			arr[j] = arr[j+1];
             			arr[j+1] = temp;
             		}				 
             	}
             	System.out.print(arr[i]  + ",");
             }
         }
       ```

----------

#### （2）插入排序 Insert Sort  
```java
   /**
	- 插入排序
    - @param arr 需要排序的数组 
    */
    public static void insertSort(int[] arr){  
      int length=arr.length; //数组长度  
      int j;               //当前值的位置  
      int i;               //指向j前的位置  
      int key;             //当前要进行插入排序的值  
         //61,19,56,37,20     ,66,50,34,37,3
        // 19 37 56 61 
        /*
        	key  = 20
        	j =4;
        	i = j-1 = 3
        	a[4] = a[3]
        	19 37 56 61 61
        	i = 2 56 > 20
        	a[3]=a[2]
        	19 37 56 56 61
        	i = 1 37 > 20
        	a[2] = a[1]
        	19 37 37 56 61
        	i =0 19 > 20 false
        	a[1] = key =20
        	
        */
      //从数组的第二个位置开始遍历值  
          19 37 37 56 61
      for(j=1;j<length;j++){  
       key=arr[j];  
       i=j-1;  
       //a[i]比当前值大时，a[i]后移一位,空出i的位置，好让下一次循环的值后移  
       while(i>=0 && arr[i]>key){  
           arr[i+1]=arr[i]; //将a[i]值后移  
           i--;         //i前移  
       }//跳出循环(找到要插入的中间位置或已遍历到0下标)  
       arr[i+1]=key;    //将当前值插入  
      }  
     }  
```

----------

#### （3）选择排序 Select Sort   
```java
/**
- 选择排序
  - @param arr 需要排序的数组 
*/
 public static void selectSort(int[] arr) { 
     for (int i = 0; i < arr.length; i++) {  
         int min = i; / 将当前下标定义为最小值下标 
  		 for (int j = i + 1; j < arr.length; j++) {  
                if (arr[min] > arr[j]) { /* 如果有小于当前最小值的关键字 */  
                    min = j; /* 将此关键字的下标赋值给min */  
                }  
          }  
          if (i != min) {/* 若min不等于i，说明找到最小值，交换 */  
                int tmp = arr[min];  
                arr[min] = arr[i];  
                arr[i] = tmp;  
          }  
        }  
    }  
```

----------

#### （4）归并排序 Merge Sort 	
```java
/**
	- 归并排序 
    - @param a 需要排序的数组
    - @param s 第一个有序表的起始下标 
    - @param m 第二个有序表的起始下标 
    - @param t 第二个有序表的结束下标 
    - */  
 public static void merge(int[] arr, int s, int m, int t) {  
  int[] tmp = new int[t - s + 1];  

    int i = s, j = m, k = 0;  
	  while (i < m && j <= t) {  
	   if (arr[i] <= arr[j]) {  
	    tmp[k] = arr[i];  
	    k++;  
	    i++;  
	   } else {  
	    tmp[k] = arr[j];  
	    // sum += (j - i) - (j - m);  
	    j++;  
	    k++;  
	   }  
	  }  
	  while (i < m) {  
	   tmp[k] = arr[i];  
	   i++;  
	   k++;  
	  }  
	  
	  while (j <= t) {  
	   tmp[k] = arr[j];  
	   j++;  
	   k++;  
	  }  	  
	  System.arraycopy(tmp, 0, arr, s, tmp.length);  
} 
```

----------

#### （5）快速排序 Quick Sort

```java
  /**
	  * 获得基础的下标
	  * @param arr 需要排序的数组
	  * @param low 数组待排序的最小的下标
	  * @param high 数组待排序的最大的下标
	  * @return 返回中轴值（该值大于左边值，小于右边值）
	  */
	  public static  int getMiddle(int[] arr,int low,int high){
        int temp = arr[low];// temp = 12 = arr[0]
        while(low <high){// 0<1
            while(low <high && arr[high] > temp){//0<1  && 14>12
                high--;//h  = 0
            }
            arr[low] = arr[high]; // a[0] = a[0];
            while(low <high && arr[low] <=temp){//
                low++;
            }
            arr[high] = arr[low];//a[0] = a[0]
        }
        arr[low] = temp;//a[0] = 12
        return low;//0
    } 

    public  static void quickSort(int[] arr,int low, int high){
    if(low <high){//0,1
        //将数组一份为二
        int middle = getMiddle(arr, low, high);// arr 0,9  m = 4

        System.out.println("middle = " + middle);//m =4
        //左边进行递归 快速排序
        quickSort(arr,low,middle -1);  // arr 0,3
        //右边进行递归 快速排序
        quickSort(arr,middle + 1,high);// arr 5,9
    }
}

//再次封装，对外调用  12，14
public static void quick(int[] arr){
    if(arr.length  >=2)
        quickSort(arr, 0, arr.length -1);// 0,9
}

int[] a ={}
int[] a ={65}
int[] a ={65,76}

```



public static int getModdle(int[] a, int low, int high){
  key = a[low];
  while(low < high){
    while(low < high && key < a[high]){
        high--;
    }
    a[high] = a[low];

    while(low < high && key > a[low]){
        low++;
    }
    a[low] = a[high];
  }
  a[low] = key;
  retrun low;
}

public static void quickSort(int[] a, int low, int high){
  if(low < high){
      int moddle = getModdle(a, low, high);
      getModdle(a, low, moddle - 1);
      getModdle(a, moddle + 1, high);
  }
}


public static void quick(int[] a){
  if(a.length >= 2){
      quickSort(a, 0 , a.length - 1);
  }
}