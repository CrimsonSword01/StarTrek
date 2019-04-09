package com.startrek

import com.startrek.StarTrek

import spock.lang.Specification

class StarTrekSpec extends Specification{

	StarTrek starTrek = new StarTrek()
	
	def 'test Beam'() {
		expect:
		assert starTrek.beam() == "Beam me up, Scotty!"
	}
	
	def testGetPeopleToBeam() {
		when:
		def peeps = starTrek.getPeopleToBeam()
		
		then:
		assert peeps == ["Kirk", "Spock", "Uhura"]
	}
	
	def testRedShirts() {
		expect:
		starTrek.redShirts() == ["Todd", "Hunt"]
	}
	
	def testRoles() {
		expect:
		starTrek.roles() == ["captain": "Kirk", "communications": "Uhura", "doctor": "McCoy"]
	}
}
