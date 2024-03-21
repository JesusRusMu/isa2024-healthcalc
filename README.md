# isa2024-healtcalc
Health calculator

1. PRÁCTICA 1

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


2. PRÁCTICA 2


![IMAGEN DE CASOS DE USO] (https://github.com/JesusRusMu/isa2024-healthcalc/blob/practica2/doc/CasoUso.jpg)


    2.2 Especificación del caso de Uso de calcular porcentaje de grasa

        Caso de Uso: Calcular Porcentaje de Grasa
        Nombre: Calcular Porcentaje de Grasa

        Actor Principal: Usuario

        Ámbito: Sistema de seguimiento de salud y fitness

        Nivel: Funcional

        Stakeholders e Intereses:
        Usuario: Interesado en conocer su porcentaje de grasa corporal para monitorear su salud y progreso de fitness.
        Entrenador Personal (si aplicable): Interesado en tener información precisa sobre el porcentaje de grasa corporal del usuario para diseñar un programa de entrenamiento efectivo.
        Desarrolladores del Sistema: Interesados en proporcionar una funcionalidad precisa y fácil de usar para calcular el porcentaje de grasa corporal de los usuarios.

        Precondiciones:
        El usuario ha ingresado datos precisos sobre su perfil físico, incluyendo peso, altura, edad y género.
        El usuario ha ingresado mediciones específicas para calcular el porcentaje de grasa corporal, como el grosor del pliegue cutáneo en diferentes áreas del cuerpo o mediciones de impedancia bioeléctrica.

        Garantías Mínimas:
        El sistema utilizará fórmulas o métodos de medición reconocidos y precisos para calcular el porcentaje de grasa corporal.
        El sistema proporcionará resultados consistentes y confiables basados en las mediciones proporcionadas por el usuario.

        Garantía de Éxito:
        El sistema proporcionará al usuario un porcentaje de grasa corporal preciso y relevante para ayudarlo a monitorear su salud y progreso de fitness.
        El usuario podrá confiar en los resultados proporcionados por el sistema para tomar decisiones informadas sobre su dieta, ejercicio y salud en general.

        Escenario Principal:
        El usuario inicia sesión en el sistema de seguimiento de salud y fitness.
        El usuario accede a la función de "Calcular Porcentaje de Grasa".
        El sistema solicita al usuario ingresar los datos necesarios para el cálculo, como peso, altura, edad y género.
        El usuario ingresa los datos requeridos.
        El sistema realiza el cálculo del porcentaje de grasa corporal utilizando fórmulas o métodos de medición apropiados.
        El sistema muestra el resultado del porcentaje de grasa corporal al usuario.

        Escenarios Alternativos:
        Si el usuario ingresa datos incorrectos o incompletos, el sistema informará al usuario y solicitará la corrección de los datos.
        Si el sistema no puede calcular el porcentaje de grasa corporal debido a la falta de datos suficientes o problemas técnicos, se informará al usuario y se proporcionarán instrucciones adicionales si es necesario.

        Extensiones:
        El sistema puede ofrecer recomendaciones adicionales o consejos basados en el resultado del porcentaje de grasa corporal, como sugerencias de dieta y ejercicio para mejorar la composición corporal.
        El sistema puede permitir al usuario realizar un seguimiento de los cambios en su porcentaje de grasa corporal a lo largo del tiempo, mostrando gráficos o tablas de progreso.

