Feature: Login


Background:  Common steps
Given: launch url
When launch "https://www.facebook.com/"

Scenario: login

When enter email "gowthamk@gmail.com"
When enter password "gowthamrgat@4251"
When click login 
