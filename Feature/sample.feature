Feature: Visit zoomcar url

  Scenario Outline: Visiting zoomcar to book the car from one location to another locations
    Given enter the url for the zoomcar
    When click on the search box displaying
    Then select the starting point
    Then click on next button
    Then select the date car is needed
    Then click on next button
    Then select date to return car
    Then Click on done
    Then click on Book car button
    Then Enter your <mobileno>
    Then enter your <name>, <enail>, <password>
    And Click on signup button

    Examples: 
      | mobileno   | name    | enail                      | password    |
      | 7812075641 | Abijeet | abhijeetkumar193@gmail.com | Abijeet@123 |