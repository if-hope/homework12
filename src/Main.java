public class Main {
    public static void main(String[] args) {

        // Task 1
        CardRank card = CardRank.TWO;
        System.out.println("\nTASK 1: The value of TWO from CardRank is  " + card.getValue() + "\n");
        System.out.println("The values of CardRank are: \n");

        for (CardRank cards : CardRank.values()){
            System.out.println(cards);
        }

        // Task 2.1
        String sentence = "I would like to have a dog";
        int amount = 0;

        String sentenceLoverCase = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++){
            if ((sentenceLoverCase.charAt(i) == 'a') || (sentenceLoverCase.charAt(i) == 'e') ||
                    (sentenceLoverCase.charAt(i) == 'i') || (sentenceLoverCase.charAt(i) == 'o') ||
                    (sentenceLoverCase.charAt(i) == 'u')){
                amount++;
            }
        }
        System.out.printf("%nTASK 2.1: The amount of vowels is %d %n", amount);

        // Task 2.2
        String [] array = sentence.split(" ");
        System.out.println("\nTASK 2.2: The array of words looks like that: \n");
        for (String element : array){
            System.out.println(element);
        }

        //Task 2.3
        System.out.println("\nTASK 2.3: First three symbols are: \"" + sentence.substring(0,3) + "\"");

        //Task 2.4
        System.out.println("\nTASK 2.4: The sentance after replaicment looks like that: \"" + sentence.replaceAll("dog", "cat") + "\"");

        //Task 3
        String emptySentence = "";
        StringBuilder stringBuilder = new StringBuilder(emptySentence);
        for (String element : array){
            stringBuilder.append(element);
            stringBuilder.append(" ");
        }
        System.out.println("\nTASK 3: The sentence after StringBuilder looks like that: \"" + stringBuilder.toString().toUpperCase() + "\"");
    }
}