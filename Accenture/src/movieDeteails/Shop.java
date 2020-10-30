package movieDeteails;

public class Shop{
    private String[] productName=new String[Main.n];
    private int[] productQuantity=new int[Main.n];
    private float[] productPrice=new float[Main.n];
    
    public Shop(String[] s,int[] i, float[] f)
    {
        productName=s;
        productQuantity=i;
        productPrice=f;
    }
    
    public String[] search()
    {
        String[] s=new String[Main.n];
        int j = 0;
        for(int i=0;i<Main.n;i++)
        {
            
            if(productQuantity[i]<=10)
            {
                s[j]=productName[i];
                j++;
            }
        }
        return s;
    }
    
    public String[] search(int num)
    {
        String[] s=new String[Main.n];
        int j = 0;
        for(int i=0;i<Main.n;i++)
        {
            int c=productQuantity[i];
            if(num==c)
            {
                s[j]=productName[i]+":"+String.valueOf(productPrice[i]);
                j++;
            }
        }
        return s;
    }
    
    public String[] search(float cost)
    {
        String[] s=new String[Main.n];
        int j = 0;
        for(int i=0;i<Main.n;i++)
        {
            float c=productPrice[i];
            if(cost==c)
            {
                s[j]=productName[i]+":"+String.valueOf(productQuantity[i]);
                j++;
            }
        }
        return s;
    }
    
    
}