
package lieky;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//prejde stokrat,
// ak je premenna i delitelna 10 bezozvysku prejde kod ak nie ide do druheho

public class lieky {
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        List<String> lines = new ArrayList<>();
        lines.add("ID_podaneho lieku, ID_pacienta, mnozstvo, ID_lieku, ID_zam, ID_cas");
        int id = 160000;
        int uid;
        String line = null;
        for (int k = 0; k < 200; k++) {
            if(k%10 != 0){
                uid = ++id;
                int ID_liek = random.nextInt(600) +  1;
                int ID_pacient = random.nextInt(2501) +  1;
                int mnozstvo = random.nextInt(3) +  1;
                int ID_zamestnanec = random.nextInt(50) + 1;
                int ID_cas = random.nextInt(3652) + 1;
                if(ID_pacient<2502){
                    line =
                            uid + "," +
                                    ID_pacient + "," +
                                    mnozstvo + "," +
                                    ID_liek + "," +
                                    ID_zamestnanec + "," +
                                    ID_cas + ",";
                }else{
                    line=
                            "2502,nezname,nezname,nezname,nezname";

                }

                lines.add(line);
            }else{
                uid = ++id;
                int ID_liek = random.nextInt(600) + 1;
                int ID_pacient = random.nextInt(200) +  2400;
                int mnozstvo = random.nextInt(5) +  4;
                int ID_zamestnanec = random.nextInt(50) + 1;
                int ID_cas = random.nextInt(3652) + 1;
                if(ID_pacient>2502){
                    line=
                            uid + "," +
                                    ID_pacient + "," +
                                    mnozstvo + "," +
                                    ID_liek + "," +
                                    ID_zamestnanec + "," +
                                    ID_cas + ",";

                }
                else {
                    line=
                            uid + "," +
                                    ID_pacient + "," +
                                    mnozstvo + "," +
                                    ID_liek + "," +
                                    ID_zamestnanec + "," +
                                    ID_cas + ",";
                }
                lines.add(line);
            }
        }


        Path path = Paths.get("C:\\Users\\Lucia\\Desktop\\csv lieky.csv");
        Files.write(path, lines, StandardCharsets.UTF_8);



    }
}
