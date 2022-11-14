package Question4;

public class MergeSentence {

    // non static method
    void addSentences(String sentence_one, String sentence_two) {
        // returns void
        System.out.println(sentence_one + sentence_two);
    }

    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;

        // calling a static method
        sentence_one = "Apple is the";
        sentence_two = getSecondSentence();

        // using non-static method
        MergeSentence objectThisClass = new MergeSentence();
        objectThisClass.addSentences(sentence_one, sentence_two);
    }

    // This is a static method
    static String getSecondSentence() {
        return " most over rated.";
    }

}