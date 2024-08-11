public class Main {

    public static void main(String[] args) {
        String s = "Hello World";
        String result = Answer.moveCapitalLettersToFront(s);
        System.out.println(s + "==>" + result);
    }
}

class Answer {

    static String moveCapitalLettersToFront(String s) {
        // Your code goes here.
        StringBuffer result = new StringBuffer();
        int capitalIndex = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.insert(Math.min(capitalIndex++, s.length()), ch); //increase capitalIndex value by 1 after invoke
            }else{
                result.append(ch);
            }

        }
        return result.toString();
    }

}
