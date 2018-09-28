package com.example.libjava;

public class BubbleSort {

  public static void main(String[] args) {
    //简单测试数组
    int arr[] = {1, 6, 0, -1, 9, 1000, -1000, 98, -687};

    //调用选择排序法
    Select select = new Select();
    select.sort(arr);
  }

  public static void standard() {
    int arr[] = {1, 6, 0, -1, 9};
    int temp = 0;//中间值
    //-------冒泡排序法
    //外层循环,它决定一共走几趟
    for (int i = 0; i < arr.length - 1; i++) {
      //内层循环,开始逐个比较
      //如果我们发现前一个数比后一个数大,则交换
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          //换位
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }

    }
    //输出结果
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }
}

//--------------选择排序法
class Select {

  public void sort(int arr[]) {
    //中间值
    int temp = 0;

    //外循环:我认为最小的数,从0~长度-1
    for (int j = 0; j < arr.length - 1; j++) {
      //最小值:假设第一个数就是最小的
      int min = arr[j];
      //记录最小数的下标的
      int minIndex = j;

      //内循环:拿我认为的最小的数和后面的数一个个进行比较
      for (int k = j + 1; k < arr.length; k++) {
        //找到最小值
        if (min > arr[k]) {
          //修改最小
          min = arr[k];
          minIndex = k;
        }
      }
      //当退出内层循环就找到这次的最小值
      //交换位置
      temp = arr[j];
      arr[j] = arr[minIndex];
      arr[minIndex] = temp;
    }
    //输出结果
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "   ");
    }

  }
}