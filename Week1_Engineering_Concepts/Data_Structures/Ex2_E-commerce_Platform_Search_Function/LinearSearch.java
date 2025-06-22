
public class LinearSearch
{
    public static Product search(Product[] products, int tid)
    {
        for (Product product : products) {
            if (product.getProductId() == tid) {
                return product;
            }
        }
        return null; 
    }
}
