package edu.wctc.beans;

import edu.wctc.interfaces.ISalesInput;
import edu.wctc.objects.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FileSalesInput implements ISalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try{
            FileReader fr = new FileReader("sales.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while(line != null){
                String[] saleParse = line.split(",");

                Sale sale = new Sale(saleParse[0], saleParse[1], Double.parseDouble(saleParse[2]), Double.parseDouble(saleParse[3]));
                sales.add(sale);

                line = reader.readLine();
            }

        } catch (IOException ex){
            System.out.println("Error reading from file:\n" + ex.getMessage());
            return null;
        }

        return sales;
    }
}
