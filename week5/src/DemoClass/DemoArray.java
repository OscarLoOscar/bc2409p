package DemoClass;

import java.util.Arrays;

public class DemoArray {
  // attribute
  private int[] array = new int[] {1, 2, 3, 4, 5};

  public int[] getArr() {
    return this.array;
  }

  public int getLength() {
    return this.array.length;
  }

  // Instance method
  public void add(int num) {
    int[] newArr = Arrays.copyOf(this.array, this.array.length + 1);
    newArr[newArr.length - 1] = num;
    array = newArr;
  }

  // remove direct number
  public void sub(int num) {
    int[] newArr = new int[this.array.length - 1];
    int index = 0;
    boolean removed = false;
    for (int i = 0; i < this.array.length; i++) {
      if (this.array[i] == num && !removed) {
        removed = true;
        continue;
      }
      if (index < newArr.length) {
        newArr[index++] = this.array[i];
      }
    }
    array = newArr;
  }

  public void sub2(int num) {
    int index = -1;
    for (int i = 0; i < this.array.length; i++) {
      if (this.array[i] == num) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      return;
    }
    for (int i = index; i < this.array.length - 1; i++) {
      this.array[i] = this.array[i + 1];
    }
    int[] newArr = Arrays.copyOf(this.array, this.array.length - 1);
    array = newArr;
  }
  // [1,2,3,4,5,6] , remove 4
  // [1,2,3,5,6,4]
  // new Array = [1,2,3,5,6]

  public static void main(String[] args) {
    DemoArray arr1 = new DemoArray();
    // example : arr1.getLength() = 5
    arr1.add(6);
    System.out.println(arr1.getLength()); // arr1.getLength() = 6 ,
    System.out.println(Arrays.toString(arr1.getArr())); // [1,2,3,4,5,6]
    arr1.sub(1);
    System.out.println(arr1.getLength()); // arr1.getLength() = 5 ,
    System.out.println(Arrays.toString(arr1.getArr())); // [2,3,4,5,6]
    arr1.sub(6);
    System.out.println(arr1.getLength()); // arr1.getLength() = 4 ,
    System.out.println(Arrays.toString(arr1.getArr())); // [2,3,4,5]
    arr1.sub2(3);
    System.out.println(arr1.getLength()); // arr1.getLength() = 3 ,
    System.out.println(Arrays.toString(arr1.getArr())); // [2,3,5]
  }
}
