public class SearchInString {
    public static void main(String[] args) {
        System.out.println(search("Bob", 'o'));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == target)
        // return true;
        // }

        // With for-each loop
        for (char ch : str.toCharArray())
            if (ch == target)
                return true;

        return false;
    }
}
