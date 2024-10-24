# Revision @ 24/10

1. primitive : 
  - boolean
  - byte
  - short
  - int
  - char
  - float
  - long 
  - double

2. String and String method()
  - charAt()
  - indexOf()
  - tocharArray()
  - trim()
  - split()
  - compareTo()
  - toUpperCase() / toLowerCase()
  - startWith() / endWith()
  - substring(int startIndex)
  - substring(int startIndex , int endIndex-1)

3. if-else
```java=
if( condition A){

  if condition A is true , 
  do sth inside this code block

}else if(condition B){

 if condition B is true , 
 do sth inside this code block

}else{

  condition A and condition B both false ,
  do sth inside this code block 

}
```

4. switch
```java=
switch(variable){
case(A):

break;
case(B):

break;
default:
}
```

5. for-loop
```java=
for(start point ; end point ; condition ){

}
```

6. while-loop
```java=
while(condition){

}
```

7. Array
 - int[] arr = new int[5];   ==define the length first==
 - int[] arr2 = new int[]{1,2,3}; ==input the element==
 - int[] arr3 = {1,2,3}; 

 8. for-each loop
 ```java=
 for( type of source : source){

 }

 example : 
 int[] arr = new int[]{1,2,3,4,5,67,8};
 for(int i : arr){
  System.out.println("output :" + i);
 }
 // output : 1
 // output : 2
 // output : 3
 // output : 4
 // output : 5
 // output : 67
 // output : 8
 ```