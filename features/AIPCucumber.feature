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
	Scenario: AIP two pair full house vs full house win
		Given AIP has one off  full house vs full house needs for one
		When AIP compares hand with HTB -  full house vs  full house  (distinct two pair)
		Then AIP wins with full house vs full house from one
	Scenario: AIP two pair full house vs full house lose
		Given AIP has one off  full house vs full house needs for one (wont get it)
		When AIP compares hand with HTB -  full house vs  full house  (distinct two pair) no full house
		Then AIP loses with not full house vs full house (only two pair)
	Scenario: AIP two pair full house vs full house lose (eqRank)
		Given AIP has one off  full house vs full house needs for one (wont get it)(eqRank)
		When AIP compares hand with HTB -  full house vs  full house  (distinct two pair) no full house(eqRank)
		Then AIP loses with not full house vs full house (only two pair)(eqRank)
	Scenario: AIP one off from flush vs flush (lower rank) win
		Given AIP has one off from flush vs flush (lower rank)
		When AIP compares hand with HTB -  flush  vs  flush (lower rank)
		Then AIP wins with flush vs flush (lower rank)
	Scenario: AIP one off from flush vs flush (lower rank) lose
		Given AIP has one off from flush vs flush (lower rank) (wont get it)
		When AIP compares hand with HTB -  not flush  vs  flush (lower rank)
		Then AIP loses with flush vs flush (did not get flush)
	Scenario: AIP one off from flush vs flush (same suit and rank for four)
		Given AIP has one off from flush vs flush with same suit and rank for four
		When AIP compares hand with HTB -  not flush  vs  flush  flush with same suit and rank for four
		Then AIP loses with flush vs flush  flush with same suit and rank for four
	Scenario: AIP one off from flush vs flush (same suit and rank for three highest)
		Given AIP has one off from flush vs flush with same suit and rank for three highest
		When AIP compares hand with HTB -  not flush  vs  flush  flush with same suit and rank for three highest
		Then AIP loses with flush vs flush  flush with same suit and rank for for three highest
	Scenario: AIP one off from flush vs flush (same suit and rank for two highest)
		Given AIP has one off from flush vs flush with same suit and rank for two highest
		When AIP compares hand with HTB -  not flush  vs  flush  flush with same suit and rank for two highest
		Then AIP loses with flush vs flush  flush with same suit and rank for for two highest
	Scenario: AIP one off from straight vs straight (one off) AIP should win
		Given AIP has one off from straight vs straight 
		When AIP compares hand with HTB -  straight  vs  straight
		Then AIP wins with straight vs straight with a higher ranks straight
	Scenario: AIP one off from straight vs straight (one off) AIP should not win
		Given AIP has one off from straight vs straight and will not draw into straight
		When AIP compares hand with HTB - not straight  vs  straight
		Then AIP lose with not a straight vs straight 
	Scenario: AIP one off from straight vs straight with distinct higher cards, then highest card with highest suit wins
		Given AIP has a straight and HTB has a straight AIP's straight is lower rank
		When AIP compares hand with HTB -  straight is lower rank  vs  straight 
		Then AIP lose with lower rank straight vs straight 
	Scenario: AIP four of a kind same as HTB
		Given AIP four of a kind same as HTB but with higher quad
		When AIP compares hand with HTB but with higher quad
		Then AIP lose with lower rank quad vs higher rank quad 
	Scenario: AIP two pair same rank as HTB
		Given AIP two pair same as HTB but HTB has the higher suit
		When AIP compares hand with HTB but HTB has the higher suit
		Then AIP lose with lower suit two pair vs higher suit two pair 
	Scenario: AIP one pair same rank as HTB
		Given AIP one pair same as HTB but HTB has the higher suit
		When AIP compares hand with HTB but HTB's one pair has the higher suit
		Then AIP lose with lower suit one pair vs higher suit one pair 
	Scenario: AIP one pair lower rank than HTB
		Given AIP one pair lower rank as HTB but HTB
		When AIP compares hand with HTB but HTB has a higher ranked pair
		Then AIP lose with lower suit one pair vs higher ranked pair
	Scenario: AIP high card same rank than HTB
		Given AIP high card same rank as HTB but HTB has higher suit
		When AIP compares hand with HTB but HTB has a higher suit high card
		Then AIP lose with high card vs higher suit high card
	Scenario: AIP high card higher rank than HTB
		Given AIP high card higher rank as HTB 
		When AIP compares hand with HTB but HTB has a higher rank card
		Then AIP lose with high card vs higher rank high card
	
		
		
		
		