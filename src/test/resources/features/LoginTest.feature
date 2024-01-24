Feature: As a user, I want to create credentials

  @ValidCase @SomeTags
  Scenario: Successful login using valid account
    Given Login form in login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button