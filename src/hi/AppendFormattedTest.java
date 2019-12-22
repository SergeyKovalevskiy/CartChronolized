package hi;
import org.junit.Test;
import static hi.ShoppingCart.appendFormatted;
import static org.junit.Assert.assertEquals;

public class AppendFormattedTest {

    @Test
    public void trim(){
        StringBuilder sb=new StringBuilder("a");
        String extra = " a ";
        appendFormatted(sb,extra,-1,1);
        assertEquals("a  ", sb.toString());
        appendFormatted(sb,extra,-1,1);
        assertEquals("a    ", sb.toString());
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
