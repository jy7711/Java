package IO.ByteStream.ByteStreamTest1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    static void main() {
        //编码
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //解码
        String str2 = new String(bytes1);
        System.out.println(str2);
    }
}
