
public class BinarySearch
{
     public static Product search(Product[] products, int tid)
     {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = products[mid].getProductId();

            if (midId == tid) {
                return products[mid];
            } else if (midId < tid) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }

        return null; 
    }
}
