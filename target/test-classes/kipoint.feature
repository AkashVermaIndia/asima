Feature: Ki Point consumer order processing

  Background: 
    Given browser shoulde be launched
    And "Ki point" portal should be launched

@kp
  Scenario: Ki point consumer prepaid
    Given Security check is done
    When User enter "KIPOINT_TA" and "KIPOINT_FM3"
    And click on "LoginPart1_btnNext" Avanti
    And User click on "Vendita SIM" Link
    When User select Tipologia cliente as "Consumer"
    And User enter "codiceFiscale"
    And select "Ricaricabile" from Tipologia Offerta dropdown
    And click on "SearchClientPart_btnNext" Avanti
    And User enter EmailId
    And User check the accetto checkbox
    And click on "PersoInfo_btnNext" Avanti
    And click on "PromotionalCodeID_btnNext" Avanti
    And User enter tipologia Sim "SUPERSIM Trio"
    And User enter Barcode
    And User select offerta "Consumer" and Piano Tariffario "Creami GIGA 1"
    And click on "configuration_btnSemiPrint" Avanti
    And User select Acquisto prima ricarica
    And User enter Taglio "60"
    And click on "SelectOptionOrderConfigPart1_btnNext" Avanti
    And click on "SumaryPart_btnNext" Avanti
    Then Order ID should be generated
    And User click on Documentazione
    And click on "result1_btnFine" Avanti
    And User click on Si Button
