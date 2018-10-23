Feature: test the web application

  Scenario Outline: test the login with valid credentials
    Given open the  chrome browser and enter the url
    When enter the valid credentials "<username>" and "<password>"
    Then user should be able to login sucessfully

    Examples: 
      | username             | password |
      | prasannakumar2461995 | 018Apple |
      | prasannakumar2461995 | 008Apple |
      | prasannakumar2461995 | 028Apple |
