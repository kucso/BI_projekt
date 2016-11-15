
package Operacie;

import java.io.IOException;
import static java.lang.Math.random;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class operacie {
    public static void main(String[] args) throws Exception {

        int id2 = 170000;
        Random random = new Random();

        List<String> lines = new ArrayList<>();
        lines.add("ID_operacie, ID_typOperacie, ID_zam, ID_cas, dlzka, komplikacia, ID_pacient, Sala");
        for (int k = 1; k < 11; k++) {
            int uid2 = ++id2;
            int ID_typOperacie = random.nextInt(20) + 1;
            int ID_zamestnanec1 = random.nextInt(3) + 50;
            int ID_cas = random.nextInt(3651) + 1;
            int dlzkaOperacie = (int)(Math.random() * 400 + 30);
            boolean komplikacie = random.nextBoolean();
            int ID_pacient = random.nextInt(2501) + 1;
            int sala = random.nextInt(10)+ 1;
            String line =
                    uid2+ "," +
                            ID_typOperacie + "," +
                            ID_zamestnanec1 + "," +
                            ID_cas + "," +
                            dlzkaOperacie + "," +
                            komplikacie + ","+
                            ID_pacient + "," +
                            sala  + ",";

            lines.add(line);
        }
        for (int k = 10; k < 20; k++) {
            int uid2 = ++id2;
            int ID_typOperacie = random.nextInt(20) + 1;
            int ID_zamestnanec = random.nextInt(50) + 1;
            int ID_cas = random.nextInt(3651) + 1;
            int dlzkaOperacie = (int)(Math.random() * 400 + 30);
            boolean komplikacie = random.nextBoolean();
            int ID_pacient = random.nextInt(2501) +  1;
            int sala = random.nextInt(10)+ 1;
            String line =
                    uid2+ "," +
                            ID_typOperacie + "," +
                            ID_zamestnanec + "," +
                            ID_cas + "," +
                            dlzkaOperacie + "," +
                            komplikacie + ","+
                            ID_pacient + "," +
                            sala  + ",";
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

        Path path = Paths.get("C:\\Users\\Lucia\\Desktop\\csv operacie.csv");
        Files.write(path, lines, StandardCharsets.UTF_8);
    }
}

