public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] < 91) {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        String lowercase = String.valueOf(charArray);

        return lowercase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str1.length() < str2.length()) {    return false;   }
        if (str2.length() == 0) {   return true;    }
        if (str1.length() == 0) {   return false;   }
        
        // runs until the remaining string is not long enough to contain str2
        for (int i = 0; i < str1.length() - str2.length() + 1; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                String subStr = str1.substring(i, i + str2.length());
                if (subStr.equals(str2)) {  return true;    }
            }
        }

        return false;
    }
}
