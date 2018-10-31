#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: test HTB hands
	Scenario: HTB Royal Flush VS Straight Flush
		Given HTB has Royal flush vs AIP Straight Flush
		When HTB compares hand with AIP - RF VS SF
		Then HTB wins with Royal Flush vs AIP Straight Flush
	Scenario: HTB Royal Flush VS four of a kind 
		Given HTB has Royal flush vs AIP four of a kind
		When HTB compares hand with AIP - RF VS four of a kind
		Then HTB wins with Royal Flush vs AIP four of a kind
	Scenario: HTB Royal Flush vs Full House 
		Given HTB has Royal flush vs AIP full house
		When HTB compares hand with AIP - RF VS full house
		Then HTB wins with Royal Flush vs AIP full house
	Scenario: HTB Royal Flush vs Flush
		Given HTB has Royal flush vs AIP flush
		When HTB compares hand with AIP - RF VS flush
		Then HTB wins with Royal Flush vs AIP flush
	Scenario: HTB Royal Flush vs Straight
		Given HTB has Royal flush vs AIP Straight
		When HTB compares hand with AIP - RF VS Straight
		Then HTB wins with Royal Flush vs AIP Straight
	Scenario: HTB Royal Flush vs Three Of A Kind
		Given HTB has Royal flush vs AIP Three of
		When HTB compares hand with AIP - RF VS Three of
		Then HTB wins with Royal Flush vs AIP Three of
	Scenario: HTB Royal Flush vs Two Pairs
		Given HTB has Royal flush vs AIP Two Pairs
		When HTB compares hand with AIP - RF VS Two Pairs
		Then HTB wins with Royal Flush vs AIP Two Pairs
	Scenario: HTB Royal Flush vs One Pair
		Given HTB has Royal flush vs AIP One Pair
		When HTB compares hand with AIP - RF VS One Pair
		Then HTB wins with Royal Flush vs AIP One Pair
	Scenario: HTB Royal Flush vs One High
		Given HTB has Royal flush vs AIP One High
		When HTB compares hand with AIP - RF VS One High
		Then HTB wins with Royal Flush vs AIP One High
	Scenario: HTB Straight Flush vs four of a kind
		Given HTB has Straight flush vs AIP four of a kind
		When HTB compares hand with AIP - SF VS four of a kind
		Then HTB wins with Straight Flush vs AIP four of a kind
	Scenario: HTB Straight Flush vs full house
		Given HTB has Straight flush vs full house
		When HTB compares hand with AIP - SF VS full house
		Then HTB wins with Straight Flush vs AIP full house
	Scenario: HTB Straight Flush vs flush
		Given HTB has Straight flush vs flush
		When HTB compares hand with AIP - SF VS flush
		Then HTB wins with Straight Flush vs AIP flush
	Scenario: HTB Straight Flush vs straight
		Given HTB has Straight flush vs straight
		When HTB compares hand with AIP - SF VS straight
		Then HTB wins with Straight Flush vs AIP straight
	Scenario: HTB Straight Flush vs three of a kind
		Given HTB has Straight flush vs three of a kind
		When HTB compares hand with AIP - SF VS three of a kind
		Then HTB wins with Straight Flush vs AIP three of a kind
	Scenario: HTB Straight Flush vs two pair
		Given HTB has Straight flush vs two pair
		When HTB compares hand with AIP - SF VS two pair
		Then HTB wins with Straight Flush vs AIP two pair
	Scenario: HTB Straight Flush vs highest
		Given HTB has Straight flush vs highest
		When HTB compares hand with AIP - SF VS highest
		Then HTB wins with Straight Flush vs AIP highest
	Scenario: HTB Four of kind vs full house
		Given HTB has four of a kind  vs full house
		When HTB compares hand with AIP - four of a kind VS fullhouse
		Then HTB wins with four of a kind vs AIP fullhouse
	Scenario: HTB Four of kind vs flush
		Given HTB has four of a kind  vs flush
		When HTB compares hand with AIP - four of a kind VS flush
		Then HTB wins with four of a kind vs AIP flush
	Scenario: HTB Four of kind vs straight
		Given HTB has four of a kind  vs straight
		When HTB compares hand with AIP - four of a kind VS straight
		Then HTB wins with four of a kind vs AIP straight
	Scenario: HTB Four of kind vs three of a kind
		Given HTB has four of a kind  vs three of a kind
		When HTB compares hand with AIP - four of a kind VS three of a kind
		Then HTB wins with four of a kind vs AIP three of a kind
	Scenario: HTB Four of kind vs two pair
		Given HTB has four of a kind  vs two pair
		When HTB compares hand with AIP - four of a kind VS two pair
		Then HTB wins with four of a kind vs AIP two pair
	Scenario: HTB Four of kind vs one pair
		Given HTB has four of a kind  vs one pair
		When HTB compares hand with AIP - four of a kind VS one pair
		Then HTB wins with four of a kind vs AIP one pair
	Scenario: HTB Four of kind vs one card
		Given HTB has four of a kind  vs one card
		When HTB compares hand with AIP - four of a kind VS one card
		Then HTB wins with four of a kind vs AIP one card
	Scenario: HTB full house vs flush
		Given HTB has full house vs flush
		When HTB compares hand with AIP - full house vs flush
		Then HTB wins with full house vs AIP flush
	Scenario: HTB full house vs straight
		Given HTB has full house vs straight
		When HTB compares hand with AIP - full house vs straight
		Then HTB wins with full house vs AIP straight
	Scenario: HTB full house vs three of kind
		Given HTB has full house vs three of kind
		When HTB compares hand with AIP - full house vs three of kind
		Then HTB wins with full house vs AIP three of kind
	Scenario: HTB full house vs two pairs
		Given HTB has full house vs two pairs
		When HTB compares hand with AIP - full house vs two pairs
		Then HTB wins with full house vs AIP two pairs
	Scenario: HTB full house vs one pair
		Given HTB has full house vs one pair
		When HTB compares hand with AIP - full house vs one pair
		Then HTB wins with full house vs AIP one pair
	Scenario: HTB full house vs high card
		Given HTB has full house vs high card
		When HTB compares hand with AIP - full house vs high card
		Then HTB wins with full house vs AIP high card
	Scenario: HTB flush vs straight
		Given HTB has flush vs straight
		When HTB compares hand with AIP - flush vs straight
		Then HTB wins with flush vs AIP straight
	Scenario: HTB flush vs three of kind
		Given HTB has flush vs three of kind
		When HTB compares hand with AIP - flush vs three of kind
		Then HTB wins with flush vs AIP thre of kind
	Scenario: HTB flush vs two pair
		Given HTB has flush vs two pair
		When HTB compares hand with AIP - flush vs two pair
		Then HTB wins with flush vs AIP two pair
	Scenario: HTB flush vs one pair
		Given HTB has flush vs one pair
		When HTB compares hand with AIP - flush vs one pair
		Then HTB wins with flush vs AIP one pair
	Scenario: HTB flush vs high card
		Given HTB has flush vs high card
		When HTB compares hand with AIP - flush vs high card
		Then HTB wins with flush vs AIP high card
	Scenario: HTB straight vs three of a kind
		Given HTB has straight vs three of a kind
		When HTB compares hand with AIP - straight vs three of a kind
		Then HTB wins with straight vs AIP three of a kind
	Scenario: HTB straight vs two pair
		Given HTB has straight vs two pair
		When HTB compares hand with AIP - straight vs two pair
		Then HTB wins with straight vs AIP two pair
	Scenario: HTB straight vs one pair
		Given HTB has straight vs one pair
		When HTB compares hand with AIP - straight vs one pair
		Then HTB wins with straight vs AIP one pair
	Scenario: HTB straight vs high card
		Given HTB has straight vs high card
		When HTB compares hand with AIP - straight vs high card
		Then HTB wins with straight vs AIP high card
	Scenario: HTB three of a kind vs two pair
		Given HTB has three of a kind vs two pair
		When HTB compares hand with AIP - three of a kind vs two pair
		Then HTB wins with three of a kind vs AIP two pair
	Scenario: HTB three of a kind vs one pair
		Given HTB has three of a kind vs one pair
		When HTB compares hand with AIP - three of a kind vs one pair
		Then HTB wins with three of a kind vs AIP one pair
	Scenario: HTB three of a kind vs high card
		Given HTB has three of a kind vs high card
		When HTB compares hand with AIP - three of a kind vs high card
		Then HTB wins with three of a kind vs AIP high card
	Scenario: HTB two pair vs one pair
		Given HTB has two pair vs one pair
		When HTB compares hand with AIP - two pair vs one pair
		Then HTB wins with two pair vs AIP one pair
	Scenario: HTB two pair vs one pair
	  Given HTB has two pair vs high card
		When HTB compares hand with AIP - two pair vs  high card
		Then HTB wins with two pair vs high card
	Scenario: HTB one pair vs high card
		Given HTB has one pair vs high card
		When HTB compares hand with AIP - one pair vs  high card
		Then HTB wins with one pair vs high card
	
	
		
		
		
		