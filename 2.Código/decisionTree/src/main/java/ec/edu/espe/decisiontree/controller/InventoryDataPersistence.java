package ec.edu.espe.decisiontree.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.decisiontree.model.Product;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.time.LocalDate;
import utils.MongoConnection;
import java.util.ArrayList;
import java.util.HashMap;
import utils.DictionaryConversor;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class InventoryDataPersistence {

    private static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("name");
        fields.add("expireDate");
        fields.add("salesRate");
        fields.add("price");
        fields.add("discount");
        return fields;   
    }
    
    private static ArrayList getValuesToInsert(Product product){
        ArrayList values = new ArrayList();
        values.add(product.getName());
        values.add(product.getExpireDate());
        values.add(product.getSalesRate());
        values.add(product.getPrice());
        values.add(product.getDiscount());
        return values;
    }
    

    public static boolean insertProduct( MongoCollection productsCollection ,Product product){
        ArrayList fields = getFieldsToInsert();
        ArrayList values = getValuesToInsert(product);
        HashMap productToInsert = DictionaryConversor.convertToDictionary(fields, values);
        MongoDbManager.insertDocument(productsCollection, productToInsert);
        return true;
    }
    
    
    public static boolean deleteProduct(MongoCollection productsCollection, String name){
        return MongoDbManager.deleteDocument(productsCollection, "name", name);
    }
    
    public static Object getValueFromProduct(MongoCollection productsCollection,String searchField, Object searchValue, String fieldToFind){
        Object foundValue;
        foundValue = MongoDbManager.getDocumentValue(productsCollection, searchField,searchValue, fieldToFind);
        return foundValue;
    }
    
    public static ArrayList readAll(MongoCollection productsCollection, String field){
        ArrayList productsIds;
        productsIds = MongoDbManager.getFieldValues(productsCollection, field);
        return productsIds;
    }
    
    public static boolean updateProduct(MongoCollection productsCollection, Product product){
        String name = product.getName();
        MongoDbManager.updateDocument(productsCollection, "name",name, "name", product.getName());
        MongoDbManager.updateDocument(productsCollection, "name",name, "expireDate", product.getExpireDate());
        MongoDbManager.updateDocument(productsCollection, "name",name, "salesRate", product.getSalesRate());
        MongoDbManager.updateDocument(productsCollection, "name",name, "discount", product.getDiscount());

        return true;
    }
    
    public static  boolean existsProduct(MongoCollection productsCollection, String field, Object value){
        return MongoDbManager.existsDocument(productsCollection, field, value);
    }
    
    public static ArrayList <Product> readInventory( MongoCollection productsCollection){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ArrayList <Object> names = readAll(productsCollection, "name");
        Product readedProduct;
        ArrayList <Product> readedProducts = new ArrayList();
        MongoConnection mongoConnection = MongoConnection.getInstance();
        for (Object readedName: names){ 
            LocalDate expireDate = LocalDate.parse(String.valueOf(getValueFromProduct(productsCollection,"name", readedName, "expireDate")), formatter);
            Float salesRate = Float.parseFloat(String.valueOf(getValueFromProduct( productsCollection, "name", readedName, "salesRate")));
            Float price = Float.parseFloat(String.valueOf(getValueFromProduct( productsCollection, "name", readedName, "price")));
            Float discount = Float.parseFloat(String.valueOf(getValueFromProduct( productsCollection, "name", readedName, "discount")));
            readedProduct = new Product(String.valueOf(readedName), expireDate, salesRate,price,discount);
            readedProducts.add(readedProduct);
        }
        return readedProducts;
    }

}

