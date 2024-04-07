@tag
Feature: Ideal Weight Calculation

Como usuario,
Quiero poder calcular el peso ideal de una persona,
Para determinar si su peso actual está dentro de un rango saludable.

  @tag1
  Scenario Outline: Calcula el peso ideal con parámtros válidos
    
    Examples:
       gender  height  expected_ideal_weight 
       m       170     65                    
       w       160     56                    

  @tag2
  Scenario Outline: Calcula el peso ideal cuando hay error al introducir los datos
    
    Examples:
       gender  height  error 
       m       -1      True 
       w       -1      True 


   