/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.example.model.OperationModel;

/**
 *
 * @author Fernando
 */
public class CalculateSimpleTest {
    CalculateSimple cs = new CalculateSimple();
    public CalculateSimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void testAdd() {
        OperationModel operacion = new OperationModel(5,4);
        int esperado= 9;
        int resultado = cs.add(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSubtract() {
    	OperationModel operacion = new OperationModel(9,4);
        int esperado= 5;
        int resultado = cs.subtract(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiply() {
    	OperationModel operacion = new OperationModel(9,4);
        int esperado= 36;
        int resultado = cs.multiply(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivide() {
    	OperationModel operacion = new OperationModel(10,5);
        double esperado2 =2;
        double resultado2= cs.divide(operacion);
        assertEquals(esperado2, resultado2, 0.01);
        
    }

    @Test
    public void testFactorial() {
    	OperationModel operacion = new OperationModel(5);
        int esperado= 120;
        int resultado = cs.factorial(operacion);
        assertEquals(esperado, resultado);
    	
    }

    @Test
    public void testFibonacci() {
    	OperationModel operacion = new OperationModel(9);
        int esperado= 34;
        int resultado = cs.fibonacci(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSqrt() {
    	OperationModel operacion = new OperationModel(9);
        double esperado= 3.0;
        double resultado = cs.sqrt(operacion);
        assertEquals(esperado, resultado,0.1);
    }

    @Test
    public void testPower() {
    	OperationModel operacion = new OperationModel(8);
        int esperado= 64;
        int resultado = cs.power(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testClearSimple() {
    	OperationModel esperandoModel = new OperationModel(0,0);
    	OperationModel responseModel = cs.clearSimple(esperandoModel);
    	assertEquals(esperandoModel, responseModel);
    			
    }

    @Test
    public void testClearAdvanced() {
    	OperationModel esperandoModel = new OperationModel(0);
    	OperationModel responseModel = cs.clearSimple(esperandoModel);
    	assertEquals(esperandoModel, responseModel);
    }
    
}
