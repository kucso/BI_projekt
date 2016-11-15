
package Vyplaty;

import java.io.IOException;
import static java.lang.Math.random;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class vyplaty{
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        int id3 = 180000;
        List<String> lines = new ArrayList<>();
        lines.add("ID_vyplata, ID_zam, suma, benefity, nadcasy, dovolenka");
        for (int k = 1; k < 11; k++) {
            int uid3 = ++id3;
            int vyplata = random.nextInt(800) + 800;
            int nadcasy = random.nextInt(5)+ 1;
            int dovolenka = random.nextInt(15)+ 1;
            int ID_zamestnanec = random.nextInt(50) + 1;
            boolean benefity = random.nextBoolean();

            String line =
                    uid3 + "," +
                            ID_zamestnanec + "," +
                            vyplata + "," +
                            benefity + "," +
                            nadcasy + "," +
                            dovolenka + " dni,";

			/* Krajsia alternativa:
			String line = String.format(
				"16%s,%s,%s,%s,%s,%s,%s,%s eur",
				output,
				nazovLieku[random.nextInt(nazovLieku.length)],
				lieky[random.nextInt(lieky.length)],
				vyrobca[random.nextInt(vyrobca.length)],
				gramaz[random.nextInt(gramaz.length)],
				davkovanie[random.nextInt(davkovanie.length)],
				naPredpis[random.nextInt(naPredpis.length)],
				cena
			);
			*/

            lines.add(line);
        }

        Path path = Paths.get("C:\\Users\\Lucia\\Desktop\\csv vyplaty.csv");
        Files.write(path, lines, StandardCharsets.UTF_8);
    }
}
