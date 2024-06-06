/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mkpltestpraktek;

/**
 *
 * @author HP
 */
public class MessageBuilder {

    public String getMessage(String name) {

        StringBuilder result = new StringBuilder();

        if (name == null || name.trim().length() == 0) {

            result.append("Please provide a name!");

        } else {

            result.append("Hello " + name);

        }
        return result.toString();
    }

}
