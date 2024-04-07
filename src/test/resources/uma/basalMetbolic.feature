@tag
Feature: Basal Metabolic Rate Calculation

"Como usuario,
Quiero poder calcular la tasa metabólica basal (TMB) de una persona,
Para determinar su requerimiento calórico diario básico."

  @tag1
  Scenario Outline: Calcular la tasa metabólica basal con inputs válidos
    
    Examples:
       weight  age  height  gender  expected_basal_metabolic_rate 
         50      25   170     m       1442.5                        

  @tag2
  Scenario Outline: Calcular la tasa metabólica cuando hay errores al introducir los datoa.
    

    Examples:
         weight  age   height  gender  error 
         -5      12    170     w       true  
         53      -25   150     w       true  
         50      45    -160    w       true  
         71      20    170     XXXX    true  
  
  @tag3
  Scenario Outline: Calcular la tasa metabólica cuando hay el resultado es 0 o negativo 
    
    Examples:
      | weight | age  | height | gender | error |
      | 1      | 99   | 1      | w      | true  |
      | 1      | 12   | 1      | m      | true  |
    
  