Feature:Hepsiburada Delivery Feature Test Scenarios

  Background:
    Given I start the browser
    And I'm going to the hepsiburada page
    And I click the login button
    And I'm filling in the username, password fields and clicking the login button

  Scenario:Standard delivery sent by Hepsiburada
    And I'm searching "Sklz Mini Bands Antrenman 3 Lü Bant Seti"
    And I add the AntremanBantLastigi product to the cart
    And I go to my cart
    And I click the complete the shopping
    And I see standard delivery sent by Hepsiburada
    Then I close the browser

  Scenario:Tomorrow delivery sent by Hepsiburada
    And I'm searching "Delta 8 Renk Seçenekli Uzunluğu Ayarlanabilir Deluxe Atlama İpi"
    And I add the Atlamaİpi product to the cart
    And I go to my cart
    And I click the complete the shopping
    And I see tomorrow delivery sent by Hepsiburada
    Then I close the browser

  Scenario:Instant delivery sent by Hepsiburada
    And I'm searching "Microsoft Office 365 Bireysel Abonelik"
    And I add MicrosoftOffice product to the cart
    And I go to my cart
    And I click the complete the shopping
    And I see instant delivery sent by Hepsiburada
    Then I close the browser