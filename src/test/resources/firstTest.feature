Feature: 1a.lv registration
  Scenario: Success registration test
    Given user name: "Vitalik"
    And user lastname "Tester"
    And user email: "123@test.lv"
    And new password is "qwerty123"

    When we open browser window
    And open home page
    And we accept cookies
    And we are pressing Registration/login btn
    And we are opening registration form
    And  we are filling in registration form

#    Then validation errors count is 1
#    And wrong password message appears