import java.util.Random;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Lab2_3 {
    public static void main(String args[]) {
  // First create a array of 1000 element of random values
    if (args.length < 1) {
            System.out.println("No agruments enter");
            return;
     }else{
     int num=countWordInSentenceSplit(args[0],args[1]);
      System.out.println(num);
     num=countWordInSentenceIndexOf(args[0],args[1]);
      System.out.println(num);
      num=countWordInSentenceTokenizer(args[0],args[1]);
      System.out.println(num);
     num=countWordInSentenceRegex(args[0],args[1]);
     System.out.println(num);
     }
     

  }

    public static int countWordInSentenceSplit(String sentence, String word) {
        String[] words = sentence.split(word); 
        return words.length;
    }
  
   public static int countWordInSentenceIndexOf(String sentence, String word) {
       int count = 0;
       int index = sentence.indexOf(word);
       while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + 1);
        }

        return count;
    }
   public static int countWordInSentenceTokenizer(String sentence, String word) {
        int count= 0;
        StringTokenizer test=new StringTokenizer(sentence);
        
        while (test.hasMoreTokens()) {
            String wordInSe=test.nextToken();
            if(wordInSe.equalsIgnoreCase(word)){
            	count++;
            }
        }

        return count;
    }
   public static int countWordInSentenceRegex(String sentence, String word) {
        int count= 0;
    
        String regex = "\\b" + word + "\\b";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            count++;
        }

        return count;
    }
    
}
