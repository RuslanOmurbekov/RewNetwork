	@sort
	Feature: Test Search Repository, sorting - Git Hub Functionality
	
	Scenario Outline: Search repository, filter by forks/stars in desc order
	Given ContentType and AcceptType is Json
	When user enters valid authorName 
	And user selects sort by <filter> in desc order
	Then status code should be 200
	Then user verifies repository with most <filter>  comes first 

	Examples:
	|  filter    | 
	|   stars    | 
	|   forks    |

	@sort1
	Scenario Outline: Search repository, filter by forks/stars in asc order 	
	Given ContentType and AcceptType is Json
	When user enters valid authorName 
	And user selects sort by <filter> in asc order
	Then status code should be 200
	Then user verifies repository with least <filter>  comes first 
	
	Examples:
	|  filter    | 
	|   stars    | 
	|   forks    | 
	
	@sort2
	Scenario: Search repository, filter by recently updated	
	Given ContentType and AcceptType is Json
	When user enters valid authorName 
	And user selects sort by recently "updated"
	Then status code should be 200
	Then user verifies recently "updated" repository comes first 

	
	@sort3
	Scenario: Search repository, filter by least recently updated	
	Given ContentType and AcceptType is Json
	When user enters valid authorName 
	And user selects sort by least recently "updated"
	Then status code should be 200
	Then user verifies least recently "updated" repository comes first 

	