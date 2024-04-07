package uma.bdd;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uma.HealthCalcImpl;


public class IdealWeight {
    private int h;
    private char g;
    private float iw;
    private HealthCalcImpl cal; 
    private boolean er;
    private String exceptionMessage;

    @Before
    public void initialization() {
        this.h = 0;
        this.g = ' ';
        this.iw = 0;
        this.cal = null;
        this.er = false;
        this.exceptionMessage = "";
    }

    @Given("Como usuario")
    public void i_am_a_HealthCalc_user() {
        cal = new HealthCalcImpl();
    }

    @When("Cuando introduzco mi género como {string} y mi altura como {int} ")
    public void introduzco_genero_altura(String gender, int height) {
        char genderChar = gender.charAt(0);
        this.g = genderChar;
        this.h = height;
        try {
            iw = cal.idealWeight(h, g); 
        } catch (Exception e) {
            this.exceptionMessage = e.getMessage().toLowerCase();
            er = true;
        }
    }

    @When("Introduzco {int} como mi altura, la cual es menor o igual que 0")
    public void negative_height(int height, String gender) {
        char genderChar = gender.charAt(0); 
        this.g = genderChar;
        this.h = height;
        try {
            iw = cal.idealWeight(h, g); 
        } catch (Exception e) {
            this.exceptionMessage = e.getMessage().toLowerCase();
            er = true;
        }
    }

    @When("Introduzco género no reconocido")
    public void genero_no_reconocido() {
        this.g = 'X';
        this.h = 180;
        try {
            iw = cal.idealWeight(this.h, this.g); 
        } catch (Exception e) {
            this.exceptionMessage = e.getMessage().toLowerCase();
            er = true;
        }
    }

    @Then("La calculadora obtendrá el peso ideal como {float}")
    public void calculate_ideal_weight(float expectedIdealWeight) {
        Assertions.assertEquals(expectedIdealWeight, iw); 
    }

    @Then("La calculadora imprime un error")
    public void the_calculator_should_raise_an_error() {
        
        if ((this.exceptionMessage.contains("número positivo") || 
             this.exceptionMessage.contains("género debe ser"))) {
                this.er = true;
             }
        Assertions.assertTrue(er);
        
    }

    @Then("El peso ideal es cero o negatvo y salta un error")
    public void the_ideal_weight_is_negative_or_zero() {
        
        if (this.exceptionMessage.contains("peso ideal es cero o menor que cero.")) {
            this.er = true;
        }
        Assertions.assertTrue(er);

    }

}