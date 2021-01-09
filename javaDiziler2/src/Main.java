public class Main {
    public static void main(String[] args){
        double[] listelerim={1.1,2.2,3.2,4.4};
        double toplam=0;
        double enBüyük=listelerim[0];

        for(double numara:listelerim){
            if(enBüyük<numara){
                enBüyük=numara;
            }
            toplam= toplam+numara;
            System.out.println(numara);
        }
        System.out.println("Toplam = "+toplam);
        System.out.println("En Büyük Sayı = "+enBüyük);
    }
}
