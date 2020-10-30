package movieDeteails;

import java.util.Scanner;
public class Main{
    public static int n;
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of products:");
        n=sc.nextInt();
        
        int[] num=new int[n];
        String[] name=new String[n];
        float[] cost=new float[n];
        
        System.out.println("Enter product names:");
        for(int i=0;i<n;i++)
        {
        name[i]=sc.next();
        }
        
        System.out.println("Enter the price of each product:");
        for(int i=0;i<n;i++)
        cost[i]=sc.nextFloat();
        
        System.out.println("Enter the quantity of each product:");
        for(int i=0;i<n;i++)
        num[i]=sc.nextInt();
        
        float temp_cost;
        System.out.println("Enter the product price to be searched:");
        temp_cost=sc.nextFloat();
        
        int temp_num;
        System.out.println("Enter the product quantity to be searched:");
        temp_num=sc.nextInt();
        
        Shop s1=new Shop(name,num,cost);
        String[] onprice=new String[n];
        String[] onnum=new String[n];
        
        onprice=s1.search(temp_cost);
        onnum=s1.search(temp_num);
        
        System.out.println("Search based on price");
        
        int i = 0;
        System.out.println("The size of array is : "+onprice.length);
        System.out.println("The array is : "+onprice);
        while(i<onprice.length && onprice[i]!=null)
        {
        System.out.println(onprice[i]);
        i++;
        }
        
        System.out.println("Search based on quantity");
        i = 0;
        while(i<onnum.length && onnum[i]!=null)
        {
        System.out.println(onnum[i]);
        i++;
        }
        
        System.out.println("Products below re-ordered level");
        onnum=s1.search();
        i = 0;
        while(i<onnum.length && onnum[i]!=null)
        {
        System.out.println(onnum[i]);
        i++;
        }
        
    }
}