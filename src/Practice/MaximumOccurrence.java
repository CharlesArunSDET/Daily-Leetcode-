package Practice;

public class MaximumOccurrence {

        public static void main(String[] args)
        {
            System.out.println(findNumberOfOccurrence("ababsdfkjabababababsdbcab","ab"));
        }

    /*String s =“ababsdfkjabababababsdbcab" target = “ab” output = 8*/

        public static int findNumberOfOccurrence(String parent,String child)
        {
            if(child.length()>parent.length())
            {
                return -1;
            }

            int counter =0,max= 0;
            for(int i=0;i<=parent.length()-child.length();i++)
            {
                if(parent.subSequence(i,i+child.length()).equals(child))
                {
                    counter++;
                    ++i;
                }
                else
                {
                    if(max<counter) {
                        max = counter;
                    }
                        counter = 0;

                }

            }

            return max;

        }
}
