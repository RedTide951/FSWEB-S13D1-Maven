package org.example;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        boolean result = false;
        if (isBarking) {
            if ((clock >= 20 && clock < 24) || (clock >= 0 && clock < 8)) {
                result = true;
            }
        }
        return result;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        boolean result = false;

        if (firstAge <= 19 && firstAge >= 13) {
            result = true;
        } else if (secondAge <= 19 && secondAge >= 13) {
            result = true;
        } else if (thirdAge <= 19 && thirdAge >= 13) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        //Oyun oynamayı çok seven bir kedimiz var. Kedimizin oyun oynadığı zamanları tespit etmek için bir metod yazacağız.
        //Kedimiz sıcaklık 25 ile 35 arasındaysa oyun oynuyor olucak. Eğer mevsim yaz değilse. Mevsim yaz ise üst limit 35 yerine 45 olmalı.
        //isCatPlaying isimli 2 tane parametre alan bir metod yazmak istiyoruz. Eğer kedi oyun oynuyorsa metodumuz true değer dönecek. Oyun oynamıyorsa false değer dönecek.
        //İlk parametre boolean değer tutmalı ve mevsimin yaz olup olmadığını kontrol etmeli
        //İkinci parametre int olamlı ve sıcaklık değerini tutmalı.
        //isCatPlaying(true, 10); => false dönmeli(sıcaklık 25-45 arasında olmalıydı)
        //
        //isCatPlaying(false, 36); => false dönmeli(sıcaklık 25-35 arasında olmalıydı)
        //
        //isCatPlaying(false, 35); => true dönmeli(sıcaklık 25-35 arasında.)

        int maxTemp = 35;
        boolean result = false;

        if (isSummer) {
            maxTemp = 45;
        }

        if (temp >= 25 && temp <= maxTemp) {
            result = true;
        }

        return result;
     
    }

    public static double area(double width, double height) {

        // Dikdörtgenin alanını hesaplamak için bir metod yazınız. Metodun ismi area olmalı.
        //İki tane double parametre almalı ve bu parametreleri kullanıcıdan almalı.
        //Eğer parametrelerden herhangi biri negatif değer alırsa, alan negatif olamayacağından metod -1 değer dönerek yanlış bir işlem yapıldığını belirtmeli.
        //Metod iki değeri birbiriyle çarpmalı ve değeri return etmeli.
        //area(5.0, 4.0); => 20.0 değerini dönmeli.
        //
        //area(-1.0, 4.0); => -1 değerini dönmeli.
        //
        //Bir tane daha area isimli bir metod tanımla. Amacımız dairenin alanını hesaplamak.
        //bu sefer tek bir double parametresi almalı. İsmi radius olabilir. Bu parametrede kullanıcıdan alınmalı.
        //parametre negatif bir dğer alırsa metod yine -1 dönmeli.
        //Diğer şartlarda metod radius*radius*Math.PI değerini dönmeli
        //Math.PI kullandığında math kütüphanesini import etmen gerekicek.
        //Intellij kendisi otomatik import yapmazsa nasıl yapabileceğini araştır. Otomatik yaparsa Java'da başka kütüphaneleri nasıl import edebileceğimizi görmüş olucaksın.
        //area(5.0); => 78.53975 değerini dönmeli
        //
        //area(-1); => -1 değerini dönmeli.

        double result = 1;

        result = width * height;

        if (width < 0|| height < 0) {
            result = -1;
        }

        return result;
       
    }

    public static double area(double radius) {

        double result = 1;

        result = radius*radius*Math.PI;

        if (radius < 0) {
            result = -1;
        }

        return result;
    }
}
