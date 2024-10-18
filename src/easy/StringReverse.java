package easy;

public class StringReverse {
    public static void main(String[] args) {
        //r ee n ignEeraw tfoSamaI
        String string = "I am a Software Engineer";
        String wring  = "r ee n ignEeraw tfoSamaI";
        String rring =  "r ee n ignEera wtfoSa";
        int i=0;
        int j=string.length()-1;
        int blank = 0;
        while(j>=0)
        {
            if(string.charAt(i)==' ')
            {
                System.out.print(' ');
                blank++;
            }
            else {
                if(string.charAt(j) == ' ') {
                    j--;
                    i--;
                } else {
                    System.out.print(string.charAt(j));
                    j--;
                }
            }
            i++;
        }
    }


}
