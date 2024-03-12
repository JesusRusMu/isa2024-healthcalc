package healthcalc;


public class HealthCalcImpl implements HealthCalc{
    @Override


    public float idealWeight(int height, char gender) throws Exception {
        Character sexo = Character.toUpperCase(gender);
        if (height>250){
            throw new IllegalArgumentException("La altura introducida es demasiado alta");

        }
        else if (sexo != 'M' && sexo != 'W') {
            throw new IllegalArgumentException("Solo se puede introducir 'M' para hombre o 'W' para mujer" );
        } 
        else {
            if (sexo == 'M') {
                if (height >= 100) {
                	return height - 100 - (height - 150) / 4f;
                } 
            } else {
                if (height >= 100) {
                	return height - 100 - (height - 150) / 2.5f;
                } 
            }throw new IllegalArgumentException("La altura introducida no es válida ya que es menor a la esperada");

        }
    }


    @Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {

		if (10 > weight || weight > 500) {
        	throw new IllegalArgumentException("El peso introducido no es válido debe de estar dentro del umbral establecido)");
		} 

        else if (10 > height || height > 250) {
            throw new IllegalArgumentException("La altura introducida no es válida, debe de estar dentro del umbral establecido");
        }

        else { 
        	Character sexo = Character.toUpperCase(gender);
        	if (sexo != 'M' && sexo != 'W') {
                throw new IllegalArgumentException("Solo se puede introducir 'M' para hombre o 'W' para mujer");

            }else if (sexo == 'M') {
            	float BMR = 10 * weight + 6.25f * height - 5 * age + 5;
            	if (BMR > 0) {
                    return BMR;
                } 
            	else {throw new IllegalArgumentException("Los valores introducidos no son válidos");}	

            }
            else if (1 >= age || age > 100) {
                throw new IllegalArgumentException("El valor de la edad está fuera del umbral");

            }
            else {
        	float BMR = 10 * weight + 6.25f * height - 5 * age - 161;
        	if (BMR > 0) {return BMR;} 
        	else {throw new IllegalArgumentException("Los valores introduciodos dentro de los campos no son válidos");}	
        }	
        }
	}




}