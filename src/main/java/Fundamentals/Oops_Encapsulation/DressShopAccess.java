package Fundamentals.Oops_Encapsulation;

public class DressShopAccess
{
        public static void main(String[] args)
        {
            DressShop ds=new DressShop();
            ds.setDressId(2003);
            ds.setDressName("Salwar");
            ds.setDressCategory("Stitched");
            ds.setDressSection("Female");
            ds.setDressPrice(1500);
            System.out.println("Dress Id:"+ds.getDressId()+"\n"+"Dress Name:"+ds.getDressName()+"\n"+"Dress Category:"+ds.getDressCategory()+"\n"+"Dress Section:"+ds.getDressSection()+"\n"+"Dress Price:"+ds.getDressPrice());
        }
}

