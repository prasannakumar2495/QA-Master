Feature: loging to the Gmail

Scenario: the user tries to login to the gmail account
    Given the user has arrived on the gmail webpage
    When the title of the current page is gmail
    Then the user enters the username and the password
    And the user clicks on the login button.