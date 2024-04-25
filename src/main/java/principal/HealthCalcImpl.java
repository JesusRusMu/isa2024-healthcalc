package principal;


public class HealthCalcImpl implements HealthCalc{
    @Override


    public float idealWeight(int height, char gender) throws Exception {
        float iw = 0;

       
        if (height <= 0) {
            throw new IllegalArgumentException("Alltura debe de ser un valor positivo");
        }

        if (gender == 'm') {

            iw = Math.max(height - 100 - (height - 150) / 4.0f, 0.0f);
        } else if (gender == 'w') {

            iw = Math.max(height - 100 - (height - 150) / 2.5f, 0.0f);
        } else {

            throw new IllegalArgumentException("Argumento inválido");
        }
        return iw;
    }


    @Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        float bmr = 0;

        if (height < 0){
            throw new IllegalArgumentException("Altura debe de ser un vlaor positivo");
        }


        if (age < 0) {
            throw new IllegalArgumentException("Edad debe de ser un valor positivo");
        }
        
        if (gender == 'm') {

            bmr = 10 * weight + 6.25f * height - 5 * age + 5;
        }
         else if (gender == 'w') {

            bmr = 10 * weight + 6.25f * height - 5 * age - 161;
        }
         else {

            throw new IllegalArgumentException("Argumento de género inválido");
        }
        return bmr;
    }
}