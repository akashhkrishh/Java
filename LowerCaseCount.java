import java.util.Scanner;

public class LowerCaseCount {
    public static String caseCount(String words){
        int count = 0;
        for (int i = 0; i < words.length(); i++){
            if (Character.isLowerCase(words.charAt(i))){
                count++;
            }
        }
        return count==0?"No Lower Cases found":count+"";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        System.out.println(caseCount(words));
    }
}
