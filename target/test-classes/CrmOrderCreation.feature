Feature: Order Creation

	@crmordercreation
  Scenario: crm order creation
    Given Launched CRM in browser
    When User Login into siebel
    And Click on "Cliente"
    And Click on "Cerca"
    And Enter Codice fiscale in "CodiceFiscale"
    And Click on "vai"
    And Click on "CognomeDitta"
    And Click on "Fatturazione"
    And Click on "PrepaidBilling"
    And Click on "ProfilePayment"
    And Click on "Nuovo"
    And Select "Metododipagamento" as "InContanti"
    And Select "scadenzapagamento" as "scadenzapagamentovalue"
    And Click on "Complete"
    And Click on "Nuovo"
    And Select "TypeMVNO" as "Full"
    And Click on "Nuovo"
    And Click on "Applet"
    And Click on "OK"
    And Click on "OutsideClick"
    And Click on "TariffPlan"
    And Click on "AppletTariffPlan"
    And Enter Inizia Con in "EnterTariffPlan" 
    And Click on "Configura"
    And Select "SearchMSISDN" as "SelectMSISDN"  
    And Click on "OK"
    And Click on "MSISDNOutsideClick"
    And Select "ICCClick" as "ClickICCID" 
    And Click on "OK"
    And Click on "OutsideClickICCID"
    And Click on "Eseguito"
    And Click on "Invia"
    Then Stato should be In Transit
    
    
    
