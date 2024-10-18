package Practice;

public class UniqueTravelRoute {

   /* Ban Del

    Ban Kol

    Kol Che

    Che Hyd

    Ker Goa

    Goa Mum

    Enter start city : Ker

     KerBanDelKolCheHydGoa
    */


    public static void main(String []args)
    {
        String[] routes = new String[]{ "Ban Del","Ban Kol","Kol Che","Che Hyd","Ker Goa","Goa Mum"};

        String startCity = "Ker";

        String result = startCity;

        for(int i =0;i<6;i++)
        {
            String route =  routes[i];


           if(!result.contains(route.substring(0,3)))
            {
                result = result+route.substring(0,3);
            }
           if(!result.contains(route.substring(4,7)))
            {
                result = result+route.substring(4,7);
            }
        }


        System.out.println(result);




    }
}
