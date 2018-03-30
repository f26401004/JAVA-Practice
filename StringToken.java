import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String in = "Hello,World,Java";
        StringTokenizer st = new StringTokenizer(in, ",");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
