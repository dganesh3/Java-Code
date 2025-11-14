package com.revision.methods;

public class Array
{
  private int[] arr;
  private int count;
  private int incremt_capacity;
  public Array()
  {
      this.arr=new int[10];
  }
  public Array(int initial_capacity)
  {
      this.arr=new int[initial_capacity];
  }
  public Array(int initial_capacity,int incremt_capacity)
  {  
      this.arr=new int[initial_capacity];
      this.incremt_capacity=incremt_capacity;
  }
  public int size()
  {
      return count;
  }
  public void display()
  {
      for(int i=0;i<count;i++)
      {
          System.out.print(arr[i]+" ");
      }
      System.out.println();
  }
  public int capacity()
  {
      return arr.length;
  }
  public void add(int data)
  {
      if(count==arr.length)
      {
          int[] newArr;
          if(incremt_capacity==0)
          {
              newArr=new int[(int) (arr.length+arr.length*0.6)];
          }
          else
          {
           newArr=new int[arr.length+incremt_capacity]; 
          }
          for(int i=0;i<=arr.length-1;i++)
          {
              newArr[i]=arr[i];
          }
          arr=newArr;
      }
      arr[count++]=data;
  }
  public void addFront(int data)
  {
      if(count==arr.length)
      {
          int[] newArr;
          if(incremt_capacity==0)
          {
              newArr=new int[(int) (arr.length+arr.length*0.6)];
          }
          else
          {
           newArr=new int[arr.length+incremt_capacity]; 
          }
          for(int i=0;i<=arr.length-1;i++)
          {
              newArr[i]=arr[i];
          }
          arr=newArr;
      }
     
      for(int i=count;i>=1;i--)
      {
          arr[i]=arr[i-1];
      }
      arr[0]=data;
      count++;
  }
  public void add(int index,int data)
  {
      if(index<0 || index>=arr.length-1)
      {
         throw new ArrayIndexOutOfBoundsException();
      }
      int[] newArr;
      if(incremt_capacity==0)
      {
          newArr=new int[(int) (arr.length+arr.length*0.6)];
      }
      else
      {
       newArr=new int[arr.length+incremt_capacity]; 
      }
      for(int i=count;i>index;i--)
      {
          arr[i]=arr[i-1];
      }
      arr[index]=data;
      count++;
  }
  public void remove(int index)
  {
	  if(index<0|| index >=count)
	  {
		  throw new ArrayIndexOutOfBoundsException();
	  }
	  else
	  {
		  for(int i=index;i<count-1;i++)
		  {
			  arr[i]=arr[i+1];
		  }
		  count--;
	  }
  }
}
