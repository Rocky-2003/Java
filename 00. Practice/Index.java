import java.util.ArrayList;

class Index {
    public static void main(String[] args) {

        String s = "y2b2";

        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Character> it = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();
        ArrayList<Character> last = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ch.add(c);
            } else {

                it.add(c);
            }
        }

        for (int i = 0; i < ch.size(); i++) {
            int c = (int) ch.get(i);
            int c1 = (int) it.get(i);
            int cc = c + c1;
            total.add(cc);
        }

        for (Integer val : total) {
            int i = val;
            System.out.println(i);
            char c = (char) i;
            System.out.println(c);
            last.add(c);

        }
    
        System.out.println(last);

    }

}