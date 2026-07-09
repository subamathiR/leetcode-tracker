// Last updated: 7/9/2026, 9:51:25 AM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> dirSet = new HashSet<>();
        List<String> res = new ArrayList<>();

        for (String dir : folder)
            dirSet.add(dir);

        for (String dir : folder) {
            res.add(dir);
            for (int i = 0; i < dir.length(); i++) {
                if (dir.charAt(i) == '/' && dirSet.contains(dir.substring(0, i))) {
                    res.remove(res.size() - 1);
                    break;
                }
            }
        }

        return res;
    }
}