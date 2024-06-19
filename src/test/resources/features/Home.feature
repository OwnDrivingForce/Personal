@Home
Feature: Testing the Home page

  Scenario Outline: : verify browser is opening the site KAL Partz
    And user should be on home page "<Header>"
    And
    Examples:
    | Header |
    |Kalpartz|
