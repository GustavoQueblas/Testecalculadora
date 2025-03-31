package test;

import control.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestes {

    @Test
    public void testeSomar(){

        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.somar(2.0,3.0), 0.0);

    }
    @Test
    public void testeSubtrair(){

        Calculadora calc = new Calculadora();
        Assert.assertEquals(3.0, calc.subtrair(5.0,2.0), 0.0);

    }
    @Test
    public void testeMultiplicar(){

        Calculadora calc = new Calculadora();
        Assert.assertEquals(10.0, calc.multiplicar(2.0,5.0), 0.0);

    }
    @Test
    public void testeDividir(){

        Calculadora calc = new Calculadora();
        Assert.assertEquals(2.0, calc.dividir(6.0,3.0), 0.0);

    }
}



