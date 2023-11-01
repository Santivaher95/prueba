Feature: probar google

Scenario: buscar algo en google
    Given estoy en la página de inicio de Google
    When ingresa probar en el campo de búsqueda   
    Then se muestra un resultado con el titulo probar