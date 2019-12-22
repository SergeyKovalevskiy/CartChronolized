package hi;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.runners.*;
import org.junit.runner.*;

@RunWith(Parameterized.class)
public class CalculateDiscountTest
{
    private static final int[] Q_VALUES = {1, 9, 10, 19};
    private static final ShoppingCart.Type[] T_VALUES =
            {
                    ShoppingCart.Type.SECOND_FREE,
                    ShoppingCart.Type.REGULAR,
                    ShoppingCart.Type.SALE,
                    ShoppingCart.Type.NEW
            };
    private static final int[][] D_VALUES =
            {
                    { 0, 0, 0, 0},
                    { 0 },
                    { 70 },
                    { 0, 0, 0, 0}
            };
    @Parameterized.Parameters
    @SuppressWarnings("unchecked")
    public static Collection getTypeQuantityPairs()
    {
        Collection pairs = new ArrayList();
        for (int q = 0; q < Q_VALUES.length; q++)
            for (int t = 0; t < T_VALUES.length; t++)
                pairs.add(new Object[] {
                        T_VALUES[t],
                        Q_VALUES[q],
                        (D_VALUES[t].length > q)
                                ? D_VALUES[t][q]
                                : D_VALUES[t][D_VALUES[t].length - 1]
                });
        return pairs;
    }
    private ShoppingCart.Type _type;
    private int _quantity;
    private int _discount;
    public CalculateDiscountTest(ShoppingCart.Type type, int quantity, int discount){
        _type = type;
        _quantity = quantity;
        _discount = discount;
    }
    @Test
    public void discountTest(){
        assertEquals("type: "+ _type + ", quantity: " + _quantity,
                _discount,
                ShoppingCart.calculateDiscount( _type,1)
        );
    }
}
