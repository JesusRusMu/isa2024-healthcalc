package uma.bdd;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uma.HealthCalcImpl;



public class BasalMetabolic {

    private float w;
    private int a;
    private int h;
    @SuppressWarnings("unused")
    private char g;
    private HealthCalcImpl cal;
    private float bm;
    private boolean e;
    private String exceptionMessage;


    @Before
    public void initialization() {
        this.w = 0;
        this.a = 0;
        this.h = 0;
        this.g = ' ';
        this.bm = 0;
        this.e = false;
        this.cal = null;
        this.exceptionMessage = "";
    }

    @Given("Como Usuario")
    public void i_am_a_user() {
        cal = new uma.HealthCalcImpl();
    }

    @When("Introduzco mis datos {float}, {int}, {int} and {string} ")
    public void datos_into_the_calculator(float weight, int age, int height, String gender){
        this.w = weight;

        this.h = height;

        char g = gender.charAt(0); 
        this.a = age;
        try {
            bm = cal.basalMetabolicRate(w, h, g, a); 
        } catch (Exception e) {
            this.exceptionMessage = e.getMessage().toLowerCase();
        }
    }

    @When("Introduzco mis datos {float}, {int}, {int} and {string} into the calculator, y hay algún error en los datos")
    public void datos_incorrect(float weight, int age, int height, String gender){
        this.w = weight;
        this.h = height;
        this.a = age;
        char g = gender.charAt(0); 

        try {
            bm = cal.basalMetabolicRate(w, h, g, a); 
        } catch (Exception e) {
            this.exceptionMessage = e.getMessage().toLowerCase();
        }
    }

    @When("Introduzco mis datos {float}, {int}, {int} and {string} y BMR es negativo o cero")
    public void BMR_negativa_o_zero(float weight, int age, int height, String gender){
        char g = gender.charAt(0); 
        this.w = weight;
        this.a = age;
        this.h = height;
        try {
            bm = cal.basalMetabolicRate(w, h, g, a); 
        } catch (Exception e) {
            this.exceptionMessage = e.getMessage().toLowerCase();
        }
    }

    @Then("La calculadora nos debe proporcionar la tasa metabólica basal") 
    public void calculadora_funciona (float bmr) {
        Assertions.assertEquals(bmr, this.bm);
    }

    @Then("La calculadora imprime error debido a la entrada de datos")
    public void error_inputs() {
        if ((this.exceptionMessage.contains("debe ser un valor positivo") ||
             this.exceptionMessage.contains("género debe ser"))) {
            this.e = true;
        }
        Assertions.assertTrue(this.e);
    }

    @Then("La calculadora proporciona valor negativo o cero")
    public void bm_cero_negativo() {
        if (this.exceptionMessage.contains("es cero o menor que cero")) {
            this.e = true;
        }
        Assertions.assertTrue(this.e);
    }
    
    







}
