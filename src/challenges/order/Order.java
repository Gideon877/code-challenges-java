package challenges.order;

public class Order {

    public static String order(String s) {
        String[] orderParts = s.split(" ");
        StringBuilder ordered = new StringBuilder();
        if(s.isEmpty()) {
            return "";
        }
        for (int i=1; i<= orderParts.length; i++) {
            String index = Integer.toString(i);
            for (String word : orderParts) {
                if(word.contains(index)) {
                    ordered.append(word);
                    if(i != orderParts.length) {
                        ordered.append(" ");
                    }
                }
            }
        }
        return ordered.toString();
    }
}
