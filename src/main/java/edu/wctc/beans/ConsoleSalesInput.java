package edu.wctc.beans;

import edu.wctc.interfaces.ISalesInput;
import edu.wctc.objects.Sale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleSalesInput implements ISalesInput {
   private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Sale> getSales() {
        boolean moreSales = true;
        List<Sale> sales = new ArrayList<Sale>();

        do{
            System.out.println("Please add a new sale: ");
            String[] saleParse = scanner.nextLine().split(",");

            Sale sale = new Sale(saleParse[0], saleParse[1], Double.parseDouble(saleParse[2]), Double.parseDouble(saleParse[3]));
            sales.add(sale);

            System.out.println("Add another sale? (y/n)");

            char ans = scanner.nextLine().charAt(0);
            if(!(ans == 'y' || ans == 'Y')){
                moreSales = false;
            } else {
                moreSales = true;
            }
        } while (moreSales);
        return sales;
    }
}
