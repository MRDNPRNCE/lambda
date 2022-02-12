Feature: US1001_amazon

  Scenario: TC01_Amazon Sear Testi
    Given kullanici amazon sayfasina gider
    And iphone icin arama yapar
    Then sonuclari bakar

    Given  kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclari test eder
