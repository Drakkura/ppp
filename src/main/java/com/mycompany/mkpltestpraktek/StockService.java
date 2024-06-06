/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mkpltestpraktek;

/**
 *
 * @author HP
 */
public class StockService {

    private int qtyOnHand;

    public StockService(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    private void isValidQty(int qty) {
        if (qty < 0) {
            throw new IllegalArgumentException("Quality should be positive!");
        }
    }

    public int add(int qty) {

        isValidQty(qty);
        qtyOnHand = qtyOnHand + qty;
        return qtyOnHand;

    }

    public int deduct(int qty) {

        isValidQty(qty);

        int newQty = qtyOnHand - qty;
        if (newQty < 0) {
            throw new IllegalArgumentException("Out of Stock!");
        } else {
            qtyOnHand = newQty;
        }
        return qtyOnHand;

    }

}
