public class KarpRabinAlgo {

     private final int PRIME = 101;

    private double calculatehash(String str){
        double hash = 0;
        for(int i=0; i<str.length(); i++){
            hash = hash + str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength){
        double newHash = (prevHash - oldChar)/PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength-1);
        return newHash;
    }

    public void search(String text, String pattern){
        int patternLength = pattern.length();
        double patternHash = calculatehash(pattern);
        double textHash = calculatehash(text.substring(0, patternLength));

        for(int i=0; i<=text.length()-patternLength; i++){
            if(textHash == patternHash){
                if(text.substring(i, i+patternLength).equals(pattern)){
                    System.out.println("pattern found at index: " + i);
                }
            }
            if(i<text.length()-patternLength){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength),patternLength);
            }
        }
    }

}

