Feature: Order Processing

  Background: 
    Given browser shoulde be launched
    And "DP" portal should be launched

  # If using @codicefiscale hook do not use @barcode hook
   @barcode @sample
  Scenario Outline: Consumer Prepaid
    Given Security check is done
    When User select tipologia cliente as <Tipologia cliente>
    And User enter CodiceFiscale
    And select <Tipologia offerta> from tipologia Offerta dropdown
    And click on "SearchClientPart_btnNext" Avanti
    And User accept alert
    And User enter EmailId
    And User check the accetto checkbox
    And click on "PersoInfo_btnNext" Avanti
    And User accept alert
    And click on "PromotionalCodeID_btnNext" Avanti
    And User accept alert
    And User enter tipologia Sim as <Tipologia Sim>
    And User enter Barcode
    And User select offerta as <offerta> and Piano Tariffario as <Piano Tariffario>
    And click on "configuration_btnSemiPrint" Avanti
    And User accept alert
    And User select Acquisto prima ricarica
    And User enter Taglio
    And click on "SelectOptionOrderConfigPart1_btnNext" Avanti
    And User accept alert
    And click on "SumaryPart_btnNext" Avanti
    And User accept alert
    And User accept alert
    And User accept alert
    Then Order ID should be generated
    And User click on Documentazione
    And click on "result1_btnFine" Avanti
    And User accept alert
    And User accept alert
	Then User verify the order in crm
    Examples: 
      | Tipologia cliente | Tipologia offerta | Tipologia Sim | offerta  | Piano Tariffario |
      | Consumer          | Ricaricabile      | SUPERSIM Trio | Consumer | Creami GIGA 1    |

  @codicefiscale @cf
  Scenario Outline: Consumer prepaid with codicefiscale
    Given Security check is done
    When User select tipologia cliente as <Tipologia cliente>
    And User enter CodiceFiscale
    And select <Tipologia offerta> from tipologia Offerta dropdown
    And click on "SearchClientPart_btnNext" Avanti
    And User accept alert
    And User enter EmailId
    And User check the accetto checkbox
    And click on "PersoInfo_btnNext" Avanti
    And User accept alert
    And click on "PromotionalCodeID_btnNext" Avanti
    And User accept alert
    And User enter tipologia Sim as <Tipologia Sim>
    And User enter Barcode
    And User select offerta as <offerta> and Piano Tariffario as <Piano Tariffario>
    And click on "configuration_btnSemiPrint" Avanti
    And User accept alert
    And User select Acquisto prima ricarica
    And User enter Taglio
    And click on "SelectOptionOrderConfigPart1_btnNext" Avanti
    And User accept alert
    And click on "SumaryPart_btnNext" Avanti
    And User accept alert
    And User accept alert
    And User accept alert
    Then Order ID should be generated
    And User click on Documentazione
    And click on "result1_btnFine" Avanti
    And User accept alert
    And User accept alert
	Then User verify the order in crm
    Examples: 
      | Tipologia cliente | Tipologia offerta | Tipologia Sim | offerta  | Piano Tariffario |
      | Consumer          | Ricaricabile      | SUPERSIM Trio | Consumer | Creami GIGA 1    |
