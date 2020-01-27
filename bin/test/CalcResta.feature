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
Feature: Calculo de Resta 
  Mediante esta prueba se va a calcular la operacion de Resta,para ver cómo se comporta mi aplicación.
#scenario #1 => CASO EXITOSO DEBERIA PASAR PRUEBA1
@Scenario1
Scenario: Calcular Resta1 
    Given Dado dos numeros 5,5
    When calculo la resta de los mismos
    Then obteniendo como respuesta 0
#scenario #2 => CASO EXITOSO DEBERIA PASAR PRUEBA2
@Scenario2
Scenario: Calcular Resta2
    Given Dado dos numeros 5,-5
    When calculo la resta de los mismos
    Then obteniendo como respuesta 10
#scenario #3 => CASO EXITOSO DEBERIA PASAR PRUEBA3
@Scenario3
Scenario: Calcular Resta3
    Given Dado dos numeros -5,8
    When calculo la resta de los mismos
    Then obteniendo como respuesta -13
#scenario #4 => CASO EXITOSO DEBERIA PASAR PRUEBA4
@Scenario4
Scenario: Calcular Resta4
    Given Dado dos numeros -9,-5
    When calculo la resta de los mismos
    Then obteniendo como respuesta -4
