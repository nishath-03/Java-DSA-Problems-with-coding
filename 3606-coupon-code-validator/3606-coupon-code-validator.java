class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> e = new ArrayList<>();
        List<String> g = new ArrayList<>();
        List<String> p = new ArrayList<>();
        List<String> r = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) {
                continue;
            }

            if (code[i].length() == 0 ||
                !code[i].matches("[a-zA-Z0-9_]+")) {
                continue;
            }

            if (businessLine[i].equals("electronics")) {
                e.add(code[i]);

            } else if (businessLine[i].equals("grocery")) {
                g.add(code[i]);

            } else if (businessLine[i].equals("pharmacy")) {
                p.add(code[i]);

            } else if (businessLine[i].equals("restaurant")) {
                r.add(code[i]);
            }
        }

        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);

        List<String> res = new ArrayList<>();

        res.addAll(e);
        res.addAll(g);
        res.addAll(p);
        res.addAll(r);

        return res;
    }
}