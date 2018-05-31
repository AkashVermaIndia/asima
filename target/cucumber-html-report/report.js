$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KipointSOHOLP.feature");
formatter.feature({
  "line": 1,
  "name": "Order Processing Ki point SOHO Libero Professionista",
  "description": "",
  "id": "order-processing-ki-point-soho-libero-professionista",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "browser shoulde be launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "URL should be entered",
  "keyword": "And "
});
formatter.match({
  "location": "DPRicercaClienteSteps.browser_shoulde_be_launched()"
});
formatter.result({
  "duration": 16237697887,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Unexpected error launching Internet Explorer. Browser zoom level was set to 89%. It should be set to 100%\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027DDC5-DX-440S9DK\u0027, ip: \u002710.250.250.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: InternetExplorerDriver\nremote stacktrace: \r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:219)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.run(InternetExplorerDriver.java:223)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:215)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:152)\r\n\tat initialize.LaunchBrowser.setDriver(LaunchBrowser.java:47)\r\n\tat initialize.LaunchBrowser.getDriver(LaunchBrowser.java:74)\r\n\tat stepdefinitions.DPRicercaClienteSteps.browser_shoulde_be_launched(DPRicercaClienteSteps.java:35)\r\n\tat ✽.Given browser shoulde be launched(KipointSOHOLP.feature:4)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 8,
  "name": "Ki point SOHO Libero Professionista Prepaid",
  "description": "",
  "id": "order-processing-ki-point-soho-libero-professionista;ki-point-soho-libero-professionista-prepaid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@kp"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Security check is done",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enter \"KIPOINT_TA\" and \"KIPOINT_FM3\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on \"LoginPart1_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on \"Vendita SIM\" Link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select Tipologia cliente as \"SOHO Libero Professionista\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter \"CHYSFL85D57F839X\" in Codice Fiscale tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter \"12341210636\" in Partita IVA tab",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select \"Ricaricabile\" from Tipologia Offerta dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on \"SearchClientPart_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter EmailId",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enter Companyname",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User check the accetto checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on \"PersoInfo_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on \"PromotionalCodeID_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter tipologia Sim \"SUPERSIM Trio\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enter Barcode Simcard \"39335029080002336\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User select offerta \"Consumer\" and Piano Tariffario \"Creami GIGA 1\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "click on \"configuration_btnSemiPrint\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User select Acquisto prima ricarica",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enter Taglio \"60\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on \"SelectOptionOrderConfigPart1_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "click on \"SumaryPart_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Order ID should be generated",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User click on Documentazione",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click on \"result1_btnFine\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click on Si Button",
  "keyword": "And "
});
formatter.match({
  "location": "DPRicercaClienteSteps.security_check_is_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "KIPOINT_TA",
      "offset": 12
    },
    {
      "val": "KIPOINT_FM3",
      "offset": 29
    }
  ],
  "location": "KipointSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPart1_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Vendita SIM",
      "offset": 15
    }
  ],
  "location": "KipointSteps.user_click_on_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "12341210636",
      "offset": 12
    }
  ],
  "location": "DPRicercaClienteSteps.user_enter_Partita_IVA_in_Partita_IVA_tab(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "SearchClientPart_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_enter_EmailId()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_enter_Companyname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_check_the_accetto_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PersoInfo_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PromotionalCodeID_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "configuration_btnSemiPrint",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_select_Acquisto_prima_ricarica()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "SelectOptionOrderConfigPart1_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SumaryPart_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.order_ID_should_be_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_click_on_Documentazione()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "result1_btnFine",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KipointSteps.click_on_Si_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 221141,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.DPRicercaClienteSteps.Quit(DPRicercaClienteSteps.java:232)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.uri("kipoint.feature");
formatter.feature({
  "line": 1,
  "name": "Ki Point consumer order processing",
  "description": "",
  "id": "ki-point-consumer-order-processing",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "browser shoulde be launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"Ki point\" portal should be launched",
  "keyword": "And "
});
formatter.match({
  "location": "DPRicercaClienteSteps.browser_shoulde_be_launched()"
});
formatter.result({
  "duration": 6872617319,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Unexpected error launching Internet Explorer. Browser zoom level was set to 89%. It should be set to 100%\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027DDC5-DX-440S9DK\u0027, ip: \u002710.250.250.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: InternetExplorerDriver\nremote stacktrace: \r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:219)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.run(InternetExplorerDriver.java:223)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:215)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:152)\r\n\tat initialize.LaunchBrowser.setDriver(LaunchBrowser.java:47)\r\n\tat initialize.LaunchBrowser.getDriver(LaunchBrowser.java:74)\r\n\tat stepdefinitions.DPRicercaClienteSteps.browser_shoulde_be_launched(DPRicercaClienteSteps.java:35)\r\n\tat ✽.Given browser shoulde be launched(kipoint.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ki point",
      "offset": 1
    }
  ],
  "location": "DPRicercaClienteSteps.url_should_be_entered(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 8,
  "name": "Ki point consumer prepaid",
  "description": "",
  "id": "ki-point-consumer-order-processing;ki-point-consumer-prepaid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@kp"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Security check is done",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enter \"KIPOINT_TA\" and \"KIPOINT_FM3\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on \"LoginPart1_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on \"Vendita SIM\" Link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select Tipologia cliente as \"Consumer\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter \"codiceFiscale\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select \"Ricaricabile\" from Tipologia Offerta dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on \"SearchClientPart_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter EmailId",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User check the accetto checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click on \"PersoInfo_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on \"PromotionalCodeID_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enter tipologia Sim \"SUPERSIM Trio\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enter Barcode",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User select offerta \"Consumer\" and Piano Tariffario \"Creami GIGA 1\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on \"configuration_btnSemiPrint\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User select Acquisto prima ricarica",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User enter Taglio \"60\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "click on \"SelectOptionOrderConfigPart1_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "click on \"SumaryPart_btnNext\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Order ID should be generated",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User click on Documentazione",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on \"result1_btnFine\" Avanti",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click on Si Button",
  "keyword": "And "
});
formatter.match({
  "location": "DPRicercaClienteSteps.security_check_is_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "KIPOINT_TA",
      "offset": 12
    },
    {
      "val": "KIPOINT_FM3",
      "offset": 29
    }
  ],
  "location": "KipointSteps.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPart1_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Vendita SIM",
      "offset": 15
    }
  ],
  "location": "KipointSteps.user_click_on_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "SearchClientPart_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_enter_EmailId()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_check_the_accetto_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PersoInfo_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PromotionalCodeID_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_enter_Barcode_Simcard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "configuration_btnSemiPrint",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_select_Acquisto_prima_ricarica()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "SelectOptionOrderConfigPart1_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SumaryPart_btnNext",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.order_ID_should_be_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DPRicercaClienteSteps.user_click_on_Documentazione()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "result1_btnFine",
      "offset": 10
    }
  ],
  "location": "DPRicercaClienteSteps.click_on_Avanti(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KipointSteps.click_on_Si_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 131944,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.DPRicercaClienteSteps.Quit(DPRicercaClienteSteps.java:232)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
});