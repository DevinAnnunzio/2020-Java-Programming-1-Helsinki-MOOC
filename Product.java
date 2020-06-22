/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Product {

    private double price;
    private int quality;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuality) {
        this.price = initialPrice;
        this.quality = initialQuality;
        this.name = initialName;

    }

    public void printProduct() {
        System.out.println(name + ", " + price + ", " + quality);
    }

}
