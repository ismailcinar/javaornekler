public class Main {
    public static void main(String[] args) {
        String mesaj = "Aşkınla çoşkunla sen çok yaşa.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı :" + mesaj.length());
        System.out.println("11. eleman :" + mesaj.charAt(11));
        System.out.println(mesaj.concat(" Fener"));
        System.out.println(mesaj.startsWith("N"));
        System.out.println(mesaj.endsWith("."));
        char[]karakterler = new char[7];
        mesaj.getChars(0,7,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('ş'));
        System.out.println(mesaj.lastIndexOf('ş'));

    String yeniMesaj=mesaj.replace(' ','-');
    System.out.println(yeniMesaj);
    System.out.println(mesaj.substring(4,7));
    System.out.println("---------------");
    for(String kelime: mesaj.split(" ")){
        System.out.println(kelime);
    }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

    }
}
