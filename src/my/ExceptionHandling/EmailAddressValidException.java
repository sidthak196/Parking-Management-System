/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ExceptionHandling;

/**
 *
 * @author siddharth thakur
 */
public class EmailAddressValidException extends Exception {

    /**
     * Creates a new instance of <code>EmailAddressValidException</code> without
     * detail message.
     */
    public EmailAddressValidException() {
    }

    /**
     * Constructs an instance of <code>EmailAddressValidException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public EmailAddressValidException(String msg) {
        super(msg);
    }
}
