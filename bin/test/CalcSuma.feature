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
Feature: Calculo de Operaciones Matematicas 
  Mediante esta prueba se va a calcular la operacion de Suma de un usuario,para ver cómo se comporta mi aplicación.
#scenario #1 => CASO EXITOSO DEBERIA PASAR PRUEBA
@Scenario1
Scenario: Calcular Suma1 
    Given dos datos numericos 5,5
    When calculo la suma con estos datos numericos
    Then resultado debe ser 10
#scenario #2 => CASO EXITOSO DEBERIA PASAR PRUEBA
@Scenario2
Scenario: Calcular Suma2
    Given dos datos numericos 5,-5
    When calculo la suma con estos datos numericos
    Then resultado debe ser 0
#scenario #3 => => CASO CRITICO NO DEBERIA PASAR PRUEBA
@Scenario3
Scenario: Calcular Suma3
    Given dos datos numericos -5,8
    When calculo la suma con estos datos numericos
    Then resultado debe ser 3
#scenario #4 => => CASO CRITICO NO DEBERIA PASAR PRUEBA
@Scenario4
Scenario: Calcular Suma4
    Given dos datos numericos 5,-8
    When calculo la suma con estos datos numericos
    Then resultado debe ser -3
