Feature: This is just a test for cucumber

Scenario: User searches a item on google and checks if a title matches a keyword

	Given I navigate to google home page
	When I enter a keyword to search
	And I click on search button
	Then I should be able to see a title contains a keyword












