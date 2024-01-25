public class Main {
    public static void main(String[] args) {
        System.out.println(pigIt("latin is cool!"));
    }

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                if (words[i].contains("!")) {
                    words[i] = words[i].replace("!", "");
                } else if (words[i].contains("?")) {
                    words[i] = words[i].replace("?", ""); 
                }

                if (words[i].length() > 0) {
                    words[i] = words[i].substring(1).concat(String.valueOf(words[i].charAt(0)));
                    words[i] = i == words.length - 1 ? words[i].concat("ay") : words[i].concat("ay ");
                    result.append(words[i]);
                }
            }
        }

        if (str.contains("!")) {
            result.append(str.charAt(str.length() - 1));
        } else if (str.contains("?")) {
            result.append(str.charAt(str.length() - 1));
        }

        return result.toString();
    }
}
