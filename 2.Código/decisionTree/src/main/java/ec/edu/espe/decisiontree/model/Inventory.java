package ec.edu.espe.decisiontree.model;

import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import utils.MongoConnection;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Inventory {
    private static Inventory instance = null;
    private ArrayList<Product> allProducts;
    private ArrayList<Product> expireProducts;
    private ArrayList<Product> fineProducts;
    private ArrayList<Product> highSalesRateProducts;
    private ArrayList<Product> lowSalesRateProducts;

    private Inventory(ArrayList<Product> allProducts, ArrayList<Product> expireProducts, ArrayList<Product> fineProducts, ArrayList<Product> highSalesRateProducts, ArrayList<Product> lowSalesRateProducts) {
        this.allProducts = allProducts;
        this.expireProducts = expireProducts;
        this.fineProducts = fineProducts;
        this.highSalesRateProducts = highSalesRateProducts;
        this.lowSalesRateProducts = lowSalesRateProducts;
    }
    
    
    public static Inventory getInstance(){
      if (instance == null) {
        ArrayList<Product> allProductsEmpty= new ArrayList();
        ArrayList<Product> expireProductsEmpty = new ArrayList();
        ArrayList<Product> fineProductsEmpty = new ArrayList();
        ArrayList<Product> highSalesRateProductsEmpty = new ArrayList();
        ArrayList<Product> lowSalesRateProductsEmpty = new ArrayList();
        instance = new Inventory(allProductsEmpty,
                expireProductsEmpty,
                fineProductsEmpty,
                highSalesRateProductsEmpty, 
                lowSalesRateProductsEmpty);
      }
      return instance;
    }
    
    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }
    

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public ArrayList<Product> getExpireProducts() {
        return expireProducts;
    }

    public void setExpireProducts(ArrayList<Product> expireProducts) {
        this.expireProducts = expireProducts;
    }

    public ArrayList<Product> getFineProducts() {
        return fineProducts;
    }

    public void setFineProducts(ArrayList<Product> fineProducts) {
        this.fineProducts = fineProducts;
    }

    public ArrayList<Product> getHighSalesRateProducts() {
        return highSalesRateProducts;
    }

    public void serHighSalesRateProducts(ArrayList<Product> highSalesRateProducts) {
        this.highSalesRateProducts = highSalesRateProducts;
    }

    public ArrayList<Product> getLowSalesRateProducts() {
        return lowSalesRateProducts;
    }

    public void serLowSalesRateProducts(ArrayList<Product> lowSalesRateProducts) {
        this.lowSalesRateProducts = lowSalesRateProducts;
    }


   
}
