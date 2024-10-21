public class Task11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS=175;
        final int CHAR_PER_LINE=25;

        for(int i=0;i<NUMBER_OF_CHARS;i++){
            char ch=RandomCharacter.getRandomLowerCaseLetter();
            if((i+1)%CHAR_PER_LINE==0){
                System.out.print(ch);
            }
            else
            System.out.println(ch);
        }
    }
}