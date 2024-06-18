import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Pair implements Comparable<Pair>{
    String coupon;
    String date;
    Pair (String coupon, String date) {
        this.coupon = coupon;
        this.date = date;
    }
    @Override
    public int compareTo(Pair o) {
        return o.date.compareTo(this.date);
    }
}

public class Main {
    public static String findParent(Map<String, String> parent, String node, Map<String, String> couponList) {
        if(couponList.containsKey(node)) {
            return node;
        }
        if(parent.get(node).equals(node)) {
            return node;
        }

        String p = findParent(parent, parent.get(node), couponList);
        parent.put(p, node);
        return p;
    }

    public static String findParent2(String node, Map<String, String> childParentCategoryList, Map<String, String> couponList) {
        if(couponList.containsKey(node)) {
            return couponList.get(node);
        }

        if(!childParentCategoryList.containsKey(node)) {
            return null;
        }

        return findParent2(childParentCategoryList.get(node), childParentCategoryList, couponList);
    }

    public static void main(String[] args) {
        //Map<String, String> couponList = new HashMap<>();
        Map<String, PriorityQueue<Pair>> couponList = new HashMap<>();

//        couponList.put("Comforter Sets", "Comforters Sale");
//        couponList.put("Bedding", "Savings on Bedding");
//        couponList.put("Bed & Bath", "Low price for Bed & Bath");

        couponList.put("Comforter Sets", new PriorityQueue<>((a, b) -> b.date.compareTo(a.date)));
        couponList.put("Bedding", new PriorityQueue<>((a, b) -> b.date.compareTo(a.date)));
        couponList.put("Bed & Bath", new PriorityQueue<>((a, b) -> b.date.compareTo(a.date)));

        couponList.get("Comforter Sets").add(new Pair("Comforters Sale", "2020-01-01"));
        couponList.get("Comforter Sets").add(new Pair("Cozy Comforter Coupon", "2020-01-02"));

        couponList.get("Bed & Bath").add(new Pair("Best Bedding Bargins", "2019-01-01"));
        couponList.get("Bed & Bath").add(new Pair("Savings on Bedding", "2019-01-02"));

        Map<String, String> childParentCategoryList = new HashMap<>();

        childParentCategoryList.put("Comforter Sets", "Bedding");
        childParentCategoryList.put("Bedding", "Bed & Bath");
        childParentCategoryList.put("Bed & Bath", null);
        childParentCategoryList.put("Soap Dispensers", "Bathroom Accessories");
        childParentCategoryList.put("Bathroom Accessories", "Bed & Bath");
        childParentCategoryList.put("Toy Organizers", "Baby and Kids");
        childParentCategoryList.put("Baby and Kids", null);

        Map<String, String> parent = new HashMap<>();

        for(Map.Entry<String, String> category : childParentCategoryList.entrySet()) {
            //child
            String u = category.getKey();
            //parent
            String v = category.getValue();

            if(u!=null &&!parent.containsKey(u)) {
                parent.put(u, u);
            }
            if(v!=null && !parent.containsKey(v)) {
                parent.put(v, v);
            }
        }

        for(Map.Entry<String, String> category : childParentCategoryList.entrySet()) {
            //child
            String u = category.getKey();
            //parent
            String v = category.getValue();

            if(v==null) {
                continue;
            }

            String pU = findParent(parent, u, couponList);
            String pV = findParent(parent, v, couponList);

            if(!pU.equals(pV)) {
                parent.put(pU,pV);
            }
        }

//        String c1 = couponList.containsKey("Comforter Sets") ? couponList.get("Comforter Sets") : couponList.get(findParent(parent, "Comforter Sets", couponList));
//        String c2 = couponList.containsKey("Bedding") ? couponList.get("Bedding") :couponList.get(findParent(parent, "Bedding", couponList));
//        String c3 = couponList.containsKey("Bathroom Accessories") ? couponList.get("Bathroom Accessories") :couponList.get(findParent(parent, "Bathroom Accessories", couponList));
//        String c4 = couponList.containsKey("Soap Dispensers") ? couponList.get("Soap Dispensers") :couponList.get(findParent(parent, "Soap Dispensers", couponList));
//        String c5 = couponList.containsKey("Toy Organizers") ? couponList.get("Toy Organizers") :couponList.get(findParent(parent, "Toy Organizers", couponList));

//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//        System.out.println(c5);

        System.out.println(findParent2("Soap Dispensers", childParentCategoryList, couponList));
        System.out.println(findParent2("Toy Organizers", childParentCategoryList, couponList));
    }
}