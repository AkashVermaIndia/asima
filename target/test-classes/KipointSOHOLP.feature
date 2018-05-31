Feature: Order Processing Ki point SOHO Libero Professionista

  Background: 
    Given browser shoulde be launched
    And URL should be entered
    
    @kp
    Scenario: Ki point SOHO Libero Professionista Prepaid
    Given Security check is done
    When User enter "KIPOINT_TA" and "KIPOINT_FM3"
  	And click on "LoginPart1_btnNext" Avanti
  	And User click on "Vendita SIM" Link
    When User select Tipologia cliente as "SOHO Libero Professionista"
    And User enter "CHYSFL85D57F839X" in Codice Fiscale tab
    And User enter "12341210636" in Partita IVA tab
    And select "Ricaricabile" from Tipologia Offerta dropdown
    And click on "SearchClientPart_btnNext" Avanti
    And User enter EmailId 
    And User enter Companyname    
    And User check the accetto checkbox
    And click on "PersoInfo_btnNext" Avanti
    And click on "PromotionalCodeID_btnNext" Avanti
    And User enter tipologia Sim "SUPERSIM Trio"
		And User enter Barcode Simcard "39335029080002336"
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
