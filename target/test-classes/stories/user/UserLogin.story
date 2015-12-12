Meta:

Narrative:
As a user
I want to  login
So that I can get access to all user feature

Scenario: user login from main page
Given I am at Main Page
And I am logged out
When Fill login field 'usefOne' and password field '1' and click Login Button
Then I am logged in 'usefOne'. I see user menu and avatar holder

Scenario: user login from static login page
Given static login page opened
When fill login field with 'login' password field 'password' and clock Login
Then I am logged in. I see user menu and avatar holder