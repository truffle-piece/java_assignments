package cycles;

import java.util.Random;

public class Program_6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int d, w, i, otkld, otklw, bol;
        for (i = 1; i <= 120; i++) {
            bol = rd.nextInt(1);
            otkld = rd.nextInt(4);
            otklw = rd.nextInt(5);
            d = 24;
            w = 74;
            if (bol == 1) {
                d += otkld;
                w += otklw;
                if (d <= 26 && w <= 77) {
                    System.out.println("Допуск! Шарик №" + i + ": Диаметр: " + d + "мм, Вес: " + w + "гр");
                }
                else{
                    System.out.println("БРАК! Шарик №" + i + ": Диаметр: " + d + "мм, Вес: " + w + "гр");
                }
            }else {
                d -= otkld;
                w -= otklw;
                if (d >= 22 && w >= 71 ) {
                    System.out.println("Допуск! Шарик №" + i + ": Диаметр: " + d + "мм, Вес: " + w + "гр");
                }else{
                    System.out.println("БРАК! Шарик №" + i + ": Диаметр: " + d + "мм, Вес: " + w + "гр");
                }
            }

            }

        }
    }

