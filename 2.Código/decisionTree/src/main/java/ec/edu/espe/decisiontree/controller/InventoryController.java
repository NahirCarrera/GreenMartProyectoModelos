package ec.edu.espe.decisiontree.controller;

import ec.edu.espe.decisiontree.model.Inventory;
import ec.edu.espe.decisiontree.model.Product;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class InventoryController {
    
    private static Inventory defineExpireProducts(Inventory inventory){
        LocalDate currentDate;
        LocalDate expireDate;
        ArrayList<Product> allProducts;
        ArrayList<Product> expireProducts;
        ArrayList<Product> fineProducts;
        
        currentDate= LocalDate.now();
        
        allProducts = inventory.getAllProducts();
        expireProducts = inventory.getExpireProducts();
        fineProducts = inventory.getFineProducts();
        
        for(Product product: allProducts){
            expireDate = product.getExpireDate();
            
            if(currentDate.plusDays(60).isBefore(expireDate)){
                fineProducts.add(product);
            }else{
                expireProducts.add(product);
            }
        }
        inventory.setFineProducts(fineProducts);
        inventory.setExpireProducts(expireProducts);
        return inventory;
    }

    
    private static Inventory classifyInventory(Inventory inventory){
        float salesRate;
        float bestSales;
        ArrayList<Product> expireProducts;
        ArrayList<Product> fineProducts;
        ArrayList<Product> highSalesRateProducts;
        ArrayList<Product> lowSalesRateProducts; 
        Inventory classifiedInventory;
        
        classifiedInventory =  defineExpireProducts(inventory);
        
        expireProducts = classifiedInventory.getExpireProducts();
        fineProducts = classifiedInventory.getFineProducts();
        highSalesRateProducts = classifiedInventory.getHighSalesRateProducts();
        lowSalesRateProducts = classifiedInventory.getLowSalesRateProducts();
        
        bestSales = 0.6F;
        
        for(Product product: expireProducts){
            salesRate = product.getSalesRate();
            if(salesRate > bestSales){
                highSalesRateProducts.add(product);
            }else{
                lowSalesRateProducts.add(product);
            }
        }
        
        for(Product product: fineProducts){
            salesRate = product.getSalesRate();
            if(salesRate > bestSales){
                highSalesRateProducts.add(product);
            }else{
                lowSalesRateProducts.add(product);
            }
        }
        classifiedInventory.serHighSalesRateProducts(highSalesRateProducts);
        classifiedInventory.serLowSalesRateProducts(lowSalesRateProducts);
        
        return classifiedInventory;
    }
    
    public static Inventory applyDiscount(Inventory inventory){
        Inventory classifiedInventory;
        ArrayList<Product> allProducts;
        ArrayList<Product> expireProducts;
        ArrayList<Product> fineProducts;
        ArrayList<Product> highSalesRateProducts;
        ArrayList<Product> lowSalesRateProducts;
        
        classifiedInventory = classifyInventory(inventory);
        allProducts = classifiedInventory.getAllProducts();
        expireProducts = classifiedInventory.getExpireProducts();
        fineProducts = classifiedInventory.getFineProducts();
        highSalesRateProducts = classifiedInventory.getHighSalesRateProducts();
        lowSalesRateProducts = classifiedInventory.getLowSalesRateProducts();
        
        for(Product product: allProducts){
            if(fineProducts.contains(product) && highSalesRateProducts.contains(product)){
                product.setDiscount(0.0F);
            }else if(fineProducts.contains(product) && lowSalesRateProducts.contains(product)){
                product.setDiscount(0.10F);
            }else if (expireProducts.contains(product) && highSalesRateProducts.contains(product)){
                product.setDiscount(0.20F);
            }else if (expireProducts.contains(product) && lowSalesRateProducts.contains(product)){
                product.setDiscount(0.30F);
            }
        }
        classifiedInventory.setAllProducts(allProducts);
        return classifiedInventory;
    }
}
