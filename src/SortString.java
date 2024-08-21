import java.util.Arrays;

public class SortString {
public String sort(String str){
    char[] tmp = str.toCharArray();
    Arrays.sort(tmp);
//    return Arrays.toString(tmp);
    return  new String(tmp);
}
}
