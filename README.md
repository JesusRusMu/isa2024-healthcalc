# isa2024-healtcalc
Health calculator

En primer lugar, hemos realizado los test para el método idealWeight():

1. Test de altura mayor a la esperada:
Verifica que se lance una excepción IllegalArgumentException cuando se proporciona una altura mayor a la esperada al calcular el peso ideal.

2. Test de altura menor a la esperada:
Comprueba que se lance una excepción IllegalArgumentException cuando se proporciona una altura menor a la esperada al calcular el peso ideal.

3. Test de altura negativa:
Verifica que se lance una excepción IllegalArgumentException cuando se proporciona una altura negativa al calcular el peso ideal.

4. Test de hombre:
Comprueba el cálculo del peso ideal para hombres con diferentes alturas.

5. Test de mujer:
Verifica el cálculo del peso ideal para mujeres con diferentes alturas.

6. Test problema de género:
Verifica que se lance una excepción IllegalArgumentException cuando se proporciona un carácter no válido en el campo de género al calcular el peso ideal.

Ahora realizaremos los tests para la segunda parte, sobre el basalMetabolicRate():

1. testSexoBMR:
Verifica si el método lanza una excepción IllegalArgumentException cuando se introduce un sexo diferente de 'm' o 'w'.

2. testEdadBMR: 
Comprueba si el método lanza una excepción IllegalArgumentException cuando se introduce una edad fuera del rango válido (0,100].

3. testPesoBMR: 
Asegura que el método lance una excepción IllegalArgumentException si se introduce un peso negativo o fuera del rango (10,500].

4. testAlturaBMR: 
Verifica que el método lance una excepción IllegalArgumentException si se introduce una altura fuera del rango establecido (10,250].

5. testHombreBMR: 
Prueba el cálculo del metabolismo basal para hombres promedio y verifica si el resultado coincide con el esperado.

6. testMujerBMR: 
Similar al anterior, pero para mujeres promedio.


Tras realizar los tests y corregir algunos errores, proceso a importar una captura sobre los test realizados:

![IMAGEN DE TODOS LOS TESTS CORREGIDOS] (https://github.com/JesusRusMu/isa2024-healthcalc/blob/main/TestSoftware.png?raw=true)



Ahora para acabar procedo a subir el desarrollo del repositorio mediante el comando gitk:

![IMAGEN DEL RESUMEN DEL REPOSITORIO] (https://raw.githubusercontent.com/JesusRusMu/isa2024-healthcalc/3b550903b14ee0760df34825d9be754a42a54020/CapturaRepositorio.png)







PRACTICA 3



Historia de Usuario 1: Cálculo del peso ideal de una persona

Como usuario,
Quiero poder calcular el peso ideal de una persona,
Para determinar si su peso actual está dentro de un rango saludable.

Criterios de Aceptación:
- El usuario puede ingresar la altura y el género de la persona.
- El sistema calcula el peso ideal de acuerdo con la fórmula específica para hombres o mujeres.
- El sistema muestra el peso ideal calculado al usuario.

Escenarios:
1. Calcular el peso ideal para un hombre:
   - Dado que el usuario ha ingresado una altura de 180 cm y ha seleccionado el género masculino.
   - Cuando el usuario solicita calcular el peso ideal.
   - Entonces el sistema muestra el peso ideal calculado como 72 kg.

2. Calcular el peso ideal para una mujer:
   - Dado que el usuario ha ingresado una altura de 160 cm y ha seleccionado el género femenino.
   - Cuando el usuario solicita calcular el peso ideal.
   - Entonces el sistema muestra el peso ideal calculado como 58 kg.

3. Error de entrada inválida de altura:
   - Dado que el usuario ha ingresado una altura negativa de -160 cm y ha seleccionado el género masculino.
   - Cuando el usuario solicita calcular el peso ideal.
   - Entonces el sistema muestra un mensaje de error indicando que la altura ingresada no es válida y solicita al usuario que ingrese una altura válida.

Historia de Usuario 2: Cálculo de la tasa metabólica basal de una persona

Como usuario,
Quiero poder calcular la tasa metabólica basal (TMB) de una persona,
Para determinar su requerimiento calórico diario básico.

Criterios de Aceptación:
- El usuario puede ingresar el peso, la altura, la edad y el nivel de actividad física de la persona.
- El sistema calcula la TMB de acuerdo con la fórmula específica.
- El sistema muestra la TMB calculada al usuario.

Escenarios:
1. Calcular la TMB para una persona con actividad física baja:
   - Dado que el usuario ha ingresado un peso de 70 kg, una altura de 170 cm, una edad de 30 años y ha seleccionado un nivel de actividad física bajo.
   - Cuando el usuario solicita calcular la TMB.
   - Entonces el sistema muestra la TMB calculada como 1500 kcal/día.

2. Calcular la TMB para una persona con actividad física moderada:
   - Dado que el usuario ha ingresado un peso de 80 kg, una altura de 180 cm, una edad de 35 años y ha seleccionado un nivel de actividad física moderado.
   - Cuando el usuario solicita calcular la TMB.
   - Entonces el sistema muestra la TMB calculada como 1800 kcal/día.

3. Error de entrada inválida de edad:
   - Dado que el usuario ha ingresado una edad negativa de -30 años, un peso de 70 kg, una altura de 170 cm y ha seleccionado un nivel de actividad física bajo.
   - Cuando el usuario solicita calcular la TMB.
   - Entonces el sistema muestra un mensaje de error indicando que la edad ingresada no es válida y solicita al usuario que ingrese una edad válida.




Práctica 4: Interfaz gráfica de usuario


![Captura de pantalla de la interfaz] (https://github.com/JesusRusMu/isa2024-healthcalc/blob/practica4/doc/Calculadora_Salud.png)



