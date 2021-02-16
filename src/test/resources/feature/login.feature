Feature: To validate the login functionality

  Scenario Outline: To verify login funtionality with valid username and invalid password in FB
    Given user has to launch chrome and hit the FB url
    When user has to enter the "<username>" and "<password>"
    And click the login button
    Then user unable to enter the home page

    Examples: 
      | username | password   |
      | java     | java@123   |
      | sql      | sql@123    |
      | python   | python@123 |
      | hadoop   | hadoop@123 |
