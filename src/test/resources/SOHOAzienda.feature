Feature: Order Processing for SOHO Azienda

  Background: 
    Given browser shoulde be launched
    And URL should be entered


Scenario: SOHO Azienda Prepaid

Given Security check is done
    When User select Tipologia cliente as "SOHO Azienda"
    And User enter "12348760633" in Codice Fiscale tab
    And User enter "12348760633" in Partita IVA tab
    And select "Ricaricabile" from Tipologia Offerta dropdown
    And click on "SearchClientPart_btnNext" Avanti
    And User accept alert
    #And User enter Numero REA
    And User enter EmailId 
     #And User enter Companyname
    And User select "Passaporto" from dropdown documenttype
    And user enter number of document
 	And User enter start date
 	And User enter end date
 	And User enter Issuing Institute name
 	And User enter Place name    
    And User check the accetto checkbox
    And click on "PersoInfo_btnNext" Avanti
    And User accept alert    
    And click on "PromotionalCodeID_btnNext" Avanti
    And User accept alert
    And User enter tipologia Sim "SUPERSIM Trio"
	And User enter Barcode Simcard "39335029080000413"
	And User select offerta "Consumer" and Piano Tariffario "Creami GIGA 1"
	And click on "configuration_btnSemiPrint" Avanti
	And User accept alert	
    And User select Acquisto prima ricarica  
    And User enter Taglio "60"  
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
