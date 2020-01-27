#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@featureTest
Feature: Calculo de Multiplicacion 
  Mediante esta prueba se va a calcular la operacion de Multiplicacion,para ver cómo se comporta mi aplicación.
#scenario #1 => CASO EXITOSO DEBERIA PASAR PRUEBA1
@Scenario1
Scenario: Calcular Multiplicacion1 
    Given dos numeros 5,5
    When calculo la multiplicacion con estos numeros
    Then su resultado es 25
#scenario #2 => CASO EXITOSO DEBERIA PASAR PRUEBA2
@Scenario2
Scenario: Calcular Multiplicacion2
    Given dos numeros 5,-5
    When calculo la multiplicacion con estos numeros
    Then su resultado es -25
#scenario #3 => CASO EXITOSO DEBERIA PASAR PRUEBA3
@Scenario3
Scenario: Calcular Multiplicacion3
    Given dos numeros -5,8
    When calculo la multiplicacion con estos numeros
    Then su resultado es -40
#scenario #4 => CASO EXITOSO DEBERIA PASAR PRUEBA4
@Scenario4
Scenario: Calcular Multiplicacion4
    Given dos datos numericos 0,-5
    When calculo la multiplicacion con estos numeros
    Then su resultado es 0