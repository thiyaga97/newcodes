Feature: login authentication validation of Facebook appication

  Scenario Outline: login with Valid Username and invalid Password
    Given launch Facebook application
    When Enter valid  "<UserName>" and invalid "<PassWord>"
    When Click login button

    Examples: 
      | UserName | PassWord    |
      | thiyaga  | thiyaga@123 |
      | ravi     | ravi@123    |
