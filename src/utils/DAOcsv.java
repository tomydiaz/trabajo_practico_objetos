package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class DAOcsv {

    public static void save (ArrayList list) throws Exception {
        File file = new File("src/txtData/pacientes.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("");
        bw.newLine();
        for(int i=0;i< list.size();i++)
        {
            bw.write(list.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

}
