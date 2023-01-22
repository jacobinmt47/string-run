import java.util.List;
import java.util.ArrayList;
public class Main {
    /**
     * create a String from a list of Characters
     * @param ul list of Characters
     * @return Chars combined to a Strings
     */
    public String FromList(List<Character> ul){
        String s2 = new String();
        for (Character c2:ul
        ) {
            s2 = s2.concat(c2.toString());
        }
        return s2;
    }
    public String longest(String s){
        //find longest unique string
        List<String> sl = new ArrayList<>();
        List<Character> ul = new ArrayList<>();
        int slen = s.length();
        for (int i = 0; i < slen; i++) {
            Character c = s.charAt(i);
            //System.out.println(c);
            if (!ul.contains(c)) {
                ul.add(c);
            }
            else{
                //System.out.println(this.FromList(ul));
                sl.add((this.FromList(ul)));
                ul = new ArrayList<>(); // start over
                ul.add(c);
            }
        }
        sl.add(this.FromList(ul));
        int count = 0;
        int len = 0;
        for (int i = 0; i < sl.size(); i++) {
            String s3 = sl.get(i);
            if(s3.length()>len){
                count = i;
                len = s3.length();
            }
        }
        //System.out.println(count);
        return sl.get(count);
    }
    public static void main(String[] args) {
        Main m = new Main();
        String s = m.longest("abcabcabcd");
        System.out.println(s);

    }
}