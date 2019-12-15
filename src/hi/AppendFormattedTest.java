package hi;
import org.junit.Test;
import static hi.ShoppingCart.appendFormatted;
import static org.junit.Assert.assertEquals;

public class AppendFormattedTest {
    /**
     * Appends to sb formatted value.
     * Trims string if its length > width.
     * align -1 for align left, 0 for center and +1 for align right.
     */
    @Test
    public void trim(){
        StringBuilder sb=new StringBuilder("a");
        String extra = "a";
        appendFormatted(sb,extra,-1,1);
        assertEquals("aa ", sb.toString());
        appendFormatted(sb,extra,-1,1);
        assertEquals("aa a ", sb.toString());
    }

    @Test
    public void align(){
        StringBuilder sb=new StringBuilder("");
        String extra = "a";
        //left
        appendFormatted(sb,extra,-1,2);
        assertEquals("a  ", sb.toString());
        //middle
        sb=new StringBuilder("");
        appendFormatted(sb,extra,0,3);
        assertEquals(" a  ", sb.toString());
        //right
        sb=new StringBuilder("");
        appendFormatted(sb,extra,1,2);
        assertEquals(" a ", sb.toString());
    }


}
