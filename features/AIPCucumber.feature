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
Feature: test AIP hands
	Scenario: AIP Royal Flush VS Straight Flush
		Given AIP has Royal flush vs HTB Straight Flush
		When AIP compares hand with HTB - RF VS SF
		Then AIP wins with Royal Flush vs HTB Straight Flush
	Scenario: AIP Royal Flush VS four of a kind 
		Given AIP has Royal flush vs HTB four of a kind
		When AIP compares hand with HTB - RF VS four of a kind
		Then AIP wins with Royal Flush vs HTB four of a kind
	Scenario: AIP Royal Flush vs Full House 
		Given AIP has Royal flush vs HTB full house
		When AIP compares hand with HTB - RF VS full house
		Then AIP wins with Royal Flush vs HTB full house
	Scenario: AIP Royal Flush vs Flush
		Given AIP has Royal flush vs HTB flush
		When AIP compares hand with HTB - RF VS flush
		Then AIP wins with Royal Flush vs HTB flush
	Scenario: AIP Royal Flush vs Straight
		Given AIP has Royal flush vs HTB Straight
		When AIP compares hand with HTB - RF VS Straight
		Then AIP wins with Royal Flush vs HTB Straight
	Scenario: AIP Royal Flush vs Three Of A Kind
		Given AIP has Royal flush vs HTB Three of
		When AIP compares hand with HTB - RF VS Three of
		Then AIP wins with Royal Flush vs HTB Three of
	Scenario: AIP Royal Flush vs Two Pairs
		Given AIP has Royal flush vs HTB Two Pairs
		When AIP compares hand with HTB - RF VS Two Pairs
		Then AIP wins with Royal Flush vs HTB Two Pairs
	Scenario: AIP Royal Flush vs One Pair
		Given AIP has Royal flush vs HTB One Pair
		When AIP compares hand with HTB - RF VS One Pair
		Then AIP wins with Royal Flush vs HTB One Pair
	Scenario: AIP Royal Flush vs One High
		Given AIP has Royal flush vs HTB One High
		When AIP compares hand with HTB - RF VS One High
		Then AIP wins with Royal Flush vs HTB One High
	Scenario: AIP Straight Flush vs four of a kind
		Given AIP has Straight flush vs HTB four of a kind
		When AIP compares hand with HTB - SF VS four of a kind
		Then AIP wins with Straight Flush vs HTB four of a kind
	Scenario: AIP Straight Flush vs full house
		Given AIP has Straight flush vs full house
		When AIP compares hand with HTB - SF VS full house
		Then AIP wins with Straight Flush vs HTB full house
	Scenario: AIP Straight Flush vs flush
		Given AIP has Straight flush vs flush
		When AIP compares hand with HTB - SF VS flush
		Then AIP wins with Straight Flush vs HTB flush
	Scenario: AIP Straight Flush vs straight
		Given AIP has Straight flush vs straight
		When AIP compares hand with HTB - SF VS straight
		Then AIP wins with Straight Flush vs HTB straight
	Scenario: AIP Straight Flush vs three of a kind
		Given AIP has Straight flush vs three of a kind
		When AIP compares hand with HTB - SF VS three of a kind
		Then AIP wins with Straight Flush vs HTB three of a kind
	Scenario: AIP Straight Flush vs two pair
		Given AIP has Straight flush vs two pair
		When AIP compares hand with HTB - SF VS two pair
		Then AIP wins with Straight Flush vs HTB two pair
	Scenario: AIP Straight Flush vs highest
		Given AIP has Straight flush vs highest
		When AIP compares hand with HTB - SF VS highest
		Then AIP wins with Straight Flush vs HTB highest
	Scenario: AIP Four of kind vs full house
		Given AIP has four of a kind  vs full house
		When AIP compares hand with HTB - four of a kind VS fullhouse
		Then AIP wins with four of a kind vs HTB fullhouse
	Scenario: AIP Four of kind vs flush
		Given AIP has four of a kind  vs flush
		When AIP compares hand with HTB - four of a kind VS flush
		Then AIP wins with four of a kind vs HTB flush
	Scenario: AIP Four of kind vs straight
		Given AIP has four of a kind  vs straight
		When AIP compares hand with HTB - four of a kind VS straight
		Then AIP wins with four of a kind vs HTB straight
	Scenario: AIP Four of kind vs three of a kind
		Given AIP has four of a kind  vs three of a kind
		When AIP compares hand with HTB - four of a kind VS three of a kind
		Then AIP wins with four of a kind vs HTB three of a kind
	Scenario: AIP Four of kind vs two pair
		Given AIP has four of a kind  vs two pair
		When AIP compares hand with HTB - four of a kind VS two pair
		Then AIP wins with four of a kind vs HTB two pair
	Scenario: AIP Four of kind vs one pair
		Given AIP has four of a kind  vs one pair
		When AIP compares hand with HTB - four of a kind VS one pair
		Then AIP wins with four of a kind vs HTB one pair
	Scenario: AIP Four of kind vs one card
		Given AIP has four of a kind  vs one card
		When AIP compares hand with HTB - four of a kind VS one card
		Then AIP wins with four of a kind vs HTB one card
	Scenario: AIP full house vs flush
		Given AIP has full house vs flush
		When AIP compares hand with HTB - full house vs flush
		Then AIP wins with full house vs HTB flush
	Scenario: AIP full house vs straight
		Given AIP has full house vs straight
		When AIP compares hand with HTB - full house vs straight
		Then AIP wins with full house vs HTB straight
	Scenario: AIP full house vs three of kind
		Given AIP has full house vs three of kind
		When AIP compares hand with HTB - full house vs three of kind
		Then AIP wins with full house vs HTB three of kind
	Scenario: AIP full house vs two pairs
		Given AIP has full house vs two pairs
		When AIP compares hand with HTB - full house vs two pairs
		Then AIP wins with full house vs HTB two pairs
	Scenario: AIP full house vs one pair
		Given AIP has full house vs one pair
		When AIP compares hand with HTB - full house vs one pair
		Then AIP wins with full house vs HTB one pair
	Scenario: AIP full house vs high card
		Given AIP has full house vs high card
		When AIP compares hand with HTB - full house vs high card
		Then AIP wins with full house vs HTB high card
	Scenario: AIP flush vs straight
		Given AIP has flush vs straight
		When AIP compares hand with HTB - flush vs straight
		Then AIP wins with flush vs HTB straight
	Scenario: AIP flush vs three of kind
		Given AIP has flush vs three of kind
		When AIP compares hand with HTB - flush vs three of kind
		Then AIP wins with flush vs HTB thre of kind
	Scenario: AIP flush vs two pair
		Given AIP has flush vs two pair
		When AIP compares hand with HTB - flush vs two pair
		Then AIP wins with flush vs HTB two pair
	Scenario: AIP flush vs one pair
		Given AIP has flush vs one pair
		When AIP compares hand with HTB - flush vs one pair
		Then AIP wins with flush vs HTB one pair
	Scenario: AIP flush vs high card
		Given AIP has flush vs high card
		When AIP compares hand with HTB - flush vs high card
		Then AIP wins with flush vs HTB high card
	Scenario: AIP straight vs three of a kind
		Given AIP has straight vs three of a kind
		When AIP compares hand with HTB - straight vs three of a kind
		Then AIP wins with straight vs HTB three of a kind
	Scenario: AIP straight vs two pair
		Given AIP has straight vs two pair
		When AIP compares hand with HTB - straight vs two pair
		Then AIP wins with straight vs HTB two pair
	Scenario: AIP straight vs one pair
		Given AIP has straight vs one pair
		When AIP compares hand with HTB - straight vs one pair
		Then AIP wins with straight vs HTB one pair
	Scenario: AIP straight vs high card
		Given AIP has straight vs high card
		When AIP compares hand with HTB - straight vs high card
		Then AIP wins with straight vs HTB high card
	Scenario: AIP one off from royal flush vs royal flush
		Given AIP has one off royal flush vs royal flush
		When AIP compares hand with HTB - royal flush vs royal flush
		Then AIP wins with royal flush vs royal flush lower suit
	Scenario: AIP one off from royal flush vs royal flush
		Given AIP has one off royal flush vs royal flush higher suit
		When AIP compares hand with HTB - one off royal flush vs royal flush
		Then AIP loses with royal flush vs royal flush
	Scenario: AIP one off from straight flush vs straight flush
		Given AIP has one off straight flush vs straight flush
		When AIP compares hand with HTB -  straight flush vs  straight flush
		Then AIP wins with straight flush vs  straight flush lower suit
	Scenario: AIP one off from royal flush vs royal flush
		Given AIP has one off  straight flush vs straight flush higher suit
		When AIP compares hand with HTB - one off  straight flush vs  straight flush
		Then AIP loses with not straight flush vs  straight flush 
	Scenario: AIP one off from royal flush vs royal flush (same but one distinct higher)
		Given AIP has one off  straight flush vs straight flush higher suit (with one distinct higher)
		When AIP compares hand with HTB - one off  straight flush vs  straight flush (with one distinct higher)
		Then AIP wins with straight flush vs  straight flush (with one distinct higher)
	Scenario: AIP two  off from full house vs full house
		Given AIP has two off  full house vs full house 
		When AIP compares hand with HTB -  full house vs  full house (with distinct higherSet)
		Then AIP wins with full house vs full house 
	Scenario: AIP two off from full house vs full house
		Given AIP has two off  full house vs full house needs swap
		When AIP compares hand with HTB - two off  full house vs  full house 
		Then AIP loses with not full house vs full house 
	
	
		
		
		
		