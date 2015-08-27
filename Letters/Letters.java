// 3 similar letters to 3 different people, one redundant paragraph
// 8/27/15
// coded by Ktelyn Le and Lu Peng

public class Letters{
    public static void repeat(){
        System.out.println("Oh and by the way, I haven't seen you in a while, we should go out to eat togethersometime!");
        System.out.println("Sincerely, Cooper");
        // this part will show in all 3 letters
    }

    public static void aunt(){
        System.out.println ("Hi Auntie Beth! How have you been recently?");
        System.out.println ("I am doing great, thanks for the batch of cookies you sent me.");
        repeat();
    }
    
    public static void katelyn(){
        System.out.println ("Hi Katelyn! How are you? I heard you are coming back from Cambodia!");
        System.out.println ("I am doing great, thanks for the post cards you sent me.");
        repeat();
    }
    
    public static void lu(){
        System.out.println ("Hi Lu! How are you? How was your trip to Chicago?");
        System.out.println ("I am doing great, you should also try not to get into trouble.");
        repeat();
    }
    
    public static void main (String[] args){
        aunt();
        System.out.println ();
        katelyn();
        System.out.println ();
        lu();
    }
}
  