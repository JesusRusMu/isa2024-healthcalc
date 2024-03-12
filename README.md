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


