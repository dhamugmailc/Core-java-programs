package Stringprograms;

public class xx {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("abcdefghij");
        int size = 3;
        char fillChar = 'x';
        while (str1.length() % size != 0) {
            str1.append(fillChar);
        }
        int numGroups = str1.length() / size;

        String[] groups = new String[numGroups];
        for (int i = 0; i < numGroups; i++) {
            int startIndex = i * size;
            int endIndex = startIndex + size;
            groups[i] = str1.substring(startIndex, endIndex);
        }
        for (String group : groups) {
            System.out.println(group);
        }
    }
}
