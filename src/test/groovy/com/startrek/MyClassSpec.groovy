package com.startrek
 
import com.startrek.MyClass
import com.startrek.StarTrek

import spock.lang.Specification

class MyClassSpec extends Specification {

	MyClass myClass = new MyClass()
	
	StarTrek starTrek = Mock(StarTrek.class) 
	
	def setup() {
		myClass.starTrek = starTrek
	}
	
	def testHurry() {
		setup:
		starTrek.beam() >> "Beam me, man!"
		
		expect:
		myClass.hurry() == "Beam me, man! Hurry!"
	}
}
