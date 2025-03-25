public class WordSearch {
    public static void main(String[] args) {
        String[] sentences = {"hello my name is ishaan", "hello my name is siddhart", "hello my name is janinder", "hello my name is hitesh"};
        String targetWord = "Ishaan";

        String ans = getWord(sentences,targetWord);
        if(ans.equals("")){
            System.out.println("The target is not present is the search space");
        }
        else{
            System.out.println("In the sentence \"" + ans + "\" the word \"" + targetWord + "\" is present");
        }

//        In the sentence "hello my name is ishaan" the word "Ishaan" is present
    }

    public static String getWord(String[] sentences, String targetWord){
        int size = sentences.length;
        for(String i:sentences){
            String[] words = i.split(" ");
            for(String s:words){
                if(s.equalsIgnoreCase(targetWord)) return i;
            }
        }
        return "";
    }
}