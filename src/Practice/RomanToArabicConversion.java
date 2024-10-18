package Practice;

public class RomanToArabicConversion {
    public static void main(String[] args) {


        System.out.println(convertArabicToRoman(3756));
    }

      /*1=I
       5 = V
       4 = IV
       9 = IX
       10= X
       50 = L
       100 = C
       500 = D
       1000 =M*/
//3756
    public static String convertArabicToRoman(int number)
    {
       /* HashMap<String,Integer> conversionMap = new HashMap<>();
        conversionMap.put("I",1);
        conversionMap.put("IV",4);
        conversionMap.put("V",5);
        conversionMap.put("IX",9);
        conversionMap.put("X",10);
        conversionMap.put("XL",40);
        conversionMap.put("L",50);
        conversionMap.put("XC",90);
        conversionMap.put("C",100);
        conversionMap.put("CD",400);
        conversionMap.put("D",500);
        conversionMap.put("CM",900);
        conversionMap.put("M",1000);*/

        String[] romanArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int[] arabicArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arabicArray.length;i++)
        {
            if(number/arabicArray[i]>0&&number>0)
            {
                sb.append(romanArray[i]);
             number = number%arabicArray[i];
            }
        }


        return sb.toString();
    }
}
