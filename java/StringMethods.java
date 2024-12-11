public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Chetan";
        String str2 = "Singh";
        String str3 = "CSE";
        String str4 = "   Chetan Singh Chouhan   ";
        String regexStr = "CSE2024";
        
        // 1. length()
        System.out.println("Length of str1: " + str1.length());
        
        // 2. charAt()
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        
        // 3. substring()
        System.out.println("Substring of str2 from index 2: " + str2.substring(2));
        System.out.println("Substring of str2 from 2 to 5: " + str2.substring(2, 5));
        
        // 4. concat()
        System.out.println("Concatenated String: " + str1.concat(" ").concat(str2));
        
        // 5. indexOf() and lastIndexOf()
        System.out.println("Index of 'e' in str1: " + str1.indexOf('e'));
        System.out.println("Last Index of 'i' in str2: " + str2.lastIndexOf('i'));
        
        // 6. equals() and equalsIgnoreCase()
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase 'CHETAN': " + str1.equalsIgnoreCase("CHETAN"));
        
        // 7. compareTo()
        System.out.println("Comparison of str1 and str2: " + str1.compareTo(str2));
        
        // 8. toUpperCase() and toLowerCase()
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());
        
        // 9. trim()
        System.out.println("Trimmed str4: " + str4.trim());
        
        // 10. replace() and replaceAll()
        System.out.println("Replace 'e' with 'o' in str1: " + str1.replace('e', 'o'));
        System.out.println("ReplaceAll digits in regexStr: " + regexStr.replaceAll("\\d", "#"));
        
        // 11. split()
        String[] parts = "Chetan,Singh,CSE".split(",");
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }
        
        // 12. startsWith() and endsWith()
        System.out.println("str2 starts with 'Sin': " + str2.startsWith("Sin"));
        System.out.println("str2 ends with 'gh': " + str2.endsWith("gh"));
        
        // 13. contains()
        System.out.println("str2 contains 'ing': " + str2.contains("ing"));
        
        // 14. isEmpty()
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
        
        // 15. toCharArray()
        char[] charArray = str1.toCharArray();
        System.out.println("Characters in str1:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        // 16. format()
        String formattedStr = String.format("Name: %s, Dept: %s", str1, str3);
        System.out.println("Formatted String: " + formattedStr);
        
        // 17. valueOf()
        int num = 2024;
        System.out.println("String value of num: " + String.valueOf(num));
        
        // 18. intern()
        String internedStr = str1.intern();
        System.out.println("Interned String: " + internedStr);
        
        // 19. matches()
        System.out.println("regexStr matches regex 'CSE\\d{4}': " + regexStr.matches("CSE\\d{4}"));
    }
}
