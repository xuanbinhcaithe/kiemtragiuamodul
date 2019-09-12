package bai01;

import java.util.AbstractList;
import java.util.ArrayList;

public class ProductManager{

   private ArrayList<Product> listProducts = new ArrayList<Product>();

    public void disPlay() {
        for (Product pr: listProducts) {
            System.out.println(pr);
        }
    }
    public void addProduct(Product product) {
        listProducts.add(product);
    }
    public void editProduct(int index,Product product) {
        if (index >= listProducts.size() ) throw new IndexOutOfBoundsException("Index not valid");
        listProducts.set(index,product) ;
    }
    public void deleteProduct(int index) {
        if (index >= listProducts.size() ) throw new IndexOutOfBoundsException("Index not valid");
        listProducts.remove(index);
    }
    public void searchProduct(String name) {
        boolean check = false;
        for (Product pr: listProducts) {
            if (pr.getName() == name) {
               check = true;
            }else {
                check = false;
            }
        }
        if (check) {
            System.out.println(name + " have in list");
        }else {
            System.out.println(name + " have not in list");
        }

    }




    public static void main(String[] args) {
        ProductManager list = new ProductManager();
        Product pr1 = new Product(1,"banana",13,"blue");
        Product pr2 = new Product(2,"phone",50,"black");
        Product pr3 = new Product(3,"apple",15,"red");



        list.addProduct(pr1);
        list.addProduct(pr2);
        list.addProduct(pr3);
        list.disPlay();


    }


}