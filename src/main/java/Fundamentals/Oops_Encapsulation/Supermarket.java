package Fundamentals.Oops_Encapsulation;

public class Supermarket
    {
        private int productId;
        private String productName;
        private String productCategory;
        private int productPrice;
        public int getProductId()
        {
            return productId;
        }
        public void setProductId(int productId)
        {
            this.productId=productId;
        }
        public String getProductName()
        {
            return productName;
        }
        public void setProductName(String productName)
        {
            this.productName=productName;
        }
        public String getProductCategory()
        {
            return productCategory;
        }
        public void setProductCategory(String productCategory)
        {
            this.productCategory=productCategory;
        }
        public int getProductPrice()
        {
            return productPrice;
        }
        public void setProductPrice(int productPrice)
        {
            this.productPrice=productPrice;
        }
    }

