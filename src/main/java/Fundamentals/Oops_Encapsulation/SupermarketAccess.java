package Fundamentals.Oops_Encapsulation;

public class SupermarketAccess
{
    public static void main(String[] args)
    {
        Supermarket sm=new Supermarket();
        sm.setProductId(2002);
        sm.setProductName("Tooth Brush");
        sm.setProductCategory("Mouth Cleaner");
        sm.setProductPrice(25);
        System.out.println("Product Id:"+sm.getProductId()+"\n" +"Product Name:"+sm.getProductName()+"\n" +"Product Category:"+sm.getProductCategory()+"\n"+"Product Price:"+sm.getProductPrice());
    }
}


