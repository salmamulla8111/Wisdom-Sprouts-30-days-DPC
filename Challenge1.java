/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.challenge1;

/**
 *
 * @author salma gold smith
 */
public class Challenge1 {
public static void main(String[] args)
{
int[] a={65, 58, 12, 47, 76, 32, 24};
int k=4;
for(int i=0; i<a.length-1; i++)
{
for(int j =i+1; j<a.length; j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
if(i==k-1)
{
System.out.println(k+" largest element is "+a[i]);
}
}
System.out.println("-");
for(int i=0; i<a.length; i++)
    {
System.out.print(a[i]+" ");
}
}
}
